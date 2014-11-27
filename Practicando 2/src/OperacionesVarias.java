import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OperacionesVarias extends JFrame {

	private JPanel contentPane;
	private JTextField ValSuma1;
	private JTextField ValSuma2;
	private JTextField ResSuma;
	private JLabel lblValResta1;
	private JTextField ValResta1;
	private JButton BotonResta;
	private JLabel lblValResta2;
	private JTextField ValResta2;
	private JTextField ResResta;
	private JLabel lblResResta;
	private JTextField ValMult1;
	private JLabel label;
	private JLabel label_1;
	private JTextField ValMult2;
	private JButton BotonMultiplicacion;
	private JTextField ResMult;
	private JLabel lblMultiplicacion;


	/**
	 * Create the frame.
	 */
	public OperacionesVarias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ELEMENTOS DE LA SUMA.
		
		//Caja donde se introduce el primer valor de la suma.
		ValSuma1 = new JTextField();
		ValSuma1.setBounds(0, 39, 86, 20);
		contentPane.add(ValSuma1);
		ValSuma1.setColumns(10);
		
		//Caja donde se introduce el primer valor de la suma.
		ValSuma2 = new JTextField();
		ValSuma2.setBounds(199, 39, 86, 20);
		contentPane.add(ValSuma2);
		ValSuma2.setColumns(10);
		
		//Caja donde sale el valor de la suma.
		ResSuma = new JTextField();
		ResSuma.setBounds(308, 39, 86, 20);
		contentPane.add(ResSuma);
		ResSuma.setColumns(10);
		
		//Boton que realiza la suma
		JButton BotonSuma = new JButton("SUMA");
		BotonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float ValorSuma1;
				float ValorSuma2;
				ValorSuma1=Float.parseFloat(ValSuma1.getText());
				ValorSuma2=Float.parseFloat(ValSuma2.getText());
				ResSuma.setText(String.valueOf(ValorSuma1 + ValorSuma2));
				//Copia el resulado de la suma en la caja del valor de la multiplicacion.
				ValMult1.setText(ResSuma.getText());
			}
		});
		BotonSuma.setBounds(100, 38, 89, 23);
		contentPane.add(BotonSuma);
		
		//Jlabels que definen cada JtextField de la suma.
		JLabel lblValSuma1 = new JLabel("Valor Suma 1");
		lblValSuma1.setBounds(0, 11, 86, 17);
		contentPane.add(lblValSuma1);
		
		JLabel lblValSuma2 = new JLabel("Valor Suma 2");
		lblValSuma2.setBounds(199, 11, 86, 17);
		contentPane.add(lblValSuma2);
		
		JLabel lblResSuma = new JLabel("Resultado Suma");
		lblResSuma.setBounds(305, 11, 111, 17);
		contentPane.add(lblResSuma);
		
		//ELEMENTOS DE LA RESTA.
		
		//Caja donde se introduce el primer valor de la resta.
		ValResta1 = new JTextField();
		ValResta1.setColumns(10);
		ValResta1.setBounds(0, 98, 86, 20);
		contentPane.add(ValResta1);
		
		//Caja donde se introduce el segundo valor de la resta.
		ValResta2 = new JTextField();
		ValResta2.setColumns(10);
		ValResta2.setBounds(199, 98, 86, 20);
		contentPane.add(ValResta2);
		
		//Caja donde sale el resultado de la resta.
		ResResta = new JTextField();
		ResResta.setColumns(10);
		ResResta.setBounds(308, 98, 86, 20);
		contentPane.add(ResResta);
		
		//Boton que realiza la resta.
		BotonResta = new JButton("RESTA");
		BotonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float ValorResta1;
				float ValorResta2;
				ValorResta1=Float.parseFloat(ValResta1.getText());
				ValorResta2=Float.parseFloat(ValResta2.getText());
				ResResta.setText(String.valueOf(ValorResta1 - ValorResta2));
				//Copia el resulado de la resta en la caja del valor de la multiplicacion.
				ValMult2.setText(ResResta.getText());
			}
		});
		BotonResta.setBounds(100, 97, 89, 23);
		contentPane.add(BotonResta);
		
		//JLabels que definen cada JTextField de la resta.
		lblValResta1 = new JLabel("Valor Resta 1");
		lblValResta1.setBounds(0, 70, 86, 17);
		contentPane.add(lblValResta1);
		
		lblValResta2 = new JLabel("Valor Resta 2");
		lblValResta2.setBounds(199, 70, 86, 17);
		contentPane.add(lblValResta2);
		
		lblResResta = new JLabel("Resultado Resta");
		lblResResta.setBounds(305, 70, 111, 17);
		contentPane.add(lblResResta);
		
		//ELEMENTOS DE LA MULTIPLICACION.
		
		//Caja donde se introduce el resultado de la suma.
		ValMult1 = new JTextField();
		ValMult1.setColumns(10);
		ValMult1.setBounds(3, 157, 86, 20);
		contentPane.add(ValMult1);
		
		//Caja donde se intrduce el resultado de la resta.
		ValMult2 = new JTextField();
		ValMult2.setColumns(10);
		ValMult2.setBounds(212, 157, 86, 20);
		contentPane.add(ValMult2);
		
		//Caja donde sale el resultado de la multiplicacion.
		ResMult = new JTextField();
		ResMult.setColumns(10);
		ResMult.setBounds(308, 157, 86, 20);
		contentPane.add(ResMult);
		
		
		//Boton que realiza la multiplicacion.
		BotonMultiplicacion = new JButton("MULTIPLICA");
		BotonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float ValorMult1;
				float ValorMult2;
				ValorMult1=Float.parseFloat(ResSuma.getText());
				ValorMult2=Float.parseFloat(ResResta.getText());
				ResMult.setText(String.valueOf(ValorMult1 * ValorMult2));
			}
		});
		BotonMultiplicacion.setBounds(100, 156, 102, 23);
		contentPane.add(BotonMultiplicacion);
		
		//JLabel que define el valor de cada JTextField.
		label = new JLabel("Resultado Suma");
		label.setBounds(0, 129, 111, 17);
		contentPane.add(label);
		
		label_1 = new JLabel("Resultado Resta");
		label_1.setBounds(209, 129, 111, 17);
		contentPane.add(label_1);
		
		lblMultiplicacion = new JLabel("Resultado Multiplicacion");
		lblMultiplicacion.setBounds(305, 129, 111, 17);
		contentPane.add(lblMultiplicacion);
		
		
		
	}
}
