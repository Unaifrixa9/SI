/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author unaif
 */
import java.awt.*;
import javax.swing.*;


public class VentanaPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;
	
    FondoPanel panel = new FondoPanel();
       
    public VentanaPrincipal(){      
        Sigma b = new Sigma();
        this.add(b, BorderLayout.CENTER);
        
        this.setTitle("Bandeja de entrada");
        this.setSize(new Dimension(800, 550));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setLocationRelativeTo(null);
        
    }

    public static void main(String [] args){
        VentanaPrincipal frame = new VentanaPrincipal();
        frame.setVisible(true);
    }
    
    
}
 