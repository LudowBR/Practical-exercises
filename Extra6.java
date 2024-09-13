package atividadeExtraA;

import java.util.Scanner;

/*
 * O transporte de carvão utilizado em uma siderurgia é feito em 2 etapas: por ferrovia da
mina onde é feita a extração até um porto marítimo onde é embarcado em navio e daí até a
siderúrgica. Na primeira etapa ocorre um perda de 2% em relação à quantidade de carvão
extraída da mina e na segunda etapa ocorre perda de 3% em relação à quantidade que chega
ao porto. Conhecendo-se a quantidade de carvão solicitada pela siderúrgica, como obter a
quantidade de carvão que deve ser extraída da mina para atender ao pedido da siderúrgica?
 */

public class Extra6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double carvao, etapaA, etapaB, percaA, percaB, fimEtapas;
		
		/*entrada*/
		System.out.println("Quantos KG de carvão serão necessários? (ex. 1500) ");
		carvao = sc.nextDouble();
		
		/*Processamento*/
		percaA = (carvao*(0.02));
		etapaA = (carvao-percaA);
		
		/*Saida*/
		System.out.println("Após a primeira etapa, por ferrovia, a quantidade de carvão será: " + etapaA + "Kg.");
		
		/*Processamento*/
		percaB = (etapaA*(0.03));
		etapaB = (etapaA-percaB);
		
		/*Saida*/
		System.out.println("E após a segunda etapa, maritima, a quantidade de carvão será de: " + etapaB + "Kg.");
		
		/*Processamento*/
		fimEtapas = carvao - etapaB;
		carvao = carvao + fimEtapas;
		
		/*Saida*/
		System.out.println();
		System.out.println("Levando em consideração as percas de 2% na primeira etapa e 3% na segunda, recomenda-se que seja solicitado um total de " + carvao + " Kg, para que a quantidade desejada chegue corretamente");

	}

}
