import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Ventana1 extends JFrame {
	private JPanel contentPane;
	private JTextField Numero1;
	private JTextField Numero2;
	private JTextField SumaNumeros;
	private JTextField NumResta;
	private JLabel lblNumResta;
	private JLabel lblResResta;
	private JTextField ResResta;
	private JButton btnResta;

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Numero1 para la suma.
		Numero1 = new JTextField();
		Numero1.setBounds(101, 36, 86, 20);
		contentPane.add(Numero1);
		Numero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Numero1");
		lblNumero1.setBounds(101, 13, 86, 14);
		contentPane.add(lblNumero1);
		
		//Numero2 para la suma.
		Numero2 = new JTextField();
		Numero2.setBounds(206, 36, 86, 20);
		contentPane.add(Numero2);
		Numero2.setColumns(10);
		
		JLabel lblNumero2 = new JLabel("Numero2");
		lblNumero2.setBounds(206, 11, 86, 14);
		contentPane.add(lblNumero2);
		
		//Resultado de la suma.
		SumaNumeros = new JTextField();
		SumaNumeros.setBounds(154, 102, 86, 20);
		contentPane.add(SumaNumeros);
		SumaNumeros.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(81, 105, 58, 14);
		contentPane.add(lblResultado);
		
		//Boton que realiza la suma.
		JButton btnBotonSuma = new JButton("Suma");
		btnBotonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float ValorNum1;
				float ValorNum2;
				ValorNum1=Float.parseFloat(Numero1.getText());
				ValorNum2=Float.parseFloat(Numero2.getText());
				SumaNumeros.setText(String.valueOf(ValorNum1 + ValorNum2));
			}
		});
		btnBotonSuma.setBounds(154, 67, 89, 23);
		contentPane.add(btnBotonSuma);
		
		//Numero para la resta.
		NumResta = new JTextField();
		NumResta.setBounds(154, 133, 86, 20);
		contentPane.add(NumResta);
		NumResta.setColumns(10);
		
		lblNumResta = new JLabel("NumResta");
		lblNumResta.setBounds(81, 136, 72, 14);
		contentPane.add(lblNumResta);
		
		//Resultado de la resta.
		ResResta = new JTextField();
		ResResta.setColumns(10);
		ResResta.setBounds(154, 203, 86, 20);
		contentPane.add(ResResta);
		
		lblResResta = new JLabel("Resultado");
		lblResResta.setBounds(81, 206, 72, 14);
		contentPane.add(lblResResta);
		
		//Boton que realiza la resta.
		btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float ResultadoSuma;
				float NumeroResta;
				ResultadoSuma=Float.parseFloat(SumaNumeros.getText());
				NumeroResta=Float.parseFloat(NumResta.getText());
				ResResta.setText(String.valueOf(ResultadoSuma - NumeroResta));
			}
		});
		btnResta.setBounds(151, 164, 89, 23);
		contentPane.add(btnResta);

		
	}
}
