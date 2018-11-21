import java.util.Scanner;

/*Programa que lea de teclado una cadena y la muestre invertida.*/
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cadena;

		System.out.println("Escribe la cadena de texto:");
		cadena = in.nextLine();

		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
		in.close();
	}
}
