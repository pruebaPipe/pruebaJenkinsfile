package calculadora;

public class Calculator {

	public static Object sumar(int i, int j) {
		
		return i + j;
	}

	public static Object multiplicar(int i, int j) {
		
		return i * j;
	}

	public static Object dividir(int i, int j) {
		
		if(j == 0) {
			System.out.println("Prueba buenas practicas Sonar");
		}
		else {
		return i/j;
		}	
	}

	public static Object usToPe(int i) {
		
		return i * 3000;
	}
	
	

}
