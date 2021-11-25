import java.util.Scanner;
public class VetorTabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], result[], i, j, k=0;
		
		a = new int [5];
		result = new int [50];
		
		for(i=0; i<5; i++) {
			System.out.println("Digite o "+(i+1)+"° valor da tabuada");
			a[i] = in.nextInt();
			System.out.println("\n");
		}
		for(i=0; i<5; i++) {
			for(j=1; j<11;j++) {
				result[k]= j*a[i];
				System.out.println(j+"x"+a[i]+"="+result[k]);
			}
			System.out.println("\n");
		}
	}
}