package listaF;
/*
 * F2-) Desenvolva um programa para auxiliar uma escolinha de futebol na classificação das categorias das equipes de futebol. 
 * O programa deverá ler a idade da criança e apresentar o nome da categoria em a criança deve jogar, através da tabela abaixo:
Idade Categoria
6 à 8 anos Dente de Leite
9 à 11 anos Pré-Mirim
12 e 13 anos Mirim
14 e 15 anos Infantil
16 e 17 anos Juvenil
18 à 20 anos Juniores

 */

import java.util.Scanner;

public class f2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual a idade da crinça?");
		idade = sc.nextInt();
		
		if(idade >=6 & idade <9) {
			System.out.println("Categoria 'Dente de Leite' ");
		}else if(idade >= 9 & idade<12) {
				System.out.println("Categoria 'Pré-Mirim' ");
		}else if(idade >= 12 & idade<14) {
			System.out.println("Categoria 'Mirim' ");
		}else if(idade >= 14 & idade<16) {
			System.out.println("Categoria 'Infantil' ");
		}else if(idade >= 16 & idade<18) {
			System.out.println("Categoria 'Juvenil' ");
		}else if(idade >= 18 & idade<121) {
			System.out.println("Categoria 'Juniores' ");
		}else {
			System.out.println("Idade inferior ou superior as nossas categorias.");
		}
	
	}

}
