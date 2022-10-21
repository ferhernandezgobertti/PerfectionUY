package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import Dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaSeleccionJugador extends javax.swing.JFrame {

    public Partida juego;
    private ArrayList<String> listaAMostrar;

    public VentanaSeleccionJugador(Partida game) {
        juego = game;
        initComponents();
        listaAMostrar = ControlVentanas.mostrarJugadores(juego.getListaJugadores());
        lstJugadores.setListData(listaAMostrar.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstJugadores = new javax.swing.JList();
        btnElegir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(500, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lstJugadores.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(lstJugadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 470, 370);

        btnElegir.setBackground(new java.awt.Color(255, 255, 255));
        btnElegir.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnElegir.setForeground(new java.awt.Color(0, 0, 255));
        btnElegir.setText("ELEGIR");
        btnElegir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.blue, java.awt.Color.black, java.awt.Color.blue));
        btnElegir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElegir.setOpaque(true);
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });
        getContentPane().add(btnElegir);
        btnElegir.setBounds(30, 440, 170, 50);

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Seleccione su Jugador:");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(20, 10, 450, 50);

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
        btnAyuda.setBounds(400, 440, 50, 50);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(204, 204, 204)));
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(230, 439, 140, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
        accionSeleccionarJugador();
    }//GEN-LAST:event_btnElegirActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Seleccione un jugador de los desplegados que se encontraban en el archivo previamente seleccionado."
                + "\nA continuación presione Continuar");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        accionCancelarSeleccionJugador();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnElegir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JList lstJugadores;
    // End of variables declaration//GEN-END:variables


public void accionSeleccionarJugador (){
        boolean correcto = false;
        if (!lstJugadores.isSelectionEmpty()) {
            if(juego.isJugador1()){
                if((juego.getJugador2().isListoRegistroJugador()) && 
                        !juego.getListaJugadores().get(lstJugadores.getSelectedIndex()).equals(juego.getJugador2()) ||
                        !juego.getJugador2().isListoRegistroJugador()){
                    juego.setJugador1(juego.getListaJugadores().get(lstJugadores.getSelectedIndex()));
                    juego.getJugador1().setListoRegistroJugador(true);
                    correcto = true;      
                }  
            }
            if(!juego.isJugador1()){
                if((juego.getJugador1().isListoRegistroJugador()) && 
                        !juego.getListaJugadores().get(lstJugadores.getSelectedIndex()).equals(juego.getJugador1()) ||
                        !juego.getJugador1().isListoRegistroJugador()){
                    juego.setJugador2(juego.getListaJugadores().get(lstJugadores.getSelectedIndex()));
                    juego.getJugador2().setListoRegistroJugador(true);
                    correcto = true;      
                }
            }
            if(correcto){
                JOptionPane.showMessageDialog(null, "Jugador Seleccionado.", "FELICITACIONES", 2);
                 setVisible(false);
                VentanaMenuInicial menuInicial = new VentanaMenuInicial(juego);
                menuInicial.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "No puede jugar contra si mismo.\nVuelva a seleecionar un jugador", "ERROR", 0);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un jugador antes de proseguir. Disculpe las molestias", "ERROR", 0);
        }
    }

    public void accionCancelarSeleccionJugador(){
        if(juego.isJugador1()){
            juego.getJugador1().setListoRegistroJugador(false);
        }
        else{
            juego.getJugador2().setListoRegistroJugador(false);
        }
        setVisible(false);
        VentanaMenuInicial menu = new VentanaMenuInicial(juego);
        menu.setVisible(true);
    }

}