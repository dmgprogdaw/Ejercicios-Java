import java.util.Random;
import java.util.Scanner;

public class Divisible {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("¿comprobar si un número es divisible entre otro?");
		String respuesta = in.next();
		while (respuesta.equals("s".toLowerCase())) {
			System.out.println("introduce un número: ");
			int x = in.nextInt();
			System.out.println("introduce otro número: ");
			int y = in.nextInt();
			
			if(x%y==0) {
				System.out.println(x + " es divisible por " + y);
			}
			else {
				System.out.println(x + " no es divisible por " + y);
				System.out.println("¿comprobar si un número es divisible entre " +y +"?");
				respuesta = in.next();
			}
		}
	}
}

/*Random r = new Random (System.nanoTime());
int X = r.nextInt(6) + 1;
int Y = r.nextInt(6) + 1;
System.out.println(X);
System.out.println(Y);
if (X % Y == 0) {
	System.out.println (X + " es divisible por " + Y);
}
else {
	System.out.println(X + " no es divisible por " + Y);
}*/