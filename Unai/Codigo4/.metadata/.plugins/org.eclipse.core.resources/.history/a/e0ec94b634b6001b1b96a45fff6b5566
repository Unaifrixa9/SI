/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ventu
 */
public class Prueba {

    public static boolean guardarMensaje(JTextField destinatario, JTextField asunto, JTextArea mensaje) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("message.txt"));
            bw.write(destinatario.getText());
            bw.write("\n");
            bw.write(asunto.getText());
            bw.write("\n");
            bw.write(mensaje.getText());
            bw.close();
            
            return true;
        }catch(IOException ex){
            System.err.println(ex);
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean enviado = false;
        JTextField destinatario = new JTextField();
        JTextField asunto = new JTextField();
        JTextArea mensaje = new JTextArea();
        
        destinatario.setText("Destinatario_1");
        asunto.setText("Asunto_1");
        mensaje.setText("Cuerpo_mensaje_1");
        
        enviado = guardarMensaje(destinatario, asunto, mensaje);
    }
    
}
