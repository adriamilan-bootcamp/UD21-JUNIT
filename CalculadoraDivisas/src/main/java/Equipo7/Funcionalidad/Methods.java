package Equipo7.Funcionalidad;

import java.util.Hashtable;

public class Methods {

	public Methods() {}
	//INSERT KEY VALUE DICTIONARY WITH COIN AND SYMBOL RELATED 
	public String typeMonedaSelector(String monedaSeleccionada) {
		
		Hashtable<String, String> coinsValue = new Hashtable<String, String>();
		coinsValue.put("euro", "€");
		coinsValue.put("dolar", "$");
		coinsValue.put("yen", "¥");
		coinsValue.put("libra", "£");
		
		return coinsValue.get(monedaSeleccionada);
		
	}
	
    //IF COINS ARE DIFERENT APLIES THE "monedaTransform" ALGORITHM METHOD OTHER CASE IT'S THE SAME COIN :)) (THE FIRST OPTION)
	public String valorMoneda( double moneda1Value, String moneda1TypeSelected, String moneda2TypeSelected) {

		if (moneda1TypeSelected.equals(moneda2TypeSelected)) {
			return moneda1Value + typeMonedaSelector(moneda1TypeSelected.toLowerCase());
		} else  {
			return monedaTransform(moneda1Value, moneda1TypeSelected, moneda2TypeSelected, typeMonedaSelector(moneda2TypeSelected.toLowerCase()));
		}
	}
	

	//THIS METHOD EVALUEs TWO PARAMETERS AND ACCORD CONDITIONS EVALUATED RETURNS THE PROPER EXCHANGE ALGORITHM
	public String monedaTransform(double moneda1, String moneda1Type,String moneda2Type, String coinIcon) {
		
		String type1 = moneda1Type.toLowerCase();
		String type2 = moneda2Type.toLowerCase();
		
		if (type1.equals("euro") && type2.equals("dolar")) {
			return moneda1 * 1.03 + coinIcon;
		} else if(type1.equals("euro") && type2.equals("yen")) {
			return moneda1 * 136.91 + coinIcon;
		} else if(type1.equals("euro") && type2.equals("libra")) {
			return moneda1 * 0.85 + coinIcon;
		} else if(type1.equals("dolar") && type2.equals("euro")) {
			return moneda1 * 0.98 + coinIcon;
		} else if(type1.equals("dolar") && type2.equals("yen")) {
			return moneda1 * 133.55 + coinIcon;
		} else if(type1.equals("dolar") && type2.equals("libra")) {
			return moneda1 * 0.82 + coinIcon;
		} else if(type1.equals("yen") && type2.equals("euro")) {
			return moneda1 * 0.0073 + coinIcon;
		} else if(type1.equals("yen") && type2.equals("dolar")) {
			return moneda1 * 0.0075 + coinIcon;
		} else if(type1.equals("yen") && type2.equals("libra")) {
			return moneda1 * 0.0062 + coinIcon;
		} else if(type1.equals("libra") && type2.equals("euro")) {
			return moneda1 * 1.18 + coinIcon;
		} else if(type1.equals("libra") && type2.equals("dolar")) {
			return moneda1 * 1.21 + coinIcon;
		} else if(type1.equals("libra") && type2.equals("yen")) {
			return moneda1 * 162.03 + coinIcon;
		} else {
			return "0?error";
		}
		
	}
	
}
