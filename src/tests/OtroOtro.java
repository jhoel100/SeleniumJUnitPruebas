package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class OtroOtro {

	@Test
	public void test() {
		UnitTesting objeto = new UnitTesting();
		String salida = objeto.caso1("asdsadasd","asdasdsad");
		assertEquals("Please provide two numeric values in any fields below.",salida);
		
	}

}
