/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author unaif
 */
public class EscribirMensaje extends javax.swing.JPanel {

    /**
     * Creates new form EscribirMensaje
     */
    public EscribirMensaje(VentanaPrincipal jf) {
        initComponents(jf);
    }

   private void initComponents(VentanaPrincipal jf) {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JButtonCancelar = new javax.swing.JButton();
        JButonGuardar = new javax.swing.JButton();
        jButtonEnviar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ImageIcon imagen_opciones5 = new ImageIcon(getClass().getResource("../imagenes/calendario.png"));
        Image conversion = imagen_opciones5.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_opciones5 = new ImageIcon(conversion);
        jButton_opciones5 = new javax.swing.JButton(imagen_opciones5);
        ImageIcon imagen_opciones6 = new ImageIcon(getClass().getResource("../imagenes/correo.png"));
        conversion = imagen_opciones6.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_opciones6 = new ImageIcon(conversion);
        jButton_opciones6 = new javax.swing.JButton(imagen_opciones6);
        ImageIcon imagen_opciones7 = new ImageIcon(getClass().getResource("../imagenes/moodle.png"));
        conversion = imagen_opciones7.getImage();
        conversion = conversion.getScaledInstance(100, 50, Image.SCALE_SMOOTH);
        imagen_opciones7 = new ImageIcon(conversion);
        jButton_opciones7 = new javax.swing.JButton(imagen_opciones7);
        ImageIcon imagen_opciones8 = new ImageIcon(getClass().getResource("../imagenes/sigma.png"));
        conversion = imagen_opciones8.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_opciones8 = new ImageIcon(conversion);
        jButton_opciones8 = new javax.swing.JButton(imagen_opciones8);
        ImageIcon imagen_opciones9 = new ImageIcon(getClass().getResource("../imagenes/busqueda.png"));
        conversion = imagen_opciones9.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_opciones9 = new ImageIcon(conversion);
        jButton_opciones9 = new javax.swing.JButton(imagen_opciones9);
        ImageIcon imagen_opciones10 = new ImageIcon(getClass().getResource("../imagenes/enviados.png"));
        conversion = imagen_opciones10.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_opciones10 = new ImageIcon(conversion);
        jButton_opciones10 = new javax.swing.JButton(imagen_opciones10);
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ImageIcon imagen_opciones13 = new ImageIcon(getClass().getResource("../imagenes/opciones.png"));
        conversion = imagen_opciones13.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_opciones13 = new ImageIcon(conversion);
        jButton_opciones13 = new javax.swing.JButton(imagen_opciones13);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Redactar Mensaje");

        jLabel2.setText("Destinatario:");

        jLabel4.setText("Asunto:");

        jTextField1.setText("Usuario");

        jTextField2.setText("Asunto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Adjuntar Archivo");


        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        JButtonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addActionListener(new FocusPanel(this, 1, jf));

        JButonGuardar.setBackground(new java.awt.Color(0, 0, 0));
        JButonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JButonGuardar.setText("Guardar");

        jButtonEnviar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonEnviar.setText("Enviar");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setVisible(false);

        jButton_opciones5.setContentAreaFilled(false);
        jButton_opciones5.addActionListener(new FocusPanel(this, 3, jf));

        jButton_opciones6.setContentAreaFilled(false);
        jButton_opciones6.addActionListener(new FocusPanel(this, 1, jf));
        
        jButton_opciones7.setContentAreaFilled(false);
        

        jButton_opciones8.setContentAreaFilled(false);
        jButton_opciones8.addActionListener(new FocusPanel(this, 6, jf));


        jButton_opciones9.setContentAreaFilled(false);
        

        jButton_opciones10.setContentAreaFilled(false);
        jButton_opciones10.addActionListener(new FocusPanel(this, 2, jf));
        jLabel16.setText("Correo");

        jLabel17.setText("Busqueda");

        jLabel18.setText("Calendario");

        jLabel19.setText("Moodle");

        jLabel20.setText("Sigma");

        jLabel21.setText("Mensajes enviados");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_opciones6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_opciones5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_opciones7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_opciones8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_opciones9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_opciones10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_opciones6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_opciones10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_opciones5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_opciones7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_opciones8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jButton_opciones9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 69, Short.MAX_VALUE))
        );

        jButton_opciones13.setContentAreaFilled(false);
        jButton_opciones13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_opciones13MouseClicked(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                                .addComponent(jButtonEnviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButtonCancelar))
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_opciones13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        ))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton_opciones13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(JButtonCancelar)
                            .addComponent(JButonGuardar)
                            .addComponent(jButtonEnviar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
   
   
    
    int x = 0;
    private void jButton_opciones13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_opciones13MouseClicked
        if(x == 210) {
            jPanel3.setSize(210, 552);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for(int i = 210; i >= 0; i--) {
                            Thread.sleep(1);
                            jPanel3.setSize(i, 552);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x = 0;
        } else if(x == 0){
            jPanel3.show();
            jPanel3.setSize(x, 552);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= x; i++) {
                            Thread.sleep(1);
                            jPanel3.setSize(i, 552);
                        }
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x = 210;
        }
    }
    void opaque() {
    	jPanel3.setVisible(false);
    	x = 0;
    }

    public void paint(Graphics g) {
	Dimension dimension = this.getSize();
	      
	ImageIcon icon = new ImageIcon(getClass().getResource("../imagenes/fondo.jpg"));
	g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
	setOpaque(false);
	super.paintChildren(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButonGuardar;
    private javax.swing.JButton JButtonCancelar;
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButton_opciones10;
    private javax.swing.JButton jButton_opciones13;
    private javax.swing.JButton jButton_opciones5;
    private javax.swing.JButton jButton_opciones6;
    private javax.swing.JButton jButton_opciones7;
    private javax.swing.JButton jButton_opciones8;
    private javax.swing.JButton jButton_opciones9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
