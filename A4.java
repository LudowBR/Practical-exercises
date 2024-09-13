package listaA;
/*
 * Calcular volume da lata de óleo
 */

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		double altura, raio, volume;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a altura da lata? ");
		altura = sc.nextDouble();
		System.out.println("Qaul o raio da lata? ");
		raio = sc.nextDouble();
		volume = (3.14 * raio * raio * altura);
		System.out.println("O volume da lata é: " + volume);
		
	}

}
