package Interfaz;
// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

import Dominio.*;
import javax.swing.*;

public class VentanaTablero extends javax.swing.JFrame {

    public Partida juego;

    public VentanaTablero(Partida game) {
        juego = game;
        initComponents();
        this.setSize(400, 200);
        btnComenzar.setVisible(false);
        lblDimensionPanel.setVisible(false);
        selectorDimensionPanel.setVisible(false);
        lblMaximo.setVisible(false);
        lblCantidadFichas.setVisible(false);
        txtFichas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTablero = new javax.swing.JLabel();
        lblDimensionTablero = new javax.swing.JLabel();
        lblDimensionPanel = new javax.swing.JLabel();
        selectorDimensionTablero = new javax.swing.JComboBox();
        btnComenzar = new javax.swing.JButton();
        selectorDimensionPanel = new javax.swing.JComboBox();
        btnAyuda = new javax.swing.JButton();
        txtFichas = new javax.swing.JTextField();
        lblMaximo = new javax.swing.JLabel();
        lblCantidadFichas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTablero.setFont(new java.awt.Font("Monotype Corsiva", 3, 60)); // NOI18N
        lblTablero.setForeground(new java.awt.Color(0, 0, 204));
        lblTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTablero.setText("TABLERO");
        lblTablero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTablero);
        lblTablero.setBounds(0, 10, 400, 70);

        lblDimensionTablero.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        lblDimensionTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDimensionTablero.setText("Elija la dimensión del Tablero:");
        getContentPane().add(lblDimensionTablero);
        lblDimensionTablero.setBounds(0, 70, 400, 80);

        lblDimensionPanel.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        lblDimensionPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDimensionPanel.setText("Escoja la dimensión del Panel:");
        getContentPane().add(lblDimensionPanel);
        lblDimensionPanel.setBounds(0, 180, 400, 60);

