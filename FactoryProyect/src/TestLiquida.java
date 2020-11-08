import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

class TestLiquida {

	@Test
	void test01_liquidaSueldoMensualValido() {
		Empleado e1 = new Empleado("Emp1","ape1","321","soltero",50000.0,50,ETipoCobro.mensual);
		Double esperado = 50000.0;
		assertEquals(  esperado , LiquidaSueldos.liquida(e1.getTipoCobro()).calcular(e1));
		
	}
	
	@Test
	void test02_liquidaSueldoPorHoraValido() {
		Empleado e1 = new Empleado("Emp1","ape1","321","soltero",50000.0,50,ETipoCobro.porHora);
		Double esperado = 1000.0;
		assertEquals(  esperado , LiquidaSueldos.liquida(e1.getTipoCobro()).calcular(e1));
		
	}

}
