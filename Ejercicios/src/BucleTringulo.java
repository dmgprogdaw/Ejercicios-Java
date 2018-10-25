
//Anidar blucles con los digitos(0...9) para formar triangulos
public class BucleTringulo {

	public static void main(String[] args) {
		int n;
		int espacios;
		int digitos;
		
		for(int i=1; i<=10; i++) {
			n = i % 10;
			espacios = 10 -i;
			digitos = i + i - 1;

			for(int j=0; j<espacios; j++) 
				System.out.print(" ");
		
			for(int b=0; b<digitos; b++) {			
				if(b >= digitos /2) {
					System.out.print(n-- % 10);
				}
				else if(b <= digitos) {
					System.out.print(n++ % 10);
				}
			}
		System.out.println();
		}
	}
}
