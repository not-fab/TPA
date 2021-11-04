import java.util.Scanner;
public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i;
		a = new int [10];
		b = new int [10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A");
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];
		}
		System.out.print("b[ ");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}
}
