package listaA;
import java.util.Scanner;

public class a8 {
	
	
	
	public static void main(String[] args) {
		
		double A, B, C;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor de A?");
		A = sc.nextDouble();
		System.out.println("Qual o valor de B?");
		B = sc.nextDouble();
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("Os valores de A e B, trocados, são: " + A + " e " + B + ", respectivamente.");
		

	}

}
