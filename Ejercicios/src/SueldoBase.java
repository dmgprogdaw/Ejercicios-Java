import java.util.Scanner;

public class SueldoBase {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float venta1, venta2, venta3;
		float comision1, comision2, comision3;
		final float sueldo = 1200;
		final float porcentaje = 0.1f;
		
		System.out.println("Valor de la venta 1: ");
		venta1 = teclado.nextFloat();
		comision1 = venta1 * porcentaje;
		
		System.out.println("Valor de la venta 2: ");
		venta2 = teclado.nextFloat();
		comision2 = venta2 * porcentaje;
		
		System.out.println("Valor de la venta 3: ");
		venta3 = teclado.nextFloat();
		comision3 = venta3 * porcentaje;
		
		System.out.println("Comision venta 1: " + comision1);
		System.out.println("Comision venta 2: " + comision2);
		System.out.println("Comision venta 3: " + comision3);
		
		System.out.println("Sueldo final: " + (comision1 + comision2 + comision3 + sueldo));
		teclado.close();
	}
}



















