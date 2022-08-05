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
	void areaPentagono() {
		int result = geometria.areapentagono(5, 2);
		int expect = 5;
		assertEquals(expect, result);
	}
	
	@Test
	void areaRombo() {
		int result = geometria.arearombo(6,2);
		int expect = 6;
		assertEquals(expect, result);
	}
	
	@Test
	void areaRomboide() {
		int result = geometria.arearomboide(20, 4);
		int expect = 80;
		assertEquals(expect, result);
	}
	
	@Test
	void setid() {
		int result = 3;
		geometria.setId(result);
		int expect = 3;
		assertEquals(expect, geometria.getId());
	}
	
	@Test
	void getid() {
		int result = geometria.getId();
		int expect = 9;
		assertEquals(expect, result);
	}
	
	@Test
	void setnom() {
		String result = "Triangulo";
		geometria.setNom(result);
		String expect = "Triangulo";
		assertEquals(expect, geometria.getNom());
	}
	
	@Test
	void getnom() {
		geometria = new Geometria(3);
		String result = geometria.getNom();
		String expect = "Triangulo";
		assertEquals(expect, result);
	}
	
	@Test
	void setarea() {
		int result = geometria.arearomboide(20, 4);
		geometria.setArea(result);
		int expect = 80;
		assertEquals(expect, geometria.getArea());
	}
	
	@Test
	void getarea() {
		double result = geometria.getArea();
		int expect = 0;
		assertEquals(expect, geometria.getArea());
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
