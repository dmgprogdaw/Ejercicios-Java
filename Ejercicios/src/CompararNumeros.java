import java.util.Random;

public class CompararNumeros {

	public static void main(String[] args) {
		
		Random r = new Random (System.nanoTime());
		
		int n1 = r.nextInt(749) + 5;//genera numeros entre 5 y 10
		int n2 = r.nextInt(749) + 5;
		
		
		System.out.println("Número 1: " + n1);
		
		System.out.println("Número 2: " + n2);
		
		if (n1 > n2) {
			System.out.println(n1 + " es mayor que " + n2);
		}
		else if (n1 < n2) {
			System.out.println(n1 + " es menor que " + n2);
		}
		else {
			System.out.println("son iguales");
		}
	}

}
