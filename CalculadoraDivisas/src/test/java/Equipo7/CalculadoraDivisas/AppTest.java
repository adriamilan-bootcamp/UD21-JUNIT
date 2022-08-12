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
	void moneda1() {
		String result = methods.valorMoneda("moneda1", 1, , null, null)
	}
	
	@Test
	void valorMoneda() {
		
	}
	
	@Test
	void monedaTransform() {
		
	}
}
