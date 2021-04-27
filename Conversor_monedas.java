package practica21;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

public class Conversor_monedas extends JFrame implements ActionListener {

	/**
	 * variables de instancia
	 */
	private  double cambio_dolares;
	private JButton euros;
	private JButton dolares;
	private JButton desglosar;
	private TextArea desglose;
	private JTextField visor_resultado;
	private static final long serialVersionUID = 1L;
	private JOptionPane error;
	private JOptionPane mensaje;
	private Desglose d;
	/**
	 *Ángela
	 *9:40:51
	 *13-abr-2021
	 **/
	/**
	 * constructor
	 */
	public Conversor_monedas() {
		this.setTitle("Conversor de dolores a euros");
		euros=new JButton("A euros");
		dolares=new JButton("A dólares");
		desglosar=new JButton("Desglosar");
		this.setIconImage(new ImageIcon("C:\\Users\\diegl\\OneDrive\\Documentos\\Iconos\\signo-euro-simbolo_2227-473.jpg").getImage());
		Container c=this.getContentPane();
	desglose=new TextArea();
	
	visor_resultado=new JTextField("                    ");

c.setLayout(new GridLayout(3,1));
mensaje=new JOptionPane();
error=new JOptionPane();
	/**
 * añagir los componente
 */
//JPanel panel_abajo=new JPanel();
JPanel panel_resultado=new JPanel();
JPanel panel_botones=new JPanel();
/**
 * añadir componentes al panel primero
 */
JLabel etiqueta=new JLabel("Visor del resultado");
panel_resultado.add(etiqueta);
panel_resultado.add(visor_resultado);
c.add(panel_resultado);
/**
 * añadir componentes al panel de los botones
 */

panel_botones.add(euros);
panel_botones.add(dolares);
panel_botones.add(desglosar);
euros.setForeground(Color.blue);
dolares.setForeground(Color.blue);
desglosar.setForeground(Color.blue);
Font f=new Font("Comic Sans ms",Font.BOLD,12);
euros.setFont(f);
dolares.setFont(f);
desglosar.setFont(f);
c.add(panel_botones);
this.pack();

/**
 * añadir el texto del desglose 
 */
//ScrollPane panel_deslizable=new ScrollPane();
//panel_deslizable.add(desglose);
//panel_abajo.add(panel_deslizable);
euros.addActionListener(this);
dolares.addActionListener(this);
desglosar.addActionListener(this);
c.add(desglose);
/**
 * añadir los eventos
 */
try {
	String input=JOptionPane.showInputDialog("Introduzca el cambio a dolar");
	cambio_dolares=Double.parseDouble(input);
}
catch(RuntimeException err) {
	error.showMessageDialog(this, "Debe Introducir un número", "mensaje", JOptionPane.ERROR_MESSAGE);
	cambio_dolares=1;
}


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			DecimalFormatSymbols simbolos=new DecimalFormatSymbols();
			simbolos.setDecimalSeparator('.');
			DecimalFormat patron=new DecimalFormat("00.0",simbolos);
			double valor=Double.parseDouble(visor_resultado.getText());
			if(e.getSource()==desglosar) {
				desglosar(valor);
			}
		
		else {
			if(e.getSource()==dolares) {
				valor=Double.valueOf(visor_resultado.getText())*cambio_dolares;
				visor_resultado.setText(patron.format(valor).toString());
			}
			else {
				valor=Double.valueOf(visor_resultado.getText())/cambio_dolares;
				visor_resultado.setText(patron.format(valor).toString());
			}
		}
		}
		catch(NumberFormatException err) {
			error.showMessageDialog(this, "Debe Introducir un número", "mensaje", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void desglosar(double valor){

		d=new Desglose(valor);
	desglose.setText(d.toString());
	}
}
