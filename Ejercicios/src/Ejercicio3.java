import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce un número entero mayor que uno");
		n = teclado.nextInt();
		
		if(n > 1) {
			do{
				if (n%2==0) {
					n=(n/2);		
					System.out.println(n);
				}
				else {
					n=(n*3)+1;
					System.out.println(n);
				}
			}while(n>1);
		} 
		else {
			System.out.println("Tiene que ser mayor que uno capullo");
		}
		teclado.close();
	}

}
