package obligatorio;
// PROGRAMACIÓN 2 - Obligatorio 1
// Fernando Hernández (173631 - Ingeniería en Telecomunicaciones) - Sebastián Effa (193248 - Ingeniería en Electrónica)

import java.util.*;

public class Jugador {
    
    //Atributos de la clase Jugador
    private String nombre;
    private int edad;
    private String alias;
    private String ficha;
    private int partidasGanadas;
    private int partidasJugadas;
    private ArrayList<String> calificaciones;
    private int cantidadFichas;
    
    //Constructor por Defecto (sin Parámetros)
    public Jugador(){
        this.setNombre("Sin nombre.");
        this.setEdad(0);
        this.setAlias("Sin alias");
        this.setFicha("Sin ficha");
        this.setPartidasGanadas(0);
        this.setPartidasJugadas(0);
        this.setCantidadFichas(0);
    }
    
    //Métodos de la clase Jugador
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getAlias(){
        return alias;
    }
    
    public String getFicha(){
        return ficha;
    }
    
    public int getPartidasGanadas(){
        return partidasGanadas;
    }
    
     public int getPartidasJugadas(){
        return partidasJugadas;
    }
     
     public int getCantidadFichas(){
         return cantidadFichas;
     }
     
     public ArrayList<String> getCalificaciones() {
        return calificaciones;
    }
    
    public void setNombre(String unNombre){
        this.nombre=unNombre;
    }
    
    public void setEdad(int unaEdad){
        this.edad=unaEdad;
    }
    
    public void setAlias(String unAlias){
        this.alias=unAlias;
    }
    
    public void setFicha(String unaFicha){
        this.ficha=unaFicha;
    }
    
    public void setPartidasGanadas(int unaPartidaGanada){
        this.partidasGanadas=unaPartidaGanada;
    }
    
    public void setPartidasJugadas(int unaPartidaJugada){
        this.partidasJugadas=unaPartidaJugada;
    }
    
    public void setCantidadFichas (int unaCantidadFichas){
        this.cantidadFichas=unaCantidadFichas;
    }
    
    public void setCalificaciones(ArrayList<String> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString(){
        return "\nPARTIDAS JUGADAS: "+this.getPartidasJugadas()+"   FICHAS ÚLTIMAS JUGADAS: "+this.getFicha()
                +"\n"+"Nombre: "+this.getNombre()+"   Edad: "+this.getEdad()+"    Alias: "+this.getAlias()
                +"\nPARTIDAS GANADAS: "+this.getPartidasGanadas()+"   CALIFICACIÓN/ES: "+this.getCalificaciones()+"\n\n";
    }
    
    //Redefinición del Método equals(Object o) en clase Jugador
    public boolean equals(Jugador o){
        boolean ok = this.getNombre().equals(o.getNombre()) && this.getEdad()==o.getEdad() && this.getAlias().equals(o.getAlias());
        return ok;
        
    }
 }
