/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ventu
 */
public class GuardarEvento implements ActionListener {
	
	JPanel old_panel;
	   
    int new_panel;
    
    VentanaPrincipal frame;
    static JTextField destinatario;
     static JTextField asunto;
     static JTextArea mensaje;

    public static boolean guardarMensaje() {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Evento.txt"));
            bw.write("Destinatario: "+destinatario.getText());
            bw.write("\n");
            bw.write("Asunto: "+asunto.getText());
            bw.write("\n");
            bw.write("Mensaje: \n");
            bw.write(mensaje.getText());
            bw.close();
            
            return true;
        }catch(IOException ex){
            System.err.println(ex);
            return false;
        }
    }
    
    public GuardarEvento(JPanel old_panel, 
            int new_panel, VentanaPrincipal frame, JTextField destinatario, JTextField asunto, JTextArea mensaje) {
    	this.old_panel = old_panel;
        this.new_panel = new_panel;
        this.frame = frame;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		this.guardarMensaje();
		frame.FocusPanel(old_panel, new_panel);
	}

    
}
