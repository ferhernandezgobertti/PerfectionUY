// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

package Interfaz;

import Dominio.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaFinJuego extends javax.swing.JFrame implements ActionListener {

    private static Partida juego;
    private final Timer timer;
    
    public VentanaFinJuego(Partida game) {
        juego = game;
        initComponents();
        String ganador;
        if(juego.isJugador1Vencedor()){
            ganador = "GANADOR: "+juego.getJugador1().getAlias()+" (Jugador 1)";
        } else{
            ganador = "GANADOR: "+juego.getJugador2().getAlias()+" (Jugador 2)";
        }
        lblGanador.setText(ganador);
        JLabel [] arrayEtiquetas = {lbl11, lbl12, lbl21, lbl12, lbl31, lbl22, lbl41, lbl32, lbl51, lbl42, lbl61, lbl62};
        ControlVentanas.seteoInicialDecoradoInicial(arrayEtiquetas);
        this.timer = new Timer(200, this);
        this.timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lblGanador = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        lbl21 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl61 = new javax.swing.JLabel();
        lbl62 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 400));
        setMinimumSize(new java.awt.Dimension(700, 290));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lbl11.setOpaque(true);
        getContentPane().add(lbl11);
        lbl11.setBounds(0, 0, 150, 80);

        lbl12.setOpaque(true);
        getContentPane().add(lbl12);
        lbl12.setBounds(150, 0, 160, 80);

        lblGanador.setBackground(new java.awt.Color(255, 255, 255));
        lblGanador.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        lblGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanador.setOpaque(true);
        getContentPane().add(lblGanador);
        lblGanador.setBounds(100, 80, 500, 110);

        lbl22.setOpaque(true);
        getContentPane().add(lbl22);
        lbl22.setBounds(310, 0, 150, 80);

        lbl32.setOpaque(true);
        getContentPane().add(lbl32);
        lbl32.setBounds(460, 0, 140, 80);

        lbl42.setOpaque(true);
        getContentPane().add(lbl42);
        lbl42.setBounds(600, 0, 100, 80);

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 0, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setOpaque(true);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(600, 230, 100, 40);

        lbl21.setOpaque(true);
        getContentPane().add(lbl21);
        lbl21.setBounds(0, 80, 100, 110);

        lbl31.setOpaque(true);
        getContentPane().add(lbl31);
        lbl31.setBounds(0, 190, 150, 80);

        lbl41.setOpaque(true);
        getContentPane().add(lbl41);
        lbl41.setBounds(150, 190, 160, 80);

        lbl51.setOpaque(true);
        getContentPane().add(lbl51);
        lbl51.setBounds(310, 190, 150, 80);

        lbl61.setOpaque(true);
        getContentPane().add(lbl61);
        lbl61.setBounds(460, 190, 140, 80);

        lbl62.setOpaque(true);
        getContentPane().add(lbl62);
        lbl62.setBounds(600, 150, 100, 80);

        lbl52.setOpaque(true);
        getContentPane().add(lbl52);
        lbl52.setBounds(600, 80, 100, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.timer.stop();
        VentanaRanking ranking = new VentanaRanking (juego);
        ranking.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl61;
    private javax.swing.JLabel lbl62;
    private javax.swing.JLabel lblGanador;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel [] arrayEtiquetas = {lbl11, lbl12, lbl21, lbl22, lbl31, lbl32, lbl41, lbl42, lbl51, lbl52, lbl61, lbl62};
        ControlVentanas.cambiarColorDecoradoInicial(arrayEtiquetas);
    }
}
