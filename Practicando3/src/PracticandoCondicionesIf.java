import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PracticandoCondicionesIf extends JFrame {

	private JPanel contentPane;
	private JTextField Valor1;
	private JTextField Valor2;
	private JTextField ComValor1;
	private JTextField ComValor2;

	/**
	 * Create the frame.
	 */
	public PracticandoCondicionesIf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JTextField donde se introduce un valor.
		Valor1 = new JTextField();
		Valor1.setBounds(10, 43, 86, 20);
		contentPane.add(Valor1);
		Valor1.setColumns(10);
		
		//JTextField donde se introduce un valor.
		Valor2 = new JTextField();
		Valor2.setBounds(10, 113, 86, 20);
		contentPane.add(Valor2);
		Valor2.setColumns(10);
		
		//JTextField donde sale si el valor es correcto.
		ComValor1 = new JTextField();
		ComValor1.setEditable(false);
		ComValor1.setBounds(295, 43, 200, 20);
		contentPane.add(ComValor1);
		ComValor1.setColumns(10);
		
		//JTextField donde sale si el valor es correcto.
		ComValor2 = new JTextField();
		ComValor2.setEditable(false);
		ComValor2.setBounds(295, 113, 200, 20);
		contentPane.add(ComValor2);
		ComValor2.setColumns(10);
		
		//JLabel que definen las JTextField
		JLabel lblValor1 = new JLabel("Introducir Valor Numerico Entre 0 y 10");
		lblValor1.setBounds(10, 11, 260, 25);
		contentPane.add(lblValor1);
		
		JLabel lblValor2 = new JLabel("Introducir Valor Numerico Entre 10 y 20");
		lblValor2.setBounds(10, 74, 260, 28);
		contentPane.add(lblValor2);
		
		JLabel lblComValor1 = new JLabel("Resolucion si el valor es correcto");
		lblComValor1.setBounds(296, 11, 200, 25);
		contentPane.add(lblComValor1);
		
		JLabel lblComValor2 = new JLabel("Resolucion si el valor es correcto");
		lblComValor2.setBounds(296, 74, 199, 28);
		contentPane.add(lblComValor2);
		
		//Boton que realiza la funcion de validacion.
		JButton btnComprobar1 = new JButton("Comprobar");
		btnComprobar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Ivalor1=0;
				String Svalor1="";
				
				Svalor1=Valor1.getText();
				
				Ivalor1=Integer.parseInt(Svalor1);
				
				//CONDICION
				if((Ivalor1>=0)&&(Ivalor1<=10)){
					//Si es verdadera la condicion
					ComValor1.setText("Es un valor correcto");
				}else{
					//Si no es verdadera la condicion
					ComValor1.setText("No es un valor correcto");
				}
			}
		});
		btnComprobar1.setBounds(153, 43, 107, 20);
		contentPane.add(btnComprobar1);
		

		JButton btnComprobar2 = new JButton("Comprobar");
		btnComprobar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Ivalor2=0;
				String Svalor2="";
				
				Svalor2=Valor2.getText();
				
				Ivalor2=Integer.parseInt(Svalor2);
				
				//CONDICION
				if((Ivalor2>=10)&&(Ivalor2<=20)){
					//Si es verdadera la condicion
					ComValor2.setText("Es un valor correcto");
				}else{
					//Si no es verdadera la condicion
					ComValor2.setText("No es un valor correcto");
				}
			}
		});
		btnComprobar2.setBounds(153, 113, 107, 20);
		contentPane.add(btnComprobar2);
		
		JButton btnComprobar3 = new JButton("Comprobar los dos valores al mismo tiempo");
		btnComprobar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Ivalor1=0;
				String Svalor1="";
				int Ivalor2=0;
				String Svalor2="";
				
				Svalor1=Valor1.getText();
				Svalor2=Valor2.getText();
				
				Ivalor1=Integer.parseInt(Svalor1);
				Ivalor2=Integer.parseInt(Svalor2);
				
				//CONDICION
				if((Ivalor1>=0)&&(Ivalor1<=10)){
					//Si es verdadera la condicion
					ComValor1.setText("Es un valor correcto");
				}else{
					//Si no es verdadera la condicion
					ComValor1.setText("No es un valor correcto");
				}
				if((Ivalor2>=10)&&(Ivalor2<=20)){
					//Si es verdadera la condicion
					ComValor2.setText("Es un valor correcto");
				}else{
					//Si no es verdadera la condicion
					ComValor2.setText("No es un valor correcto");
				}
			}
		});
		btnComprobar3.setBounds(10, 180, 485, 23);
		contentPane.add(btnComprobar3);
	}
}
