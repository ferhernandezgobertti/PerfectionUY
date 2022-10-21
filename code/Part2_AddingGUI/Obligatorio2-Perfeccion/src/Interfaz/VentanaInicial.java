// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

package Interfaz;

import Dominio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaInicial extends javax.swing.JFrame implements ActionListener {

    private final Partida juego;
    private final Timer timer;

    public VentanaInicial(Partida game) {
        juego = game;
        initComponents();
        JLabel [] arrayEtiquetas = {lbl11, lbl12, lbl21, lbl22, lbl31, lbl32, lbl41, lbl42, lbl51, lbl52, lbl61, lbl62};
        ControlVentanas.seteoInicialDecoradoInicial(arrayEtiquetas);
        btnComenzar.setBackground(Color.WHITE);
        this.timer = new Timer(200, this);
        this.timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel [] arrayEtiquetas = {lbl11, lbl12, lbl21, lbl22, lbl31, lbl32, lbl41, lbl42, lbl51, lbl52, lbl61, lbl62};
        ControlVentanas.cambiarColorDecoradoInicial(arrayEtiquetas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenidoA = new javax.swing.JLabel();
        lblPerfeccion = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        lbl12 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl62 = new javax.swing.JLabel();
        lbl61 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(650, 440));
        setName("fondo"); // NOI18N
        setPreferredSize(new java.awt.Dimension(630, 410));
        getContentPane().setLayout(null);

        lblBienvenidoA.setBackground(new java.awt.Color(255, 255, 255));
        lblBienvenidoA.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        lblBienvenidoA.setForeground(new java.awt.Color(0, 0, 204));
        lblBienvenidoA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenidoA.setText("BIENVENIDO A");
        lblBienvenidoA.setOpaque(true);
        getContentPane().add(lblBienvenidoA);
        lblBienvenidoA.setBounds(160, 90, 330, 50);

        lblPerfeccion.setBackground(new java.awt.Color(255, 255, 255));
        lblPerfeccion.setFont(new java.awt.Font("PT Mono", 3, 70)); // NOI18N
        lblPerfeccion.setForeground(new java.awt.Color(0, 0, 255));
        lblPerfeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerfeccion.setText("PERFECCIÓN");
        lblPerfeccion.setOpaque(true);
        getContentPane().add(lblPerfeccion);
        lblPerfeccion.setBounds(80, 130, 500, 150);

        btnComenzar.setBackground(new java.awt.Color(255, 255, 255));
        btnComenzar.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(0, 0, 204));
        btnComenzar.setText("PULSA AQUÍ PARA COMENZAR");
        btnComenzar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComenzar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComenzar.setOpaque(true);
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComenzar);
        btnComenzar.setBounds(170, 280, 320, 80);

        lbl12.setOpaque(true);
        getContentPane().add(lbl12);
        lbl12.setBounds(450, 0, 250, 90);

        lbl22.setOpaque(true);
        getContentPane().add(lbl22);
        lbl22.setBounds(480, 90, 230, 70);

        lbl32.setOpaque(true);
        getContentPane().add(lbl32);
        lbl32.setBounds(550, 160, 160, 70);

        lbl42.setOpaque(true);
        getContentPane().add(lbl42);
        lbl42.setBounds(490, 230, 220, 60);

        lbl52.setOpaque(true);
        getContentPane().add(lbl52);
        lbl52.setBounds(490, 280, 210, 80);

        lbl62.setOpaque(true);
        getContentPane().add(lbl62);
        lbl62.setBounds(195, 360, 510, 70);

        lbl61.setOpaque(true);
        getContentPane().add(lbl61);
        lbl61.setBounds(0, 360, 200, 70);

        lbl51.setOpaque(true);
        getContentPane().add(lbl51);
        lbl51.setBounds(0, 270, 170, 90);

        lbl41.setOpaque(true);
        getContentPane().add(lbl41);
        lbl41.setBounds(0, 230, 170, 70);

        lbl31.setOpaque(true);
        getContentPane().add(lbl31);
        lbl31.setBounds(0, 140, 120, 90);

        lbl21.setOpaque(true);
        getContentPane().add(lbl21);
        lbl21.setBounds(0, 70, 170, 100);

        lbl11.setOpaque(true);
        getContentPane().add(lbl11);
        lbl11.setBounds(0, 0, 450, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        this.timer.stop();
        juego.setListaJugadores(ControlArchivos.leerJugadoresAuto());
        VentanaMenuInicial ventanaNueva = new VentanaMenuInicial(juego);
        ventanaNueva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnComenzarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
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
    private javax.swing.JLabel lblBienvenidoA;
    private javax.swing.JLabel lblPerfeccion;
    // End of variables declaration//GEN-END:variables

}
