package listaF;
/*
 * F1-) Desenvolva um programa para auxiliar uma empresa na classificação dos funcionários nos departamentos da empresa. O programa devera solicitar a cada 
 * funcionário o código do departamento em que ele deverá trabalhar e apresentar ao funcionário a descrição do departamento correspondente ao código indicado.
Código Departamento
10 Contabilidade
12 Almoxarifado
14 Informática
 */
import java.util.Scanner;

public class f1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;
		
		
		System.out.println("Digite o código do departamento:");
		System.out.println("10) Contabilidade \n12) Almoxarifado \n14) Informática");
		codigo = sc.nextInt();
		
		if (codigo == 10) {
			System.out.println("Segue abaixo as informações sobre 'Contabilidade':\n lorem15");
		}else if (codigo == 12) {
			System.out.println("Segue abaixo as informações sobre 'Almoxarifado':\n lorem15");
		}else if (codigo == 14) {
				System.out.println("Segue abaixo as informações sobre 'Informática':\n lorem15");
		}

	}

}
