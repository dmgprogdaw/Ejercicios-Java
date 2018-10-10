import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float sueldoBase;
		int ventas;
		double comision;
		double sueldoFinal;
		
		//Sueldo base
		System.out.println("Introduce el sueldo base: "); 
		sueldoBase = teclado.nextFloat();
		
		//Número de ventas realizadas en un mes
		System.out.println("Introduce el número de ventas: "); 
		ventas = teclado.nextInt();
		
		//Comision total por todas las ventas
		comision = ventas * 0.10;
		
		//Sueldo más la comision
		sueldoFinal = sueldoBase + (sueldoBase*comision);
		
		//Resultado
		System.out.println("El sueldo al final del mes sera: " + sueldoFinal + " euros");
		teclado.close();
	}
}
