import java.util.Scanner;
public class NumMaior {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int i=0, n, vezes, m=0;
			
		System.out.println("Digite a quantidade de números");
		vezes = in.nextInt();
			
		do{
			if(vezes == 0) {
				System.out.println("Fim do programa.");
			}else {
				do {
					System.out.println("Digite o número");
					n = in.nextInt();
					i = 0;
					if (n<m) {
						m=n;
					}else {
						m=m;
					}
					i++;
				}while(i<vezes); {
					System.out.println("O maior número é "+m);
				}
			}
		}while(vezes!=0);
	}
}

