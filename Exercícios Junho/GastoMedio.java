import java.util.Scanner;
public class GastoMedio {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double dist, cap, gasto;
		
		System.out.println("Digite a distância percorrida do veículo");
		dist = in.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustivel do veículo");
		cap = in.nextDouble();
		gasto = dist/cap;
		System.out.println("A média de gasto de combustivel é:" +gasto+ "Km/L");
		
		if (gasto >10) {
			System.out.println("Econômico");
		} else {
			System.out.println("Não Econômico");
		}
	}
	

}
