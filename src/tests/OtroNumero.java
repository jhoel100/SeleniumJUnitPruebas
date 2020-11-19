package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class OtroNumero {

	@Test
	public void test() {
		UnitTesting objeto = new UnitTesting();
		String salida = objeto.caso1("asdasda", 90);
		assertEquals("Please provide two numeric values in any fields below.",salida);
		
	}


}
