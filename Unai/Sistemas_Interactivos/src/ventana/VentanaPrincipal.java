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


public class VentanaPrincipal extends JFrame{
   
       
    public VentanaPrincipal(){
        
    	//this.setContentPane(panel);
    	
	Inicio inicio = new Inicio();

        //panel.setLayout(new BorderLayout(5, 5));
        this.add(inicio, BorderLayout.CENTER);
        
        
        this.setTitle("Ventana Principal");
        this.setSize(new Dimension(800, 550));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setLocationRelativeTo(null);
    }

    public static void main(String [] args){
        VentanaPrincipal frame = new VentanaPrincipal();
        frame.setVisible(true);
    }
    
    
}
 