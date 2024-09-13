package listaF;

import java.util.Scanner;

/*
 * F9-) Desenvolver um programa que efetue a leitura de um valor numérico inteiro e apresente-o 
 * caso este valor seja divisível por 4 e 5. Não sendo divisível por 4 e 5 o programa deverá apresentar a mensagem 
 * “Não é divisível por 4 e 5”.
 */
public class f9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um número inteiro: ");
		valor = sc.nextInt();
		
		if(valor%4 == 0 & valor%5 == 0) {
			System.out.println("Valor digitado ("+valor+") é divisivel por 4 e por 5.");
		}else if(valor%5 == 0) { 
			System.out.println("Valor digitado ("+valor+") é divisivel por 5.");
		}else if(valor%4 == 0) {
			System.out.println("Valor digitado ("+valor+") é divisivel por 4.");
		}else {
			System.out.println("NÃO é divisivel por 4 e 5.");	
		}
	}
}