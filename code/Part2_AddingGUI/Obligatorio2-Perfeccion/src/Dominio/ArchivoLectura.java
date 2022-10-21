package Dominio;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica


import java.io.*;

public class ArchivoLectura {
    
    String linea = "";
    BufferedReader in;
    
    public ArchivoLectura (String unNombre){
        try{
            in = new BufferedReader (new FileReader (unNombre));
        }
        catch(FileNotFoundException e){}
    }
    public boolean hayMasLineas(){
        try{
            linea = in.readLine();
        }
        catch(IOException e){
            linea = null;
        }
        return (linea!=null);
    }
    
    public String linea(){
        return linea;
    }
    
    public boolean cerrar(){
        boolean ok = true;
        try{
            in.close();
        }
        catch(Exception e){
            ok = false;
        }
        return ok;
    }
    
}
