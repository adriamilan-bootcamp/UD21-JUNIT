package Equipo7.CalculadoraDivisas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Equipo7.Funcionalidad.Methods;

class MethodsTest {

	Methods methods;
    
    @BeforeEach
    public void before() {
        this.methods = new Methods();
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
    	String result = methods.valorMoneda("moneda2", 4537.30, "Libra", "Yen");
    	System.out.println(result);
    	String expect = "735178.719¥";
    	assertEquals(expect, result);
    }
    
    @Test
    public void valorMoneda1() {
    	String result = methods.valorMoneda("moneda1", 43.45, "Libra", "Yen");
    	String expect = "43.45£";
    	assertEquals(expect, result);
    }

}
