package listaF;

import java.util.Scanner;

/*Desenvolva um programa para calcular o reajuste salarial dos funcionários de um empresa.
O programa deverá solicitar a leitura do código e o salário atual do funcionário e realizar o reajuste salarial de acordo com
a tabela abaixo. O programa deverá apresentar os seguintes valores: salário antigo, salário novo e reajuste.
Código Percentual
1 5%
2 10%
3 15%
4 20%
5 25%
6 30%
Lembrete: Fórmulas para o cálculo do reajuste salarial
REAJUSTE:= (SALARIO_ATUAL / 100) * PERCENTUAL;
SALARIO_NOVO:= SALARIO_ATUAL + REAJUSTE;
4
Caderno de Exercícios Programação e Algoritmos
 */

public class f5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioAtual, salarioNovo, codReajuste, reajuste;
		
		System.out.println("Digite o código de alteração: ");//Não informo os códigos, pois como se trata de uma alteração, imagino que deve deixar pouco intuitivo para questões de segurança...Mais pode ser eu pensando muito alto
		codReajuste = sc.nextDouble();
		
		
		if(codReajuste == 1) {
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*5);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 5% ao salário antigo (R$ "+ salarioAtual +"), o novo salário do funcionário é R$ " +salarioNovo);
		}else if(codReajuste == 2){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*10);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 10% ao salário antigo (R$ "+ salarioAtual +"), o novo salário do funcionário é R$ " +salarioNovo);
		}else if(codReajuste == 3){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*15);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 15% ao salário antigo (R$ "+salarioAtual+"), o novo salário do funcionário é R$ " +salarioNovo);
		}else if(codReajuste == 4){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*20);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 20% ao salário antigo (R$ "+salarioAtual+"), o novo salário do funcionário é R$ " +salarioNovo);
		}else if(codReajuste == 5){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*25);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 25% ao salário antigo (R$ "+ salarioAtual +"), o novo salário do funcionário é R$ " +salarioNovo);
		}else if(codReajuste == 6){
			System.out.println("Qual o salário do funcionário?");
			salarioAtual = sc.nextDouble();
			reajuste = ((salarioAtual/100)*30);
			salarioNovo = (salarioAtual + reajuste);
			System.out.println("Aplicando o ajuste de 30% ao salário antigo (R$ "+salarioAtual+"), o novo salário do funcionário é R$ " +salarioNovo);
		}else {
			System.out.println("Código informado inválido");
		}
		
		
	}
}
