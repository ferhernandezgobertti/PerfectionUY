package obligatorio;
// PROGRAMACIÓN 2 - Obligatorio 1
// Fernando Hernández (173631 - Ingeniería en Telecomunicaciones) - Sebastián Effa (193248 - Ingeniería en Electrónica)

import java.util.*;

public class Juego {

    //Atributos de la clase Juego
    private ArrayList<Jugador> listaJugadores;

    //Métodos de la clase Juego

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void borrarListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores.clear();
    }

    //Método para crear e inicializar una Matriz de Strings (apropiarla para la partida)
    public static String[][] matrizNueva(int dimension) {
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = " ";
            }
        }
        return matriz;
    }

    //Método para copiar una matriz
    public static String[][] copiaMatriz(String[][] matriz) {
        String[][] matrizCopia = new String[matriz.length][matriz[0].length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matrizCopia[fila][columna] = matriz[fila][columna];
            }
        }
        return matrizCopia;
    }

    //Método para colocar el panel en el tablero
    public static String[][] colocarPanel(String[][] panel, int fila, int columna, String[][] tablero) {
        String[][] copiaTablero = copiaMatriz(tablero);
        if (((fila + panel.length) <= tablero.length) && ((columna + panel[0].length) <= tablero[0].length)) {
            for (int i = 0; i < panel.length; i++) {
                for (int j = 0; j < panel[0].length; j++) {
                    copiaTablero[fila + i][columna + j] = panel[i][j];
                }
            }
        }
        return copiaTablero;
    }

    //Método para comprobar si se puede colocar el panel en cierta posición
    public static boolean sePuedeColocarPanel(int dimension, int fila, int columna, String[][] tablero) {
        return (((fila + dimension) <= tablero.length) && ((columna + dimension) <= tablero[0].length) && fila >= 0 && columna >= 0);
    }

    //Método que retorna la nueva posición del panel y si se puede mover
    public static int[] moverPanel(String[][] tableroConPanel, int dimension, int filaPanel, int columnaPanel, String direccion, int distancia) {
        int filaNueva = 0;
        int columnaNueva = 0;
        int[] retorno = {0, 0, 0};
        if (direccion.equals("I")) {
            filaNueva = filaPanel;
            columnaNueva = (columnaPanel - distancia);
        }
        if (direccion.equals("D")) {
            filaNueva = filaPanel;
            columnaNueva = (columnaPanel + distancia);
        }
        if (direccion.equals("A")) {
            filaNueva = (filaPanel - distancia);
            columnaNueva = columnaPanel;
        }
        if (direccion.equals("B")) {
            filaNueva = (filaPanel + distancia);
            columnaNueva = columnaPanel;
        }
        if (sePuedeColocarPanel(dimension, filaNueva, columnaNueva, tableroConPanel)) {
            retorno[0] = 1;
        }
        retorno[1] = filaNueva;
        retorno[2] = columnaNueva;
        return retorno;
    }

    //Método para actualizar el panel una vez se coloca o se mueve sobre el tablero
    public static String[][] panelNuevo(String[][] tableroConPanel, int filaPanel, int columnaPanel, int dimension) {
        String[][] panelNuevo = matrizNueva(dimension);
        for (int fila = filaPanel; fila < (filaPanel + dimension); fila++) {
            for (int columna = columnaPanel; columna < (columnaPanel + dimension); columna++) {
                panelNuevo[fila - filaPanel][columna - columnaPanel] = tableroConPanel[fila][columna];
            }
        }
        return panelNuevo;
    }

    //Método para comprobar si una ficha se coloca sobre el panel (si no es así, la ficha también se coloca en el tablero sin panel)
    public static boolean fichaSobrePanel(int filaFicha, int columnaFicha, int filaPanel, int columnaPanel, int dimension) {
        return (filaFicha >= filaPanel && filaFicha <= filaPanel + dimension && columnaFicha >= columnaPanel && columnaFicha <= columnaPanel + dimension);
    }

    //Método para agregar puntos a los jugadores
    public void agregarPuntos(ArrayList<Jugador> listaTodosJugadores, ArrayList<Jugador> listaJugadores) {

        try {
            listaJugadores.get(0).setPartidasJugadas(listaJugadores.get(0).getPartidasJugadas() + 1);
            listaJugadores.get(1).setPartidasJugadas(listaJugadores.get(1).getPartidasJugadas() + 1);
            if (listaTodosJugadores.isEmpty()) {
                listaTodosJugadores.add(listaJugadores.get(0));
                listaTodosJugadores.add(listaJugadores.get(1));
            } else {
                Iterator<Jugador> it = listaTodosJugadores.iterator();
                while (it.hasNext()) {
                    Jugador unJugador = it.next();
                    if (unJugador.equals(listaJugadores.get(0))) {
                        unJugador.setPartidasJugadas(unJugador.getPartidasJugadas() + 1);
                        unJugador.setPartidasGanadas(listaJugadores.get(0).getPartidasGanadas());
                        unJugador.setFicha(listaJugadores.get(0).getFicha());
                    } else {
                        listaTodosJugadores.add(listaJugadores.get(0));
                    }
                    if (unJugador.equals(listaJugadores.get(1))) {
                        unJugador.setPartidasJugadas(unJugador.getPartidasJugadas() + 1);
                        unJugador.setPartidasGanadas(listaJugadores.get(1).getPartidasGanadas());
                        unJugador.setFicha(listaJugadores.get(1).getFicha());
                    } else {
                        listaTodosJugadores.add(listaJugadores.get(1));
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    //Método para contar puntos por partida
    public static int contarPuntos(String[][] matriz, String criterio) {
        int puntos = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                if (matriz[fila][columna].equals(criterio)) {
                    puntos++;
                }
            }
        }
        return puntos;
    }

    //Método para colocar asteriscos donde se encontró la simetría o numerales donde se encuentra el panel (en una copia del tablero) 
    public static String[][] colocarString(String[][] tablero, int fila, int columna, int dimension, String string) {
        String[][] copiaTablero = copiaMatriz(tablero);
        for (int i = fila; i < (fila + dimension); i++) {
            for (int j = columna; j < (columna + dimension); j++) {
                if (string.equals("*")) {
                    copiaTablero[i][j] = string;
                }
                if (string.equals("#")) { //agregar si fila es impar
                    if (i % 2 == 0 && (columna % 2 == 0 || (columna % 2 != 0 && j != columna))) {
                        copiaTablero[i][j] = " " + string + " ";
                    }
                    if (i % 2 != 0 && j % 2 == 0 && i != fila) {
                        copiaTablero[i][j] = "  " + string + "  ";
                    }
                }
            }
        }
        return copiaTablero;
    }

    //Método para sustituir las fichas en una simetría 
    public static String[][] cambiarSimetriaTablero(String[][] tablero, int fila, int columna, int dimensionSimetria, int turno, boolean tableroSinPanel, 
            int filaPanel, int columnaPanel, int dimensionPanel) {
        String[][] copiaTablero = copiaMatriz(tablero);
        for (int i = fila; i < (fila + dimensionSimetria); i++) {
            for (int j = columna; j < (columna + dimensionSimetria); j++) {
                if (turno % 2 != 0 && !tableroSinPanel){
                    copiaTablero[i][j] = "B";                 
                }
                if (turno % 2 == 0 && !tableroSinPanel){
                    copiaTablero[i][j] = "N";
                }
                if(tableroSinPanel && !Juego.fichaSobrePanel(i, j, filaPanel, columnaPanel, dimensionPanel)){
                    if (turno % 2 != 0){
                        copiaTablero[i][j] = "B";
                    }
                    if (turno % 2 == 0){
                        copiaTablero[i][j] = "N";
                    }
                }
                
            }
        }

        return copiaTablero;
    }

    //Método desplegado en caso de querer realizar un comentario sobre el juego
    public static void calificarJuego(ArrayList<Jugador> listaTodosJugadores, ArrayList<Jugador> listaJugadores) {
        listaJugadores.get(0).getCalificaciones().clear();
        listaJugadores.get(1).getCalificaciones().clear();
        String calificacion = Interfaz.pedidoCaracteres("JUGADORES: \nIngresen su calificación. \nNOTA: La calificación puede ser tanto un valor a escala personal como un comentario. Ambos son agradecidos.", "Muchas gracias");
        Iterator<Jugador> it = listaTodosJugadores.iterator();
        while (it.hasNext()) {
            Jugador unJugador = it.next();
            if (unJugador.getAlias().equals(listaJugadores.get(0).getAlias())) {
                unJugador.getCalificaciones().add(calificacion);
            }
        }
        System.out.println("\nCALIFICACIONES AÑADIDAS...");
    }

    //Método para ingresar las dimensiones de los Tableros a usar (Tablero Fijo y Panel Móvil)
    public static void ingresarDimensionesTableros(Juego game, Tablero table) {
        table.setDimensionTablero(Interfaz.pedidoMatrizTablero("\nTABLERO PRINCIPAL_____________________________________", "4, 6 u 8", 4, 6, 8));
        table.setMatrizTablero(game.matrizNueva(table.getDimensionTablero()));
        table.setTableroConPanel(game.copiaMatriz(table.getMatrizTablero()));
        table.setTableroVacio(game.matrizNueva(table.getDimensionTablero()));
        if (table.getDimensionTablero() == 4) {
            System.out.println("\nLa dimensión única disponible del Panel Móvil para la dimensión del Tablero elegida es 2x2");
            table.setDimensionMovil(2);
        }
        if (table.getDimensionTablero() == 6) {
            table.setDimensionMovil(Interfaz.pedidoMatrizTablero("\nTABLERO MÓVIL______________________________________", "2 o 3", 2, 3, 173631));
        }
        if (table.getDimensionTablero() == 8) {
            table.setDimensionMovil(Interfaz.pedidoMatrizTablero("\nTABLERO MÓVIL_______________________________________", "2, 3 o 4", 2, 3, 4));
        }
        table.setPanel(game.matrizNueva(table.getDimensionMovil()));
        game.getListaJugadores().get(0).setCantidadFichas((table.getDimensionMovil()*table.getDimensionMovil()
                + table.getDimensionTablero()*table.getDimensionTablero()) / 2);
        game.getListaJugadores().get(1).setCantidadFichas((table.getDimensionMovil()*table.getDimensionMovil()
                + table.getDimensionTablero()*table.getDimensionTablero()) / 2);
        }

    //Método desplegado al ser el movimiento una X y así querer el jugador de turno retirarse de la partida
    public static void abandonarPartida(Juego game, int turno) {
        if (turno % 2 != 0) { //Si el turno es del Jugador 1 (Blancas)
            System.out.println("\nEL JUGADOR 1 SE RETIRA.\n EL GANADOR FUE EL JUGADOR 2!!!!!!");
            game.getListaJugadores().get(1).setPartidasGanadas(game.getListaJugadores().get(1).getPartidasGanadas() + 1);
        }
        if (turno % 2 == 0) { //Si el turno es del Jugador 2 (Negras)
            System.out.println("\nEL JUGADOR 2 SE RETIRA.\n EL GANADOR FUE EL JUGADOR 1!!!!!!");
            game.getListaJugadores().get(0).setPartidasGanadas(game.getListaJugadores().get(0).getPartidasGanadas() + 1);
        }
    }

    //Método para colocar una Ficha (y su consiguiente verificación de simetría) en un tablero con panel (movilEnTablero == true)
    public static boolean colocarFichaTableroConPanel(Juego game, Tablero table, String opcion, int[] datos, int turno, int filaPanel, int columnaPanel,
            boolean tieneFichasJugador1, boolean tieneFichasJugador2) {

        boolean opcionCorrecta = false;
        int filaFicha = Interfaz.pasarANumero(opcion.substring(1, 2)) - 1;
        int columnaFicha = Interfaz.pasarANumero(opcion.substring(2, 3)) - 1;
        if(Interfaz.esLetra(opcion.substring(1, 2)) && Interfaz.esNumero(opcion.substring(2, 3))){
            if (table.posicionValida(table.getTableroConPanel(), filaFicha, columnaFicha)) {
                if ((turno % 2 != 0) && (tieneFichasJugador1)){
                    table.setFichaTableroConPanel(filaFicha, columnaFicha, "B");
                    if (!Juego.fichaSobrePanel(filaFicha, columnaFicha, filaPanel, columnaPanel, table.getPanel().length)) {
                        table.setFichaMatrizTablero(filaFicha, columnaFicha, "B");                       
                    }
                    System.out.println("Su ficha a sido colocada.");
                    opcionCorrecta = true;
                    game.getListaJugadores().get(0).setCantidadFichas(game.getListaJugadores().get(0).getCantidadFichas() - 1);
                }             
                if ((turno % 2 ==0) && (tieneFichasJugador2)){
                    table.setFichaTableroConPanel(filaFicha, columnaFicha, "N");
                    if (!Juego.fichaSobrePanel(filaFicha, columnaFicha, filaPanel, columnaPanel, table.getPanel().length)) {
                        table.setFichaMatrizTablero(filaFicha, columnaFicha, "N");
                    }
                    System.out.println("Su ficha a sido colocada.");
                    opcionCorrecta = true;
                    game.getListaJugadores().get(1).setCantidadFichas(game.getListaJugadores().get(1).getCantidadFichas() - 1);
                }            
                if((turno%2!= 0 && !tieneFichasJugador1) || (turno%2==0 && !tieneFichasJugador2)){
                    System.out.println("No tiene Fichas disponibles. Ingrese otra jugada");
                }
                datos = table.buscarSimetrias(table.getTableroConPanel(),filaFicha,columnaFicha);
                if (datos[0] != 0) {
                    System.out.println("Se ha encontrado la siguiente simetría\n");
                    table.imprimirMatriz(Juego.colocarString(table.getTableroVacio(), datos[1], datos[2], datos[0], "*"), table.getPanel(), filaPanel,
                        columnaPanel, true, true);
                    if (turno % 2 != 0) {
                        System.out.println("\nLas posiciones marcadas con asteriscos se sustituyen por fichas BLANCAS.\n");
                    }
                    if (turno % 2 == 0) {
                        System.out.println("\nLas posiciones marcadas con asteriscos se sustituyen por fichas NEGRAS.\n");
                    }
                    table.setTableroConPanel(Juego.cambiarSimetriaTablero(table.getTableroConPanel(), datos[1], datos[2], datos[0], turno, false,
                            filaPanel, columnaPanel, table.getPanel().length));
                    table.setMatrizTablero(Juego.cambiarSimetriaTablero(table.getMatrizTablero(), datos[1], datos[2], datos[0], turno, true,
                            filaPanel, columnaPanel, table.getPanel().length));
                }
                table.setPanel(game.panelNuevo(table.getTableroConPanel(), filaPanel, columnaPanel, table.getPanel().length));
            }
        }
        return opcionCorrecta;
    }

    //Método para colocar una Ficha (y su consiguiente verificació de simetría) en un tablero sin panel (movilEnTablero == false)
    public static boolean colocarFichaTableroSinPanel(Juego game, Tablero table, String opcion, int[] datos, int turno, int filaPanel, int columnaPanel,
            boolean tieneFichasJugador1, boolean tieneFichasJugador2) {

        boolean opcionCorrecta = false;
        int filaFicha = Interfaz.pasarANumero(opcion.substring(1, 2)) - 1;
        int columnaFicha = Interfaz.pasarANumero(opcion.substring(2, 3)) - 1;
        if (table.posicionValida(table.getMatrizTablero(), filaFicha, columnaFicha) && Interfaz.esLetra(opcion.substring(1, 2)) &&
                Interfaz.esNumero(opcion.substring(2, 3))) {
            if ((turno % 2 != 0) && (tieneFichasJugador1)) {
                table.setFichaMatrizTablero(filaFicha, columnaFicha, "B");
                System.out.println("Su ficha ha sido colocada.");
                opcionCorrecta = true;
                game.getListaJugadores().get(0).setCantidadFichas(game.getListaJugadores().get(0).getCantidadFichas() - 1);
            }
            if ((turno % 2 == 0) && (tieneFichasJugador2)) {
                table.setFichaMatrizTablero(filaFicha, columnaFicha, "N");
                System.out.println("Su ficha ha sido colocada.");
                opcionCorrecta = true;
                game.getListaJugadores().get(1).setCantidadFichas(game.getListaJugadores().get(1).getCantidadFichas() - 1);
            }
            if((turno%2!= 0 && !tieneFichasJugador1) || (turno%2==0 && !tieneFichasJugador2)){
                    System.out.println("No tiene Fichas disponibles. Ingrese otra jugada");
            }
            datos = table.buscarSimetrias(table.getMatrizTablero(), filaFicha, columnaFicha);
            if (datos[0] != 0) {
                System.out.println("Se ha encontrado la siguiente simetría\n");
                table.imprimirMatriz(Juego.colocarString(table.getTableroVacio(), datos[1], datos[2], datos[0], "*"), table.getPanel(),
                    filaPanel, columnaPanel, false, true);
                if (turno % 2 != 0) {
                    System.out.println("\nlas posiciones marcadas con asteriscos se sustituyen por fichas blancas.\n");
                }
                if (turno % 2 == 0) {
                    System.out.println("\nlas posiciones marcadas con asteriscos se sustituyen por fichas negras.\n");
                }
                table.setMatrizTablero(Juego.cambiarSimetriaTablero(table.getMatrizTablero(), datos[1], datos[2], datos[0], turno, false,
                            filaPanel, columnaPanel, table.getPanel().length));
            }
        }
        return opcionCorrecta;
    }

    //Método usado en el main para colocar el panel móvil en el tablero fijo
    public static boolean panelEnTablero(Juego game, Tablero table, String opcion, int filaPanel, int columnaPanel) {
        boolean movilEnTablero = false;
        filaPanel = Interfaz.pasarANumero(opcion.substring(1, 2)) - 1;
        columnaPanel = Interfaz.pasarANumero(opcion.substring(2, 3)) - 1;
        table.setTableroConPanel(game.copiaMatriz(table.getMatrizTablero()));
        boolean opcionCorrecta = game.sePuedeColocarPanel(table.getPanel().length, filaPanel, columnaPanel, table.getMatrizTablero());
        if (opcionCorrecta) {
            table.setTableroConPanel(Juego.colocarPanel(table.getPanel(), filaPanel, columnaPanel, table.getTableroConPanel()));
            movilEnTablero = true;
        }
        return movilEnTablero;
    }

}
