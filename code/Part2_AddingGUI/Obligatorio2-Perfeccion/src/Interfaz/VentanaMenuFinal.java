// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

package Interfaz;

import Dominio.*;
import javax.swing.*;

public class VentanaMenuFinal extends javax.swing.JFrame {

    private Partida juego;
    
    public VentanaMenuFinal(Partida game) {
        juego = game;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuFinal = new javax.swing.JLabel();
        btnAbandonarJuego = new javax.swing.JButton();
        btnCalificar = new javax.swing.JButton();
        btnJugarNuevamente = new javax.swing.JButton();
        btnAyudaJugarNuevamente = new javax.swing.JButton();
        btnAyudaCalificarJuego = new javax.swing.JButton();
        btnAyudaAbandonarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 450, 500));
        setMinimumSize(new java.awt.Dimension(450, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblMenuFinal.setFont(new java.awt.Font("Geneva", 1, 60)); // NOI18N
        lblMenuFinal.setForeground(new java.awt.Color(51, 51, 255));
        lblMenuFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuFinal.setText("MENU FINAL");
        getContentPane().add(lblMenuFinal);
        lblMenuFinal.setBounds(0, 10, 440, 60);

        btnAbandonarJuego.setBackground(new java.awt.Color(255, 255, 255));
        btnAbandonarJuego.setFont(new java.awt.Font("Nanum Pen Script", 1, 24)); // NOI18N
        btnAbandonarJuego.setForeground(new java.awt.Color(0, 0, 255));
        btnAbandonarJuego.setText("ABANDONAR JUEGO");
        btnAbandonarJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.gray, java.awt.Color.blue, java.awt.Color.gray));
        btnAbandonarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbandonarJuego.setOpaque(true);
        btnAbandonarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbandonarJuego);
        btnAbandonarJuego.setBounds(90, 290, 210, 60);

        btnCalificar.setBackground(new java.awt.Color(255, 255, 255));
        btnCalificar.setFont(new java.awt.Font("Nanum Pen Script", 1, 24)); // NOI18N
        btnCalificar.setForeground(new java.awt.Color(0, 0, 255));
        btnCalificar.setText("CALIFICAR JUEGO");
        btnCalificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.blue));
        btnCalificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCalificar.setOpaque(true);
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalificar);
        btnCalificar.setBounds(90, 200, 210, 60);

        btnJugarNuevamente.setBackground(new java.awt.Color(255, 255, 255));
        btnJugarNuevamente.setFont(new java.awt.Font("Nanum Pen Script", 1, 24)); // NOI18N
        btnJugarNuevamente.setForeground(new java.awt.Color(0, 0, 255));
        btnJugarNuevamente.setText("JUGAR NUEVAMENTE");
        btnJugarNuevamente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.lightGray, java.awt.Color.blue, java.awt.Color.lightGray));
        btnJugarNuevamente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnJugarNuevamente.setOpaque(true);
        btnJugarNuevamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarNuevamenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugarNuevamente);
        btnJugarNuevamente.setBounds(90, 110, 210, 60);

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
        btnAyudaJugarNuevamente.setBounds(360, 120, 50, 40);

        btnAyudaCalificarJuego.setBackground(new java.awt.Color(255, 255, 255));
        btnAyudaCalificarJuego.setFont(new java.awt.Font("Kannada Sangam MN", 1, 24)); // NOI18N
        btnAyudaCalificarJuego.setForeground(new java.awt.Color(0, 0, 255));
        btnAyudaCalificarJuego.setText("?");
        btnAyudaCalificarJuego.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.blue));
        btnAyudaCalificarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAyudaCalificarJuego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyudaCalificarJuego.setOpaque(true);
        btnAyudaCalificarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaCalificarJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyudaCalificarJuego);
        btnAyudaCalificarJuego.setBounds(360, 210, 50, 40);

        btnAyudaAbandonarJuego.setBackground(new java.awt.Color(255, 255, 255));
        btnAyudaAbandonarJuego.setFont(new java.awt.Font("Kannada Sangam MN", 1, 24)); // NOI18N
        btnAyudaAbandonarJuego.setForeground(new java.awt.Color(0, 0, 255));
        btnAyudaAbandonarJuego.setText("?");
        btnAyudaAbandonarJuego.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.blue));
        btnAyudaAbandonarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAyudaAbandonarJuego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyudaAbandonarJuego.setOpaque(true);
        btnAyudaAbandonarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaAbandonarJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyudaAbandonarJuego);
        btnAyudaAbandonarJuego.setBounds(360, 300, 50, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbandonarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarJuegoActionPerformed
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_btnAbandonarJuegoActionPerformed

    private void btnJugarNuevamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarNuevamenteActionPerformed
        JOptionPane.showMessageDialog(null, "Su nuevo juego Inicia", "AVISO", 4);
        VentanaMenuInicial menuInicial = new VentanaMenuInicial(new Partida());
        menuInicial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnJugarNuevamenteActionPerformed

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed
        VentanaCalificacion calificaciones = new VentanaCalificacion(juego);
        calificaciones.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCalificarActionPerformed

    private void btnAyudaJugarNuevamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaJugarNuevamenteActionPerformed
        JOptionPane.showMessageDialog(null, "Comience nuevamente una nueva partida y venza a sus amigos.");
    }//GEN-LAST:event_btnAyudaJugarNuevamenteActionPerformed

    private void btnAyudaCalificarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaCalificarJuegoActionPerformed
        JOptionPane.showMessageDialog(null, "Califique sinceramente este juego para una revisión posterior de la empresa.");
    }//GEN-LAST:event_btnAyudaCalificarJuegoActionPerformed

    private void btnAyudaAbandonarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaAbandonarJuegoActionPerformed
        JOptionPane.showMessageDialog(null, "Abandone el juego y juegue nuevamente más tarde.");
    }//GEN-LAST:event_btnAyudaAbandonarJuegoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonarJuego;
    private javax.swing.JButton btnAyudaAbandonarJuego;
    private javax.swing.JButton btnAyudaCalificarJuego;
    private javax.swing.JButton btnAyudaJugarNuevamente;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnJugarNuevamente;
    private javax.swing.JLabel lblMenuFinal;
    // End of variables declaration//GEN-END:variables
}
