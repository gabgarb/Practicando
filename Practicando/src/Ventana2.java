import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana2 extends JFrame {
	private JPanel contentPane;
	private JTextField Texto;
	private JTextField Texto2;
	private JTextField Texto3;
	private JTextField Texto4;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Se copia el texto escrito.
		Texto = new JTextField();
		Texto.setBounds(10, 44, 86, 20);
		contentPane.add(Texto);
		Texto.setColumns(10);
		
		//Se pega el texto escrito.
		Texto2 = new JTextField();
		Texto2.setBounds(236, 44, 86, 20);
		contentPane.add(Texto2);
		Texto2.setColumns(10);
		
		//Se pega el texto.
		Texto3 = new JTextField();
		Texto3.setColumns(10);
		Texto3.setBounds(236, 124, 86, 20);
		contentPane.add(Texto3);
		
		//Se pega el texto.
		Texto4 = new JTextField();
		Texto4.setColumns(10);
		Texto4.setBounds(10, 124, 86, 20);
		contentPane.add(Texto4);
		
		//Boton que realiza la funcion de copiado.
		button1 = new JButton("Copiado");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Texto2.setText(Texto.getText());
			}
		});
		button1.setBounds(118, 43, 89, 23);
		contentPane.add(button1);
		
		//Boton que realiza la funcion de copiado.
		button2 = new JButton("Copiado");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Texto3.setText(Texto2.getText());
			}
		});
		button2.setBounds(233, 75, 89, 23);
		contentPane.add(button2);
		
		//Boton que realiza la funcion de copiado.
		button3 = new JButton("Copiado");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Texto4.setText(Texto3.getText());	
			}
		});
		button3.setBounds(118, 123, 89, 23);
		contentPane.add(button3);
		
		//Boton que realiza la funcion de copiado.
		button4 = new JButton("Copiado");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Texto.setText(Texto4.getText());
			}
		});
		button4.setBounds(10, 78, 89, 23);
		contentPane.add(button4);
	}

}
