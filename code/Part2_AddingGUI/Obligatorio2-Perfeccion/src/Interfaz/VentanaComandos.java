// Obligatorio 2 - PROGRAMACIÓN 2
// Fernando Agustín Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

package Interfaz;

import Dominio.*;
import javax.swing.JOptionPane;

public class VentanaComandos extends javax.swing.JFrame {

    public Partida juego;

    public VentanaComandos(Partida game) {
        initComponents();
        juego = game;
        txtCantidadPosiciones.setEnabled(false);
        if (juego.isMovilEnTablero()) {
            btnColocarMoverPanel.setText("MOVER PANEL");
        }else{
            btnColocarMoverPanel.setText("COLOCAR PANEL");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbandonar = new javax.swing.JButton();
        lblComandos = new javax.swing.JLabel();
        btnLimpieza = new javax.swing.JButton();
        btnMoverArriba = new javax.swing.JButton();
        txtCantidadPosiciones = new javax.swing.JTextField();
        btnMoverDerecha = new javax.swing.JButton();
        btnMoverIzquierda = new javax.swing.JButton();
        btnMoverAbajo = new javax.swing.JButton();
        btnColocarMoverPanel = new javax.swing.JButton();
        btnGuardarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(910, 100, 450, 620));
        setMinimumSize(new java.awt.Dimension(450, 620));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnAbandonar.setBackground(new java.awt.Color(255, 255, 255));
        btnAbandonar.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        btnAbandonar.setForeground(new java.awt.Color(0, 0, 255));
        btnAbandonar.setText("ABANDONAR");
        btnAbandonar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.lightGray, java.awt.Color.blue, java.awt.Color.lightGray));
        btnAbandonar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbandonar.setOpaque(true);
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbandonar);
        btnAbandonar.setBounds(110, 460, 230, 50);

        lblComandos.setFont(new java.awt.Font("Gurmukhi MN", 1, 60)); // NOI18N
        lblComandos.setForeground(new java.awt.Color(0, 0, 255));
        lblComandos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComandos.setText("COMANDOS");
        getContentPane().add(lblComandos);
        lblComandos.setBounds(0, 20, 440, 50);

        btnLimpieza.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpieza.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        btnLimpieza.setForeground(new java.awt.Color(0, 0, 255));
        btnLimpieza.setText("FICHA LIMPIEZA");
        btnLimpieza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.blue));
        btnLimpieza.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpieza.setOpaque(true);
        btnLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiezaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpieza);
        btnLimpieza.setBounds(100, 180, 240, 50);

        btnMoverArriba.setBackground(new java.awt.Color(255, 255, 255));
        btnMoverArriba.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        btnMoverArriba.setForeground(new java.awt.Color(0, 0, 255));
        btnMoverArriba.setText("▲");
        btnMoverArriba.setAlignmentY(1.0F);
        btnMoverArriba.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnMoverArriba.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMoverArriba.setOpaque(true);
        btnMoverArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverArribaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoverArriba);
        btnMoverArriba.setBounds(200, 280, 50, 50);

        txtCantidadPosiciones.setFont(new java.awt.Font("Nadeem", 1, 14)); // NOI18N
        txtCantidadPosiciones.setForeground(new java.awt.Color(0, 0, 255));
        txtCantidadPosiciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCantidadPosiciones);
        txtCantidadPosiciones.setBounds(200, 330, 50, 50);

        btnMoverDerecha.setBackground(new java.awt.Color(255, 255, 255));
        btnMoverDerecha.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        btnMoverDerecha.setForeground(new java.awt.Color(0, 0, 255));
        btnMoverDerecha.setText("►");
        btnMoverDerecha.setAlignmentY(0.0F);
        btnMoverDerecha.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.blue));
        btnMoverDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMoverDerecha.setOpaque(true);
        btnMoverDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverDerechaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoverDerecha);
        btnMoverDerecha.setBounds(250, 330, 50, 50);

        btnMoverIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        btnMoverIzquierda.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        btnMoverIzquierda.setForeground(new java.awt.Color(0, 0, 255));
        btnMoverIzquierda.setText("◄");
        btnMoverIzquierda.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.blue));
        btnMoverIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMoverIzquierda.setOpaque(true);
        btnMoverIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverIzquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoverIzquierda);
        btnMoverIzquierda.setBounds(150, 330, 50, 50);

        btnMoverAbajo.setBackground(new java.awt.Color(255, 255, 255));
        btnMoverAbajo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        btnMoverAbajo.setForeground(new java.awt.Color(0, 0, 255));
        btnMoverAbajo.setText("▼");
        btnMoverAbajo.setAlignmentY(-0.5F);
        btnMoverAbajo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.lightGray, java.awt.Color.blue, java.awt.Color.lightGray));
        btnMoverAbajo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMoverAbajo.setOpaque(true);
        btnMoverAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverAbajoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoverAbajo);
        btnMoverAbajo.setBounds(200, 380, 50, 50);

        btnColocarMoverPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnColocarMoverPanel.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        btnColocarMoverPanel.setForeground(new java.awt.Color(0, 0, 255));
        btnColocarMoverPanel.setText("COLOCAR PANEL");
        btnColocarMoverPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.blue));
        btnColocarMoverPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnColocarMoverPanel.setOpaque(true);
        btnColocarMoverPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarMoverPanelActionPerformed(evt);
            }
        });
        getContentPane().add(btnColocarMoverPanel);
        btnColocarMoverPanel.setBounds(100, 100, 240, 50);

        btnGuardarPartida.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarPartida.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        btnGuardarPartida.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardarPartida.setText("GUARDAR PARTIDA");
        btnGuardarPartida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.gray, java.awt.Color.blue, java.awt.Color.gray));
        btnGuardarPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarPartida.setOpaque(true);
        btnGuardarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarPartida);
        btnGuardarPartida.setBounds(110, 530, 230, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoverArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverArribaActionPerformed
        accionFlechas("A");
    }//GEN-LAST:event_btnMoverArribaActionPerformed

    private void btnLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiezaActionPerformed
        accionLimpieza();
    }//GEN-LAST:event_btnLimpiezaActionPerformed

    private void btnMoverIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverIzquierdaActionPerformed
        accionFlechas("I");
    }//GEN-LAST:event_btnMoverIzquierdaActionPerformed

    private void btnMoverDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverDerechaActionPerformed
        accionFlechas("D");
    }//GEN-LAST:event_btnMoverDerechaActionPerformed

    private void btnMoverAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverAbajoActionPerformed
        accionFlechas("B");
    }//GEN-LAST:event_btnMoverAbajoActionPerformed

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
        accionAbandonarPartida();
    }//GEN-LAST:event_btnAbandonarActionPerformed

    private void btnColocarMoverPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarMoverPanelActionPerformed
        seteoBotonesVentanaComandos();
    }//GEN-LAST:event_btnColocarMoverPanelActionPerformed

    private void btnGuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPartidaActionPerformed
        accionGuardarPartida();
    }//GEN-LAST:event_btnGuardarPartidaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salir(this, juego.getListaJugadores());
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAbandonar;
    public javax.swing.JButton btnColocarMoverPanel;
    public javax.swing.JButton btnGuardarPartida;
    public javax.swing.JButton btnLimpieza;
    private javax.swing.JButton btnMoverAbajo;
    private javax.swing.JButton btnMoverArriba;
    private javax.swing.JButton btnMoverDerecha;
    private javax.swing.JButton btnMoverIzquierda;
    private javax.swing.JLabel lblComandos;
    public javax.swing.JTextField txtCantidadPosiciones;
    // End of variables declaration//GEN-END:variables


    //Método que realiza la acción correspondiente al hacer click en las flechas
    public void accionFlechas(String letra) {
        int[] panel = {0, 0, 0};
        if (juego.getOpcion().equals("M")) {
            juego.setOpcion(juego.getOpcion() + letra + txtCantidadPosiciones.getText());
            if (posicionValida()) {
                panel = juego.moverPanel(juego);
            }
            if (panel[0] == 0) {
                JOptionPane.showMessageDialog(null, "\nADVERTENCIA: Ingrese una posición válida.\n", null, 2);
            } else if (panel[0] == 1) {
                juego.setFilaPanel(panel[1]);
                juego.setColumnaPanel(panel[2]);
                juego.getTable().setTableroConPanel(juego.colocarPanel(juego.getTable().getPanel(), 
                        juego.getFilaPanel(), juego.getColumnaPanel(), juego.getTable().getMatrizTablero()));
                juego.getTable().setPanel(juego.panelNuevo(juego.getTable().getTableroConPanel(), 
                        juego.getFilaPanel(), juego.getColumnaPanel(), juego.getTable().getPanel().length));
            }
            juego.observar();
            juego.setTurno(juego.getTurno()+1);
        } else {
            JOptionPane.showMessageDialog(null, "\nADVERTENCIA: Primero debe hacer click en 'MOVER PANEL'.\n", null, 2);
        }
        txtCantidadPosiciones.setText("");
        txtCantidadPosiciones.setEnabled(false);
        btnColocarMoverPanel.setText("MOVER PANEL");
    }

    //Método que realiza la acción del botón ficha limpieza
    public void accionLimpieza() {
        if (juego.getTurno() % 2 != 0 && juego.getJugador1().isTieneFichaLimpieza()) {
            juego.setOpcion("L");
            btnLimpieza.setText("<html><FONT SIZE=4>Seleccione la posición<br>   en el tablero</FONT>");
            juego.getJugador1().setTieneFichaLimpieza(false);
        } else if (juego.getTurno() % 2 == 0 && juego.getJugador2().isTieneFichaLimpieza()) {
            juego.setOpcion("L");
            btnLimpieza.setText("<html><FONT SIZE=4>Seleccione la posición<br>   en el tablero</FONT>");
            juego.getJugador2().setTieneFichaLimpieza(false);
        }
        if (juego.getTurno() % 2 != 0) {
            if (juego.getJugador2().isTieneFichaLimpieza()) {
                btnLimpieza.setVisible(true);
            } else {
                btnLimpieza.setVisible(false);
            }
        } else {
            if (juego.getJugador1().isTieneFichaLimpieza()) {
                btnLimpieza.setVisible(true);
            } else {
                btnLimpieza.setVisible(false);
            }
        }
    }
    
    //Método que realiza la acción del botón abandonar partida
    public void accionAbandonarPartida() {
        if (juego.getTurno() % 2 != 0) {
            juego.setJugador1Vencedor(false);
        }
        if (juego.getTurno() % 2 == 0) {
            juego.setJugador1Vencedor(true);
        }
        VentanaFinJuego fin = new VentanaFinJuego(juego);
        fin.setVisible(true);
        juego.observar();
        this.setVisible(false);
    }
    
    //Método que realiza la acción del botón guardar partida
    public void accionGuardarPartida() {
        boolean ok = false;
        ok = ControlArchivos.guardarPartida(juego, this);
        if (!ok) {
            JOptionPane.showMessageDialog(null, "ADVERTENCIA: No se pudo guardar la partida.\n", null, 2);
        } else {
            JOptionPane.showMessageDialog(null, "Éxito al guardar partida.\n", null, 3);
        }
    }
        
    //Método que verifica que el texto ingresado sea un número
    public boolean posicionValida() {
        String cantidad = txtCantidadPosiciones.getText();
        boolean validas = false;
        if (!cantidad.isEmpty()) {
            try {
                validas = true;
            } catch (Exception e) {
            }
        }
        return validas;
    }
    
    //Método que cambia el texto de un botón de la ventana para indicar las instrucciones correspondientes
    public void seteoBotonesVentanaComandos() {
        if (btnColocarMoverPanel.getText().equals("COLOCAR PANEL")) {
            juego.setOpcion("P");
            btnColocarMoverPanel.setText("<html><FONT SIZE=4>Seleccione la posición<br>en el tablero</FONT>");
        }
        if (btnColocarMoverPanel.getText().equals("MOVER PANEL")) {
            juego.setOpcion("M");
            btnColocarMoverPanel.setText("<html><FONT SIZE=3>Ingrese la distancia<br>en el campo y seleccione<br>la dirección con las flechas</FONT>");
            txtCantidadPosiciones.setText("");
            txtCantidadPosiciones.setEnabled(true);
        }
    }
}
