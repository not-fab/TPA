import java.util.Scanner;
public class NomeIdade {
public static void main (String args[]) {
	Scanner in = new Scanner (System.in);
	int nome, id, idMaior, nomeMaior, idMenor, nomeMenor;
	
	System.out.println("Insira o primeiro nome");
	nome = in.nextInt();
	System.out.println("Insira a primeira idade");
	id = in.nextInt();
	
	nomeMaior = nome;
	idMaior = id;
	nomeMenor = nome;
	idMenor= nome;
	
	System.out.println("Insira o segundo nome");
	nome = in.nextInt();
	System.out.println("Insira a segunda idade");
	id = in.nextInt();
	
	if (id > idMaior) {
		idMaior = id;
		nomeMaior = nome;
	} else if (id < idMenor) {
		idMenor = id;
		nomeMenor = nome;
	}
	
	System.out.println("Insira o terceiro nome");
	nome = in.nextInt();
	System.out.println("Insira a terceira idade");
	id = in.nextInt();
	
	if (id > idMaior) {
		idMaior = id;
		nomeMaior = nome;
	} else if (id < idMenor) {
		idMenor = id;
		nomeMenor = nome;
	}
	
	System.out.println("Insira o quarto nome");
	nome = in.nextInt();
	System.out.println("Insira a quarta idade");
	id = in.nextInt();
	
	if (id > idMaior) {
		idMaior = id;
		nomeMaior = nome;
	} else if (id < idMenor) {
		idMenor = id;
		nomeMenor = nome;
	}
	
	System.out.println("Insira o quinto nome");
	nome = in.nextInt();
	System.out.println("Insira a quinta idade");
	id = in.nextInt();
	
	if (id > idMaior) {
		idMaior = id;
		nomeMaior = nome;
	} else if (id < idMenor) {
		idMenor = id;
		nomeMenor = nome;
	}
	
	System.out.println("O mais velho é "+nomeMaior+" com "+idMaior+" anos");
	System.out.println("O mais velho é "+nomeMenor+" com "+idMenor+" anos");
	
}
}
