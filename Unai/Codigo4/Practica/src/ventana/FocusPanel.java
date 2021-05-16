package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FocusPanel implements ActionListener{
    
    

    JPanel old_panel;
   
    int new_panel;
    
    VentanaPrincipal frame;
    
    
    public FocusPanel(JPanel old_panel, 
        int new_panel, VentanaPrincipal frame) {
    	this.old_panel = old_panel;
        this.new_panel = new_panel;
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.FocusPanel(old_panel, new_panel);
    }
}
