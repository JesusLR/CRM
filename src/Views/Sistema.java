package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sistema extends JFrame {

	private JPanel contentPane;
	private JTextField textField_BuscarCliente;
	private JTextField textFieldCliente_NID;
	private JTextField textFieldCliente_NOMBRE;
	private JTextField textFieldCliente_APELLIDO;
	private JTextField textFieldCliente_Email;
	private JTextField textFieldCliente_TELEFONO;
	private JTextField textFieldCliente_DIRECCION;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
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
	public Sistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1336, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1320, 47);
		contentPane.add(panel);
		
		JLabel lblCrm = new JLabel("CRM");
		lblCrm.setForeground(Color.WHITE);
		lblCrm.setBackground(Color.RED);
		lblCrm.setFont(new Font("Vladimir Script", Font.PLAIN, 24));
		panel.add(lblCrm);
		
		JTabbedPane TabbedPanePrincipal = new JTabbedPane(JTabbedPane.TOP);
		TabbedPanePrincipal.setBounds(0, 105, 1320, 556);
		contentPane.add(TabbedPanePrincipal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		TabbedPanePrincipal.addTab("Ventas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		TabbedPanePrincipal.addTab("Clientes", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 1295, 50);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblClientes.setForeground(SystemColor.activeCaption);
		lblClientes.setBounds(10, 0, 97, 50);
		panel_3.add(lblClientes);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setForeground(SystemColor.activeCaption);
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBuscar.setBounds(415, 23, 46, 14);
		panel_3.add(lblBuscar);
		
		textField_BuscarCliente = new JTextField();
		textField_BuscarCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_BuscarCliente.setBounds(471, 20, 182, 20);
		panel_3.add(textField_BuscarCliente);
		textField_BuscarCliente.setColumns(10);
		
		JPanel TabbedPane = new JPanel();
		TabbedPane.setBounds(10, 72, 401, 445);
		panel_2.add(TabbedPane);
		TabbedPane.setLayout(null);
		
		JTabbedPane TabbedPaneCliente = new JTabbedPane(JTabbedPane.TOP);
		TabbedPaneCliente.setBounds(10, 27, 381, 407);
		TabbedPane.add(TabbedPaneCliente);
		
		JPanel Tabbed_5 = new JPanel();
		TabbedPaneCliente.addTab("Clientes", null, Tabbed_5, null);
		Tabbed_5.setLayout(null);
		
		JLabel lblInformacionDelCliente = new JLabel("Informacion del cliente");
		lblInformacionDelCliente.setBackground(SystemColor.activeCaption);
		lblInformacionDelCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInformacionDelCliente.setBounds(104, 11, 145, 17);
		Tabbed_5.add(lblInformacionDelCliente);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(73, 39, 196, 109);
		Tabbed_5.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 176, 87);
		panel_4.add(lblNewLabel);
		
		JLabel LabelCliente_NID = new JLabel("NID");
		LabelCliente_NID.setForeground(SystemColor.activeCaption);
		LabelCliente_NID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelCliente_NID.setBounds(10, 168, 29, 17);
		Tabbed_5.add(LabelCliente_NID);
		
		textFieldCliente_NID = new JTextField();
		textFieldCliente_NID.setBounds(10, 191, 145, 20);
		Tabbed_5.add(textFieldCliente_NID);
		textFieldCliente_NID.setColumns(10);
		
		JLabel LabelCLiente_NOMBRE = new JLabel("NOMBRE");
		LabelCLiente_NOMBRE.setForeground(SystemColor.activeCaption);
		LabelCLiente_NOMBRE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelCLiente_NOMBRE.setBounds(189, 168, 74, 17);
		Tabbed_5.add(LabelCLiente_NOMBRE);
		
		textFieldCliente_NOMBRE = new JTextField();
		textFieldCliente_NOMBRE.setColumns(10);
		textFieldCliente_NOMBRE.setBounds(189, 191, 145, 20);
		Tabbed_5.add(textFieldCliente_NOMBRE);
		
		JLabel LabelCliente_APELLIDO = new JLabel("APELLIDO");
		LabelCliente_APELLIDO.setForeground(SystemColor.activeCaption);
		LabelCliente_APELLIDO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelCliente_APELLIDO.setBounds(10, 225, 74, 17);
		Tabbed_5.add(LabelCliente_APELLIDO);
		
		textFieldCliente_APELLIDO = new JTextField();
		textFieldCliente_APELLIDO.setColumns(10);
		textFieldCliente_APELLIDO.setBounds(10, 248, 145, 20);
		Tabbed_5.add(textFieldCliente_APELLIDO);
		
		JLabel LabelCliente_Email = new JLabel("Email");
		LabelCliente_Email.setForeground(SystemColor.activeCaption);
		LabelCliente_Email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelCliente_Email.setBounds(189, 228, 74, 17);
		Tabbed_5.add(LabelCliente_Email);
		
		textFieldCliente_Email = new JTextField();
		textFieldCliente_Email.setColumns(10);
		textFieldCliente_Email.setBounds(189, 248, 145, 20);
		Tabbed_5.add(textFieldCliente_Email);
		
		JLabel LabelCliente_TELEFONO = new JLabel("TELEFONO");
		LabelCliente_TELEFONO.setForeground(SystemColor.activeCaption);
		LabelCliente_TELEFONO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelCliente_TELEFONO.setBounds(10, 281, 74, 17);
		Tabbed_5.add(LabelCliente_TELEFONO);
		
		JLabel LabelCliente_DIRECCION = new JLabel("DIRECCION");
		LabelCliente_DIRECCION.setForeground(SystemColor.activeCaption);
		LabelCliente_DIRECCION.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelCliente_DIRECCION.setBounds(189, 284, 74, 17);
		Tabbed_5.add(LabelCliente_DIRECCION);
		
		textFieldCliente_TELEFONO = new JTextField();
		textFieldCliente_TELEFONO.setColumns(10);
		textFieldCliente_TELEFONO.setBounds(10, 304, 145, 20);
		Tabbed_5.add(textFieldCliente_TELEFONO);
		
		textFieldCliente_DIRECCION = new JTextField();
		textFieldCliente_DIRECCION.setColumns(10);
		textFieldCliente_DIRECCION.setBounds(189, 304, 145, 20);
		Tabbed_5.add(textFieldCliente_DIRECCION);
		
		JButton btnClientes_Agregar = new JButton("");
		btnClientes_Agregar.setIcon(new ImageIcon("C:\\Users\\jesus\\eclipse-workspace\\CRM\\src\\Resources\\Agregar.png"));
		btnClientes_Agregar.setBackground(SystemColor.activeCaption);
		btnClientes_Agregar.setBounds(34, 335, 94, 33);
		Tabbed_5.add(btnClientes_Agregar);
		
		JButton btnClientes_Cancelar = new JButton("");
		btnClientes_Cancelar.setIcon(new ImageIcon("C:\\Users\\jesus\\eclipse-workspace\\CRM\\src\\Resources\\Cancelar.png"));
		btnClientes_Cancelar.setBackground(SystemColor.activeCaption);
		btnClientes_Cancelar.setBounds(218, 335, 89, 33);
		Tabbed_5.add(btnClientes_Cancelar);
		
		JPanel TabbedPanelCliente = new JPanel();
		TabbedPanelCliente.setBackground(SystemColor.activeCaptionBorder);
		TabbedPaneCliente.addTab("Pagos", null, TabbedPanelCliente, null);
		
		JButton btnClientes = new JButton("");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TabbedPanePrincipal.setSelectedIndex(1);
			}
		});
		btnClientes.setBackground(SystemColor.activeCaption);
		btnClientes.setIcon(new ImageIcon("C:\\Users\\jesus\\eclipse-workspace\\CRM\\src\\Resources\\people.png"));
		btnClientes.setBounds(36, 58, 89, 23);
		contentPane.add(btnClientes);
	}
}
