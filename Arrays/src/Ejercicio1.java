import java.util.Random;
import java.util.Scanner;

/*Programa que cree un vector de números enteros de un tamaño especificado por el usuario,
mayor que 1 y menor o igual que 50. El vector se llenará con números aleatorios
comprendidos entre -100 y 100 sin repetir ninguno. A continuación se creará un segundo
vector que contenga los elementos del anterior almacenados en orden inverso.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Tamaño del vector: ");
			n = sc.nextInt();
			if (n < 2 || n > 50) {
				System.out.println("Tamaño incorrecto, tiene que ser mayor que 1 o menor o igual que 50. BAKA!!!");
			}
		} while (n < 2 || n > 50);
		
		int[] vector = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			vector[i] = r.nextInt(201) - 100;
		}
		
		int[] vectorAlreves = new int[vector.length];
		for (int i = 0; i < n; i++) {
			vectorAlreves[vector.length - i - 1] = vector[i];
		}
		
		for (int i=0; i<n; i++) {
			System.out.print(vector[i] + " ");
		}
			System.out.println();
		for (int i=0; i<n; i++) {
			System.out.print(vectorAlreves[i] + " ");
		}
		sc.close();
	}
}
