import java.util.Scanner;
public class VetorCrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0, j=0, a[], b[], reserva;
		
		a = new int [10];
		b = new int [10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		for(i=0; i<10; i++) {
			for(j=i+1; j<10; j++) {
				if(b[i] > b[j]) {
					reserva = b[i];
					b[i] = b[j];
					b[j] = reserva;
				}
			}
		}
		
		System.out.print("[ ");
		for(i=0; i<=10; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}
}
