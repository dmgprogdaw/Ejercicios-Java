import java.util.Scanner;

/*Programa que lea de teclado dos cadenas y muestre el número de veces que la segunda
esta contenida en la primera.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String primeraCadena;
		String segundaCadena;
		do {
			System.out.println("Escribe la primera cadena de texto:");
			primeraCadena = in.nextLine();
		} while (primeraCadena.length() == 0);
		do {
			System.out.println("Escribe la segunda cadena de texto:");
			segundaCadena = in.nextLine();
		} while (segundaCadena.length() == 0 || segundaCadena.length() > primeraCadena.length());

		int i = 0;
		int c = 0;
		do {
			i = primeraCadena.indexOf(segundaCadena, i);
			if (i >= 0) {
				c++;
				i++;
			}
		} while (i >= 0);
		System.out.println("La segunda esta contenida " + c + " veces en la primera");
		in.close();
	}
}
