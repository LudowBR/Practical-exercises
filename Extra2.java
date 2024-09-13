package atividadeExtra;

import java.util.Scanner;

/*
 * 2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de 
votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em 
relação ao total de eleitores
 */

public class Extra2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalEleitores, votosBrancos, votosNulos, votosValidos;
		float tE, vB, vN,vV;
		String municipio;
		
		System.out.println("Qual o múnicipio? ");
		municipio = sc.next();
		
		System.out.println("Qual o total de eleitores no muicipio de " + municipio + ".");
		totalEleitores = sc.nextInt();
		
		System.out.println("Qual o total de votos em branco do municipio?");
		votosBrancos = sc.nextInt();
		
		System.out.println("Qual o total de votos nulos no municipio?");
		votosNulos = sc.nextInt();
		
		System.out.println("Qual o total de votos válidos no municipio?");
		votosValidos = sc.nextInt();
		
		tE = totalEleitores;
		vB = votosBrancos;
		vN = votosNulos;
		vV = votosValidos;
		
		
		vB = ((vB/tE)*100);
		vN = ((vN/tE)*100);
		vV = ((vV/tE)*100);
		
		System.out.println("Desses " + tE + " eleitores, os votos em branco correspondem a um total de" + vB + "%; Os votos nulos correspondem a " + vN + "%; E os votos validos são de " + vV+ "%");
	}

}
