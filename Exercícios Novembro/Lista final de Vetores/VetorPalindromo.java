import java.util.Scanner;
public class VetorPalindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean v = true;
		int i, a[], b = 0; 
		final int TAM = 7;
		a = new int [TAM];
		
		for(i = 0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° valor do Vetor A: ");
			a[i] = in.nextInt();
		}
		
		for (i=TAM-1;i>=0;i--) {
			if(a[i]==a[b]) {
				v = true;
			}else {
				v = false;
			}
			b++;
		}
		
		if(v) {
			System.out.println("É um palindromo");
		}else {
			System.out.println("Não é um palindromo");
		}
	}
}