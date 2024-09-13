package listaF;

/*
 * F10-) Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.
 */
import java.util.Scanner;

public class f10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		
		System.out.println("Digite o valor de A (EX. 5)");
		a = sc.nextInt();
		System.out.println("Digite o valor de B (EX. 5)");
		b = sc.nextInt();
		System.out.println("Digite o valor de C (EX. 5)");
		c = sc.nextInt();
		System.out.println("Digite o valor de D (EX. 5)");
		d = sc.nextInt();
		System.out.println("Digite o valor de E (EX. 5)");
		e = sc.nextInt();

		if(a>b & a>c & a>d & a>e) {
			System.out.println("O valor de 'A' ("+a+") é o maior");
		}else if(b>a & b>c & b>d & b>e) {
			System.out.println("O valor de 'A' ("+b+") é o maior");
		}else if(c>b & c>a & c>d & c>e) {
			System.out.println("O valor de 'A' ("+c+") é o maior");
		}else if(d>b & d>c & d>a & d>e) {
			System.out.println("O valor de 'A' ("+d+") é o maior");
		}else {
			System.out.println("O valor de 'E' ("+e+") é o maior");
		}
		
		if(a<b & a<c & a<d & a<e) {
			System.out.println("O valor de 'A' ("+a+") é o menor");
		}else if(b<a & b<c & b<d & b<e) {
			System.out.println("O valor de 'A' ("+b+") é o menor");
		}else if(c<b & c<a & c<d & c<e) {
			System.out.println("O valor de 'A' ("+c+") é o menor");
		}else if(d<b & d<c & d<a & d<e) {
			System.out.println("O valor de 'A' ("+d+") é o menor");
		}else {
			System.out.println("O valor de 'E' ("+e+") é o menor");
		}

	}
}
