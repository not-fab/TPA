import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num, f=1, i=1;
		
		System.out.println("Escreva o número do fatorial");
		num = in.nextInt();
		
		while (i<=num) {
			f=f*1;
			i=i+1;
		}
		
		System.out.println("O resultado do fatorial é:"+i);
	}

}
