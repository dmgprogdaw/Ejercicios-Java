import java.util.Scanner;

public class CubosNicomaco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la cantidad de cubos");
		int n = teclado.nextInt();
		int sgteImpar = 1;
		
		for(int i=1; i<=n; i++) {
			int acumulador = 0;
			System.out.print(i + "^3 = ");
			for (int j=1; j<=i; j++) {
				System.out.print(sgteImpar + " + ");
				acumulador += sgteImpar;
				sgteImpar += 2;
			}
			System.out.println(" = " + acumulador);
		}		
		teclado.close();
	}
}
