package Equipo7.CalculadoraDivisas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import Equipo7.Funcionalidad.GestorEventos;
import Equipo7.Funcionalidad.Methods;
import Equipo7.Interfaz.InterfazGrafica;

/**
 * Unit test for simple App.
 */
public class AppTest {

	GestorEventos gestorEventos;
	Methods methods;
	InterfazGrafica ig;
	
	@BeforeEach
	public void before() {
		methods = new Methods();
		ig = new InterfazGrafica();
		gestorEventos = new GestorEventos(ig, methods);
	}
	
	@Test
	void settearTexto() {
		gestorEventos.settearTexto("2");
		String result = ig.textField_dol_converter.getText();
		String expected = "2";
		assertEquals(result, expected);
	}
	
	@Test
	void delete() {
		ig.textField_dol_converter.setText("hola");
		gestorEventos.delete();
		String result = ig.textField_dol_converter.getText();
		String expected = "hol";
		assertEquals(result, expected);
	}
	
	@Test
	void settear() {
		gestorEventos.settear();
		String result = ig.textField_dol_converter.getText();
		String expected = "";
		assertEquals(result, expected);
	}
	
	@Test
	void moneda1() {
		ig.textField_dol_converter.setText("1");
		gestorEventos.moneda1();
		String result = ig.textField_eur_converter.getText();
		System.out.println(result);
		String expected = "1.0€";
		assertEquals(result, expected);
	}
	
	@Test
	void moneda2() {
		gestorEventos.moneda1();
		String result = ig.textField_eur_converter.getText();
		System.out.println(result);
		String expected = "";
		assertEquals(result, expected);
	}
	
	private static Stream<Arguments> monedasParams() {
		return Stream.of(
				Arguments.of(1,"Euro","Yen","¥","136.91¥"),
				Arguments.of(1,"Euro","Dolar","$","136.91¥"),
				Arguments.of(1,"Euro","Libra","£","136.91¥"),
				Arguments.of(1,"Yen","Euro","€","136.91¥"),
				Arguments.of(1,"Yen","Libra","£","136.91¥"),
				Arguments.of(1,"Yen","Dolar","$","136.91¥"),
				Arguments.of(1,"Yen","Yen","¥","136.91¥"),
				Arguments.of(1,"Libra","Dolar","$","136.91¥"),
				Arguments.of(1,"Libra","Euro","€","136.91¥"),
				Arguments.of(1,"Dolar","Euro","€","136.91¥"),
				Arguments.of(1,"Dolar","Libra","£","136.91¥"),
				Arguments.of(1,"Dolar","Yen","¥","136.91¥"),
				Arguments.of(1,"Dolar","Dolar","$","1$"),
				Arguments.of(1,"Libra","Libra","£","1$"),
				Arguments.of(1,"Libra","Yen","¥","1$"),
				Arguments.of(1,"Euro","Euro","€","1€"));
	}
	
	@ParameterizedTest
	@MethodSource("monedasParams")
	void figura(int cantidad, String moneda1, String moneda2, String simbolo, String expected) {
		String result = methods.monedaTransform(cantidad, moneda1, moneda2, simbolo);
		assertEquals(expected, result);
	}
	
	@Test
    public void monedaTransform() {
        String result = methods.monedaTransform(1.00, "Euro", "Yen", "¥");
        String expect = "136.91¥";
        assertEquals(expect, result);
    }
	
    
    @Test
    public void typeMonedaSelector() {
    	String result = methods.typeMonedaSelector("yen");
    	String expect = "¥";
    	assertEquals(expect, result);
    }
    
    @Test
    public void valorMoneda2() {
    	String result = methods.valorMoneda(4537.30, "Libra", "Yen");
    	String expect = "735178.719¥";
    	assertEquals(expect, result);
    }
    
    @Test
    public void valorMoneda1() {
    	String result = methods.valorMoneda(43.45, "Libra", "Yen");
    	String expect = "7040.2035000000005¥";
    	assertEquals(expect, result);
    }
	
}
