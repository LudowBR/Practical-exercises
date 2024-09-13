package atividadeExtraA;

import java.util.Scanner;

/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo
de fábrica do carro, calcular e escrever o custo final ao consumidor. 
*/

public class Extra4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float custoFabrica, custoImpostos, valorImpostos, custoDistribuidora, valorDistribuidora;
		
		System.out.println("Qual o valor do veículo comprado na fabrica? R$ ");
		custoFabrica = sc.nextFloat();
		
		custoImpostos = (float) (custoFabrica * 0.45); //Gera o valor de 45% em cima do custo de fabrica.
		valorImpostos = (float) (custoImpostos + custoFabrica); //Soma o custo da fabrica com os 45% de impostos.
		
		custoDistribuidora = (float) (valorImpostos * 0.28); //*Gera o valor de 28% da distribuidora.
		valorDistribuidora = (float) (valorImpostos+custoDistribuidora); //Soma o valor dos impostos com os 28%
		
		System.out.println("Sendo o custo de fabrica R$ " + custoFabrica + " o valor do veículo para o consumidor vai ser de R$ " + valorDistribuidora);
		
		
		
	}

}
