package tvstore;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;



public class ModificarTelevisores extends JDialog {

	private final JPanel cpModificarTelevisores = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarTelevisores dialog = new ModificarTelevisores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarTelevisores() {
		setTitle("Modificar Televisores");
		setBounds(100, 100, 471, 304);
		getContentPane().setLayout(null);
		cpModificarTelevisores.setBounds(0, 0, 447, 267);
		cpModificarTelevisores.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(cpModificarTelevisores);
		cpModificarTelevisores.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setHorizontalAlignment(SwingConstants.LEFT);
			lblModelo.setBounds(20, 41, 64, 19);
			lblModelo.setFont(new Font("Arial", Font.PLAIN, 15));
			cpModificarTelevisores.add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio ( S/ )");
			lblPrecio.setHorizontalAlignment(SwingConstants.LEFT);
			lblPrecio.setVerticalAlignment(SwingConstants.TOP);
			lblPrecio.setFont(new Font("Arial", Font.PLAIN, 15));
			lblPrecio.setBounds(20, 80, 80, 19);
			cpModificarTelevisores.add(lblPrecio);
		}
		{
			JLabel lblAncho = new JLabel("Ancho ( cm )");
			lblAncho.setFont(new Font("Arial", Font.PLAIN, 15));
			lblAncho.setBounds(20, 121, 91, 18);
			cpModificarTelevisores.add(lblAncho);
		}
		{
			JLabel lblAncho = new JLabel("Alto ( cm )");
			lblAncho.setFont(new Font("Arial", Font.PLAIN, 15));
			lblAncho.setBounds(20, 163, 80, 19);
			cpModificarTelevisores.add(lblAncho);
		}
		{
			JLabel lblFondo = new JLabel("Fondo ( cm )");
			lblFondo.setFont(new Font("Arial", Font.PLAIN, 15));
			lblFondo.setBounds(20, 203, 91, 19);
			cpModificarTelevisores.add(lblFondo);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setFont(new Font("Arial", Font.PLAIN, 15));
			btnCerrar.setBounds(335, 41, 102, 21);
			cpModificarTelevisores.add(btnCerrar);
			btnCerrar.addActionListener(e -> dispose());
		}
		{
			JButton btnGuardar = new JButton("Guardar");
			btnGuardar.setFont(new Font("Arial", Font.PLAIN, 15));
			btnGuardar.setBounds(335, 80, 102, 21);
			cpModificarTelevisores.add(btnGuardar);
			{
				JComboBox cmbModelo = new JComboBox();
				cmbModelo.setFont(new Font("Arial", Font.PLAIN, 15));
				cmbModelo.setModel(new DefaultComboBoxModel(new String[] {"LG OLED55C1PSA", "Samsung QLED Q60B 55”", "Sony Bravia X80K 50”", "Xiaomi P1 43”", "TCL 4K 65P735"}));
				cmbModelo.setBounds(139, 41, 166, 21);
				cpModificarTelevisores.add(cmbModelo);
			}
		
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Arial", Font.PLAIN, 15));
			txtPrecio.setText("3499.0");
			txtPrecio.setBounds(139, 81, 166, 19);
			cpModificarTelevisores.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setFont(new Font("Arial", Font.PLAIN, 15));
			txtAncho.setText("122.0");
			txtAncho.setBounds(139, 122, 166, 19);
			cpModificarTelevisores.add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setFont(new Font("Arial", Font.PLAIN, 15));
			txtAlto.setText("70.6");
			txtAlto.setBounds(139, 164, 166, 19);
			cpModificarTelevisores.add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setFont(new Font("Arial", Font.PLAIN, 15));
			txtFondo.setText("4.7");
			txtFondo.setBounds(139, 204, 166, 19);
			cpModificarTelevisores.add(txtFondo);
			txtFondo.setColumns(10);
		}
	}

}
