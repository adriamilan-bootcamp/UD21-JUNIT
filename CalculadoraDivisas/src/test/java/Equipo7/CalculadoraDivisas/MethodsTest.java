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
    public void test1() {
        String result = methods.monedaTransform(1, "Euro", "Yen", "¥");
        String expect = "137,03¥";
        assertEquals(expect, result);
    }
}
