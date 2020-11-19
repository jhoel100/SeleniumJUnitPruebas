package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroOtro {

	@Test
	public void test() {
		UnitTesting objeto = new UnitTesting();
		String salida = objeto.caso1(10,"asdasdsad");
		assertEquals("Please provide two numeric values in any fields below.",salida);
		
	}

}
