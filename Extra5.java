package atividadeExtraA;

import java.util.Scanner;

/*
  * Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das
vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele
vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro
vendido. Calcule e escreva o salário final do vendedor
  */

public class Extra5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, comissaoPorCarro, carrosVendidos, comissaoCarro;
		double  metaBatida, comissaoValor, salarioFinal;
		
		System.out.println("Qual o salário fixo dos funcionários? R$ ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Qual o valor da comissão fixa por veículo vendido? R$");
		comissaoPorCarro = sc.nextFloat();
		
		System.out.println("E quantos carros ele vendeu?");
		carrosVendidos = sc.nextFloat();
		
		comissaoCarro = (comissaoPorCarro * carrosVendidos);
		
		System.out.println("No total, qual foi o valor vendido pelo funcionário? (EX. 10462.58)");
		metaBatida = sc.nextFloat();
		
		comissaoValor = (metaBatida*(0.05));
		salarioFinal = (salarioBruto + comissaoCarro + comissaoValor);
		
		System.out.println("Baseado nos valores indicados o funcionário irá receber um total de R$ " + salarioFinal);

	}

}
