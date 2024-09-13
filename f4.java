package listaF;
/*
 * Desenvolva um programa para ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
 * dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. 
 * Se o valor da média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média. 
 * Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado em exame. 
 * Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
 * Apresentar junto com as mensagens o valor da média do aluno, para qualquer condição.
 */

import java.util.Scanner;

public class f4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota1, nota2, nota3, nota4, exame;
		double soma, media, media2;
		
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
		
		if(media >= 7) {
			System.out.println("Parabéns, você passou!! sua media foi de " + media);
		}else if(media < 7) {
			System.out.println("Media insuficiente: " + media);
			System.out.println("Qual foi sua nota no exame?");
			exame = sc.nextInt();
			media2 = ((nota1+nota2+nota3+nota4+exame)/5);
			if(media2 >=5) {
				System.out.println("Passou raspando ein. Parabéns. Media com o exame: " + media2);
			}else {
				System.out.println("É... Eu tentei te ajudar, espero melhoras! Media com o exame: " + media2);
			}
		}

	}

}
