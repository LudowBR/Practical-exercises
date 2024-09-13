package listaF;
/*
 * F6-) Desenvolva um programa para calcular o reajuste salarial dos funcionários de um empresa de desenvolvimento de softwares. 
 * O programa deverá solicitar a leitura do código e o salário atual do funcionário e realizar o reajuste salarial de acordo com a 
 * tabela abaixo. O programa deverá apresentar o salário antigo, o novo salário, o valor do reajuste e a função do funcionário.
Código Função Percentual
1 Operador 5%
2 Programador 10%
3 Analista 15%
4 Gerente 25%
 */

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioAtual, salarioNovo, codReajuste, reajuste;
		
		System.out.println("Digite o código da nova função: ");//Sem informar código pelo mesmo motivo da anterior.
		codReajuste = sc.nextDouble();
		
		
		if(codReajuste == 1) {
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*5);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 5% ao salário antigo (R$ "+ salarioAtual +"), o novo salário do funcionário como operador é R$ " +salarioNovo);
		}else if(codReajuste == 2){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*10);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 10% ao salário antigo (R$ "+ salarioAtual +"), o novo salário do funcionário como programador é R$ " +salarioNovo);
		}else if(codReajuste == 3){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*15);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 15% ao salário antigo (R$ "+salarioAtual+"), o novo salário do funcionário como analista é R$ " +salarioNovo);
		}else if(codReajuste == 4){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*25);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 25% ao salário antigo (R$ "+salarioAtual+"), o novo salário do funcionário gerente é R$ " +salarioNovo);
		}else {
			System.out.println("Código informado inválido");
		}

	}

}
