package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaUnit3 {

	@Test
	public void test() {
		UnitTesting objeto = new UnitTesting();
		String salida = objeto.caso3(101,10);
		assertEquals("0111",salida);
	}

}
