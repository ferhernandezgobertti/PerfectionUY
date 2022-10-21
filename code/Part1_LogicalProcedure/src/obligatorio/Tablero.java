package obligatorio;
// PROGRAMACIÓN 2 - Obligatorio 1
// Fernando Hernández (173631 - Ingeniería en Telecomunicaciones) - Sebastián Effa (193248 - Ingeniería en Electrónica)

public class Tablero {
    
    //Atributos de la clase Tablero
    private String[][] matrizTablero;
    private String[][] tableroConPanel;
    private int dimensionMovil;
    private int dimensionTablero;
    private String[][] panel;
    private String[][] tableroVacio;

    //Métodos de la clase Tablero
    public String[][] getTableroVacio() {
        return tableroVacio;
    }

    public void setTableroVacio(String[][] tableroVacio) {
        this.tableroVacio = tableroVacio;
    }

    public String[][] getPanel() {
        return panel;
    }

    public void setPanel(String[][] panel) {
        this.panel = panel;
    }
    
    public int getDimensionMovil() {
        return dimensionMovil;
    }

    public void setDimensionMovil(int dimensionMovil) {
        this.dimensionMovil = dimensionMovil;
    }

    public int getDimensionTablero() {
        return dimensionTablero;
    }

    public void setDimensionTablero(int dimensionTablero) {
        this.dimensionTablero = dimensionTablero;
    }
    
    public String[][] getMatrizTablero() {
        return matrizTablero;
    }

    public void setMatrizTablero(String[][] matrizTablero) {
        this.matrizTablero = matrizTablero;
    }

    public void setFichaMatrizTablero(int fila, int columna, String letra) {
        this.matrizTablero[fila][columna] = letra;
    }

    public String[][] getTableroConPanel() {
        return tableroConPanel;
    }

    public void setTableroConPanel(String[][] tableroConPanel) {
        this.tableroConPanel = tableroConPanel;
    }  
    
    public void setFichaTableroConPanel(int fila, int columna, String letra) {
        this.tableroConPanel[fila][columna] = letra;
    }
    
    //Método para buscar simetrías (utiliza simetrías debajo)
    public static int [] buscarSimetrias(String [][] tablero, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //Array cuyo primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        datos = simetrias4x4Lados(tablero, filaFicha, columnaFicha);
        if(datos[0] == 0){
            datos = simetrias4x4Lados(tablero, (filaFicha-1), columnaFicha);
        }
        if(datos[0] == 0){
            datos = simetrias4x4Lados(tablero, (filaFicha-2), columnaFicha);
        }
        if(datos[0] == 0){
            datos = simetrias4x4Lados(tablero, filaFicha, (columnaFicha-1));
        }
        if(datos[0] == 0){
            datos = simetrias4x4Lados(tablero, (filaFicha-2), (columnaFicha-2));
        }
        if(datos[0] == 0){
            datos = simetrias4x4Medio(tablero, filaFicha, columnaFicha);
        }
        if(datos[0] == 0){
            datos = simetrias3x3(tablero, filaFicha, columnaFicha);
        }
        if(datos[0] == 0){
            datos = simetrias2x2(tablero, filaFicha, columnaFicha);
        }
        return datos;
    }

    //Método general de detección de simetrías utilizado en los métodos posteriores
    public static int [] simetriaGeneral (String [][] matrizAuxiliar, int simetria, int filaFicha, int columnaFicha,
            int pasoFila, int pasoColumna, String [][] tablero, int [] datos){ 
        if((datos[0]==0) && (simetriaValida(tablero,simetria,filaFicha,columnaFicha))){
            for(int fila = filaFicha; fila < pasoFila; fila++){
                for(int columna = columnaFicha; columna < pasoColumna; columna++){
                    matrizAuxiliar[fila - filaFicha][columna - columnaFicha] = tablero[fila][columna];
                }
            }
            if(simetria == 2){
                datos = simetria2x2 (matrizAuxiliar, filaFicha, columnaFicha);
            }
            if(simetria == 3){
                datos = simetria3x3 (matrizAuxiliar, filaFicha, columnaFicha);
            }
            if(simetria == 4){
                datos = simetria4x4 (matrizAuxiliar, filaFicha, columnaFicha);
            }
        }
        return datos;
    }
     
