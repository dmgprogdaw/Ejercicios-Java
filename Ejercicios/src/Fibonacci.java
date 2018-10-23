import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);

	int num1=0;
	int num2=1;
	int x;

	System.out.println("Introducir el límite para la serie: ");
	int limite = in.nextInt();

	System.out.println(num1);
	System.out.println(num2);

	while (num2+num1 <= limite) {

		x = num1;
		num1 = num2;
		num2 = x + num1;
		System.out.println(num2);
		
		}
	
	in.close();
	
	}

}