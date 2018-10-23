import java.util.Scanner;
public class Triangulos {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float a, b, c;
		
		System.out.println("Introduce la longitud de a");
		a = teclado.nextFloat();
		System.out.println("Introduce la longitud de a");
		b = teclado.nextFloat();
		System.out.println("Introduce la longitud de a");
		c = teclado.nextFloat();
		
		if (a<b+c && b<a+c && c<a+b) {
			System.out.println("Las longitudes pueden formar un triángulo");
				if(a==b && b== c && a==c) {
					System.out.println("El triangulo equilatero");
				}
				else if (a==b || a==c || c==b) {
					System.out.println("El triangulo es isosceles");
				}
				else {
					System.out.println("El triangulo es escaleno");
				}
		}
		else {
			System.out.println("Las longitudes NO pueden formar un triángulo");
		}
		teclado.close();
	}
}
