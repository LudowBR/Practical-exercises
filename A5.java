package listaA;

import java.util.Scanner;

/*
 * Calcular desconto
 */

public class A5 {

	public static void main(String[] args) {
	
		double preco, desconto, vista;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto? R$ ");
		preco = sc.nextDouble();
		desconto = ((preco/100)*10);
		vista = preco - desconto;
		System.out.println("Sendo o valor do produto R$ " + preco + "e o desconto aplicado de 10%, o valor que você pagará à vista será R$" + vista);
	}

}
