import java.util.Random;
import java.util.Scanner;

public class Divisible {
	
public static void main(String[] args) {
		
		Random r = new Random (System.nanoTime());
			
		int X = r.nextInt(6) + 1;
		int Y = r.nextInt(6) + 1;
		
		System.out.println(X);
		System.out.println(Y);


		if (X % Y == 0) {
			System.out.println (X + " es divisible por " + Y);
		}
		else {
			System.out.println(X + " no es divisible por " + Y);
			}
	}
}