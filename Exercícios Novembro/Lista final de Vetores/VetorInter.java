import java.util.Scanner;
public class VetorInter {
        public static void main (String args[]) {
            Scanner in = new Scanner (System.in);
            int a[], b[], c[], i = 0, j = 0, k=0;
            
             a = new int [10];
             b = new int [10];
             c = new int [10];
             int localizar = 0;

             for(i=0; i<10; i++) {
                 System.out.println("Digite o "+(i+1)+"° valor de A");
                 a[i] = in.nextInt();
             }
             for(i=0; i<10; i++) {
                 System.out.println("digite o "+(i+1)+"° valor de B");
                  b[i] = in.nextInt();
             }
             for(i=0; i<10; i++) {
            	 localizar = 0;
                 for(j=0; j<10; j++) {
                     if(a[i] == b[j]) {
                    	 localizar = 1;
                     }
                 }
                 if(localizar == 1) {
                     c[k] = a[i]; 
                     k++;
                 }
             }
             System.out.println("");
             System.out.print("Valores do vetor A: ");
             System.out.print("[");
             for(i=0; i<10; i++) {
                 System.out.print(" "+a[i]);
             }
             System.out.print("]");
             
             System.out.println("");
             System.out.print("Valores do vetor B: ");
             System.out.print("[");
             for(i=0; i<10; i++) {
                 System.out.print(" "+b[i]);
             }
             System.out.print("]");
             
             System.out.println("");
             System.out.print("Valores da intersecção: ");
             System.out.print("[");
             for(i=0; i<10; i++) {
                 System.out.print(" "+c[i]);
             }
             System.out.print("]");
    }
}