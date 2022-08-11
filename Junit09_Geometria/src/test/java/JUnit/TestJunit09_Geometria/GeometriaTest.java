package JUnit.TestJunit09_Geometria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import JUnit.Junit09_Geometria.dto.Geometria;

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
	void areatriangulo() {
		int result = geometria.areatriangulo(2, 3);
		int expect = 3; 
		assertEquals(expect, result);		
	}
	
	@Test
	void arearectangulo() {
		int result = geometria.arearectangulo(4, 4);
		int expect = 16;
		assertEquals(expect, result);		
	}
	
	@Test
	void areaTrapecio() {
		int result = geometria.areatrapecio(12, 4, 5);
		int expect = 40;
		assertEquals(expect, result);
	}
	
	private static Stream<Arguments> figuraParams() {
		return Stream.of(
				Arguments.of(1, "Cuadrado"),
				Arguments.of(2, "Circulo"),
				Arguments.of(3, "Triangulo"),
				Arguments.of(4, "Rectangulo"),
				Arguments.of(5, "Pentagono"),
				Arguments.of(6, "Rombo"),
				Arguments.of(7, "Romboide"),
				Arguments.of(8, "Trapecio"),
				Arguments.of(9, "Default"));
	}
	
	@ParameterizedTest
	@MethodSource("figuraParams")
	void figura(int id, String nombre) {
		String result = geometria.figura(id);
		assertEquals(nombre, result);
	}
	
	@Test
	void testToString() {
		String result = geometria.toString();
		String expect = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(expect, result);
	}
	
}
