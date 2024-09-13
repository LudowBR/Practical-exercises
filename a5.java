package listaA;

/*
 *Calcular salário 
 */

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorHora, horaTrabalhada, salarioBase, porcentoDescontado, totalDesconto, salarioLiquido;
		
		System.out.println("Quanto você recebe por hora? ");
		valorHora = sc.nextDouble();
		System.out.println("Quantas horas você trabalha no mês? ");
		horaTrabalhada = sc.nextDouble();
		salarioBase = valorHora * horaTrabalhada;
		System.out.println("Qual a porcentagem descontado de você (Não adcione o simbolo %)");
		porcentoDescontado = sc.nextDouble();
		totalDesconto = (porcentoDescontado/100)*salarioBase;
		salarioLiquido = salarioBase - totalDesconto;
		System.out.println("Seu salário bruto é de R$ " + salarioBase);
		System.out.println("É descontado de você um total de R$ " + totalDesconto);
		System.out.println("No final você vai receber de salário líquido um total de R$ " + salarioLiquido);
	}

}
