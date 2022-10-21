package Dominio;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class ControlArchivos {
    

    //Método para Guardar una Partida al desearlo un usuario
    public static boolean guardarPartida(Partida game, JFrame ventana) {
        boolean ok = false;
        try {
            JFileChooser guardar = new JFileChooser();
            int returnVal = guardar.showSaveDialog(ventana);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File direccion = guardar.getSelectedFile();
                ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(direccion));
                salida.writeObject(game);
                salida.close();
                ok = true;
            }  
        } catch (Exception e) {}
        return ok;
    }

    

    //Método para Buscar y Abrir un Archivo seleccionado por el usuario, usado para leer jugadores
    public static String buscarArchivo(String titulo, FileNameExtensionFilter filtro) {
        String direccion = null;
        JFileChooser buscador = new JFileChooser();
        buscador.setFileFilter(filtro);
        buscador.setDialogTitle(titulo);
        int opcion = buscador.showOpenDialog(buscador);
        buscador.setVisible(true);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            direccion = buscador.getSelectedFile().getAbsolutePath();
        }
        return direccion;
    }
    
    
    
    //Método que graba jugadores automaticamente al salir
    public static void grabarJugadoresAuto(ArrayList <Jugador> jugadores){
        File archivo = new File("datosJugadores");
        if(!jugadores.isEmpty()){
            for(int i=0;i<jugadores.size();i++){
                jugadores.get(i).setTieneFichaLimpieza(true);
            }
            try{
                ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo.getAbsolutePath()));
                salida.writeObject(jugadores);
                salida.close();
            }catch(Exception e){}
        }
    }
    
    //Método que lee jugadores automaticamente al iniciar el programa
    public static ArrayList<Jugador> leerJugadoresAuto(){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        File archivo = new File("datosJugadores");
        if(archivo.exists()){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo.getAbsolutePath()));
            jugadores = (ArrayList <Jugador>)entrada.readObject();
            entrada.close();
        }
        catch(Exception e){}
        }
        return jugadores;
    }
    
    
    
    
}
