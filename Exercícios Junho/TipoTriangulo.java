import java.util.Scanner;
public class TipoTriangulo {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int a, b, c;
		
		System.out.println("Digite o primeiro lado do tri�ngulo:");
		a = in.nextInt();
		System.out.println("Digite o segundo lado do tri�ngulo:");
		b = in.nextInt();
		System.out.println("Digite o terceiro lado do tri�ngulo:");
		c = in.nextInt();
		
		if (a>b+c || b>a+c || c>a+b) {
			System.out.println("N�o � tri�ngulo");
		}
		else if (a==b==c) {
			System.out.println("Tri�ngulo Equil�tero");
		} else if (a!=b!=c) {
			System.out.println("Tri�ngulo Escaleno");			
		} else {
			System.out.println("Tri�ngulo Is�sceles");
		}
	}

}
