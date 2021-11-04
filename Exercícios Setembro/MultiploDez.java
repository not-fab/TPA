import java.util.Scanner;
public class MultiploDez {
		public static void main (String args[]) {
			Scanner in=new Scanner (System.in);
			int i = 0;
			do {
			if (i % 10==0) {
				System.out.println(i+ " é multiplo de 10.");
			}else {
				System.out.println (i);
			}
				i++;
			}while (i<301);
	}
}
