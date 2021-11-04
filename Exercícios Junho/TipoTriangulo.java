import java.util.Scanner;
public class TipoTriangulo {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int a, b, c;
		
		System.out.println("Digite o primeiro lado do triângulo:");
		a = in.nextInt();
		System.out.println("Digite o segundo lado do triângulo:");
		b = in.nextInt();
		System.out.println("Digite o terceiro lado do triângulo:");
		c = in.nextInt();
		
		if (a>b+c || b>a+c || c>a+b) {
			System.out.println("Não é triângulo");
		}
		else if (a==b==c) {
			System.out.println("Triângulo Equilátero");
		} else if (a!=b!=c) {
			System.out.println("Triângulo Escaleno");			
		} else {
			System.out.println("Triângulo Isósceles");
		}
	}

}
