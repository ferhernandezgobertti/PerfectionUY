package obligatorio;
// PROGRAMACIÓN 2 - Obligatorio 1
// Fernando Hernández (173631 - Ingeniería en Telecomunicaciones) - Sebastián Effa (193248 - Ingeniería en Electrónica)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Interfaz {
    
    //Método para la Introduccion al Programa
    public static void introduccion() {
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        for (int i = 0; i < 2; i++) {
            System.out.println("░░                                                                                                ░░");
        }
        System.out.println("░░                             Bienvenido a: P.E.R.F.E.C.C.I.O.N. !!!!                            ░░");
        System.out.println(
                "░░  _____     ______   ______    ______   ______       ______	 ______     ┬       /             ░░\n"
                + "░░ /     |   |        /      |   |        |           /      |  /      |    |   ______    |\\    | ░░\n"
                + "░░ |     |   |----    |      |   |        |----       |         |           |   |     |   | \\   | ░░\n"
                + "░░ |_____/   |        |------/   |----    |           |         |           |   |     |   |  \\  | ░░\n"
                + "░░ |	     |______  |      |   |        |______     |         |______/    |   |     |   |   \\ | ░░\n"
                + "░░ |		      |       |  |		      |______/              ┴   |_____|   |    \\| ░░");
        for (int i = 0; i < 2; i++) {
            System.out.println("░░                                                                                                ░░");
        }
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("\n                       Les damos la bienvenida a este juego único en su clase");
        System.out.println("\nPara comenzar a jugar, le solicitaremos el ingreso de datos del Jugador y las condiciones de juego que desee");
    }
    
    //Método para solicitar dimensión de un tablero
    public static int pedidoMatrizTablero(String titulo, String mensaje, int valor1, int valor2, int valor3) {
        Scanner in = new Scanner(System.in);
        boolean dimensionCorrecta = false;
        int dimension = 0;
        System.out.println(titulo);
        while (!dimensionCorrecta) {
            dimension = verificacionEntero("\nCuál es la dimensión del tablero en la que desea jugar? \nNota: Se aceptarán tableros de " + mensaje + " piezas de lado solamente.",
                    "\nDebe ingresar " + mensaje + " según sean las dimensiones deseadas. \nIngrese nuevamente, por favor.", "");
            if ((dimension != valor1) && (dimension != valor2) && dimension != valor3) {
                System.out.println("\nDebe ingresar valores " + mensaje + " refiriendo a la dimension que desee para el tablero.");
            }
            if ((dimension == valor1) || (dimension == valor2) || (dimension == valor3)) {
                System.out.println("\nDimension asignada.\n");
                dimensionCorrecta = true;
            }
        }
        return dimension;
    }
    
    //Método para la solicitud de cadenas de caracteres o Strings
    public static String pedidoCaracteres(String pedido, String devolucion) {
        Scanner caracteres = new Scanner(System.in);
        System.out.println("\n" + pedido);
        String dato = caracteres.nextLine();
        System.out.println("\n" + devolucion);
        return dato;
    }

    //Método para la solicitud de enteros
    public static int verificacionEntero(String pedido, String datoErroneo, String datoValido) {
        Scanner in = new Scanner(System.in);
        int dato = 0;
        boolean datoCorrecto = false;
        while (!datoCorrecto) {
            try {
                System.out.println("\n" + pedido);
                dato = in.nextInt();
                datoCorrecto = true;
                System.out.println("\n" + datoValido);
            } catch (InputMismatchException e) {
                System.out.println("\n" + datoErroneo);
                in.nextLine();
            }

        }
        return dato;
    }   

    //Método para la Introduccion al Juego
    public static void comienzoJuego() {
        System.out.println("\n                EL JUEGO ESTA COMENZANDO!!!");
        System.out.println("              ____   |   |   ____   ____   ___   | | |" + "\n                |    |   |   |-     |  _  |   |  | | |" + "\n             \\__/    \\___/   |___   \\__/  |___|  O O O");
    }

    //Método para pedir y mostrar datos en el Menu del Juego
    public static void menuJuego(int turno, String opcion3) {
        System.out.println("\n\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        if(turno%2!=0)
        System.out.println("▒ JUGADOR 1, este es su turno:                                                                               ▒");
        if(turno%2==0)
            System.out.println("▒ JUGADOR 2, este es su turno:                                                                               ▒");
        System.out.println("▒ RECUERDE que su turno será válido solo si ingresa sus intenciones de la forma a continuación explicitada   ▒"
                + "\n▒ * Para ingresar una ficha al tablero en una POSICIÓN VACÍA ingrese de la forma 'J-Fila-Columna' (sin       ▒"
                + "\n▒ * guiones) refiriéndose a la fila y columna donde quiera ingresar la ficha respectivamente.                ▒"
                + "\n▒ ** Para dejar la partida y así rendirse ingrese 'X'.                                                       ▒" + "\n▒" + opcion3
                + "\n▒ RECUERDE: Las filas deben ser ingresadas en caracteres (estando ordenadas comenzando por A) y las          ▒"
                + "\n▒ y las columnas en números (comenzando por el 1).                                                           ▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("\n\nIngrese su intención a continuación y presione ENTER");
    }
    
    //Método para mostrar y solicitar datos correspondientes al fin de la partida (set)
    public static int mensajeFinSet() {
        boolean opcionCorrecta = false;
        System.out.println("\n\n╔═════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║ QUÉ DESEA HACER A CONTINUACIÓN?                                         ║"
                + "\n║  1. Jugar nuevamente.                                                   ║"
                + "\n║  2. Calificar este juego o sobreescribir una calificación previa.       ║"
                + "\n║     Sus opiniones son siempre tenidas en cuenta.                        ║"
                + "\n║  3. Abandonar el juego.                                                 ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════╝");
        int opcion = Interfaz.verificacionEntero("", "Por favor, inserte una opción válida.\nIngrese nuevamente a continuación", "Dato recibido.");
        while (!opcionCorrecta) {
            if (opcion != 1 && opcion != 2 && opcion != 3) {
                System.out.println("Ingrese una opcion correcta dentro del rango brindado. Digite una vez más.");
                opcion = Interfaz.verificacionEntero("", "Por favor, inserte una opción válida.\nIngrese nuevamente a continuación", "Dato recibido.");
            } else {
                opcionCorrecta = true;
            }
        }
        return opcion;
    }
    
    //Método para el Ingreso de datos del Jugador
    public static ArrayList<Jugador> registroJugadores(ArrayList <Jugador> listaTodosJugadores) {
        boolean jugadorSolitario = true;
        ArrayList<Jugador> listaAuxiliar = new ArrayList<>();
        ArrayList<String> califPredeterminada=new ArrayList<>();
        califPredeterminada.add("Ninguna Calificación");
        while(jugadorSolitario){
            listaAuxiliar.clear();
            for (int cantidadJugadores = 1; cantidadJugadores < 3; cantidadJugadores++) {
                boolean edadCorrecta = false;
                System.out.println("\nJUGADOR " + cantidadJugadores + "____________________________ \n");
                Jugador participante = new Jugador();
                if (cantidadJugadores == 1) {
                    System.out.println("Jugará con las fichas BLANCAS");
                    participante.setFicha("Blancas");
                }
            if (cantidadJugadores == 2) {
                System.out.println("Jugará con las fichas NEGRAS");
                participante.setFicha("Negras");
            }
            String nombreJugador = Interfaz.pedidoCaracteres("Ahora ingrese su NOMBRE", "NOMBRE aceptado.");
            participante.setNombre(nombreJugador);

            while (!edadCorrecta) {
                int edadJugador = Interfaz.verificacionEntero("Por favor, ingrese su EDAD a continuación", "Debe ingresar su edad en enteros", "");
                participante.setEdad(edadJugador);
                if (edadJugador > 120 || edadJugador < 1) {
                    System.out.println("No puede engañar a este programa. Debe ingresar su VERDADERA edad");
                } else {
                    edadCorrecta = true;
                }
            }
            System.out.println("Edad recibida");

            String aliasJugador = Interfaz.pedidoCaracteres("Ingrese su ALIAS", "ALIAS ingresado.");
            participante.setAlias(aliasJugador);
            participante.setCalificaciones(califPredeterminada);
            listaAuxiliar.add(participante);
        }
         if(listaAuxiliar.get(0).equals(listaAuxiliar.get(1))){
             System.out.println("\nNo puede jugar contra si mismo. Ingrese nuevamente");
         }
         else
             jugadorSolitario = false;
        }
        if(!listaTodosJugadores.isEmpty()){    
        Iterator <Jugador> it = listaTodosJugadores.iterator();
            while(it.hasNext()){
                Jugador jugador = it.next();
                if(jugador.equals(listaAuxiliar.get(0))){
                    listaAuxiliar.get(0).setPartidasJugadas(jugador.getPartidasJugadas());
                    listaAuxiliar.get(0).setPartidasGanadas(jugador.getPartidasGanadas());
                }
                if(jugador.equals(listaAuxiliar.get(1))){
                    listaAuxiliar.get(1).setPartidasJugadas(jugador.getPartidasJugadas());
                    listaAuxiliar.get(1).setPartidasGanadas(jugador.getPartidasGanadas());
                }
            }
        }
        System.out.println("\nMuchas gracias. Sus datos están siendo procesados.");
        return listaAuxiliar;
    }
  
    //Método para brindarle al Jugador la posibilidad de cambiar sus datos una vez ingresados
    public static ArrayList<Jugador> cambioDatosJugador(Juego unJuego, ArrayList<Jugador> jugadores, ArrayList <Jugador> listaTodosJugadores) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 1) {
            System.out.println("\n Los datos ingresados fueron: " + "\n" + jugadores);
            opcion = Interfaz.verificacionEntero("Están de acuerdo con los datos ingresados?" + "\n 1- Si" + "\t 2- No", "Debe ingresar enteros 1 o 2.", "");
            if (opcion == 1) {
                System.out.println("Datos procesados.");
            }
            if (opcion == 2) {
                System.out.println("Les solicitaremos nuevamente sus datos");
                unJuego.setListaJugadores(Interfaz.registroJugadores(listaTodosJugadores));
            }
            if (opcion != 1 && opcion != 2) {
                System.out.println("Debe ingresar opcion 1 o 2 únicamente. Disculpe las molestias.\n");
            }
        }
        return jugadores;
    }

    //Método para pasar un String a número entero
    public static int pasarANumero(String letra) {
        char l = letra.charAt(0);
        int num = l - 64;
        if (num < 0) {
            num = Integer.parseInt("" + l);
        }
        return num;
    }
    
    //Método para verificar si un caracter es letra
    public static boolean esLetra(String letra) {
        boolean esLetra = true;
        char l = letra.charAt(0);
        int num = l - 64;
        if (num < 0) {
            esLetra = false;
        }
        return esLetra;
    }
    
    //Método para verificar si un caracter es número
    public static boolean esNumero(String numero) {
        boolean esNumero = false;
        char l = numero.charAt(0);
        int num = l - 64;
        if (num < 0) {
            esNumero = true;
        }
        return esNumero;
    }

    
    //Método que devuelve un ArrayList de Jugadores dado en forma ordenada
    public static ArrayList<Jugador> devolverJugadoresOrdenados(ArrayList<Jugador> listaJugadores) {
        //Criterio Interno, Inner Class Anónima (se define el criterio localmente pero sin dar el nombre)
        Collections.sort(listaJugadores, new Comparator() {
            public int compare(Object param1, Object param2) {
                Jugador participante1 = (Jugador) param1;
                Jugador participante2 = (Jugador) param2;
                int aux = participante1.getNombre().compareTo(((Jugador) participante2).getNombre());
                if (aux == 0) {
                    aux = participante1.getAlias().compareTo(((Jugador) participante2).getAlias());
                }
                return aux;
            }
        });
        return listaJugadores;
    }
    
    //Método que despliega las opciones del Fin del Set (Jugar nuevamente, calificar o abandonar el juego)
    public static boolean [] opcionesFinSet(Juego game, int opcionJuego, ArrayList<Jugador> listaTodosJugadores){
                    // Inicialización de un Array de booleanos que determina el valor de la variable finSet(posicion 1) y gameOver (posicion 2) del main            
                    boolean [] finPartidas = new boolean[2]; 
                    if (opcionJuego == 1) {
                        System.out.println("SU NUEVO JUEGO COMENZARÁ EN BREVE...\n\n");
                        finPartidas[0] = true;
                    }
                    if (opcionJuego == 2) {
                        game.calificarJuego(listaTodosJugadores, game.getListaJugadores());
                    }
                    if (opcionJuego == 3) {
                        System.out.println("Muchas gracias por jugar. Lo esperamos nuevamente pronto!!!");
                        finPartidas[0] = true;
                        finPartidas[1] = true;
                    }
                    return finPartidas;
    }
    
    //Método que verifica la confirmación del despliegue del Ranking Mundial y lo verifica en caso afirmativo
    public static boolean opcionesRankingMundial(ArrayList<Jugador> listaTodosJugadores, boolean optionCorrecta, int option){
                        if (option == 1) {
                            System.out.println("RANKING MUNDIAL:");
                            listaTodosJugadores = Interfaz.devolverJugadoresOrdenados(listaTodosJugadores);
                            System.out.println(listaTodosJugadores);
                            optionCorrecta = true;
                        }
                        if (option == 2) {
                            optionCorrecta = true;
                        }
                        if (option != 1 && option != 2) {
                            System.out.println("Debe ingresar un valor válido y apropiado (1 o 2).\nIngrese nuevamente, por favor.");
                        }
                        return optionCorrecta;
    }
    
    //Método que muestra quien fue el ganador de la partida y el consiguiente incremento de las partidas ganadas del vencedor
    public static void mensajeGanador(Juego game, int puntosJugador1, int puntosJugador2, boolean rendicion){
        if (puntosJugador1 > puntosJugador2 && !rendicion) {
                    System.out.println("EL GANADOR FUE EL JUGADOR 1!!!!!!\n\n");
                    game.getListaJugadores().get(0).setPartidasGanadas(game.getListaJugadores().get(0).getPartidasGanadas()+1);
                }
                if (puntosJugador1 < puntosJugador2 && !rendicion) {
                    System.out.println("EL GANADOR FUE EL JUGADOR 2!!!!!!\n\n");
                    game.getListaJugadores().get(0).setPartidasGanadas(game.getListaJugadores().get(0).getPartidasGanadas()+1);
                }
                if (puntosJugador1 == puntosJugador2 && !rendicion) {
                    System.out.println("EMPATE !!!!!!\n\n");
                }
    }
    
}

