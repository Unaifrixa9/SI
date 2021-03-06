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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Inicio in = new Inicio(this);
	Menu menu = new Menu(this);
	BandejaEntrada be = new BandejaEntrada(this);
	Enviados en = new Enviados(this);
	Calendario cal = new Calendario(this);
	EscribirMensaje emen = new EscribirMensaje(this);
	LeerMensaje lmen = new LeerMensaje(this);
	Sigma sig = new Sigma(this);
	VerArticulo verA = new VerArticulo(this);
	VerExamenes verEx = new VerExamenes(this);
	AnadirEvento aE = new AnadirEvento(this);
	       
    public VentanaPrincipal(){
    	
    	this.setContentPane(in);
        
        this.setTitle("UCO");
        this.setSize(new Dimension(800, 550));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setLocationRelativeTo(null);
        
    }
    
    public void FocusPanel(JPanel old_panel, 
            int new_panel) {
    			this.remove(old_panel);
    			switch (new_panel){
    			case 0:
    				this.setContentPane(menu);
    				break;
    			case 1:
    				this.setContentPane(be);
    				be.opaque();
    				break;
    			case 2:
    				this.setContentPane(en);
    				en.opaque();
    				break;
    			case 3:
    				this.setContentPane(cal);
    				cal.opaque();
    				break;
    			case 4:
    				System.out.print("YDywg");
    				this.setContentPane(emen);
    				emen.opaque();
    				break;
    			case 5:
    				this.setContentPane(lmen);
    				lmen.opaque();
    				break;
    			case 6:
    				this.setContentPane(sig);
    				sig.opaque();
    				break;
    			case 7:
    				this.setContentPane(verA);
    				verA.opaque();
    				break;
    			case 8:
    				System.out.print("Bien");
    				this.setContentPane(verEx);
    				verEx.opaque();
    				break;
    			case 9:
    				this.setContentPane(aE);
    				aE.opaque();
    				break;
    			}
    			this.revalidate();
       }

    public static void main(String [] args){
        VentanaPrincipal frame = new VentanaPrincipal();
        frame.setVisible(true);
    }
    
    
}
 