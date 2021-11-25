import java.util.Scanner;
public class VetorFatorial{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0, j=0, a[], b[], f;
		a = new int [15];
		b = new int [15];
		
		for(i=0; i<15; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<15; i++) {
			f = 1;
			for(j=1; j<=a[i]; j++) {
				f = f * j;
			}
			b[i] = f;
			System.out.println("O fatorial de "+a[i]+" é "+b[i]);
			System.out.println("");
		}
		
	}
}

