package atividadeExtra;

import java.util.Scanner;

/*
 * 1) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor
e seu sucessor. 
 */

public class Extra1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor, a, b, c;
		
		System.out.println("Digite um número: ");
		valor = sc.nextInt();
		
		a = (valor-1);
		b = (valor+1);
		
		System.out.println("Sendo o número digitado: " + valor + ", temos como seu antecessor: " + a + " e como seu sucessor: " + b + ".");
	
	}

}
