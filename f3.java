package listaF;
/*
 * F3-) Desenvolva um programa para ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma 
 * mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, 
 * indicar uma mensagem informando esta condição. Apresentar junto com a mensagem o valor da média do aluno para qualquer condição.
 */
import java.util.Scanner;

public class f3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota1, nota2, nota3, nota4;
		double soma, media;
		
		System.out.println("Qual fui nota em matematica?");
		nota1 = sc.nextInt();
		System.out.println("Qual fui nota em português?");
		nota2 = sc.nextInt();
		System.out.println("Qual fui nota em história?");
		nota3 = sc.nextInt();
		System.out.println("Qual fui nota em geografia?");
		nota4 = sc.nextInt();
		
		soma = (nota1+nota2+nota3+nota4);
		media = (soma/4);
		
		if(media >= 5) {
			System.out.println("Parabéns, você passou!! sua media foi de " + media);
		}else {
			System.out.println("Sua media foi "+ media +". Infelizmente você não foi aprovado... Melhor sorte da próxima vez. ");
		}
	}

}
