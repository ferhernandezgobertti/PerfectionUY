// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

package Interfaz;

import Dominio.*;
import javax.swing.*;

public class VentanaInstrucciones extends javax.swing.JFrame {

    private Partida juego;
    
    public VentanaInstrucciones(Partida game) {
        juego = game;
        initComponents();
        actualizarInstrucciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblLimpieza = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblColocarFicha = new javax.swing.JLabel();
        lblAbandonar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblColocarMoverPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(40, 20, 770, 290));
        setMinimumSize(new java.awt.Dimension(860, 312));
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 10));

        lblLimpieza.setBackground(new java.awt.Color(255, 255, 255));
        lblLimpieza.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        lblLimpieza.setForeground(new java.awt.Color(0, 0, 255));
        lblLimpieza.setText("Colocar su ficha limpieza para eliminar las fichas de una fila y columna entera");
        lblLimpieza.setOpaque(true);

        lblInstrucciones.setBackground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setFont(new java.awt.Font("Gulim", 3, 36)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(0, 0, 255));
        lblInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrucciones.setText("INSTRUCCIONES");
        lblInstrucciones.setOpaque(true);

        lblSubtitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setFont(new java.awt.Font("Myanmar MN", 0, 18)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblSubtitulo.setText("EN SU TURNO, PODRÁ:");
        lblSubtitulo.setOpaque(true);

        lblColocarFicha.setBackground(new java.awt.Color(255, 255, 255));
        lblColocarFicha.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        lblColocarFicha.setForeground(new java.awt.Color(0, 0, 255));
        lblColocarFicha.setText("Colocar una Ficha al cliquear en la posición en la que desea colocarla sobre el tablero");
        lblColocarFicha.setOpaque(true);

        lblAbandonar.setBackground(new java.awt.Color(255, 255, 255));
        lblAbandonar.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        lblAbandonar.setForeground(new java.awt.Color(0, 0, 255));
        lblAbandonar.setText("Abandonar la partida cliqueando en \"ABANDONAR\"");
        lblAbandonar.setOpaque(true);

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Monotype Sorts", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.black, java.awt.Color.blue, java.awt.Color.black));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setOpaque(true);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblColocarMoverPanel.setBackground(new java.awt.Color(255, 255, 255));
        lblColocarMoverPanel.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        lblColocarMoverPanel.setForeground(new java.awt.Color(0, 0, 255));
        lblColocarMoverPanel.setText("Colocar el panel al cliquear en el botón 'COLOCAR PANEL' e indicar su posición en el tablero");
        lblColocarMoverPanel.setOpaque(true);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblColocarMoverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblColocarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(lblInstrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColocarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColocarMoverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(panel);
        panel.setBounds(0, 0, 860, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel lblAbandonar;
    private javax.swing.JLabel lblColocarFicha;
    private javax.swing.JLabel lblColocarMoverPanel;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblLimpieza;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables


   //Método utilizado para actualizar la ventana, dependiendo de las jugadas disponibles
    //array (lblColocarFicha, lblAbandonar, lblColocarMoverPanel, lblLimpieza)
    public void actualizarInstrucciones() {
        if (juego.isMovilEnTablero()) {
            lblColocarMoverPanel.setText("Mover el panel clickeando en 'MOVER PANEL' e indicando distancia "
                    + "y dirección con flechas");
        }
        if (juego.getTurno() % 2 == 0) {
            instruccionesJugador(juego.getJugador1());
        } else {
            instruccionesJugador(juego.getJugador2());
        }
    }
    
    //Método creado para modificar las posiciones y visibilidades de los elementos de VentanaInstrucciones dependiendo del Jugador
    public void instruccionesJugador(Jugador jugador) {
        if (jugador.isTieneFichaLimpieza()) {
            lblLimpieza.setVisible(true);
        } else {
            lblLimpieza.setVisible(false);
        }
        if (jugador.getCantidadFichas() > 0) {
            lblColocarFicha.setVisible(true);
            lblAbandonar.setBounds(30, 135, 650, 40);
            lblColocarMoverPanel.setBounds(30, 175, 650, 40);
            lblLimpieza.setBounds(30, 215, 650, 40);
        } else {
            lblColocarFicha.setVisible(false);
            lblAbandonar.setBounds(30, 95, 650, 40);
            lblColocarMoverPanel.setBounds(30, 135, 650, 40);
            lblLimpieza.setBounds(30, 175, 650, 40);
        }
    }
}
