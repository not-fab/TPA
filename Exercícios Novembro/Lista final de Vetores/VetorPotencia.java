import java.util.Scanner;
public class VetorPotencia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, pot, a[];
		a = new int [11];
		
		for(i=0; i<10; i++) {
			System.out.println("Entre com um numero inteiro");
			a[i] = in.nextInt();
			
			pot = (int) Math.pow(2, a[i]);
			System.out.println("O resultado da potência 2^"+a[i]+" é "+pot);
			System.out.println("");
		}
	}
}