package Equipo7.Interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InterfazGrafica extends JFrame {
	
	// INTERFACE APPLICATION
	private JPanel contentPane;
	
	// WE INITIALIZE COIN VALUES
	private int valorMoneda1 = 0;
	private int valorMoneda2;
	
	private String[] monedasDispo = {"Euro", "Dolar", "Yen", "Libra"};
	private JTextField textField_dol_converter;
	private JTextField textField_eur_converter;
	
	public InterfazGrafica() {
	
		// NOT RESIZABLE STATUS
		setResizable(false);
		
		// TITLE
		setTitle("FOREX CALCULATOR");
		
		// BOUNDARIES
		setBounds(400, 200, 585, 466);
		
		// CROSS WINDOW CLOSER
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// TUR UP THE WINDOW
		setVisible(true);
		
		// CREATES PANEL
		contentPane = new JPanel();
		
		// SET NULL LAYOUT TO WORK BETTER WITH WINDOWS BUILDER
		contentPane.setLayout(null);
		
		//SET PANEL TO WINDOW
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(313, 10, 248, 408);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_6.setBounds(170, 170, 70, 70);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_8.setBounds(90, 90, 70, 70);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_7.setBounds(10, 90, 70, 70);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_9.setBounds(170, 90, 70, 70);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(90, 170, 70, 70);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.setBounds(10, 170, 70, 70);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_CE = new JButton("CE");
		btnNewButton_CE.setBounds(90, 10, 70, 70);
		panel.add(btnNewButton_CE);
		
		JButton btnNewButton_delete = new JButton("delete");
		btnNewButton_delete.setBounds(170, 10, 70, 70);
		panel.add(btnNewButton_delete);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_0.setBounds(90, 331, 70, 70);
		panel.add(btnNewButton_0);
		
		JButton btnNewButton_comma = new JButton(",");
		btnNewButton_comma.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_comma.setBounds(170, 331, 70, 70);
		panel.add(btnNewButton_comma);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(170, 250, 70, 70);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(90, 250, 70, 70);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(10, 250, 70, 70);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 293, 408);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_eur = new JLabel("€");
		lblNewLabel_eur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_eur.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_eur.setBounds(224, 286, 43, 44);
		panel_1.add(lblNewLabel_eur);
		
		JLabel lblNewLabel_dol = new JLabel("$");
		lblNewLabel_dol.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_dol.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_dol.setBounds(224, 123, 43, 44);
		panel_1.add(lblNewLabel_dol);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(200, 133, 29, 21);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(200, 294, 29, 21);
		panel_1.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("Updated ");
		lblNewLabel.setBounds(10, 371, 114, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_coin_1 = new JLabel("coin selector");
		lblNewLabel_coin_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_coin_1.setBounds(158, 264, 125, 22);
		panel_1.add(lblNewLabel_coin_1);
		
		JLabel lblNewLabel_coin_1_1 = new JLabel("coin selector");
		lblNewLabel_coin_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_coin_1_1.setBounds(158, 101, 125, 22);
		panel_1.add(lblNewLabel_coin_1_1);
		
		textField_dol_converter = new JTextField();
		textField_dol_converter.setEditable(false);
		textField_dol_converter.setBounds(10, 134, 143, 19);
		panel_1.add(textField_dol_converter);
		textField_dol_converter.setColumns(10);
		
		textField_eur_converter = new JTextField();
		textField_eur_converter.setEditable(false);
		textField_eur_converter.setColumns(10);
		textField_eur_converter.setBounds(10, 295, 143, 19);
		panel_1.add(textField_eur_converter);

	}
}