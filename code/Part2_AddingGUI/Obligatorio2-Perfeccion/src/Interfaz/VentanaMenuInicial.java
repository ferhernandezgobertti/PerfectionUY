package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import javax.swing.*;
import Dominio.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaMenuInicial extends javax.swing.JFrame {

    public Partida juego;

    public VentanaMenuInicial(Partida game) {
        juego = game;
        initComponents();
        determinarTicks();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnContinuar = new javax.swing.JButton();
        lblJugador = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        lblMenuInicial = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        rdBtnJugador1 = new javax.swing.JRadioButton();
        rdBtnJugador2 = new javax.swing.JRadioButton();
        lblTick2b = new javax.swing.JLabel();
        lblTick2a = new javax.swing.JLabel();
        lblTick1b = new javax.swing.JLabel();
        lblTick1a = new javax.swing.JLabel();
        btnCargarPartida = new javax.swing.JButton();
        btnCargarJugadores = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(650, 470));
        setName("menuInicial"); // NOI18N
        setPreferredSize(new java.awt.Dimension(490, 445));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(51, 51, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.blue));
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setOpaque(true);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(290, 320, 260, 90);

        lblJugador.setFont(new java.awt.Font("Phosphate", 1, 48)); // NOI18N
        lblJugador.setForeground(new java.awt.Color(51, 51, 255));
        lblJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador.setText("JUGADORES");
        getContentPane().add(lblJugador);
        lblJugador.setBounds(270, 80, 330, 50);

        btnRegistro.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(51, 51, 255));
        btnRegistro.setText("REGISTRO NUEVO");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro);
        btnRegistro.setBounds(30, 210, 210, 90);

        btnSeleccionar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(51, 51, 255));
        btnSeleccionar.setText("<html>SELECCIONAR JUGADOR");
        btnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar);
        btnSeleccionar.setBounds(290, 230, 160, 80);

        btnColor.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnColor.setForeground(new java.awt.Color(0, 0, 255));
        btnColor.setText("ELEGIR COLOR");
        btnColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        getContentPane().add(btnColor);
        btnColor.setBounds(470, 230, 160, 80);

        lblMenuInicial.setFont(new java.awt.Font("Geneva", 1, 60)); // NOI18N
        lblMenuInicial.setForeground(new java.awt.Color(51, 51, 255));
        lblMenuInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuInicial.setText("MENÚ INICIAL");
        getContentPane().add(lblMenuInicial);
        lblMenuInicial.setBounds(0, 0, 650, 90);

        btnAyuda.setBackground(new java.awt.Color(255, 255, 255));
        btnAyuda.setFont(new java.awt.Font("Kannada Sangam MN", 1, 24)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(0, 0, 255));
        btnAyuda.setText("?");
        btnAyuda.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.blue));
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda.setOpaque(true);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda);
        btnAyuda.setBounds(560, 320, 60, 40);

        buttonGroup1.add(rdBtnJugador1);
        rdBtnJugador1.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        rdBtnJugador1.setForeground(new java.awt.Color(0, 0, 255));
        rdBtnJugador1.setText("JUGADOR 1");
        getContentPane().add(rdBtnJugador1);
        rdBtnJugador1.setBounds(280, 140, 160, 30);

        buttonGroup1.add(rdBtnJugador2);
        rdBtnJugador2.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        rdBtnJugador2.setForeground(new java.awt.Color(0, 0, 255));
        rdBtnJugador2.setText("JUGADOR 2");
        getContentPane().add(rdBtnJugador2);
        rdBtnJugador2.setBounds(280, 190, 160, 29);

        lblTick2b.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTick2b.setForeground(new java.awt.Color(0, 0, 255));
        lblTick2b.setText("Color: ✘");
        getContentPane().add(lblTick2b);
        lblTick2b.setBounds(540, 190, 60, 30);

        lblTick2a.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTick2a.setForeground(new java.awt.Color(0, 0, 255));
        lblTick2a.setText("Registro: ✘");
        getContentPane().add(lblTick2a);
        lblTick2a.setBounds(450, 190, 90, 30);

        lblTick1b.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTick1b.setForeground(new java.awt.Color(0, 0, 255));
        lblTick1b.setText("Color: ✘");
        getContentPane().add(lblTick1b);
        lblTick1b.setBounds(540, 140, 60, 30);

        lblTick1a.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTick1a.setForeground(new java.awt.Color(0, 0, 255));
        lblTick1a.setText("Registro: ✘");
        getContentPane().add(lblTick1a);
        lblTick1a.setBounds(450, 140, 90, 30);

        btnCargarPartida.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnCargarPartida.setForeground(new java.awt.Color(0, 0, 255));
        btnCargarPartida.setText("CARGAR PARTIDA");
        btnCargarPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargarPartida);
        btnCargarPartida.setBounds(30, 320, 210, 90);

        btnCargarJugadores.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnCargarJugadores.setForeground(new java.awt.Color(51, 51, 255));
        btnCargarJugadores.setText("CARGAR JUGADORES");
        btnCargarJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargarJugadores);
        btnCargarJugadores.setBounds(30, 100, 210, 90);

        btnRestaurar.setBackground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        btnRestaurar.setForeground(new java.awt.Color(0, 0, 255));
        btnRestaurar.setText("<html>Restaurar jugadores en sistema");
        btnRestaurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestaurar);
        btnRestaurar.setBounds(560, 370, 60, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        accionContinuarMenuInicial();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.setVisible(false);
        VentanaRegistroJugador registro = new VentanaRegistroJugador(juego);
        registro.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        accionSeleccionarMenuInicial();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        if (!rdBtnJugador1.isSelected() && (!rdBtnJugador2.isSelected())) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un jugador.", "ADVERTENCIA", 2);
        }    
        seteoColoresJugadores();
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Autentífiquese como Jugador a continuación\n\n"
                + "Opte por si cargar un jugador ya existente o si crear uno nuevo, luego selecciónelo.\n"
                + "A su vez, escoga el color del jugador de su preferencia. \n\nSi desea cargar la partida, cargará todos los datos de una partida previa sin terminar");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPartidaActionPerformed
        accionCargarPartida();
    }//GEN-LAST:event_btnCargarPartidaActionPerformed

    private void btnCargarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarJugadoresActionPerformed
        leerYCargarJugadores();
    }//GEN-LAST:event_btnCargarJugadoresActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        borrarJugadores();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCargarJugadores;
    private javax.swing.JButton btnCargarPartida;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblMenuInicial;
    public javax.swing.JLabel lblTick1a;
    public javax.swing.JLabel lblTick1b;
    public javax.swing.JLabel lblTick2a;
    public javax.swing.JLabel lblTick2b;
    public javax.swing.JRadioButton rdBtnJugador1;
    public javax.swing.JRadioButton rdBtnJugador2;
    // End of variables declaration//GEN-END:variables


    //Método para agregar Ticks al lado de cada Jugador indicando si ya se ha registrado y/o ha elegido su color
    public void determinarTicks() {
        try {
            if (juego.getJugador1().isListoRegistroJugador()) {
                lblTick1a.setText("Registro: ✓");
            }
            if (juego.getJugador2().isListoRegistroJugador()) {
                lblTick2a.setText("Registro: ✓");
            }
            if (juego.getJugador1().isListoColorJugador()) {
                lblTick1b.setText("Color: ✓");
                lblTick1b.setForeground(juego.getJugador1().getColor());
            }
            if (juego.getJugador2().isListoColorJugador()) {
                lblTick2b.setText("Color: ✓");
                lblTick2b.setForeground(juego.getJugador2().getColor());
            }
        } catch (Exception ex) {}
    }
    
    public void accionContinuarMenuInicial(){
        if (juego.getJugador1().isListoRegistroJugador() && juego.getJugador1().isListoColorJugador()
                && juego.getJugador2().isListoRegistroJugador() && juego.getJugador2().isListoColorJugador()) {
            VentanaTablero continuar = new VentanaTablero(juego);
            continuar.setVisible(true);
            setVisible(false);
        } 
        else if (!juego.isPartidaCargada()){
            JOptionPane.showMessageDialog(null, "Existen campos sin especificar. Hágalo correctamente, por favor.", "ERROR", 0);
        }
        else if (juego.isPartidaCargada()){
            setVisible(false);
            ControlVentanas.abrirVentanasJuego(juego);
        }
    }
    
    public void accionSeleccionarMenuInicial(){
        if ((!rdBtnJugador1.isSelected()) && (!rdBtnJugador2.isSelected())) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un jugador.", "ADVERTENCIA", 2);
        }    
        if ((((rdBtnJugador1.isSelected()) && (juego.getJugador1().isListoRegistroJugador())))
                    || ((rdBtnJugador2.isSelected()) && (juego.getJugador2().isListoRegistroJugador()))) {
                JOptionPane.showMessageDialog(null, "Disculpe, ya ha ingresado este campo.", "ADVERTENCIA", 2);
        }
        if(!juego.getListaJugadores().isEmpty()){
            if ((((rdBtnJugador1.isSelected()) && (!juego.getJugador1().isListoRegistroJugador())))
                    || ((rdBtnJugador2.isSelected()) && (!juego.getJugador2().isListoRegistroJugador()))){
                setVisible(false);
                seteoSeleccionJugador();
            }
        }
        else if(rdBtnJugador1.isSelected() || rdBtnJugador2.isSelected()){
            JOptionPane.showMessageDialog(null, "No hay jugadores en el sistema, registre al menos uno para mostrar.", "ADVERTENCIA", 2);
        }
    }
    
    //Método usado al momento de querer el Usuario seleccionar un Jugador
    public void seteoSeleccionJugador() {
        if (((rdBtnJugador1.isSelected()) && (!juego.getJugador1().isListoRegistroJugador()))) {
            juego.setIsJugador1(true);
        }
        if (((rdBtnJugador2.isSelected()) && (!juego.getJugador2().isListoRegistroJugador()))) {
            juego.setIsJugador1(false);
        }
        VentanaSeleccionJugador seleccion = new VentanaSeleccionJugador(juego);
        seleccion.setVisible(true);
    }
    
    //Método utilizado al momento de querer el Usuario setear un color a un Jugador
    public void seteoColoresJugadores() {
        if (rdBtnJugador1.isSelected()) {
            juego.setIsJugador1(true);
            juego.getJugador1().setListoColorJugador(true);
            VentanaColor color1 = new VentanaColor(juego);
            color1.setVisible(true);
            setVisible(false);
        }
        if (rdBtnJugador2.isSelected()) {
            juego.setIsJugador1(false);
            juego.getJugador2().setListoColorJugador(true);
            VentanaColor color2 = new VentanaColor(juego);
            color2.setVisible(true);
            setVisible(false);
        }
    }
    
    public void accionCargarPartida(){
        try{
            Partida game = abrirPartida();
            if(game.isPartidaCargada()){
                juego = game;
                JOptionPane.showMessageDialog(null, "Partida cargada con éxito", null, 1);
                setVisible(false);
                ControlVentanas.abrirVentanasJuego(juego);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al cargar la partida", null, 0);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar la partida", "ERROR", 0);
        }
    }
    
    //Método para Abrir o Cargar una Partida al así quererlo un usuario
    public Partida abrirPartida() {
        Partida juego = new Partida();
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ControlArchivos.buscarArchivo("Abrir Partida", null)));
            juego = (Partida) entrada.readObject();
            entrada.close();
            juego.setPartidaCargada(true);
        } catch (Exception e) {}
        return juego;
    }
    
    //Método para leer jugadores desde un archivo elegido
    public void leerYCargarJugadores() { 
        try{
            String direccion = ControlArchivos.buscarArchivo("Seleccione el archivo con jugadores a cargar", new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
            if(direccion != null){
                ArchivoLectura in = new ArchivoLectura(direccion);
                while (in.hayMasLineas()) {
                    if(!in.linea().isEmpty()){
                        String [] partes = in.linea().split("#");
                        int edad = Integer.parseInt(partes[1]);
                        Jugador jugador = new Jugador(partes[0], edad, partes[2], 0, 0, "Sin calificaciones");
                        juego.agregarJugador(juego, jugador);
                    }
                }
                JOptionPane.showMessageDialog(null, "Jugadores cargados con éxito", null, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer archivo\n"+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método para borrar todos los jugadores del sistema si el usuario así lo desea
    public void borrarJugadores(){
        int opcion = JOptionPane.showConfirmDialog(this, "SEGURO DESEA BORRAR TODOS LOS JUGADORES EN EL SISTEMA?\nEsta opción no se puede deshacer", "ADVERTENCIA", JOptionPane.OK_CANCEL_OPTION);
        if(opcion == JOptionPane.OK_OPTION){
            File archivo = new File("datosJugadores");
            if(juego.getListaJugadores().isEmpty() && !archivo.exists()) {
                JOptionPane.showMessageDialog(this, "No hay jugadores en el sistema que borrar", "Advertencia", 2);
            }
            else{
                if(archivo.exists()){
                    archivo.delete();
                }
                if(!juego.getListaJugadores().isEmpty()){
                    juego.setListaJugadores(new ArrayList<Jugador>());
                }
            }
        }
    }
    
}