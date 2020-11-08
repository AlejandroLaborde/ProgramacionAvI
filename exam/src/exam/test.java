package exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class test {

	@Test
	void testExamen_01_respuestaCorrecta() {
		try {
			
			String valorEsperado = "palabras";
			String palabra = new String( "dos palabras" );
			ManejoPalabra manejo = new ManejoPalabra();
			String respuesta = manejo.segundaPalabra(palabra);
			assertEquals(valorEsperado, respuesta );
			
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	
	@Test
	void testExamen_02_checkExepcion() {
		
		try {
			String valorEsperado = "palabras";
			String palabra = new String( "unaPalabra" );
			ManejoPalabra manejo = new ManejoPalabra();
			String respuesta = manejo.segundaPalabra(palabra);
		}catch (ArrayIndexOutOfBoundsException e) {
			//si entrro a este sector, ya sabemos que es correcta la excepcion que arrojo
			assertTrue(true);
		}catch (Exception e) {
			assertTrue(false);
		}
	}

}
