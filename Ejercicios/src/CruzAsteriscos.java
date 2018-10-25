import java.util.Scanner;

public class CruzAsteriscos {

	static Scanner teclado = new Scanner(System.in);
	static  int obtenerFC(String fc) {
		int x;		
		do {
			System.out.println("Introduce el número de " + fc +": ");
			x = teclado.nextInt();
			if (x < 3 || x % 2 == 0) {
				System.out.println("El número de " + fc + " es incorrecto, vuelve a introducirlo");
			}
		}while (x < 3 || x % 2 == 0);		
		return x;
	}
	
	
	public static void main(String[] args) {
		int N = obtenerFC("filas") ;
		int M = obtenerFC("columnas");
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