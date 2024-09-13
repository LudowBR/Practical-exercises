package listaF;

import java.util.Scanner;

/*
 * F7-) Desenvolva um programa para ler três valores (X, Y e Z). 
 * O programa deverá verificar se estes três valores podem ser os comprimentos dos lados de um triângulo e, 
 * se forem, verificar se é um triângulo eqüilátero, isósceles ou escaleno. Se eles não forem um triângulo, escrever uma mensagem.
Propriedades e definições dos triângulos:
- O comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados;
- Chama-se triângulo eqüilátero ao triângulo que tem os comprimentos dos três lados iguais;
- Chama-se triângulo isósceles ao triângulo que tem os comprimentos de dois lados iguais. 
	Portanto, todo triângulo eqüilátero é também isósceles;
- Chama-se triângulo escaleno ao triângulo que tem os comprimentos de seus três lados diferentes.
 */
public class f7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Digite o valor de X");
		x = sc.nextInt();
		System.out.println("Digite o valor de Y");
		y = sc.nextInt();
		System.out.println("Digite o valor de Z");
		z = sc.nextInt();
		
		if (x+y < z | x+z < y | z+y < x) {
			System.out.println("Esses valores podem ser os comprimentos dos lados de um triangulo obtusângulo.");
		}else if (x==y & x==z & y==z) {
			System.out.println("Esses valores podem ser os comprimentos dos lados de um triangulo equilátero, que também seria um triângulo isósceles.");
		}else if (x==y | z==x | y==z) {
			System.out.println("Esses valores podem ser os comprimentos dos lados de um triângulo isósceles.");
		}else if (x!=y & z!=x & y!=z) {
			System.out.println("Esses valores podem ser os comprimentos dos lados de um triângulo escaleno.");
		}

	}

}
