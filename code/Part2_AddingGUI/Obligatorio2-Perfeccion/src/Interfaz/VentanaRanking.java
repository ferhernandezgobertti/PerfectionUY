package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

//TODO LO NO ESPECIFICADO EN LA LETRA SE REALIZO AL MEJOR PARECER

import Dominio.*;
import javax.swing.*;

public class VentanaRanking extends javax.swing.JFrame {

    private Partida juego;

    public VentanaRanking(Partida game) {
        juego = game;
        initComponents();
        juego.getJugador1().setPartidasJugadas(juego.getJugador1().getPartidasJugadas()+1);
        juego.getJugador2().setPartidasJugadas(juego.getJugador2().getPartidasJugadas()+1);
        if(juego.isJugador1Vencedor()){
            juego.getJugador1().setPartidasGanadas(juego.getJugador1().getPartidasGanadas()+1);    
        }
        else{
            juego.getJugador2().setPartidasGanadas(juego.getJugador2().getPartidasGanadas()+1);
        }
        juego.setListaJugadores(juego.setListaJugadoresRanking(juego));
        lstRankingMundial.setListData(juego.getListaJugadores().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstRankingMundial = new javax.swing.JList();
        btnContinuar = new javax.swing.JButton();
        lblRanking = new javax.swing.JLabel();
        btnAyudaJugarNuevamente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 250, 1100, 480));
        setMinimumSize(new java.awt.Dimension(1100, 480));
        setPreferredSize(new java.awt.Dimension(540, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lstRankingMundial.setFont(new java.awt.Font("Telugu Sangam MN", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(lstRankingMundial);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 1080, 300);

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(51, 51, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.blue, java.awt.Color.lightGray));
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar.setOpaque(true);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(230, 380, 660, 50);

        lblRanking.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblRanking.setForeground(new java.awt.Color(51, 51, 255));
        lblRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRanking.setText("RANKING MUNDIAL");
        lblRanking.setMinimumSize(new java.awt.Dimension(450, 440));
        getContentPane().add(lblRanking);
        lblRanking.setBounds(160, 10, 770, 50);

        btnAyudaJugarNuevamente.setBackground(new java.awt.Color(255, 255, 255));
        btnAyudaJugarNuevamente.setFont(new java.awt.Font("Kannada Sangam MN", 1, 24)); // NOI18N
        btnAyudaJugarNuevamente.setForeground(new java.awt.Color(0, 0, 255));
        btnAyudaJugarNuevamente.setText("?");
        btnAyudaJugarNuevamente.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.blue));
        btnAyudaJugarNuevamente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAyudaJugarNuevamente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyudaJugarNuevamente.setOpaque(true);
        btnAyudaJugarNuevamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaJugarNuevamenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyudaJugarNuevamente);
        btnAyudaJugarNuevamente.setBounds(990, 380, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        VentanaMenuFinal menuFinal = new VentanaMenuFinal(juego);
        menuFinal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAyudaJugarNuevamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaJugarNuevamenteActionPerformed
        JOptionPane.showMessageDialog(null, "Vea nuestro Ranking Mundial y luego presione 'CONTINUAR'");
    }//GEN-LAST:event_btnAyudaJugarNuevamenteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaJugarNuevamente;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRanking;
    private javax.swing.JList lstRankingMundial;
    // End of variables declaration//GEN-END:variables
}
