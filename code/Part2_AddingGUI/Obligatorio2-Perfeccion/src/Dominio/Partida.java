package Dominio;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica


import java.util.*;
import java.io.*;

public class Partida extends Observable implements Serializable{
    
     //Atributos de la clase Partida
    private boolean jugador1Vencedor, isJugador1, movilEnTablero, partidaCargada;
    private int turno, filaPanel, columnaPanel, filaFicha, columnaFicha, partida, cantFichasMax;
    private int[] datos = new int[3];
    private String opcion;
    private Tablero table = new Tablero();
    private Jugador jugador1, jugador2;
    private ArrayList <Jugador> listaJugadores;

    //Constructor Sin Parámetros de la Clase Partida
    public Partida() {
        turno = 1;
        filaPanel = 0;
        columnaPanel = 0;
        partida = 1;
        movilEnTablero = false;
        partidaCargada = false;
        opcion = " ";
        jugador1 = new Jugador();
        jugador2 = new Jugador();  
    }

    //Métodos de Acceso y Modificación de la clase Partida
    
    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public boolean isPartidaCargada() {
        return partidaCargada;
    }

    public void setPartidaCargada(boolean partidaCargada) {
        this.partidaCargada = partidaCargada;
    }

    public int getFilaFicha() {
        return filaFicha;
    }
    
    public int getColumnaFicha() {
        return columnaFicha;
    }
    
    public int getFilaPanel() {
        return filaPanel;
    }
    
    public int getColumnaPanel() {
        return columnaPanel;
    }
    public int getCantFichasMax() {
        return cantFichasMax;
    }

    public boolean isMovilEnTablero() {
        return movilEnTablero;
    }

    public String getOpcion() {
        return opcion;
    }
    
    public int[] getDatos() {
        return datos;
    }
    
    public Tablero getTable() {
        return table;
    }
    
    public int getTurno() {
        return turno;
    }
    
    public boolean isJugador1Vencedor() {
        return jugador1Vencedor;
    }
    
     public boolean isJugador1() {
        return isJugador1;
    }
    
     public Jugador getJugador1(){
         return jugador1;
     }
     
     public Jugador getJugador2(){
         return jugador2;
     }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
     
    public void setFilaFicha(int filaFicha) {
        this.filaFicha = filaFicha;
    }    

    public void setColumnaFicha(int columnaFicha) {
        this.columnaFicha = columnaFicha;
    }
    
    public void setFilaPanel(int filaPanel) {
        this.filaPanel = filaPanel;
    }
    
    public void setColumnaPanel(int columnaPanel) {
        this.columnaPanel = columnaPanel;
    }

    public void setMovilEnTablero(boolean movilEnTablero) {
        this.movilEnTablero = movilEnTablero;
    }
    
    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    
    public void setDatos(int[] datos) {
        this.datos = datos;
    }
    
    public void setTurno(int turno) {
        this.turno = turno;
    }
       
    public void setJugador1Vencedor(boolean isJugador1Vencedor) {
        this.jugador1Vencedor = isJugador1Vencedor;
    }
    
    public void setIsJugador1(boolean isJugador1) {
        this.isJugador1 = isJugador1;
    } 
    
    public void setCantFichasMax(int cantFichasMax) {
        this.cantFichasMax = cantFichasMax;
    }

