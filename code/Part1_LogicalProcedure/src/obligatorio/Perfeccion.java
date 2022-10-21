package obligatorio;
// PROGRAMACIÓN 2 - Obligatorio 1
// Fernando Hernández (173631 - Ingeniería en Telecomunicaciones) - Sebastián Effa (193248 - Ingeniería en Electrónica)

import java.util.*;

public class Perfeccion {

    //MÉTODO MAIN DEL OBLIGATORIO
    public static void main(String[] args) {
        //Variables inicializadas únicamente al comienzo del programa
        boolean gameOver = false;
        int partida = 1;
        ArrayList<Jugador> listaTodosJugadores = new ArrayList<Jugador>();

        Interfaz.introduccion();

        //Repetición hasta el término del juego
        while (!gameOver) {

            //Variables reinicializadas al comienzo de cada juego (iniicalizadas en pocas líneas para ahorrar espacio del método)
            int opcionJuego = 0, puntosJugador1 = 0, puntosJugador2 = 0, turno = 1, filaPanel = 0, columnaPanel = 0, fichasJugador1 = 0, fichasJugador2;
            boolean rendicion = false, setOver = false, movilEnTablero = false, tieneFichasJugador1 = true, tieneFichasJugador2 = true;
            boolean opcionCorrecta = false, optionCorrecta = false, finSet = false, posicionesLibres = true;
            String opcion, movimiento = " ";
            int[] datos = new int[3];
            Juego game = new Juego();
            Tablero table = new Tablero();

            System.out.println("\n\nPARTIDA " + partida);

            //Solicitud datos de los Jugadores
            game.setListaJugadores(Interfaz.registroJugadores(listaTodosJugadores));
            Interfaz.cambioDatosJugador(game, game.getListaJugadores(), listaTodosJugadores);

            //Solicitud de datos y creación de las Matrices a utilizar
            game.ingresarDimensionesTableros(game, table);

            Interfaz.comienzoJuego();

            //Repetición hasta que ambos jugadores se quedan sin fichas (hasta que termina la partida)
            while (!setOver) {
                while (!opcionCorrecta) {
                    if (!movilEnTablero) { //Si el panel móvil NO se encuentra en el tablero
                        Interfaz.menuJuego(turno, " *** Para colocar el Panel Móvil ingresar de la forma 'P-Fila-Columna' (sin guiones)                        ▒\n"
                                + "▒ *** indicando así la posición del borde superior izquierdo del mismo                                       ▒");
                        table.imprimirMatriz(table.getMatrizTablero(), table.getPanel(), filaPanel, columnaPanel, movilEnTablero, false);
                    }
                    if (movilEnTablero) { //Si el panel móvil se encuentra en el tablero
                        Interfaz.menuJuego(turno, " *** Para desplazar el Panel Móvil ingresar de la forma 'M-Dirección-Cantidad de Posiciones' (sin guiones)  ▒");
                        table.imprimirMatriz(table.getTableroConPanel(), table.getPanel(), filaPanel, columnaPanel, movilEnTablero, false);
                    }
                    opcion = Interfaz.pedidoCaracteres("Ingrese una jugada válida", "").toUpperCase().trim().replaceAll(" ", "");
                    //Todo a mayúsculas, sin espacios
                    movimiento = opcion.substring(0, 1); // El movimiento puede ser únicamente 'J', 'X y ('P' o 'M')
                    if ((movimiento.equals("X")) && (opcion.length() == 1)) {   //Si el jugador desea rendirse
                        game.abandonarPartida(game, turno);
                        rendicion = true;
                        setOver = true;
                        opcionCorrecta = true;
                    }
                    if (opcion.length() == 3) {
                        if (movilEnTablero) {
                            if (movimiento.equals("J")) {   //Si el jugador desea ingresar una ficha estando el panel móvil en el tablero
                                try {
                                    opcionCorrecta = game.colocarFichaTableroConPanel(game, table, opcion, datos, turno, filaPanel, columnaPanel,
                                            tieneFichasJugador1, tieneFichasJugador2);
                                } catch (Exception e) {
                                    opcionCorrecta = false;
                                }
                            }
                            if (movimiento.equals("P")) {   //Si el jugador desea ingresar el panel móvil ya estando éste en el tablero (jugada errónea)
                                System.out.println("\nADVERTENCIA: El panel ya se encuentra en el tablero. Debe ingresar una opción válida.\n");
                            }
                            if (movimiento.equals("M")) {   //Si el jugador desea mover el panel móvil ya estando éste en el tablero
                                try {
                                    String direccion = opcion.substring(1, 2);
                                    int distancia = Interfaz.pasarANumero(opcion.substring(2, 3));
                                    if ((direccion.equals("I") || direccion.equals("D") || direccion.equals("A") || direccion.equals("B"))
                                            && Interfaz.esNumero(opcion.substring(2, 3))) {
                                        //Array que contiene en la primer posición si se movio el panel, y en las siguientes donde se movio
                                        int[] panelMovido = {0, 0, 0};
                                        panelMovido = game.moverPanel(table.getTableroConPanel(), table.getPanel().length, filaPanel, columnaPanel,
                                                direccion, distancia);
                                        if (panelMovido[0] == 1) {
                                            opcionCorrecta = true;
                                            filaPanel = panelMovido[1];
                                            columnaPanel = panelMovido[2];
                                            table.setTableroConPanel(Juego.colocarPanel(table.getPanel(), filaPanel, columnaPanel, table.getMatrizTablero()));
                                            table.setPanel(game.panelNuevo(table.getTableroConPanel(), filaPanel, columnaPanel, table.getPanel().length));
                                        }
                                        if (panelMovido[0] == 0) {
                                            System.out.println("\nADVERTENCIA: No se puede mover el panel como indicó.\n");
                                        }
                                    } else {
                                        System.out.println("\nADVERTENCIA: Ingrese un movimiento válido para el panel.\n");
                                    }

                                } catch (Exception e) {
                                    opcionCorrecta = false;
                                }
                            }
                            if (opcionCorrecta) {
                                table.imprimirMatriz(table.getTableroConPanel(), table.getPanel(), filaPanel, columnaPanel, movilEnTablero, false);
                            }
                        }
                    }
                    if (!movilEnTablero) {
                        if (movimiento.equals("J")) {   //Si el jugador desea colocar una ficha NO estando el panel móvil en el tablero
                            try {
                                opcionCorrecta = game.colocarFichaTableroSinPanel(game, table, opcion, datos, turno, filaPanel, columnaPanel,
                                       tieneFichasJugador1, tieneFichasJugador2);
                            } catch (Exception e) {
                            }
                        }
                        if (movimiento.equals("P")) {   //Si el jugador desea colocar el panel móvil NO estando éste en el tablero
                            try {
                                filaPanel = Interfaz.pasarANumero(opcion.substring(1, 2)) - 1;
                                columnaPanel = Interfaz.pasarANumero(opcion.substring(2, 3)) - 1;
                                table.setTableroConPanel(game.copiaMatriz(table.getMatrizTablero()));
                                opcionCorrecta = game.sePuedeColocarPanel(table.getPanel().length, filaPanel, columnaPanel, table.getMatrizTablero())
                                        && Interfaz.esLetra(opcion.substring(1, 2)) && Interfaz.esNumero(opcion.substring(2, 3));
                                if (opcionCorrecta) {
                                    table.setTableroConPanel(Juego.colocarPanel(table.getPanel(), filaPanel, columnaPanel, table.getTableroConPanel()));
                                    movilEnTablero = true;
                                }
                            } catch (Exception e) {
                                opcionCorrecta = false;
                            }
                        }
                        if (movimiento.equals("M")) {   //Si el jugador desea mover el panel móvil NO estando éste en el tablero (jugada errónea)
                            System.out.println("\nADVERTENCIA: El panel no se encuentra en el tablero. Debe ingresar una opción válida.\n");
                        }
                        if (opcionCorrecta && !movimiento.equals("P")) {    //Si la opción se ingresó adecuadamente y ésta NO se refiere a colocar el panel
                            table.imprimirMatriz(table.getMatrizTablero(), table.getPanel(), filaPanel, columnaPanel, movilEnTablero, false);
                        }
                        if (opcionCorrecta && movimiento.equals("P")) {     //Si la opción se ingresó adecuadamente y ésta se refiere a colocar el panel
                            table.imprimirMatriz(table.getTableroConPanel(), table.getPanel(), filaPanel, columnaPanel, movilEnTablero, false);
                        }
                    }
                    if (!opcionCorrecta) {  //Si la opcion NO se ingreso adecuadamente
                        System.out.println("Su jugada no es válida. Ingrese nuevamente a continuación.");
                    }
                } //Al finalizar cada turno de cada jugador
                opcionCorrecta = false;
                turno++;
                tieneFichasJugador1 = game.getListaJugadores().get(0).getCantidadFichas() > 0; //Cantidad de fichas restantes del Jugador 1
                tieneFichasJugador2 = game.getListaJugadores().get(1).getCantidadFichas() > 0; //Cantidad de fichas restantes del Jugador 2
               
                //Se juega hasta que ambos jugadores se queden sin fichas o alguno se rinda, lo que es equivalente a que no haya posiciones libres en el tablero
                if ((!movilEnTablero) && (game.contarPuntos(table.getMatrizTablero(), " ") == 0)) { 
                    System.out.println("No hay posiciones disponibles, puede colocar el panel para seguir o ingresar 'X' para abandonar");   //Si no está el panel móvil colocado y no hay posiciones libres en el tablero
                }
                if ((movilEnTablero) && (game.contarPuntos(table.getMatrizTablero(), " ") + game.contarPuntos(table.getPanel(), " ") == 0)) {
                    posicionesLibres = false;   //Si está el panel móvil colocado y no hay posiciones libres ni en el tablero ni en el panel móvil
                }
                if((!posicionesLibres)||(!tieneFichasJugador1 && !tieneFichasJugador2)){
                    setOver=true;
                }
            }

            if (movilEnTablero) {
                puntosJugador1 = game.contarPuntos(table.getTableroConPanel(), "B");
                puntosJugador2 = game.contarPuntos(table.getTableroConPanel(), "N");
            } else {
                puntosJugador1 = game.contarPuntos(table.getMatrizTablero(), "B");
                puntosJugador2 = game.contarPuntos(table.getMatrizTablero(), "N");
            }
            game.agregarPuntos(listaTodosJugadores, game.getListaJugadores());
            Interfaz.mensajeGanador(game, puntosJugador1, puntosJugador2, rendicion);
            System.out.println("FIN DE LA PARTIDA!!! \nLos resultados fueron... \n");
            game.setListaJugadores(Interfaz.devolverJugadoresOrdenados(game.getListaJugadores()));
            System.out.println(game.getListaJugadores());
            partida++;
            while (!optionCorrecta) {   //Menú de escala o ranking global
                int option = Interfaz.verificacionEntero("Desearía ver sus resultados de nuestro juego a escala global???\n 1 - Si, me encantaría. \t"
                        + " 2 - No, gracias.", "Debe ingresar un valor váido.", "");
                optionCorrecta = Interfaz.opcionesRankingMundial(listaTodosJugadores, optionCorrecta, option);
            }

            while (!finSet) {   //Menú final de la Partida
                opcionJuego = Interfaz.mensajeFinSet();
                boolean[] finPartidas = Interfaz.opcionesFinSet(game, opcionJuego, listaTodosJugadores);
                finSet = finPartidas[0];
                gameOver = finPartidas[1];
            }
            game.borrarListaJugadores(game.getListaJugadores());
        }
    }

}
