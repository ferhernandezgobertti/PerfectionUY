package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import Dominio.*;
import java.awt.*;
import javax.swing.*;

public class VentanaColor extends javax.swing.JFrame {

    public Partida juego;

    public VentanaColor(Partida game) {
        juego = game;
        initComponents();
        final JLabel previewLabel = new JLabel("♥I Love Perfección♥", JLabel.CENTER);
        previewLabel.setFont(new Font("American Typewriter", Font.BOLD | Font.ITALIC, 48));
        previewLabel.setSize(previewLabel.getPreferredSize());
        previewLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 1, 0));
        selectorColor.setPreviewPanel(previewLabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectorColor = new javax.swing.JColorChooser();
        lblSubtitulo = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnAyudaJugarNuevamente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(735, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(selectorColor);
        selectorColor.setBounds(20, 40, 694, 376);

        lblSubtitulo.setFont(new java.awt.Font("Apple Color Emoji", 1, 24)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("Seleccione el color que más le agrade:");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(0, 0, 740, 40);

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Euphemia UCAS", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 0, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar.setOpaque(true);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(30, 430, 540, 60);

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
        btnAyudaJugarNuevamente.setBounds(620, 440, 50, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        accionSeleccionColor();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    private void btnAyudaJugarNuevamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaJugarNuevamenteActionPerformed
        JOptionPane.showMessageDialog(null, "Seleccione un color que más le agrade con el que desea que su jugador juege.");
    }//GEN-LAST:event_btnAyudaJugarNuevamenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaJugarNuevamente;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblSubtitulo;
    public javax.swing.JColorChooser selectorColor;
    // End of variables declaration//GEN-END:variables

//Método que setea el color elegido al jugador correspondiente
    public void accionSeleccionColor() {
        int opcion = 0;
        if (selectorColor.getColor().getBlue() > 250 && selectorColor.getColor().getGreen()< 150 || 
                selectorColor.getColor().getBlue() > 250 && selectorColor.getColor().getRed() < 100 ||
                selectorColor.getColor().getBlue() > 220 && selectorColor.getColor().getRed() > 220 && selectorColor.getColor().getGreen() > 220 ||
                selectorColor.getColor().getBlue() < 80 && selectorColor.getColor().getRed() < 80 && selectorColor.getColor().getGreen() < 80) {
            opcion = JOptionPane.showConfirmDialog(selectorColor, "El color elegido hará de su ficha poco visible. Desea continuar?");
        }
        if (opcion == 0) {
            if (juego.isJugador1()) {
                juego.getJugador1().setColor(selectorColor.getColor());
            }
            if (!juego.isJugador1()) {
                juego.getJugador2().setColor(selectorColor.getColor());
            }
            VentanaMenuInicial menuInicial = new VentanaMenuInicial(juego);
            menuInicial.setVisible(true);
            setVisible(false);
        }
    }

}