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
import java.awt.Window.Type;
import java.awt.Dialog.ModalityType;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class AcercadeTienda extends JDialog {

	private final JPanel cpTIenda = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercadeTienda dialog = new AcercadeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercadeTienda() {
		setType(Type.UTILITY);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 463, 392);
		getContentPane().setLayout(new BorderLayout());
		cpTIenda.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(cpTIenda, BorderLayout.CENTER);
		cpTIenda.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tienda 1.0");
			lblNewLabel.setBounds(0, 10, 449, 60);
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			cpTIenda.add(lblNewLabel);
		}
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Arial", Font.BOLD, 20));
		lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores.setBounds(158, 80, 128, 41);
		cpTIenda.add(lblAutores);
		
		JLabel lblPM = new JLabel("Peralta Mary");
		lblPM.setHorizontalAlignment(SwingConstants.CENTER);
		lblPM.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPM.setBounds(168, 130, 101, 13);
		cpTIenda.add(lblPM);
		
		JPanel pnlTienda = new JPanel();
		pnlTienda.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 153)));
		pnlTienda.setBounds(0, 0, 449, 74);
		cpTIenda.add(pnlTienda);
		
		JLabel lblEH = new JLabel("Eva Hernandez");
		lblEH.setHorizontalAlignment(SwingConstants.CENTER);
		lblEH.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEH.setBounds(168, 153, 118, 13);
		cpTIenda.add(lblEH);
		
		JLabel lblGN = new JLabel("Greisy Nuñez");
		lblGN.setFont(new Font("Arial", Font.PLAIN, 15));
		lblGN.setBounds(176, 176, 93, 13);
		cpTIenda.add(lblGN);
		
		JLabel lblJL = new JLabel("Josue Leon");
		lblJL.setFont(new Font("Arial", Font.PLAIN, 15));
		lblJL.setBounds(185, 199, 101, 13);
		cpTIenda.add(lblJL);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCerrar.setBounds(168, 255, 85, 21);
		cpTIenda.add(btnCerrar);
		btnCerrar.addActionListener(e -> dispose());
	}
}
