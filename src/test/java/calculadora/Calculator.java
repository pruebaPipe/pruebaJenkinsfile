package calculadora;

class Calculator {
	
	public static Object sumar(int i, int j) {
		
		return i + j;
	}

	public static Object multiplicar(int i, int j) {
		
		return i * j;
	}

	private static Object dividir(int i, int j) {
		
		if(j == 0) {
			throw new IllegalArgumentException ("El divisor no puede ser 0, imagina las implicaciones!");
		}
		return i / j;
	}

	public static Object usToPe(int i) {
		
		return i * 3000;
	}
	
	

}
