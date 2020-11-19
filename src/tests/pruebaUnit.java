package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaUnit {

	@Test
	public void test() {
		UnitTesting objeto = new UnitTesting();
		String salida = objeto.caso1(10, 90);
		assertEquals("9",salida);
		
		
	}

}
