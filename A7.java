package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		double minutos, horas, velocidadeMedia, distancia, litrosUsados;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto tempo durou a viagem? (Em minutos) ");
		minutos = sc.nextDouble();
		horas = minutos / 60;
		System.out.println("Qual foi a velocidade média da viagem? (em KM) ");
		velocidadeMedia = sc.nextDouble();
		distancia = horas * velocidadeMedia;
		litrosUsados = distancia / 12;
		System.out.println("Considerando que sua velocidade média foi de " + velocidadeMedia + " KM/h e seu tempo gasto foi de " + horas + " hora(s), a distancia percorrida foi de, aproximadamente, " + distancia + "KM e a quantidade de litros usados no percurso foi de, aproximadamente, " + litrosUsados);
	}

}
