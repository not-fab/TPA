import java.util.Scanner;
public class NumCrescente {
	public static void main (String args[]) {
	Scanner in = new Scanner (System.in);
	int a, b, c;
	
	System.out.println("Digite o primeiro número");
	a = in.nextInt();
	System.out.println("Digite o segundo número");
	b = in.nextInt();
	System.out.println("Digite o terceiro número");
	c = in.nextInt();
	
	if (a<b && b<c) {
		System.out.println(+a+","+b+","+c);
	}else if (a<c && c<b) {
		System.out.println(+a+","+c+","+b);
	}else if (b<a && a<c) {
		System.out.println(+b+","+a+","+c);
	}else if (b<c && c<a) {
		System.out.println(+b+","+c+","+a);
	}else if (c<a && a<b) {
		System.out.println(+c+","+a+","+b);
	}else {
		System.out.println(+c+","+b+","+a);
	}
		
	}
}
