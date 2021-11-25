import java.util.Scanner;
public class VetorPesquisar{
        public static void main (String args[]) {
            Scanner in = new Scanner (System.in);
               int a[], b[], i = 0, j = 0;
                 a = new int [10];
                 b = new int [1];
                 int localizar = 0;

                 for(i=0; i<10; i++) {
                     System.out.println("Insira o "+(i+1)+"° valor de A");
                     a[i] = in.nextInt();
                 }
                 System.out.println("");
                 for(i=0; i<1; i++) {
                	 
                     System.out.println("Digite o valor que deseja encontrar");
                      b[i] = in.nextInt();
                 }
                 for(i=0; i<10; i++) {
                         if(a[i] == b[j]) {
                        	 localizar = 1;
                         }
                     }
                     if(localizar == 1) {
                    System.out.println("O número "+b[j]+" está presente no vetor");
                     }else {
                         System.out.println("O número "+b[j]+" não está presente no vetor");
                     }
        }
}