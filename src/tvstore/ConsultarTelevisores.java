package tvstore;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class ConsultarTelevisores extends JDialog {

	private final JPanel cpConsultarTelevisores = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarTelevisores dialog = new ConsultarTelevisores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarTelevisores() {
		setTitle("Consultar Televisores");
		setBounds(100, 100, 479, 322);
		getContentPane().setLayout(new BorderLayout());
		cpConsultarTelevisores.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(cpConsultarTelevisores, BorderLayout.CENTER);
		cpConsultarTelevisores.setLayout(null);
		{
			JLabel lblAlto = new JLabel("Alto ( cm )");
			lblAlto.setBounds(10, 160, 86, 22);
			lblAlto.setFont(new Font("Tahoma", Font.PLAIN, 18));
			cpConsultarTelevisores.add(lblAlto);
		}
		{
			JLabel lblFondo = new JLabel("Fondo ( cm )");
			lblFondo.setBounds(11, 205, 105, 22);
			lblFondo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			cpConsultarTelevisores.add(lblFondo);
		}
		{
			JLabel lblAncho = new JLabel("Ancho ( cm )");
			lblAncho.setBounds(10, 114, 106, 22);
			lblAncho.setFont(new Font("Tahoma", Font.PLAIN, 18));
			cpConsultarTelevisores.add(lblAncho);
		}
		{
			JLabel lblPrecio = new JLabel("Precio ( s/ )");
			lblPrecio.setBounds(10, 77, 95, 22);
			lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
			cpConsultarTelevisores.add(lblPrecio);
		}
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 34, 58, 22);
			lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
			lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			cpConsultarTelevisores.add(lblModelo);
		}
		
		JComboBox cmbModelo = new JComboBox();
		cmbModelo.setFont(new Font("Arial", Font.PLAIN, 15));
		cmbModelo.setModel(new DefaultComboBoxModel(new String[] {"LG OLED55C1PSA", "Samsung QLED Q60B 55”", "Sony Bravia X80K 50”", "Xiaomi P1 43”", "TCL 4K 65P735"}));
		cmbModelo.setBounds(145, 35, 162, 21);
		cpConsultarTelevisores.add(cmbModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Arial", Font.PLAIN, 15));
		txtPrecio.setText("3499.0");
		txtPrecio.setBounds(145, 82, 162, 19);
		cpConsultarTelevisores.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setFont(new Font("Arial", Font.PLAIN, 15));
		txtAncho.setText("122.8");
		txtAncho.setBounds(145, 119, 162, 19);
		cpConsultarTelevisores.add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setFont(new Font("Arial", Font.PLAIN, 15));
		txtAlto.setText("70.6");
		txtAlto.setBounds(145, 165, 162, 19);
		cpConsultarTelevisores.add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setFont(new Font("Arial", Font.PLAIN, 15));
		txtFondo.setText("4.7");
		txtFondo.setBounds(145, 208, 157, 19);
		cpConsultarTelevisores.add(txtFondo);
		txtFondo.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCerrar.setBounds(355, 34, 85, 21);
		cpConsultarTelevisores.add(btnCerrar);
		btnCerrar.addActionListener(e -> dispose());
	}
}
