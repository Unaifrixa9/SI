package ventana;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VerMensajeAction implements MouseListener{

	JPanel old_panel;
	   
    int new_panel;
    
    VentanaPrincipal frame;
    
    
    public VerMensajeAction(JPanel old_panel, 
        int new_panel, VentanaPrincipal frame) {
        this.old_panel = old_panel;
        this.new_panel = new_panel;
        this.frame = frame;
    }
    
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.FocusPanel(old_panel, new_panel);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
