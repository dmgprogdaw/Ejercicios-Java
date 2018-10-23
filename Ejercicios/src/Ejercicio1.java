import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N; //Número de columnas - Número impar mayor que 3
		int M; //Número de lineas - Número impar mayor que 3
		
		System.out.println("Introduce el número de columnas");
		N = teclado.nextInt();
		System.out.println("Introduce el número de lineas");
		M = teclado.nextInt();
//Version 3
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {			
				System.out.print((i==N/2 || j==M/2) ? "*" : " ");
			}
			System.out.println();
		}

		teclado.close();
	}
}
//Version 1
/*for(int i=0; i<N; i++) {
	if(i==N/2){				
		for(int j=0; j<M; j++) {
			System.out.print("*");
		}
	}
	else{
		for(int j=0; j<M; j++) {
			if(j==M/2){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
	}
}
System.out.println();
}*/

//Version 2 nuestra	
/*		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i != N/2 && j != M/2) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}*/

//Version 2 otro
/*		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i == N/2 || j == M/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/