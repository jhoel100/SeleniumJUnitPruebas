package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaUnit2 {

	@Test
	public void test() {
		UnitTesting objeto = new UnitTesting();
		String salida = objeto.caso2();
		assertEquals(" 48",salida);
	}

}