    //Método para crear e inicializar una Matriz de Strings (apropiada para la partida)
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
    public String[][] copiaMatriz(String[][] matriz) {
        String[][] matrizCopia = new String[matriz.length][matriz[0].length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matrizCopia[fila][columna] = matriz[fila][columna];
            }
        }
        return matrizCopia;
    }

    //Método para colocar el panel en el tablero
    public String[][] colocarPanel(String[][] panel, int fila, int columna, String[][] tablero) {
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
    public boolean sePuedeColocarPanel(int dimension, int fila, int columna, String[][] tablero) {
        return (((fila + dimension) <= tablero.length) && ((columna + dimension) <= tablero[0].length) && fila >= 0 && columna >= 0);
    }

    //Método que verifica y retorna la nueva posición del panel y si éste se pudo mover
    public int[] moverPanel(Partida game) {
        int filaNueva = 0;
        int columnaNueva = 0;
        String[][] tableroConPanel = game.getTable().getTableroConPanel();
        int dimension = game.getTable().getPanel().length;
        int filaPanel = game.getFilaPanel();
        int columnaPanel = game.getColumnaPanel();
        String direccion = game.getOpcion().substring(1,2);
        int distancia = Integer.parseInt(game.getOpcion().substring(2,3));
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
            retorno[1] = filaNueva;
            retorno[2] = columnaNueva;
        }    
        return retorno;
    }

    //Método para actualizar la matriz panel una vez se coloca o se mueve sobre el tablero
    public String[][] panelNuevo(String[][] tableroConPanel, int filaPanel, int columnaPanel, int dimension) {
        String[][] panelNuevo = matrizNueva(dimension);
        for (int fila = filaPanel; fila < (filaPanel + dimension); fila++) {
            for (int columna = columnaPanel; columna < (columnaPanel + dimension); columna++) {
                panelNuevo[fila - filaPanel][columna - columnaPanel] = tableroConPanel[fila][columna];
            }
        }
        return panelNuevo;
    }

    //Método para comprobar si una ficha se coloca sobre el panel (si no es así, la ficha también se coloca en el tablero sin panel)
    public boolean fichaSobrePanel(int filaFicha, int columnaFicha, Partida game) {
        return (filaFicha >= game.getFilaPanel() && filaFicha <= game.getFilaPanel() + game.getTable().getPanel().length &&
                columnaFicha >= game.getColumnaPanel() && columnaFicha <= game.getColumnaPanel() + game.getTable().getPanel().length);
    }

    //Método para contar puntos por jugada
    public int contarPuntos(String[][] matriz, String criterio) {
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

    //Método para sustituir las fichas en una simetría 
    public String[][] cambiarSimetriaTablero(Partida game, String[][] tablero, int fila, int columna, int dimensionSimetria, boolean tableroSinPanel) {
        String[][] copiaTablero = copiaMatriz(tablero);
        for (int i = fila; i < (fila + dimensionSimetria); i++) {
            for (int j = columna; j < (columna + dimensionSimetria); j++) {
                if (game.getTurno() % 2 != 0 && !tableroSinPanel){
                    copiaTablero[i][j] = "B";                 
                }
                if (game.getTurno() % 2 == 0 && !tableroSinPanel){
                    copiaTablero[i][j] = "N";
                }
                if(tableroSinPanel && !fichaSobrePanel(i, j, game)){
                    if (game.getTurno() % 2 != 0){
                        copiaTablero[i][j] = "B";
                    }
                    if (game.getTurno() % 2 == 0){
                        copiaTablero[i][j] = "N";
                    }
                }
            }
        }
        return copiaTablero;
    }
    
    //Método usado en el Observer, para actualizar el tablero desde otra ventana
    public void observar(){
        setChanged();
        notifyObservers();
    }
    
    //Método para pasar un String a número entero
    public int pasarANumero(String letra) {
        char l = letra.charAt(0);
        int num = l - 64;
        if (num < 0) {
            num = Integer.parseInt("" + l);
        }
        return num;
    }

    //Método para enumerar las posiciones según los respectivos puntajes de los Jugadores
    //(luego de ordenar la lista por puntajes)
    public ArrayList determinarPosicionesRanking(ArrayList<Jugador> listaJugadores) {
        ArrayList<Jugador> jugadores = listaJugadores;
        for(int i=0;i<jugadores.size();i++){
            jugadores.get(i).setPosicionRanking(i+1);
        }
        return jugadores;
    }

    //Método que devuelve un ArrayList de Jugadores dado en forma ordenada
    public ArrayList<Jugador> devolverJugadoresOrdenados(ArrayList<Jugador> listaJugadores) {
        Collections.sort(listaJugadores, new Comparator() {
            public int compare(Object param1, Object param2) {
                Jugador participante1 = (Jugador) param1;
                Jugador participante2 = (Jugador) param2;
                int aux = (participante2.getPartidasGanadas()) - participante1.getPartidasGanadas();
                if (aux == 0) {
                    aux = (participante2.getPartidasJugadas()) - participante1.getPartidasJugadas();
                }
                return aux;
            }
        });
        return listaJugadores;
    }
    
    //Método para acomodar la lista de jugadores adecuadamente para mostrar en el Ranking
    public ArrayList setListaJugadoresRanking(Partida juego){
        ArrayList<Jugador> jugadores = new ArrayList<Jugador> ();
        jugadores = actualizarDatosJugadores(juego);
        jugadores = devolverJugadoresOrdenados(jugadores);
        jugadores = determinarPosicionesRanking(jugadores);
        return jugadores;
    }
    
    //Método para agregar un jugador a una lista haciendo verificaciones correspondientes
    public void agregarJugador(Partida game, Jugador jugador) {
        ArrayList<String> alias = new ArrayList<>();
        ArrayList<Jugador> listaJugadores = game.getListaJugadores();
        if(!listaJugadores.isEmpty()){   
            for (int i = 0; i < listaJugadores.size(); i++) {
                alias.add(listaJugadores.get(i).getAlias());
            }
        }
        int pos = alias.indexOf(jugador.getAlias());
        if (pos == -1) {
            listaJugadores.add(jugador);
        } else {
            listaJugadores.get(pos).setNombre(jugador.getNombre());
            listaJugadores.get(pos).setEdad(jugador.getEdad());
        }
        game.setListaJugadores(listaJugadores);
    }

    //Método para actualizar los datos de un jugador 
    //(el caso de que este no se encuentre en la lista no debería verificarse pero se hace por precaución)
    public ArrayList actualizarDatosJugadores(Partida juego) {
        ArrayList<String> alias = new ArrayList<>();
        ArrayList<Jugador> listaJugadores = juego.getListaJugadores();
        Iterator<Jugador> it = listaJugadores.iterator();
        while(it.hasNext()){
            Jugador player = it.next();
            alias.add(player.getAlias());
        }
        int pos = alias.indexOf(juego.getJugador1().getAlias());
        if (pos == -1) {
            listaJugadores.add(juego.getJugador1());
        } else {
            listaJugadores.set(pos, juego.getJugador1());
        }
        pos = alias.indexOf(juego.getJugador2().getAlias());
            if (pos == -1) {
                listaJugadores.add(juego.getJugador2());
        } else {
            listaJugadores.set(pos, juego.getJugador2());
        }    
        return listaJugadores;
    }
    
    //Método usado para setear características del Tablero en caso de no abrirse una partida ya comenzada
    public void noPartidaCargada(Partida juego) {
        if (!juego.isPartidaCargada()) {
            juego.getTable().setMatrizTablero(Partida.matrizNueva(juego.getTable().getDimensionTablero()));
            juego.getTable().setTableroConPanel(Partida.matrizNueva(juego.getTable().getDimensionTablero()));
            juego.getTable().setPanel(Partida.matrizNueva(juego.getTable().getDimensionMovil()));
        }
    }

    //Método para contar puntos y mostrar ganador al finalizar una partida
    public void finPartida(Partida game) {
        int puntosJ1Tablero = game.contarPuntos(game.getTable().getMatrizTablero(), "B");
        int puntosJ2Tablero = game.contarPuntos(game.getTable().getMatrizTablero(), "N");
        int puntosJ1Panel = game.contarPuntos(game.getTable().getPanel(), "B");
        int puntosJ2Panel = game.contarPuntos(game.getTable().getPanel(), "N");
        if (game.isMovilEnTablero()) {
            if (puntosJ1Tablero + puntosJ1Panel > puntosJ2Tablero + puntosJ2Panel) {
                game.setJugador1Vencedor(true);
            } else {
                game.setJugador1Vencedor(false);
            }
        }
        if (!game.isMovilEnTablero()) {
            if (puntosJ1Tablero > puntosJ2Tablero) {
                game.setJugador1Vencedor(true);
            } else {
                game.setJugador1Vencedor(false);
            }
        }
    }
    
}
