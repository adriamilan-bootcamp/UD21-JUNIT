package Equipo7.Funcionalidad;

import java.util.Hashtable;

public class Methods {

	public Methods() {}
	
	public String typeMonedaSelector(String monedaSeleccionada) {
		
		Hashtable<String, String> coinsValue = new Hashtable<String, String>();
		coinsValue.put("euro", "€");
		coinsValue.put("dolar", "$");
		coinsValue.put("yen", "¥");
		coinsValue.put("libra", "£");
		
		return coinsValue.get(monedaSeleccionada);
		
	}
	
	public String valorMoneda(String indicator, int monedaValue, String monedaTypeSelected) {
		// Devuelve el valor de moneda$ + typeMoneda
		
		if (indicator.equals("moneda1")) {
			return monedaValue + typeMonedaSelector(monedaTypeSelected);
		} else if(indicator.equals("moneda2")) {
			return monedaTransform(monedaValue) + typeMonedaSelector(monedaTypeSelected);
		}
		
	}
	
	public int monedaTransform() {
		// Devuelve valor de moneda2
	}
	
}
