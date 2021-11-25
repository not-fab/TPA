import java.util.Scanner;
public class VetorPrimos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, resto0=0, a[];
		a = new int[10];
		
		for (int j=0; j<10; j++) {
			resto0=0;
			
			System.out.println("Entre com um numero inteiro");
			a[j] = in.nextInt();

			for (i=1; i<=a[j]; i++) {
				if (a[j]%i == 0) {
					resto0++;
				}
			}

			if (resto0 > 2) {
				System.out.println("Não é primo");
				System.out.println();
			}else {
				System.out.println("É primo");
				System.out.println();
			}
		}
	}
}