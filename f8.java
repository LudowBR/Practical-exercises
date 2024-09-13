package listaF;
/*
 * Desenvolva um programa para efetuar a leitura de três valores (A, B e C) e apresentar os valores dispostos em ordem crescente.
 */

import java.util.Scanner;

public class f8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b, c;
		
		System.out.println("Digite o valor de A");
		a = sc.nextInt();
		System.out.println("Digite o valor de B");
		b = sc.nextInt();
		System.out.println("Digite o valor de C");
		c = sc.nextInt();
		
		if(a>b & b>c) {
			System.out.println("A ordem crescente é 'c, b, a': \n" +c+" \n"+b+" \n"+a);
		}else if(a>c & c>b) {
			System.out.println("A ordem crescente é 'b, c, a': \n" +b+" \n"+c+" \n"+a);
		}else if(b>a & a>c) {
			System.out.println("A ordem crescente é 'c, a, b': \n" +c+" \n"+a+" \n"+b);
		}else if(b>c & c>a) {
			System.out.println("A ordem crescente é 'a, c, b': \n" +a+" \n"+c+" \n"+b);
		}else if(c>a & a>b) {
			System.out.println("A ordem crescente é 'b, a, c': \n" +b+" \n"+a+" \n"+c);
		}else {
			System.out.println("A ordem crescente é 'a, b, c': \n" +a+" \n"+b+" \n"+c);
		}

	}

}
