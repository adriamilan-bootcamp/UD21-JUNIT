package Equipo7.Funcionalidad;

import java.util.Hashtable;

public class Methods {

	public Methods() {}
	
	public String typeMonedaSelector(String monedaSeleccionada) {
		
		Hashtable<String, String> coinsValue = new Hashtable<String, String>();
		coinsValue.put("euro", "€");
		coinsValue.put("dollar", "$");
		coinsValue.put("yen", "¥");
		coinsValue.put("libra", "£");
		
		return coinsValue.get(monedaSeleccionada);
		
	}
	
	public String valorMoneda(String indicator, Double moneda1Value, String moneda1TypeSelected, String moneda2TypeSelected) {
		// Devuelve el valor de moneda$ + typeMoneda
		if (indicator.equals("moneda1")) {
			return moneda1Value + typeMonedaSelector(moneda1TypeSelected.toLowerCase());
		} else if(indicator.equals("moneda2")) {
			return monedaTransform(moneda1Value, moneda1TypeSelected, moneda2TypeSelected, typeMonedaSelector(moneda2TypeSelected.toLowerCase()));
		} else {
			return "Error";
		}
		
	}
	
	public String monedaTransform(Double moneda1, String moneda1Type,String moneda2Type, String coinIcon) {
		// Devuelve valor de moneda2
		
		String type1 = moneda1Type.toLowerCase();
		String type2 = moneda2Type.toLowerCase();
		
		if (type1.equals("euro") && type2.equals("dolars")) {
			return moneda1 * 1.03 + coinIcon;
		} else if(type1.equals("euro") && type2.equals("yen")) {
			return moneda1 * 136.91 + coinIcon;
		} else if(type1.equals("euro") && type2.equals("libra")) {
			return moneda1 * 0.85 + coinIcon;
		} else if(type1.equals("dollar") && type2.equals("euro")) {
			return moneda1 * 0.98 + coinIcon;
		} else if(type1.equals("dollar") && type2.equals("yen")) {
			return moneda1 * 133.55 + coinIcon;
		} else if(type1.equals("dollar") && type2.equals("libra")) {
			return moneda1 * 0.82 + coinIcon;
		} else if(type1.equals("yen") && type2.equals("euro")) {
			return moneda1 * 0.0073 + coinIcon;
		} else if(type1.equals("yen") && type2.equals("dollar")) {
			return moneda1 * 0.0075 + coinIcon;
		} else if(type1.equals("yen") && type2.equals("libra")) {
			return moneda1 * 0.0062 + coinIcon;
		} else if(type1.equals("libra") && type2.equals("euro")) {
			return moneda1 * 1.18 + coinIcon;
		} else if(type1.equals("libra") && type2.equals("dollar")) {
			return moneda1 * 1.21 + coinIcon;
		} else if(type1.equals("libra") && type2.equals("yen")) {
			return moneda1 * 162.03 + coinIcon;
		} else {
			return "0?error";
		}
		
	}
	
}
