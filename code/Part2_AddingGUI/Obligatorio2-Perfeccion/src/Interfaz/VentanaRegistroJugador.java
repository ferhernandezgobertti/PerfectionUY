package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import Dominio.*;
import javax.swing.*;

public class VentanaRegistroJugador extends javax.swing.JFrame {

    public Partida juego;

    public VentanaRegistroJugador(Partida game) {
        juego = game;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSubtitulo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblAlias = new javax.swing.JLabel();
        txtAlias = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnFinRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setName("registro"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblSubtitulo.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("Ingrese un jugador nuevo:");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(0, 60, 410, 40);

        lblTitulo.setFont(new java.awt.Font("SimHei", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("JUGADOR, REGÍSTRESE:");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(0, 0, 400, 60);

        lblNombre.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 255));
        lblNombre.setText("NOMBRE:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(20, 110, 180, 40);

        txtNombre.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(10, 150, 380, 50);

        lblEdad.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 0, 255));
        lblEdad.setText("EDAD:");
        getContentPane().add(lblEdad);
        lblEdad.setBounds(20, 210, 80, 30);

        txtEdad.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtEdad);
        txtEdad.setBounds(10, 240, 380, 50);

        lblAlias.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        lblAlias.setForeground(new java.awt.Color(0, 0, 255));
        lblAlias.setText("ALIAS:");
        getContentPane().add(lblAlias);
        lblAlias.setBounds(20, 310, 70, 30);

        txtAlias.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        txtAlias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAlias);
        txtAlias.setBounds(10, 340, 380, 50);

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setOpaque(true);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(20, 410, 120, 50);

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
        btnAyuda.setBounds(310, 410, 50, 50);

        btnFinRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnFinRegistro.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        btnFinRegistro.setForeground(new java.awt.Color(0, 0, 255));
        btnFinRegistro.setText("FIN REGISTRO");
        btnFinRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinRegistro);
        btnFinRegistro.setBounds(147, 409, 150, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        accionRegistrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "REGISTRO JUGADOR: \n\nDebe ingresar sus datos de manera apropiada."
                + "\nRecuerde ingresar su verdadera edad. Ésta no puede ser negativa ni logicamente muy grande (mayor a 120)");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnFinRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinRegistroActionPerformed
        this.setVisible(false);
        VentanaMenuInicial menu = new VentanaMenuInicial(juego);
        menu.setVisible(true);
    }//GEN-LAST:event_btnFinRegistroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnFinRegistro;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtAlias;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables


    public void accionRegistrar(){
        if ((txtNombre.getText().isEmpty()) || (txtEdad.getText().isEmpty()) || 
                (txtAlias.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Existen casillas sin datos. Ingrese nuevamente", "ERROR", 0);
        }
        else{
            try{
                int edad = Integer.parseInt(txtEdad.getText());           
                if (edad>0 && edad<120) {
                    Jugador aux = new Jugador(txtNombre.getText(), edad, txtAlias.getText(), 0, 0,
                            "Sin calificación");
                    juego.agregarJugador(juego, aux);
                    JOptionPane.showMessageDialog(null, "Registro exitoso", "", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    reseteoDatos(false);
                }
            }
            catch(Exception e){
                reseteoDatos(false);
            }
            reseteoDatos(true);
        }
    }

    
    //Método para borrar los datos (al equivocarse o pasar al siguiente registro)
    public void reseteoDatos(boolean ok) {
        if(!ok){
            JOptionPane.showMessageDialog(null, "Debe ingresar los datos como son solicitados. Ingrese nuevamente", "ERROR", 0);
        }
        txtNombre.setText("");
        txtEdad.setText("");
        txtAlias.setText("");
    }
    
}
