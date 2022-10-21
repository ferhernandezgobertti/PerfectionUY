package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import Dominio.*;
import Dominio.Partida;
import javax.swing.*;

public class VentanaCalificacion extends javax.swing.JFrame {

    public Partida juego;

    public VentanaCalificacion(Partida game) {
        juego = game;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJugador1 = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        txtCalificacionJugador1 = new javax.swing.JTextField();
        btnIngresarCalificacion = new javax.swing.JButton();
        lblJugador2 = new javax.swing.JLabel();
        txtCalificacionJugador2 = new javax.swing.JTextField();
        btnAyudaJugarNuevamente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(760, 380));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblJugador1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lblJugador1.setForeground(new java.awt.Color(0, 0, 255));
        lblJugador1.setText("Jugador 1:");
        getContentPane().add(lblJugador1);
        lblJugador1.setBounds(20, 70, 180, 30);

        lblSubtitulo.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("INGRESEN SUS CALIFICACIONES A CONTINUACIÓN");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(0, 0, 750, 50);

        txtCalificacionJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCalificacionJugador1);
        txtCalificacionJugador1.setBounds(30, 110, 690, 50);

        btnIngresarCalificacion.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresarCalificacion.setFont(new java.awt.Font("Euphemia UCAS", 1, 14)); // NOI18N
        btnIngresarCalificacion.setForeground(new java.awt.Color(0, 0, 255));
        btnIngresarCalificacion.setText("INGRESAR CALIFICACIÓN");
        btnIngresarCalificacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.blue));
        btnIngresarCalificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresarCalificacion.setOpaque(true);
        btnIngresarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCalificacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarCalificacion);
        btnIngresarCalificacion.setBounds(510, 300, 210, 40);

        lblJugador2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lblJugador2.setForeground(new java.awt.Color(0, 0, 255));
        lblJugador2.setText("Jugador 2:");
        getContentPane().add(lblJugador2);
        lblJugador2.setBounds(20, 190, 180, 30);

        txtCalificacionJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCalificacionJugador2);
        txtCalificacionJugador2.setBounds(30, 230, 690, 50);

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
        btnAyudaJugarNuevamente.setBounds(430, 300, 50, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCalificacionActionPerformed
        accionCalificacion();
    }//GEN-LAST:event_btnIngresarCalificacionActionPerformed


    private void btnAyudaJugarNuevamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaJugarNuevamenteActionPerformed
        JOptionPane.showMessageDialog(null, "Ingrese los comentarios de ambos jugadores y presione 'INGRESAR CALIFICACIÓN'");
    }//GEN-LAST:event_btnAyudaJugarNuevamenteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaJugarNuevamente;
    private javax.swing.JButton btnIngresarCalificacion;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblSubtitulo;
    public javax.swing.JTextField txtCalificacionJugador1;
    public javax.swing.JTextField txtCalificacionJugador2;
    // End of variables declaration//GEN-END:variables

    public void accionCalificacion(){
        if (txtCalificacionJugador1.getText().isEmpty() || txtCalificacionJugador2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar ambas calificaciones. Disculpe las molestias.", "ERROR", 0);
        } 
        if (!txtCalificacionJugador1.getText().isEmpty() && !txtCalificacionJugador2.getText().isEmpty()) {
            juego.getJugador1().setCalificacion(txtCalificacionJugador1.getText());
            juego.getJugador2().setCalificacion(txtCalificacionJugador2.getText());
            juego.setListaJugadores(juego.actualizarDatosJugadores(juego));
            JOptionPane.showMessageDialog(null, "Calificaciones ingresadas. \nMUCHAS GRACIAS POR SU APOYO!!!");
            VentanaMenuFinal menuFinal = new VentanaMenuFinal(juego);
            menuFinal.setVisible(true);
            setVisible(false);
        }
    }
}
