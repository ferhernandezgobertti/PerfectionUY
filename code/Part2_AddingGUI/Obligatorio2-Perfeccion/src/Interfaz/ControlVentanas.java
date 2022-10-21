package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import Dominio.ControlArchivos;
import Dominio.Jugador;
import Dominio.Partida;
import Dominio.Tablero;
import Interfaz.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ControlVentanas {


    //Métodos para etiquetas de decorado usados en varias ventanas
    public static void seteoInicialDecoradoInicial(JLabel[] arrayEtiquetas) {
        arrayEtiquetas[0].setBackground(Color.RED);
        arrayEtiquetas[1].setBackground(Color.WHITE);
        arrayEtiquetas[2].setBackground(Color.WHITE);
        arrayEtiquetas[3].setBackground(Color.WHITE);
        arrayEtiquetas[4].setBackground(Color.WHITE);
        arrayEtiquetas[5].setBackground(Color.WHITE);
        arrayEtiquetas[6].setBackground(Color.WHITE);
        arrayEtiquetas[7].setBackground(Color.WHITE);
        arrayEtiquetas[8].setBackground(Color.WHITE);
        arrayEtiquetas[9].setBackground(Color.WHITE);
        arrayEtiquetas[10].setBackground(Color.WHITE);
        arrayEtiquetas[11].setBackground(Color.DARK_GRAY);
    }

    public static void cambiarColorDecoradoInicial(JLabel[] arrayEtiquetas) {
        if (!(arrayEtiquetas[0].getBackground().equals(Color.WHITE)) || !(arrayEtiquetas[11].getBackground().equals(Color.WHITE))) {
            arrayEtiquetas[0].setBackground(Color.WHITE);
            arrayEtiquetas[2].setBackground(Color.YELLOW);
            arrayEtiquetas[11].setBackground(Color.WHITE);
            arrayEtiquetas[9].setBackground(Color.ORANGE);
        } else if (!(arrayEtiquetas[2].getBackground().equals(Color.WHITE)) || !(arrayEtiquetas[9].getBackground().equals(Color.WHITE))) {
            arrayEtiquetas[2].setBackground(Color.WHITE);
            arrayEtiquetas[4].setBackground(Color.CYAN);
            arrayEtiquetas[9].setBackground(Color.WHITE);
            arrayEtiquetas[7].setBackground(Color.MAGENTA);
        } else if (!(arrayEtiquetas[4].getBackground().equals(Color.WHITE)) || !(arrayEtiquetas[7].getBackground().equals(Color.WHITE))) {
            arrayEtiquetas[4].setBackground(Color.WHITE);
            arrayEtiquetas[6].setBackground(Color.RED);
            arrayEtiquetas[7].setBackground(Color.WHITE);
            arrayEtiquetas[5].setBackground(Color.GREEN);
        } else if (!(arrayEtiquetas[6].getBackground().equals(Color.WHITE)) || !(arrayEtiquetas[5].getBackground().equals(Color.WHITE))) {
            arrayEtiquetas[6].setBackground(Color.WHITE);
            arrayEtiquetas[8].setBackground(Color.GRAY);
            arrayEtiquetas[5].setBackground(Color.WHITE);
            arrayEtiquetas[3].setBackground(Color.PINK);
        } else if (!(arrayEtiquetas[8].getBackground().equals(Color.WHITE)) || !(arrayEtiquetas[3].getBackground().equals(Color.WHITE))) {
            arrayEtiquetas[8].setBackground(Color.WHITE);
            arrayEtiquetas[10].setBackground(Color.BLUE);
            arrayEtiquetas[3].setBackground(Color.WHITE);
            arrayEtiquetas[1].setBackground(Color.LIGHT_GRAY);
        } else {
            arrayEtiquetas[10].setBackground(Color.WHITE);
            arrayEtiquetas[0].setBackground(Color.RED);
            arrayEtiquetas[1].setBackground(Color.WHITE);
            arrayEtiquetas[11].setBackground(Color.DARK_GRAY);
        }
    }

    //Método para pasar ArrayList de Jugadores a uno de Strings para mostrar adecuadamente a la hora de el actor seleccionar uno
    public static ArrayList<String> mostrarJugadores(ArrayList<Jugador> jugadores) {
        ArrayList<String> listaAMostrar = new ArrayList<String>();
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador aux = jugadores.get(i);
            listaAMostrar.add("Nombre: " + aux.getNombre() + "\t Edad: " + aux.getEdad() + "\t Alias: " + aux.getAlias());
        }
        return listaAMostrar;
    }

    //Método para colocar una Ficha (y su consiguiente verificación de simetría) en un tablero con panel (movilEnTablero == true)
    public static boolean colocarFichaTableroConPanel(Partida game) {
        boolean opcionCorrecta = false;
        int filaFicha = game.pasarANumero(game.getOpcion().substring(1, 2)) - 1;
        int columnaFicha = game.pasarANumero(game.getOpcion().substring(2, 3)) - 1;
        if (game.getTable().posicionValida(game.getTable().getTableroConPanel(), filaFicha, columnaFicha)) {
            if ((game.getTurno() % 2 != 0 && game.getJugador1().getCantidadFichas() == 0) || (game.getTurno() % 2 == 0 && game.getJugador2().getCantidadFichas() == 0)) {
                JOptionPane.showMessageDialog(null, "No tiene Fichas disponibles. Ingrese otra jugada", "ERROR", 0);
            }
            if ((game.getTurno() % 2 != 0) && (game.getJugador1().getCantidadFichas() > 0)) {
                game.getTable().setFichaTableroConPanel(filaFicha, columnaFicha, "B");
                if (!game.fichaSobrePanel(filaFicha, columnaFicha, game)) {
                    game.getTable().setFichaMatrizTablero(filaFicha, columnaFicha, "B");
                }
                opcionCorrecta = true;
                game.getJugador1().setCantidadFichas(game.getJugador1().getCantidadFichas() - 1);
            }
            if ((game.getTurno() % 2 == 0) && (game.getJugador2().getCantidadFichas() > 0)) {
                game.getTable().setFichaTableroConPanel(filaFicha, columnaFicha, "N");
                if (!game.fichaSobrePanel(filaFicha, columnaFicha, game)) {
                    game.getTable().setFichaMatrizTablero(filaFicha, columnaFicha, "N");
                }
                opcionCorrecta = true;
                game.getJugador2().setCantidadFichas(game.getJugador2().getCantidadFichas() - 1);
            }
            int[] datos = Tablero.buscarSimetrias(game.getTable().getTableroConPanel(), filaFicha, columnaFicha);
            game.setDatos(datos);
            if (datos[0] != 0) {
                String color = "blancas";
                if (game.getTurno() % 2 == 0) {
                    color = "negras";
                }
                JOptionPane.showMessageDialog(null, "<html><FONT SIZE=5>Se ha encontrado la siguiente simetría.</FONT></html>\nLas posiciones señaladas  con celeste se sustituyen por fichas " + color, null, 2);
                game.getTable().setTableroConPanel(game.cambiarSimetriaTablero(game, game.getTable().getTableroConPanel(), datos[1], datos[2], datos[0], false));
                game.getTable().setMatrizTablero(game.cambiarSimetriaTablero(game, game.getTable().getMatrizTablero(), datos[1], datos[2], datos[0], true));
            }
            game.getTable().setPanel(game.panelNuevo(game.getTable().getTableroConPanel(), game.getFilaPanel(), game.getColumnaPanel(), game.getTable().getPanel().length));
        }
        return opcionCorrecta;
    }

    //Método para colocar una Ficha (y su consiguiente verificación de simetría) en un tablero sin panel (movilEnTablero == false)
    public static boolean colocarFichaTableroSinPanel(Partida game) {
        boolean opcionCorrecta = false;
        int filaFicha = game.pasarANumero(game.getOpcion().substring(1, 2)) - 1;
        int columnaFicha = game.pasarANumero(game.getOpcion().substring(2, 3)) - 1;
        if (Tablero.posicionValida(game.getTable().getMatrizTablero(), filaFicha, columnaFicha)) {
            if ((game.getTurno() % 2 != 0 && game.getJugador1().getCantidadFichas() == 0) || (game.getTurno() % 2 == 0 && game.getJugador2().getCantidadFichas() == 0)) {
                JOptionPane.showMessageDialog(null, "No tiene Fichas disponibles. Ingrese otra jugada", "ERROR", 0);
            }
            if ((game.getTurno() % 2 != 0) && (game.getJugador1().getCantidadFichas() > 0)) {
                game.getTable().setFichaMatrizTablero(filaFicha, columnaFicha, "B");
                opcionCorrecta = true;
                game.getJugador1().setCantidadFichas(game.getJugador1().getCantidadFichas() - 1);
            }
            if ((game.getTurno() % 2 == 0) && (game.getJugador2().getCantidadFichas() > 0)) {
                game.getTable().setFichaMatrizTablero(filaFicha, columnaFicha, "N");
                opcionCorrecta = true;
                game.getJugador2().setCantidadFichas(game.getJugador2().getCantidadFichas() - 1);
            }
            int[] datos = Tablero.buscarSimetrias(game.getTable().getMatrizTablero(), filaFicha, columnaFicha);
            game.setDatos(datos);
            if (datos[0] != 0) {
                String color = "blancas.";
                if (game.getTurno() % 2 == 0) {
                    color = "negras.";
                }
                JOptionPane.showMessageDialog(null, "<html><FONT SIZE=5>Se ha encontrado la siguiente simetría.</FONT></html>\nLas posiciones señaladas  con celeste se sustituyen por fichas " + color, null, 2);
                game.getTable().setMatrizTablero(game.cambiarSimetriaTablero(game, game.getTable().getMatrizTablero(), game.getDatos()[1], game.getDatos()[2], game.getDatos()[0], false));
            }
        }
        return opcionCorrecta;
    }

    //Método ejecutado al cerrar una ventana o al abandonar el juego en el menu final, guarda jugadores y despide
    public static void salir(JFrame ventana, ArrayList<Jugador> listaJugadores) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(ventana, "Seguro desea salir del programa?", null,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            ControlArchivos.grabarJugadoresAuto(listaJugadores);
            VentanaDespedida despedida = new VentanaDespedida();
            despedida.setVisible(true);
            ventana.setVisible(false);
        }
    }
        
    public static void abrirVentanasJuego(Partida juego){
        VentanaInstrucciones instrucciones = new VentanaInstrucciones(juego);
        VentanaComandos comandos = new VentanaComandos(juego);
        VentanaJuego juegoNuevo = new VentanaJuego(juego, comandos, instrucciones);
        comandos.setVisible(true);
        juegoNuevo.setVisible(true); 
        instrucciones.setVisible(true);
    }
    
    public static void cambiarDecoracionBoton(JButton boton){
        if(!boton.getBackground().equals(Color.MAGENTA)){
            boton.setBackground(Color.GREEN);
        } else if(boton.getBackground().equals(Color.GREEN)){
            boton.setBackground(Color.YELLOW);
        } else if(boton.getBackground().equals(Color.YELLOW)){
            boton.setBackground(Color.ORANGE);
        } else if(boton.getBackground().equals(Color.ORANGE)){
            boton.setBackground(Color.CYAN);
        } else {
            boton.setBackground(Color.MAGENTA);
        }
    }
    
}