        selectorDimensionTablero.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 18)); // NOI18N
        selectorDimensionTablero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin datos", "4", "6", "8" }));
        selectorDimensionTablero.setToolTipText("");
        selectorDimensionTablero.setAlignmentY(1.0F);
        selectorDimensionTablero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectorDimensionTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorDimensionTableroActionPerformed(evt);
            }
        });
        getContentPane().add(selectorDimensionTablero);
        selectorDimensionTablero.setBounds(40, 120, 290, 70);

        btnComenzar.setBackground(new java.awt.Color(255, 255, 255));
        btnComenzar.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(0, 0, 255));
        btnComenzar.setText("COMENZAR");
        btnComenzar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.darkGray));
        btnComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComenzar.setOpaque(true);
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComenzar);
        btnComenzar.setBounds(100, 390, 170, 50);

        selectorDimensionPanel.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 18)); // NOI18N
        selectorDimensionPanel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin datos", "2", "3", "4" }));
        selectorDimensionPanel.setToolTipText("");
        selectorDimensionPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectorDimensionPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorDimensionPanelActionPerformed(evt);
            }
        });
        getContentPane().add(selectorDimensionPanel);
        selectorDimensionPanel.setBounds(40, 220, 290, 70);

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
        btnAyuda.setBounds(350, 30, 40, 40);

        txtFichas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(txtFichas);
        txtFichas.setBounds(90, 330, 60, 50);

        lblMaximo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblMaximo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMaximo);
        lblMaximo.setBounds(160, 330, 130, 50);

        lblCantidadFichas.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        lblCantidadFichas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadFichas.setText("Ingrese la cantidad de fichas:");
        getContentPane().add(lblCantidadFichas);
        lblCantidadFichas.setBounds(0, 270, 400, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        accionComenzarPartida();
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Seleccione a continuación las dimensiones del Tablero y Panel con el que desea jugar.\n\n"
                + "Tenga presente que si el Tablero es de dimensión 4 entonces el Panel solo podrá ser de dimensión 2\n"
                + "y si el Tablero es de dimensión 6, entonces el panel solo podrá ser de dimension 2 o 3.", "ADVERTENCIA", 2);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void selectorDimensionTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorDimensionTableroActionPerformed
        accionSeleccionDimensionTablero();
        lblDimensionPanel.setVisible(true);
        selectorDimensionPanel.setVisible(true);
        this.setSize(400, 300);
    }//GEN-LAST:event_selectorDimensionTableroActionPerformed

    private void selectorDimensionPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorDimensionPanelActionPerformed
        accionSeleccionDimensionPanel();
        if(!selectorDimensionPanel.getSelectedItem().equals("Sin datos")){
            lblCantidadFichas.setVisible(true);
            lblMaximo.setVisible(true);
            lblMaximo.setText("Máximo: " + juego.getCantFichasMax());
            txtFichas.setVisible(true);
            btnComenzar.setVisible(true);
            this.setSize(400, 480);
        }
    }//GEN-LAST:event_selectorDimensionPanelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JLabel lblCantidadFichas;
    private javax.swing.JLabel lblDimensionPanel;
    private javax.swing.JLabel lblDimensionTablero;
    private javax.swing.JLabel lblMaximo;
    private javax.swing.JLabel lblTablero;
    public javax.swing.JComboBox selectorDimensionPanel;
    public javax.swing.JComboBox selectorDimensionTablero;
    public javax.swing.JTextField txtFichas;
    // End of variables declaration//GEN-END:variables


    //Método que controla la acción acontecida al comenzar la Partida
    public void accionComenzarPartida() {
        boolean datosCorrectos = false;
        try {
            int fichasJugadores = Integer.parseInt(txtFichas.getText());
            if (fichasJugadores < 1 || fichasJugadores > juego.getCantFichasMax()) {
                JOptionPane.showMessageDialog(null, "La cantidad de fichas ingresadas deben ser menor o igual al máximo indicado");
            } else {
                datosCorrectos = true;
                juego.getJugador1().setCantidadFichas(fichasJugadores);
                juego.getJugador2().setCantidadFichas(fichasJugadores);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingreso incorrecto de Fichas. Ingrese un numero entero menor o igual al máximo.");
            txtFichas.setText("");
        }
        if (datosCorrectos) {
            JOptionPane.showMessageDialog(null, "Dimensiones del Tablero y del Panel ingresadas correctamente.\nFichas cargadas.");
            
            setVisible(false);
            ControlVentanas.abrirVentanasJuego(this.juego);
        }
    }
    
    //Método que fija la acción activada al seleccionar la dimensión del Tablero
    public void accionSeleccionDimensionTablero() {
        String opcion = (String) selectorDimensionTablero.getSelectedItem();
        if (opcion.equals("4")) {
            String[] datos = {"Sin datos", "2"};
            DefaultComboBoxModel model = new DefaultComboBoxModel(datos);
            selectorDimensionPanel.setModel(model);
        }
        if (opcion.equals("6")) {
            String[] datos = {"Sin datos", "2", "3"};
            DefaultComboBoxModel model = new DefaultComboBoxModel(datos);
            selectorDimensionPanel.setModel(model);
        }
        if (opcion.equals("8")) {
            String[] datos = {"Sin datos", "2", "3", "4"};
            DefaultComboBoxModel model = new DefaultComboBoxModel(datos);
            selectorDimensionPanel.setModel(model);
        }
    }

    //Método que determina la acción ocurrida al seleccionar la dimensión del Tablero Móvil (o Panel Móvil) en la VentanaTablero
    public void accionSeleccionDimensionPanel() {
        if (selectorDimensionPanel.getSelectedItem().equals("Sin datos")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar algún dato deseado en ambas opciones", "ERROR", 0);
        } else {
            int dimension = Integer.parseInt((String) selectorDimensionTablero.getSelectedItem());
            int dimensionPanel = Integer.parseInt((String) selectorDimensionPanel.getSelectedItem());
            juego.setCantFichasMax((dimension * dimension + dimensionPanel * dimensionPanel) / 2);
            juego.getTable().setDimensionTablero(dimension);
            juego.getTable().setDimensionMovil(dimensionPanel);
        }
    }

}
