package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void calTest() {
		assertEquals("error en sumar()", 3, Calculator.sumar(1 , 2));
		assertEquals("error en multiplicar()", 2, Calculator.multiplicar(1 , 2));
		assertEquals("error en dividir()", 1, Calculator.dividir(2 , 2));
		assertEquals("error en convertir()", 6000, Calculator.usToPe(2));
		
	}

}
