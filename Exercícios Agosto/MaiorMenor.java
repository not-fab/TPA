import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1, idade, maiores=0, menores=0;
		
		while (i<=10) {
			System.out.println("Insira a idade");
			idade = in.nextInt();
				if (idade<18) {
					System.out.println("Menor de idade");
					maiores = maiores+1;
				} else {
					System.out.println("Maior de idade");
					menores = menores+1;
				}
			i=i+1;
		}
		System.out.println("A quantidade de maiores de idade é "+maiores);
		System.out.println("A quantidade de menores de idade é "+menores);
	}
}
