package ventana;

import java.awt.*;
import javax.swing.*;

public class VentanaInicio extends JPanel {
	
	public VentanaInicio() {
		super(new BorderLayout(5, 5));
	}
	
	public void crearVentana() {
			
	        JPanel center_panel = new JPanel(new GridBagLayout());
	        center_panel.setOpaque(false);
	        this.add(center_panel, BorderLayout.CENTER);
	        GridBagConstraints c = new GridBagConstraints();

	        c.fill = GridBagConstraints.BOTH;
	        c.insets = new Insets(1, 2, 1, 2);
	        
	        ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/Logo_UCO.png"));
	        Image conversion = logo.getImage();
	        conversion = conversion.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	        logo = new ImageIcon(conversion);
	        JLabel logo_label = new JLabel(logo);
	        c.gridx = 0; c.gridy = 0;
	        c.gridwidth = 1; c.gridheight = 1;
	        center_panel.add(logo_label, c);
	        
	        c.gridx = 1; c.gridy = 0;
	        c.gridheight = 1;c.gridwidth = 6;
	        center_panel.add(new JButton("B"), c);
	        
	        c.gridx = 0;c.gridy = 1;
	        c.gridheight = 1; c.gridwidth = 1;
	        center_panel.add(new JButton("C"), c);
	        
	        c.gridx = 7;
	        c.gridy = 3;
	        c.gridheight = 1;
	        c.gridwidth = 1;
	        center_panel.add(new JButton("D"), c);
	}
	
	@Override
	   public void paint(Graphics g){
	      Dimension dimension = this.getSize();
	      
	        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
	        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
	        setOpaque(false);
	        super.paint(g);
	   }
		
}
