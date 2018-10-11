import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
	
		int Z;
		
		System.out.println("Introduce el número");
		Z = teclado.nextInt();
		
		if (Z % 2 == 0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		
		teclado.close();
	}
}
