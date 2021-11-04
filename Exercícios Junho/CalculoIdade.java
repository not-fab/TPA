import java.util.Scanner;
public class CalculoIdade {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int anoAtual, dataNasc, idade;
		
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		System.out.println("Digite a sua data de nascimento:");
		dataNasc = in.nextInt();
		idade = anoAtual-dataNasc;
		System.out.println("Sua idade é:" +idade);
		
		if (idade<10) {
			System.out.println("Criança");
		} else if (idade>=10 && idade<18) {
			System.out.println("Adolescente");
		} else if (idade>=18 && idade<60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		
	}
	
}