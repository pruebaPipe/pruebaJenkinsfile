package calculadora;

public class Calculator {

	public static Object sumar(int i, int j) {
		
		return i + j;
	}

	public static Object multiplicar(int i, int j) {
		
		return i * j;
	}

	public static Object dividir(int i, int j) {
		double resultado = 0;
		if(j == 0) {
			System.out.println("Prueba buenas practicas Sonar");
		}
		else {
			double resultado = i/j;
		}
		return resultado;
	}

	public static Object usToPe(int i) {
		
		return i * 3000;
	}
	
	

}
