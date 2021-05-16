package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InicioSesion implements ActionListener{
	
	JTextField user;
	JPasswordField pass;
    JPanel old_panel;
   int new_panel;
    VentanaPrincipal frame;
	
	public InicioSesion(JTextField user, JPasswordField pass, JPanel old_panel, 
	       int new_panel, VentanaPrincipal frame) {
		this.user = user;
		this.pass = pass;
		this.old_panel = old_panel;
        this.new_panel = new_panel;
        this.frame = frame;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((user.getText().equals("user")) && (pass.getText().equals("pass"))) {
			frame.FocusPanel(old_panel, new_panel);
		}else {
			JOptionPane.showMessageDialog(frame, "Usuario o Password Erronea", "Error",
                JOptionPane.WARNING_MESSAGE);
		}
	}

}
