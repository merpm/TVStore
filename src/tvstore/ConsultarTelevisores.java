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

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel_3 = new JLabel("Alto ( cm )");
			lblNewLabel_3.setBounds(10, 160, 86, 22);
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Fondo ( cm )");
			lblNewLabel_4.setBounds(11, 205, 105, 22);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Ancho ( cm )");
			lblNewLabel_2.setBounds(10, 114, 106, 22);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio ( s/ )");
			lblNewLabel_1.setBounds(10, 77, 95, 22);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel = new JLabel("Modelo");
			lblNewLabel.setBounds(10, 34, 58, 22);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"LG OLED55C1PSA", "Samsung QLED Q60B 55”", "Sony Bravia X80K 50”", "Xiaomi P1 43”", "TCL 4K 65P735"}));
		comboBox.setBounds(145, 35, 162, 21);
		contentPanel.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setText("3499.0");
		textField.setBounds(145, 82, 162, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_1.setText("122.8");
		textField_1.setBounds(145, 119, 162, 19);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_2.setText("70.6");
		textField_2.setBounds(145, 165, 162, 19);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_3.setText("4.7");
		textField_3.setBounds(145, 208, 157, 19);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(355, 34, 85, 21);
		contentPanel.add(btnNewButton);
		btnNewButton.addActionListener(e -> dispose());
	}
}
