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
	
	public String valorMoneda(String indicator, int moneda1Value, int moneda2Value, String moneda1TypeSelected, String moneda2TypeSelected) {
		// Devuelve el valor de moneda$ + typeMoneda
		
		if (indicator.equals("moneda1")) {
			return moneda1Value + typeMonedaSelector(moneda1TypeSelected);
		} else if(indicator.equals("moneda2")) {
			return monedaTransform(moneda1Value, moneda2Value, moneda1TypeSelected, moneda2TypeSelected, typeMonedaSelector(moneda2TypeSelected));
		} else {
			return "Error";
		}
		
	}
	
	public String monedaTransform(int moneda1, String moneda1Type,String moneda2Type, String coinIcon) {
		// Devuelve valor de moneda2
		
		String moneda1Type = moneda1TypeSelected.toLowerCase();
		String moneda2Type = moneda2TypeSelected.toLowerCase();
		
		if (moneda1Type.equals("euro") && moneda2Type.equals("dolars")) {
			return euro2Dolars(moneda1);
		}
		
	}
	
}
