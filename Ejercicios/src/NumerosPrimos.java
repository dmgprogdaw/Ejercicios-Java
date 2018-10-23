import java.util.Scanner;

public class NumerosPrimos {

public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("¿Cuántos números primos desea generar?");
		n = teclado.nextInt();
		int candidato = 2;
		while (n > 0) {
			int divisor = candidato - 1;
			int resto;
			do {
				resto = candidato % divisor;
				divisor--;
			}while(divisor > 1 && resto > 0);
			if (resto != 0) {
				System.out.println(candidato + " es primo");
				n--;
			}
			candidato++;
		}
		
		teclado.close();
	}
}
