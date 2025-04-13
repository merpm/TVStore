package tvstore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import tvstore.AcercadeTienda;
import tvstore.ConsultarTelevisores;
import tvstore.ModificarTelevisores;


public class Menu extends JFrame {

	private JPanel cpMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 348);
		
		JMenuBar mnbTienda = new JMenuBar();
		setJMenuBar(mnbTienda);
		
		JMenu mArchivo = new JMenu("Archivo");
		mnbTienda.add(mArchivo);
		
		JMenuItem sbmSal = new JMenuItem("Salir");
		mArchivo.add(sbmSal);
		
		JMenu mMantenimiento = new JMenu("Mantenimiento");
		mnbTienda.add(mMantenimiento);
		
		JMenuItem sbmConsTele = new JMenuItem("Consultar Televisores");
		sbmConsTele.addActionListener(e -> {
		    ConsultarTelevisores dialog = new ConsultarTelevisores();
		    dialog.setLocationRelativeTo(null);
		    dialog.setVisible(true);
		});
		mMantenimiento.add(sbmConsTele);
		
		JMenuItem sbmModiTele = new JMenuItem("Modificar Televisor");
		sbmModiTele.addActionListener(e->{
			ModificarTelevisores dialog = new ModificarTelevisores();
			dialog.setLocationRelativeTo(null);
		    dialog.setVisible(true);
		});
		mMantenimiento.add(sbmModiTele);
		
		JMenuItem sbmListTele = new JMenuItem("Listar Televisores");
		mMantenimiento.add(sbmListTele);
		
		JMenu mVentas = new JMenu("Ventas");
		mnbTienda.add(mVentas);
		
		JMenuItem sbmVend = new JMenuItem("Vender");
		mVentas.add(sbmVend);
		
		JMenu mConfiguracion = new JMenu("Configuración");
		mnbTienda.add(mConfiguracion);
		
		JMenuItem sbmConfiObse = new JMenuItem("Configurar obsequios");
		mConfiguracion.add(sbmConfiObse);
		
		JMenu mAyuda = new JMenu("Ayuda");
		
		mnbTienda.add(mAyuda);
		
		JMenuItem sbmAcerTiend = new JMenuItem("Acerca de Tienda");
		sbmAcerTiend.addActionListener(e->{
			AcercadeTienda dialog = new AcercadeTienda(); // Llama al JDialog
		    dialog.setLocationRelativeTo(null); // Centra la ventana
		    dialog.setVisible(true);
		});
		mAyuda.add(sbmAcerTiend);
		cpMenu = new JPanel();
		cpMenu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(cpMenu);
	}

}
