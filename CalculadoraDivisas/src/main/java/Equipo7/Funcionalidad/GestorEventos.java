package Equipo7.Funcionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;

import Equipo7.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener {

	private InterfazGrafica interfazGrafica;
	
	private Methods metodos;
	
	private double moneda1;
	//INSIDE THE CONSTRUCTOR INSTANCE THE INTERFACE AND ADDS ALL LISTENER FOR ALL ELEMENTS
	public GestorEventos(InterfazGrafica ig,Methods metodos) {
		this.metodos = metodos;
		this.interfazGrafica = ig;
		ig.comboBox_1.addActionListener(this);
		ig.comboBox_2.addActionListener(this);
		ig.btnNewButton_0.addActionListener(this);
		ig.btnNewButton_1.addActionListener(this);
		ig.btnNewButton_2.addActionListener(this);
		ig.btnNewButton_3.addActionListener(this);
		ig.btnNewButton_4.addActionListener(this);
		ig.btnNewButton_5.addActionListener(this);
		ig.btnNewButton_6.addActionListener(this);
		ig.btnNewButton_7.addActionListener(this);
		ig.btnNewButton_8.addActionListener(this);
		ig.btnNewButton_9.addActionListener(this);
		ig.btnNewButton_comma.addActionListener(this);
		ig.btnNewButton_delete.addActionListener(this);
		ig.btnNewButton_CE.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		//SWITCHES THE COMMANDS FOR THE MAIN BUTTON ELEMENTS
		switch (event.getActionCommand()) {
			case "moneda":
				moneda1();
				break;
			case "numero":
				JButton boton = (JButton) event.getSource();
				settearTexto(boton.getText());
				moneda1();
				break;
		}
		//USES THE SOURCE ELEMENT IDENTIFIER TO EVALUATE EQUALITY OF VALUES
		if (event.getSource() == this.interfazGrafica.btnNewButton_CE) {
			settear();
		}else if (event.getSource() == this.interfazGrafica.btnNewButton_delete) {
			delete();
			moneda1();
		}
		
	}
	//SETTER
	public void settearTexto(String numero) {
		String texto = this.interfazGrafica.textField_dol_converter.getText();
		this.interfazGrafica.textField_dol_converter.setText(texto + numero);
	}
	//DELETE FUNCTION
	public void delete() {
		String texto = this.interfazGrafica.textField_dol_converter.getText();
		this.interfazGrafica.textField_dol_converter.setText(texto.substring(0,texto.length()-1));
	}
	//SETTER
	public void settear() {
		this.interfazGrafica.textField_dol_converter.setText(null);
		this.interfazGrafica.textField_eur_converter.setText(null);
	}
	//VALIDATION
	public void moneda1() {
		String cantidad = this.interfazGrafica.textField_dol_converter.getText();
		if (!cantidad.isEmpty()) {
			moneda1 = Double.parseDouble(this.interfazGrafica.textField_dol_converter.getText());
			this.interfazGrafica.textField_eur_converter.setText(this.metodos.valorMoneda(moneda1, this.interfazGrafica.comboBox_1.getSelectedItem().toString(), this.interfazGrafica.comboBox_2.getSelectedItem().toString()));
		}else {
			this.interfazGrafica.textField_eur_converter.setText(null);
		}
			
		
		

		
	}
	
}
