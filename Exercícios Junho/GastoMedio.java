import java.util.Scanner;
public class GastoMedio {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double dist, cap, gasto;
		
		System.out.println("Digite a dist�ncia percorrida do ve�culo");
		dist = in.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustivel do ve�culo");
		cap = in.nextDouble();
		gasto = dist/cap;
		System.out.println("A m�dia de gasto de combustivel �:" +gasto+ "Km/L");
		
		if (gasto >10) {
			System.out.println("Econ�mico");
		} else {
			System.out.println("N�o Econ�mico");
		}
	}
	

}
