import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float capital;
		
		System.out.println("Introduce el capital inicial: ");
		capital = teclado.nextFloat();
				
		System.out.println("El valor del capital despues e un mes es: " + capital * .02f + " euros");
		
		teclado.close();
	}

}
