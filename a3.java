package listaA;

import java.util.Scanner;

/*
 * Desenvolva um programa que leia e converta a temperatura de centigrados para fahrenheit
 */
public class A3 {

	public static void main(String[] args) {
		double C, F;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qaul a temperatura em graus centigrados? ");
		C = sc.nextDouble();
		F = (9 * C + 160) / 5;
		System.out.println("A temperatura digitada, convertida em Fahrenheit é: " + F);		
		
	}

}