    //Método general de verificación de simetría utilizado en los métodos posteriores
    public static int [] verificacionSimetria(int [] datos, int simetria, boolean condicion, int filaFicha, int columnaFicha){
        if(condicion){
            if(simetria == 2){
                datos[0] = 2;
                datos[1] = filaFicha;
                datos[2] = columnaFicha;
            }
            if(simetria == 3){
                datos[0] = 3;
                datos[1] = filaFicha;
                datos[2] = columnaFicha;
            }
            if(simetria == 4){
                datos[0] = 4;
                datos[1] = filaFicha;
                datos[2] = columnaFicha;
            }
        }
        return datos;
    }
    
    //Método para detectar las simetrías de 4x4
    public static int [] simetria4x4 (String [][] aux4x4, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //Array cuyo primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        if(filaFicha>=0 && columnaFicha>=0){
            try{
               datos = verificacionSimetria(datos, 4, aux4x4 [0][0].equals(aux4x4 [0][3]) && aux4x4 [0][1].equals(aux4x4 [0][2]) &&
                    aux4x4 [1][0].equals(aux4x4 [1][3]) && aux4x4 [1][1].equals(aux4x4 [1][2]) &&
                    aux4x4 [2][0].equals(aux4x4 [2][3]) && aux4x4 [2][1].equals(aux4x4 [2][2]) &&
                    aux4x4 [3][0].equals(aux4x4 [3][3]) && aux4x4 [3][1].equals(aux4x4 [3][2]), filaFicha, columnaFicha);
               
                datos = verificacionSimetria(datos, 4, datos[0] == 0 && aux4x4 [0][0].equals(aux4x4 [3][0]) && aux4x4 [1][0].equals(aux4x4 [2][0]) &&
                    aux4x4 [0][1].equals(aux4x4 [3][1]) && aux4x4 [1][1].equals(aux4x4 [2][1]) &&
                    aux4x4 [0][2].equals(aux4x4 [3][2]) && aux4x4 [1][2].equals(aux4x4 [2][2]) &&
                    aux4x4 [0][3].equals(aux4x4 [3][3]) && aux4x4 [1][3].equals(aux4x4 [2][3]), filaFicha, columnaFicha);
            }
            catch(NullPointerException e){
                datos [0] = 0;
            }
        }
        return datos;   
    }

    //Método para verificar las simetrías de 4x4 donde la pieza colocada se encuentre en sus extremos
    public static int [] simetrias4x4Lados(String [][] tablero, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //el primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        String [][] aux4x4 = new String [4][4];
        
        if(simetriaValida(tablero,4,filaFicha,columnaFicha)){
            for (int fila = filaFicha; fila < (filaFicha + 4); fila++) {
                for (int columna = columnaFicha; columna < (columnaFicha + 4); columna++) {
                    aux4x4[fila - filaFicha][columna - columnaFicha] = tablero[fila][columna];
                }
            }
            datos = simetria4x4 (aux4x4, filaFicha, columnaFicha);
        }
        
        datos = simetriaGeneral(aux4x4, 4, filaFicha-3, columnaFicha, filaFicha+1, columnaFicha+4, tablero, datos);
        datos = simetriaGeneral(aux4x4, 4, filaFicha, columnaFicha-3, filaFicha+4, columnaFicha+1, tablero, datos);
        datos = simetriaGeneral(aux4x4, 4, filaFicha-3, columnaFicha-3, filaFicha+1, columnaFicha+1, tablero, datos);
        
        for (int fila = 0; fila < 3; fila++) {
                for (int columna = 0; columna < 3; columna++) {
                    try{
                        if(aux4x4[fila][columna].equals(" ")){
                        datos [0] = 0;
                        }
                    }catch (Exception e){
                        datos [0] = 0;
                    }
                }
            }
        return datos;
    }  
    
    //Método para verificar el resto de las simetrías de 4x4 que no se verificaron en el método simetrias4x4Lados(String[][], int, int)
    public static int [] simetrias4x4Medio(String [][] tablero, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //Array cuyo primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        String [][] aux4x4 = new String [4][4];
        if(simetriaValida(tablero,4,(filaFicha-1),(columnaFicha-1))){
            for (int fila = (filaFicha-1); fila < (filaFicha + 3); fila++) {
                for (int columna = (columnaFicha-1); columna < (columnaFicha + 3); columna++) {
                    aux4x4[fila - (filaFicha-1)][columna - (columnaFicha-1)] = tablero[fila][columna];
                }
            }
            datos = simetria4x4 (aux4x4, (filaFicha-1), (columnaFicha-1));
        }
        
        datos = simetriaGeneral(aux4x4, 4, filaFicha-2, columnaFicha-1, filaFicha+2, columnaFicha+3, tablero, datos);
        datos = simetriaGeneral(aux4x4, 4, filaFicha-2, columnaFicha-2, filaFicha+2, columnaFicha+2, tablero, datos);
        datos = simetriaGeneral(aux4x4, 4, filaFicha-1, columnaFicha-2, filaFicha+3, columnaFicha+2, tablero, datos);
        
        
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                try{
                    if(aux4x4[fila][columna].equals(" ")){
                        datos [0] = 0;
                    }
                }catch (Exception e){
                    datos [0] = 0;
                }
            }
        }
        return datos;
    }
    
    //Método para detectar las simetrías de 3x3
    public static int [] simetria3x3 (String [][] aux3x3, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //Array cuyo primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        if(filaFicha>=0 && columnaFicha>=0){
            try{
                datos = verificacionSimetria (datos, 3, aux3x3[0][0].equals(aux3x3[0][2]) && aux3x3[1][0].equals(aux3x3[1][2]) &&
                        aux3x3[2][0].equals(aux3x3[2][2]), filaFicha, columnaFicha);
                datos = verificacionSimetria (datos, 3, aux3x3[0][0].equals(aux3x3[2][0]) && aux3x3[0][1].equals(aux3x3[2][1]) && 
                        aux3x3[0][2].equals(aux3x3[2][2]), filaFicha, columnaFicha);
            }
            catch(NullPointerException e){
                datos [0] = 0;
            }
        }
        return datos;
    }

    //Método para verificar las simetrías de 3x3 respecto a la última pieza colocada
    public static int [] simetrias3x3(String [][] tablero, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //Array cuyo primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        String [][] aux3x3 = new String [3][3];
        if(simetriaValida(tablero,3,filaFicha,columnaFicha)){
            for (int fila = filaFicha; fila < (filaFicha + 3); fila++) {
                for (int columna = columnaFicha; columna < (columnaFicha + 3); columna++) {
                    aux3x3[fila - filaFicha][columna - columnaFicha] = tablero[fila][columna];
                }
            }
            datos = simetria3x3 (aux3x3, filaFicha, columnaFicha);
        }
        
        datos = simetriaGeneral(aux3x3, 3, filaFicha-2, columnaFicha, filaFicha+1, columnaFicha+3, tablero, datos);
        datos = simetriaGeneral(aux3x3, 3, filaFicha-2, columnaFicha-2, filaFicha+1, columnaFicha+1, tablero, datos);
        datos = simetriaGeneral(aux3x3, 3, filaFicha, columnaFicha-2, filaFicha+3, columnaFicha+1, tablero, datos);
        datos = simetriaGeneral(aux3x3, 3, filaFicha-1, columnaFicha, filaFicha+2, columnaFicha+3, tablero, datos);
        datos = simetriaGeneral(aux3x3, 3, filaFicha-1, columnaFicha-2, filaFicha+2, columnaFicha+1, tablero, datos);
        datos = simetriaGeneral(aux3x3, 3, filaFicha-2, columnaFicha-1, filaFicha+1, columnaFicha+2, tablero, datos);
        datos = simetriaGeneral(aux3x3, 3, filaFicha, columnaFicha-1, filaFicha+3, columnaFicha+2, tablero, datos);
        datos = simetriaGeneral(aux3x3, 3, filaFicha-1, columnaFicha-1, filaFicha+2, columnaFicha+2, tablero, datos);
        
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                try{
                    if(aux3x3[fila][columna].equals(" ")){
                        datos [0] = 0;
                    }
                }
                catch (Exception e){
                        datos [0] = 0;
                }
            }
        }
        return datos;
    }

    //Método para detectar las simetrías de 2x2
    public static int [] simetria2x2(String [][] aux2x2, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //Array cuyo primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        if(filaFicha>=0 && columnaFicha>=0){
            try{
                datos = verificacionSimetria(datos, 2, aux2x2 [0][0].equals(aux2x2 [0][1]) && aux2x2 [1][0].equals(aux2x2 [1][1]), filaFicha, columnaFicha);
            }
                catch(Exception e){
                    datos [0] = 0;
                }
            try{
                datos = verificacionSimetria(datos, 2, aux2x2 [0][0].equals(aux2x2 [1][0]) && aux2x2 [0][1].equals(aux2x2 [1][1]), filaFicha, columnaFicha);
            }
            catch(Exception e){
                    datos [0] = 0;
                }
        }
        return datos;
    }

    //Método para verificar las simetrías de 2x2 respecto a la última pieza colocada
    public static int [] simetrias2x2(String [][] tablero, int filaFicha, int columnaFicha){
        int [] datos = {0,0,0}; //Array cuyo primer valor refiere a la dimension de la simetria (0 es que no hay), segundo y tercer valor son la posición
        String [][] aux2x2 = new String [2][2];
        if(simetriaValida(tablero,2,filaFicha,columnaFicha)){
            for (int fila = filaFicha; fila < (filaFicha + 2); fila++) {
                for (int columna = columnaFicha; columna < (columnaFicha + 2); columna++) {
                    aux2x2[fila - filaFicha][columna - columnaFicha] = tablero[fila][columna];
                }
            }
            datos = simetria2x2 (aux2x2, filaFicha, columnaFicha);
        }
        
        datos = simetriaGeneral(aux2x2, 2, filaFicha-1, columnaFicha, filaFicha+1, columnaFicha+2, tablero, datos);
        datos = simetriaGeneral(aux2x2, 2, filaFicha-1, columnaFicha-1, filaFicha+1, columnaFicha+1, tablero, datos);
        datos = simetriaGeneral(aux2x2, 2, filaFicha, columnaFicha-1, filaFicha+2, columnaFicha+1, tablero, datos);
        
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                try{
                    if(aux2x2[fila][columna].equals(" ")){
                        datos [0] = 0;
                    }
                }catch (Exception e){
                    datos [0] = 0;
                }
            }
        }
        return datos;
    }
    
    //Método para verificar si una simetría es válida
    public static boolean simetriaValida (String[][] matriz, int dimensionSimetria, int fila, int columna){
        boolean validez = false;
        boolean hayBlancas = false;
        boolean hayNegras = false;
        if((fila + (dimensionSimetria - 1)) < matriz.length && (columna + (dimensionSimetria - 1)) < matriz[0].length){
            validez=true;
        }
        if(fila>=0 && columna>=0 && validez){
            for (int f = fila; f < (fila + dimensionSimetria); f++) {
                for (int c = columna; c < (columna + dimensionSimetria); c++) {               
                    if(matriz[f][c].equals(" ")){
                        validez = false;
                    }    
                    if(matriz[f][c].equals("B")){
                        hayBlancas = true;
                    }
                    if(matriz[f][c].equals("N")){
                        hayNegras = true;
                    }                  
                }
            }
        }        
        return validez && hayBlancas && hayNegras;
    }
    
    //Método para mostrar una matriz dada en pantalla
    public static void mostrarMatriz(String[][] matriz, String separacion) {
    int numeroColumna = 1;
    String letras = "ABCDEFGH";
    String letra = "";
    int inicio = 0;
    int fin = 1;
    String espacio = "";
    if(matriz.length == 4){
        espacio = "";
    }
    if(matriz.length == 6){
        espacio = "  ";
    }
    if(matriz.length == 8){
        espacio = "   ";
    }
    
    System.out.print("    " + espacio + "    ");
    while(numeroColumna*2 < matriz.length){
        System.out.print(numeroColumna + "       ");
        numeroColumna++;
    }
    System.out.println("\n");
    for (int fila = 0; fila < matriz.length; fila++) {
        if(fila % 2 != 0){
            letra = letras.substring(inicio, fin);
            System.out.print(letra + "  ");
            inicio++;
            fin++;
        }
        if (fila % 2 == 0){
            System.out.print("    ");
        }
        for (int columna = 0; columna < matriz[0].length; columna++) {
            System.out.print(matriz[fila][columna]);
                if (columna != matriz[fila].length - 1) {
                    System.out.print(separacion);
                }
            }
            System.out.println("\n");
        }
    }

    //Método para decorar una matriz dada a modo del ejemplo presentado y mostrarla en pantalla
    public static void imprimirMatriz(String[][] matriz, String [][] panel, int filaP, int columnaP, boolean estaPanel, boolean vacio) {
        String[][] matrizNueva = new String[matriz.length * 2 + 1][matriz[0].length * 2 + 1];
        String[] array = arrayDeMatriz(matriz);
        int posicionArray = 0;
        for (int fila = 0; fila < matrizNueva.length; fila++) {
            for (int columna = 0; columna < matrizNueva[0].length; columna++) {
                if (fila % 2 == 0) {
                    if(columna % 2 == 0){
                        matrizNueva[fila][columna] = "+-+";
                    }
                    if(columna % 2 !=0){
                        matrizNueva[fila][columna] = "-+-";
                        if(columna == matrizNueva[0].length - 1){
                            matrizNueva[fila][columna] = "+";
                        }
                    }
                } 
                else {
                    if (columna % 2 == 0) {
                        matrizNueva[fila][columna] = "  |  ";
                    } else {
                        matrizNueva[fila][columna] = array[posicionArray];
                        if (vacio){
                            if (estaPanel && filaP <= fila && fila <= (filaP + panel.length*2 + 1) && columnaP <= columna && columna < (columnaP + panel[0].length*2 + 1)){
                                matrizNueva[fila][columna] = " ";
                    }
                        }
                        posicionArray++;
                        
                    }
                }
            }
        }
        if(estaPanel){
            matrizNueva = Juego.colocarString(matrizNueva,filaP*2,columnaP*2,(panel.length*2)+1,"#");
        }
        mostrarMatriz(matrizNueva, " ");
    }
    
    //Método para llenar un array con información brindada por una matriz dada
    public static String[] arrayDeMatriz(String[][] matriz) {
        String[] array = new String[matriz.length * matriz.length];
        int posicionArray = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                array[posicionArray] = matriz[fila][columna];
                posicionArray++;
            }
        }
        return array;
    }

     //Método para verificar si se puede colocar una ficha en la posición indicada
    public static boolean posicionValida (String[][] matriz, int fila, int columna){
        boolean validez = false;
        try{
            if(matriz[fila][columna].equals(" ") && fila<matriz.length && columna<matriz[0].length)
                validez=true;
        }
        catch(Exception e){}
        return validez;
    }
    
}
