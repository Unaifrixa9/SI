/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author unaif
 */
public class FondoPanel extends JPanel{
   
	@Override
	   public void paint(Graphics g){
                Dimension dimension = this.getSize();
	      
	        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/estudiar.jpg"));
	        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
	        setOpaque(false);
	        super.paint(g);
	   }
   
}