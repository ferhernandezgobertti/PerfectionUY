package Dominio;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import java.awt.*;
import java.io.*;

public class Jugador implements Serializable{

    //Atributos de la clase Jugador
    private String nombre, alias, ficha, calificacion;
    private int edad, partidasGanadas, partidasJugadas, cantidadFichas, puntos, posicionRanking;
    private boolean tieneFichaLimpieza, listoRegistroJugador, listoColorJugador;
    private Color color;
    
    //Constructor por Defecto (sin Parámetros)
    public Jugador(){
        this.setNombre("Sin nombre.");
        this.setEdad(1);
        this.setAlias("Sin alias");
        this.setFicha("Sin ficha");
        this.setPartidasGanadas(0);
        this.setPartidasJugadas(0);
        this.setCantidadFichas(0);
        this.setPuntos(0);
        this.setTieneFichaLimpieza(true);
        this.setListoRegistroJugador(false);
        this.setListoColorJugador(false);
    }
    
    public Jugador(String nombre, int edad, String alias, int partidasJugadas, int partidasGanadas, String calificacion){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setAlias(alias);
        this.setPartidasJugadas(partidasJugadas);
        this.setPartidasGanadas(partidasGanadas);
        this.setCalificacion(calificacion);
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
     
     public String getCalificacion() {
        return calificacion;
    }
     
     public Color getColor() {
        return color;
    }
     
     public int getPuntos() {
        return puntos;
    }
     
     public boolean isTieneFichaLimpieza() {
        return tieneFichaLimpieza;
    }
     
     public boolean isListoColorJugador() {
        return listoColorJugador;
    }
     
     public boolean isListoRegistroJugador() {
        return listoRegistroJugador;
    }
     
     public int getPosicionRanking() {
        return posicionRanking;
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
    
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public void setTieneFichaLimpieza(boolean tieneFichaLimpieza) {
        this.tieneFichaLimpieza = tieneFichaLimpieza;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

     public void setColor(Color color) {
        this.color = color;
    }
     
     public void setListoRegistroJugador(boolean listoRegistroJugador) {
        this.listoRegistroJugador = listoRegistroJugador;
    }
     
     public void setListoColorJugador(boolean listoColorJugador) {
        this.listoColorJugador = listoColorJugador;
    }
     
     public void setPosicionRanking(int posicionRanking) {
        this.posicionRanking = posicionRanking;
    }
    
     @Override
     public String toString (){
         return "POSICIÓN: "+this.getPosicionRanking()+".\n NOMBRE: "+this.getNombre()+",\tEDAD: "+this.getEdad()+",\tALIAS: "+this.getAlias()+
                 "\nPartidas Jugadas:"+this.getPartidasJugadas()+",\tPartidas Ganadas: "+this.getPartidasGanadas()+",\tCalificación: "+this.getCalificacion()+"\n";
     }
     
    //Redefinición del Método equals
    public boolean equals(Jugador o){
        boolean ok = this.getAlias().equals(o.getAlias());
        return ok;
    }
    
 }
