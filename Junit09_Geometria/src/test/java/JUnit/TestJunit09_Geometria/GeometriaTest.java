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
	
}
