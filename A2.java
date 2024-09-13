package listaA;
import java.util.Scanner;
/*
 * Desenvolva um prgrama que leia os lados de um retânguloe e mostre a area
 */
public class A2 {

	
	public static void main(String[] args) {
		double largura, altura, area;
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.println("Qual o valor da largura em CM? ");
		largura = meuScanner.nextDouble();
		System.out.println("Qaul o valor da altura em CM? ");
		altura = meuScanner.nextDouble();
		
		area = (largura * altura);
		
		System.out.println("A área do retângulo é: " + area);
				
	}

}
