import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class ProbandoJComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;
	private JTextField textPregunta;

	public ProbandoJComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JComboBox.
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 100, 122, 28);
		contentPane.add(comboBox);
		
		//Añadimos elementos.
		String resultado[]=new String[5];
		
		resultado[0]="";
		resultado[1]="5";
		resultado[2]="4";
		resultado[3]="23";
		resultado[4]="6";		
		
		comboBox.addItem(resultado[0]);
		comboBox.addItem(resultado[1]);
		comboBox.addItem(resultado[2]);
		comboBox.addItem(resultado[3]);
		comboBox.addItem(resultado[4]);
		
		//Evento seleccion de item.
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch((String)comboBox.getSelectedItem())
				{
				case "4":
					textResultado.setText("Solucion Correcta");
					break;
				default:
					textResultado.setText("Solucion Incorrecta");
					break;
				}
			}			
		});
		
		//JLabel que definen el textResultado y el JComboBox,
		JLabel lblJComboBox = new JLabel("Seleccione Un Valor");
		lblJComboBox.setBounds(10, 61, 122, 28);
		contentPane.add(lblJComboBox);
		
		JLabel lblResultado = new JLabel("Indica si el valor es correcto");
		lblResultado.setBounds(10, 139, 206, 28);
		contentPane.add(lblResultado);
		
		//JTextField que nos indica si elresultado seleccionado es correcto.
		textResultado = new JTextField();
		textResultado.setBounds(10, 178, 206, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		//JTextField que realiza la pregutna.
		textPregunta = new JTextField();
		textPregunta.setText("Seleccione el valor correcto de la operacion. 2x2");
		textPregunta.setBounds(10, 11, 292, 39);
		contentPane.add(textPregunta);
		textPregunta.setColumns(10);
	}
}
