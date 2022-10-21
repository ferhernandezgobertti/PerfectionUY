package Interfaz;

import Dominio.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.border.BevelBorder.*;
import javax.swing.border.Border;

public class VentanaJuego extends javax.swing.JFrame implements Observer {

    private JButton [][] botones;
    private int dimension;
    public Partida juego;
    private String movimiento;
    private VentanaComandos comandos;
    private VentanaInstrucciones instrucciones;
    private boolean primeraJugada;
    public Border bordeBotones, bordePanel;
    public Color oscuro, claro;
    private Font fuente;
    
    public VentanaJuego(Partida game, VentanaComandos comands, VentanaInstrucciones instructions) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        primeraJugada = true;
        this.juego = game;
        int jugador = 1;
        comandos = comands;
        instrucciones = instructions;
        oscuro = new Color(20, 150, 255);
        claro = new Color(0, 200, 255);
        fuente = new Font("Helvetica Neue", Font.PLAIN, 20);
        juego.addObserver(this);
        bordeBotones = BorderFactory.createBevelBorder(LOWERED);
        bordePanel = BorderFactory.createBevelBorder(RAISED, Color.cyan, oscuro);
        dimension = juego.getTable().getDimensionTablero();
        if(!juego.isPartidaCargada()){
            juego.getTable().setMatrizTablero(Partida.matrizNueva(dimension));
            juego.getTable().setTableroConPanel(Partida.matrizNueva(dimension));
            juego.getTable().setPanel(Partida.matrizNueva(juego.getTable().getDimensionMovil()));
        }
        String letras ="ABCDEFGHIJK";
        setMinimumSize(new java.awt.Dimension(dimension*64, dimension*65));
        if(juego.getTurno()%2!=0){
            jugador = 2;
        }
        this.setTitle("TURNO DEL JUGADOR "+jugador);
        panelJuego.setLayout(new GridLayout(dimension+1, dimension+1));
        panelJuego.setSize(dimension*58, dimension*58);
        botones = new JButton[dimension+2][dimension+2]; 
        for (int i = 0; i < dimension+1; i++) { 
            for (int j = 0; j < dimension+1; j++) { 
                JButton jButton = new JButton();
                jButton.setFont(fuente);
                if(i!=0&&j!=0){
                    jButton.addActionListener(new VentanaJuego.ListenerBoton(i, j)); 
                }
                panelJuego.add(jButton); 
                botones[i][j] = jButton;
                botones[i][j].setSize(20, 20);
                botones[i][j].setBackground(Color.white);
                botones[i][j].setBorder(bordeBotones);
                if(juego.isMovilEnTablero() && i>juego.getFilaPanel() && i<=(juego.getFilaPanel()+juego.getTable().getPanel().length) &&
                        j>juego.getColumnaPanel() && j<=(juego.getColumnaPanel()+game.getTable().getPanel().length)){
                    botones[i][j].setBorder(bordePanel);
                    botones[i][j].setBackground(claro);
                }
                inicializacionTableroPredeterminado(botones, i, j, letras);
                if(i!=0 && j!=0){
                    if(game.isMovilEnTablero()){
                        botones[i][j].setText(game.getTable().getTableroConPanel()[i-1][j-1]);               
                    }
                    if(!game.isMovilEnTablero()){
                        botones[i][j].setText(game.getTable().getMatrizTablero()[i-1][j-1]);
                    }
                    if(botones[i][j].getText().equals("B")){
                        botones[i][j].setBackground(juego.getJugador1().getColor());
                    }
                    if(botones[i][j].getText().equals("N")){
                        botones[i][j].setBackground(juego.getJugador2().getColor());
                    }
                }
            } 
        }
    }

    
    @Override
    public void update(Observable o, Object arg) {
        if(!comandos.isVisible()){
            if(instrucciones.isVisible()){
                instrucciones.setVisible(false);
            }
            this.setVisible(false);
        }
        else{
            actualizarTablero();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJuego = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 360, 0, 0));
        setName("ventanaJuego"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(panelJuego);
        panelJuego.setBounds(20, 10, 350, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelJuego;
    // End of variables declaration//GEN-END:variables

    private class ListenerBoton implements ActionListener { 
        private int x; 
        private int y; 
        public ListenerBoton(int i, int j) { 
        // en el constructor se almacena la fila y columna que se presionó 
            x = i; 
            y = j; 
        } 
        public void actionPerformed(ActionEvent e) { 
        // cuando se presiona un botón, se ejecutará este método 
        clickBoton(x, y); 
        } 
    } 
    
    private void clickBoton(int fila, int columna) {
        if(primeraJugada && !juego.isPartidaCargada()){
            juego.setOpcion("J");
            primeraJugada = false;
        }
        movimiento = juego.getOpcion().substring(0,1);
        if(!movimiento.equals("M")){
            juego.setOpcion(movimiento+fila+columna);
            if (juego.isMovilEnTablero()) {
                if (movimiento.equals("J")) {   //Si el jugador desea ingresar una ficha estando el panel móvil en el tablero
                    if(!ControlVentanas.colocarFichaTableroConPanel(juego) && 
                            (juego.getTurno()%2!=0 && juego.getJugador1().getCantidadFichas()>0 || juego.getTurno()%2==0 && juego.getJugador2().getCantidadFichas()>0)){
                        JOptionPane.showMessageDialog(null, "ADVERTENCIA: No se puede colocar la ficha en esa posición.\n", "ERROR", 0);
                    }
                }
            }
            if (!juego.isMovilEnTablero()) {
                if (movimiento.equals("J")) {   //Si el jugador desea colocar una ficha NO estando el panel móvil en el tablero
                    if(juego.contarPuntos(juego.getTable().getMatrizTablero()," ") == 0){
                        JOptionPane.showMessageDialog(null, "ADVERTENCIA: no hay posiciones disponibles en el tablero, realice otra jugada.\n", "ERROR", 2);
                    }
                    else if(!ControlVentanas.colocarFichaTableroSinPanel(juego) && 
                            (juego.getTurno()%2!=0 && juego.getJugador1().getCantidadFichas()>0 || juego.getTurno()%2==0 && juego.getJugador2().getCantidadFichas()>0)){
                        JOptionPane.showMessageDialog(null, "ADVERTENCIA: No se puede colocar la ficha en esa posición.\n", "ERROR", 0);
                    }
                }
                if (movimiento.equals("P")) {   //Si el jugador desea colocar el panel móvil NO estando éste en el tablero
                    juego.getTable().setTableroConPanel(juego.copiaMatriz(juego.getTable().getMatrizTablero()));
                    if(juego.sePuedeColocarPanel(juego.getTable().getPanel().length, fila-1, columna-1, juego.getTable().getMatrizTablero())){
                        juego.setFilaPanel(fila-1);
                        juego.setColumnaPanel(columna-1);
                        juego.getTable().setTableroConPanel(juego.colocarPanel(juego.getTable().getPanel(), fila-1, columna-1, juego.getTable().getTableroConPanel()));
                        juego.setMovilEnTablero(true);
                        comandos.btnColocarMoverPanel.setText("MOVER PANEL");
                        comandos.txtCantidadPosiciones.setEnabled(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ADVERTENCIA: No se puede colocar el panel en esa posición.\n", "ERROR", 0);
                    }    
                }
            }
            if (movimiento.equals("L")) {
                Tablero.limpieza(juego, fila, columna);
                comandos.btnLimpieza.setText("FICHA LIMPIEZA");
            }
            actualizarTablero();
            juego.setTurno(juego.getTurno()+1);
        }
        else{
            JOptionPane.showMessageDialog(null, "ADVERTENCIA: Para mover el panel use la ventana COMANDOS.",null, 2);
        }
        if((((juego.contarPuntos(juego.getTable().getMatrizTablero()," ") + juego.contarPuntos(juego.getTable().getPanel()," ")) == 0) &&
                !juego.getJugador1().isTieneFichaLimpieza() && !juego.getJugador2().isTieneFichaLimpieza()) || 
                juego.getJugador1().getCantidadFichas()==0 && juego.getJugador2().getCantidadFichas()==0){
            juego.finPartida(juego);
            VentanaFinJuego fin = new VentanaFinJuego(juego);
            fin.setVisible(true);
            comandos.setVisible(false);
            juego.observar();
        }
    } 
    
    
    //Método utilizado para setear las letras y números junto a su formato referentes a los extremos del tablero
    public void inicializacionTableroPredeterminado(JButton[][] botones, int i, int j, String letras) {
        if (i == 0 && j > 0) {
            botones[0][j].setText(j + "");
            botones[0][j].setFont(botones[0][j].getFont().deriveFont(Font.BOLD));
            botones[i][j].setBackground(Color.blue);
        }
        if (j == 0 && i > 0) {
            botones[i][0].setText(letras.substring(i - 1, i));
            botones[i][0].setFont(botones[i][0].getFont().deriveFont(Font.BOLD));
            botones[i][j].setBackground(Color.blue);
        }
        if (i == 0 && j == 0) {
            botones[i][j].setBackground(Color.blue);
        }
    }
    
    //Método utilizado en la VentanaJuego para actualizar el tablero, título y botones
    public void actualizarTablero() {
        actualizarTitulo();
        instrucciones.actualizarInstrucciones();
        int[] datos = juego.getDatos();
        int[] datosVacios = {0, 0, 0};
        for (int i = 0; i <= juego.getTable().getMatrizTablero().length; i++) {
            for (int j = 0; j <= juego.getTable().getMatrizTablero().length; j++) {
                if (i != 0 && j != 0) {
                    botones[i][j].setBorder(bordeBotones);
                    botones[i][j].setBackground(Color.white);
                    if (juego.isMovilEnTablero() && i > juego.getFilaPanel() && 
                            i <= (juego.getFilaPanel() + juego.getTable().getPanel().length)
                            && j > juego.getColumnaPanel() && 
                            j <= (juego.getColumnaPanel() + juego.getTable().getPanel().length)) {
                        botones[i][j].setBorder(bordePanel);
                        botones[i][j].setBackground(claro);
                    }
                    if (juego.isMovilEnTablero()) {
                        botones[i][j].setText(juego.getTable().getTableroConPanel()[i - 1][j - 1]);
                    }
                    else{
                        botones[i][j].setText(juego.getTable().getMatrizTablero()[i - 1][j - 1]);
                    }
                    if (botones[i][j].getText().equals("B")) {
                        botones[i][j].setBackground(juego.getJugador1().getColor());
                    }
                    if (botones[i][j].getText().equals("N")) {
                        botones[i][j].setBackground(juego.getJugador2().getColor());
                    }
                    if (datos[0] != 0 && i > datos[1] && i <= (datos[0] + datos[1]) && j > datos[2] && j <= (datos[0] + datos[2])) {
                        botones[i][j].setBackground(oscuro);
                    }
                }
            }
        }
        juego.setDatos(datosVacios);
        juego.setOpcion("J");
    }
    
    //Método para actualizar el título de la ventanaJuego indicando el turno del jugador correspondiente
    public void actualizarTitulo() {
        int jugador;
        if (juego.getTurno() % 2 != 0) {
            jugador = 2;
        } else {
            jugador = 1;
        }
        setTitle("TURNO DEL JUGADOR " + jugador);
    }
}
