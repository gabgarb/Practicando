import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PracticandoJCombox extends JFrame {

	private JPanel contentPane;
	private JTextField Valor1;
	private JTextField Valor2;
	private JTextField Resultado;

	/**
	 * Create the frame.
	 */
	public PracticandoJCombox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JComboBox donde se seleccionara el valor de la operacion.
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 41, 114, 26);
		contentPane.add(comboBox);
		
		String Multiplicacion="Multiplicacion";
		String Division="Division";
		String Suma="Suma";
		String Resta="Resta";
		
		comboBox.addItem(Multiplicacion);
		comboBox.addItem(Division);
		comboBox.addItem(Suma);
		comboBox.addItem(Resta);
		
		//JTextField donde se introducira un valor para la multiplicacion.
		Valor1 = new JTextField();
		Valor1.setBounds(10, 129, 114, 26);
		contentPane.add(Valor1);
		Valor1.setColumns(10);
		
		//JTextField donde se introducira un valor para la multiplicacion.
		Valor2 = new JTextField();
		Valor2.setColumns(10);
		Valor2.setBounds(258, 129, 114, 26);
		contentPane.add(Valor2);
		
		//JTextField donde saldra el resultado de la operacion.
		Resultado = new JTextField();
		Resultado.setColumns(10);
		Resultado.setBounds(398, 129, 114, 26);
		contentPane.add(Resultado);
		
		//Boton que realizara las operaciones.
		JButton btnOperaci�n = new JButton("OPERCI\u00D3N");
		btnOperaci�n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnOperaci�n.setBounds(134, 129, 114, 26);
		contentPane.add(btnOperaci�n);
		
		//JLabels que definen cada valor en la parte visual.
		JLabel lblSeleccionOperaci�n = new JLabel("Seleccion Operaci\u00F3n");
		lblSeleccionOperaci�n.setBounds(10, 11, 153, 26);
		contentPane.add(lblSeleccionOperaci�n);
		
		JLabel lblValorOperaci�n1 = new JLabel("Valor Operaci\u00F3n");
		lblValorOperaci�n1.setBounds(10, 92, 114, 26);
		contentPane.add(lblValorOperaci�n1);
		
		JLabel lblValorOperaci�n2 = new JLabel("Valor Operaci\u00F3n");
		lblValorOperaci�n2.setBounds(258, 92, 114, 26);
		contentPane.add(lblValorOperaci�n2);
		
		JLabel lblResultado = new JLabel("Resultado Operaci\u00F3n");
		lblResultado.setBounds(398, 92, 136, 26);
		contentPane.add(lblResultado);
	}
}
