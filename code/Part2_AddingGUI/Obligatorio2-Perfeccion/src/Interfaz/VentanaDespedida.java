// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

package Interfaz;

import Dominio.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaDespedida extends javax.swing.JFrame implements ActionListener{

    private final Timer timer;
    
    public VentanaDespedida() {
        initComponents();
        JLabel [] arrayEtiquetas = {lbl11, lbl12, lbl21, lbl22, lbl31, lbl32, lbl41, lbl42, lbl51, lbl52, lbl61, lbl62};
        ControlVentanas.seteoInicialDecoradoInicial(arrayEtiquetas);
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

        lblMuchasGracias = new javax.swing.JLabel();
        lblHastaPronto = new javax.swing.JLabel();
        btnGranJuego = new javax.swing.JButton();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl62 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl61 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 300, 740, 360));
        setMinimumSize(new java.awt.Dimension(740, 360));
        getContentPane().setLayout(null);

        lblMuchasGracias.setBackground(new java.awt.Color(255, 255, 255));
        lblMuchasGracias.setFont(new java.awt.Font("STHeiti", 1, 36)); // NOI18N
        lblMuchasGracias.setForeground(new java.awt.Color(0, 0, 255));
        lblMuchasGracias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMuchasGracias.setText("MUCHAS GRACIAS POR JUGAR!!!");
        lblMuchasGracias.setOpaque(true);
        getContentPane().add(lblMuchasGracias);
        lblMuchasGracias.setBounds(80, 70, 580, 70);

        lblHastaPronto.setBackground(new java.awt.Color(255, 255, 255));
        lblHastaPronto.setFont(new java.awt.Font("MS Reference Specialty", 1, 36)); // NOI18N
        lblHastaPronto.setForeground(new java.awt.Color(0, 0, 255));
        lblHastaPronto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHastaPronto.setText("HASTA PRONTO!!!");
        lblHastaPronto.setMaximumSize(new java.awt.Dimension(311, 300));
        lblHastaPronto.setOpaque(true);
        getContentPane().add(lblHastaPronto);
        lblHastaPronto.setBounds(220, 140, 330, 80);

        btnGranJuego.setBackground(new java.awt.Color(255, 255, 255));
        btnGranJuego.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        btnGranJuego.setForeground(new java.awt.Color(0, 0, 255));
        btnGranJuego.setText("GRAN JUEGO!");
        btnGranJuego.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray));
        btnGranJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGranJuego.setOpaque(true);
        btnGranJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGranJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGranJuego);
        btnGranJuego.setBounds(270, 220, 220, 50);

        lbl11.setOpaque(true);
        getContentPane().add(lbl11);
        lbl11.setBounds(0, 0, 140, 70);

        lbl12.setOpaque(true);
        getContentPane().add(lbl12);
        lbl12.setBounds(140, 0, 170, 70);

        lbl22.setOpaque(true);
        getContentPane().add(lbl22);
        lbl22.setBounds(310, 0, 180, 70);

        lbl32.setOpaque(true);
        getContentPane().add(lbl32);
        lbl32.setBounds(490, 0, 170, 70);

        lbl31.setOpaque(true);
        getContentPane().add(lbl31);
        lbl31.setBounds(80, 140, 140, 80);

        lbl52.setOpaque(true);
        getContentPane().add(lbl52);
        lbl52.setBounds(550, 140, 210, 80);

        lbl62.setOpaque(true);
        getContentPane().add(lbl62);
        lbl62.setBounds(490, 220, 270, 50);

        lbl42.setOpaque(true);
        getContentPane().add(lbl42);
        lbl42.setBounds(660, 0, 100, 140);

        lbl21.setOpaque(true);
        getContentPane().add(lbl21);
        lbl21.setBounds(0, 70, 80, 150);

        lbl41.setOpaque(true);
        getContentPane().add(lbl41);
        lbl41.setBounds(3, 220, 270, 50);

        lbl51.setOpaque(true);
        getContentPane().add(lbl51);
        lbl51.setBounds(0, 270, 390, 70);

        lbl61.setOpaque(true);
        getContentPane().add(lbl61);
        lbl61.setBounds(390, 270, 370, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGranJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGranJuegoActionPerformed
        this.timer.stop();
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnGranJuegoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGranJuego;
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
    private javax.swing.JLabel lblHastaPronto;
    private javax.swing.JLabel lblMuchasGracias;
    // End of variables declaration//GEN-END:variables

}
