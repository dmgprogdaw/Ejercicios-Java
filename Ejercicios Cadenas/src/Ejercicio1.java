import java.util.Scanner;

/*Programa que lea una cadena de teclado y muestre por pantalla el número de veces que 
aparece repetida cada vocal en dicha cadena.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cadena;

		int cont_a = 0;
		int cont_e = 0;
		int cont_i = 0;
		int cont_o = 0;
		int cont_u = 0;

		System.out.println("Escribe la cadena de texto:");
		cadena = in.nextLine().toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
//			if (c == 'a' || c == 'á') {
//				cont_a++;
//			} else if (c == 'e' || c == 'é') {
//				cont_e++;
//			} else if (c == 'i' || c == 'í') {
//				cont_i++;
//			} else if (c == 'o' || c == 'ó') {
//				cont_o++;
//			} else if (c == 'u' || c == 'ú' || c == 'ü') {
//				cont_u++;
//			}

			switch (c) {
			case 'a':
			case 'á':
				cont_a++;
				break;
			case 'e':
			case 'é':
				cont_e++;
				break;
			case 'i':
			case 'í':
				cont_i++;
				break;
			case 'o':
			case 'ó':
				cont_o++;
				break;
			case 'u':
			case 'ú':
			case 'ü':
				cont_u++;
				break;
			}
		}
		System.out.println("La vocal a se repite " + cont_a + " veces");
		System.out.println("La vocal e se repite " + cont_e + " veces");
		System.out.println("La vocal i se repite " + cont_i + " veces");
		System.out.println("La vocal o se repite " + cont_o + " veces");
		System.out.println("La vocal u se repite " + cont_u + " veces");
		in.close();
	}
}
