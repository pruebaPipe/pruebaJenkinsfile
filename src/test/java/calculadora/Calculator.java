package calculadora;

public class Calculator {
	double resultado = 0;
	public static Object sumar(int i, int j) {
		
		return i + j;
	}

	public static Object multiplicar(int i, int j) {
		
		return i * j;
	}

	public static Object dividir(int i, int j) {
		
		if(j == 0) {
			trhrow new Ilegalargumentexception ("El divisor no puede ser 0, imagina las implicaciones!")
		}
		return resultado;
	}

	public static Object usToPe(int i) {
		
		return i * 3000;
	}
	
	

}
