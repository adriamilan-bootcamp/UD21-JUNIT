package JUnit.TestJunit09_Geometria;

import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.Geometria;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class GeometriaTest {
	
	Geometria geometria;
	
	@BeforeEach
	public void before() {
		geometria = new Geometria();
	}
	
	@Test
	void areaCuadrado() {
		int result = geometria.areacuadrado(4);
		int expect = 16;
		assertEquals(expect, result);
	}
	
	@Test
	void areaCirculo() {
		double result = geometria.areaCirculo(4);
		double expect = 50.27;
		int delta = 1;
		assertEquals(expect, result, delta);
	}
	
	@Test
	void  areatriangulo() {
		int result = geometria.areatriangulo(2, 3);
		int expect = 3; 
		assertEquals(expect, result);		
	}
	
	@Test
	void  arearectangulo() {
		int result = geometria.arearectangulo(4, 4);
		int expect = 16;
		assertEquals(expect, result);		
	}
	
	
}
