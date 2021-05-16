/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ventu
 */
public class Menu extends javax.swing.JPanel {
    /**
     * Creates new form prueba2
     */
	
	
    public Menu(VentanaPrincipal jf) {
        initComponents(jf);
    }
   
    public void paint(Graphics g) {
    	Dimension dimension = this.getSize();
	      
    	ImageIcon icon = new ImageIcon(getClass().getResource("../imagenes/fondo.jpg"));
    	g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
    	setOpaque(false);
    	super.paintChildren(g);
    }

    private void initComponents(VentanaPrincipal jf) {
    	    	
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        ImageIcon imagen_calendario = new ImageIcon(getClass().getResource("../imagenes/calendario.png"));
        Image conversion = imagen_calendario.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_calendario = new ImageIcon(conversion);
        jButton_calendario = new javax.swing.JButton(imagen_calendario);
        ImageIcon imagen_moodle = new ImageIcon(getClass().getResource("../imagenes/moodle.png"));
        conversion = imagen_moodle.getImage();
        conversion = conversion.getScaledInstance(150, 75, Image.SCALE_SMOOTH);
        imagen_moodle = new ImageIcon(conversion);
        jButton_moodle = new javax.swing.JButton(imagen_moodle);
        ImageIcon imagen_correo = new ImageIcon(getClass().getResource("../imagenes/correo.png"));
        conversion = imagen_correo.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_correo = new ImageIcon(conversion);
        jButton_correo = new javax.swing.JButton(imagen_correo);
        ImageIcon imagen_sigma = new ImageIcon(getClass().getResource("../imagenes/sigma.png"));
        conversion = imagen_sigma.getImage();
        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen_sigma = new ImageIcon(conversion);
        jButton_sigma = new javax.swing.JButton(imagen_sigma);
        
            
        
        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.setOpaque(false);

        jButton_calendario.setContentAreaFilled(false);
        jButton_calendario.addActionListener(new FocusPanel(this, 3, jf));

        jButton_moodle.setContentAreaFilled(false);
        

        jButton_correo.setContentAreaFilled(false);
        jButton_correo.addActionListener(new FocusPanel(this, 1, jf));
       

        jButton_sigma.setContentAreaFilled(false);
        jButton_sigma.addActionListener(new FocusPanel(this, 6, jf));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jButton_calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_moodle, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_sigma, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_moodle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_sigma, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jButton_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

  

	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_calendario;
    private javax.swing.JButton jButton_correo;
    private javax.swing.JButton jButton_moodle;
    private javax.swing.JButton jButton_sigma;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
