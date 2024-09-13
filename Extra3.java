package atividadeExtraA;

import java.util.Scanner;

/*
 *  Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva 
a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 
dias. 
 */

public class Extra3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anos, meses, dias, diasAno, diasMes;
		
		System.out.println("Qual sua idade em anos? (ex. 20)");
		anos = sc.nextInt();
		System.out.println("Faz quantos meses que você completou " + anos + " anos?(considerar apenas meses completos) (ex. 3)");
		meses = sc.nextInt();
		System.out.println("E faz quantos dias desde que iniciou o mes atual?(ex. 14)");
		dias = sc.nextInt();
		
		diasAno = (anos * 365);
		diasMes = (meses * 30);
		
		dias = (dias+diasAno+diasMes);
	
		System.out.println("Você tem " + dias + " dias de vida.");
		
	
	}

}