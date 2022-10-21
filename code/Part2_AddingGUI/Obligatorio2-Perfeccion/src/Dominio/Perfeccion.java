//Obligatorio 2 - PROGRAMACION 2
//Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
//Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

package Dominio;

import Interfaz.*;

public class Perfeccion {
    
    public static void main(String[] args) {
        Partida game = new Partida();
        VentanaInicial ventanaNueva = new VentanaInicial(game);
        ventanaNueva.setVisible(true);
    }  
    
}
