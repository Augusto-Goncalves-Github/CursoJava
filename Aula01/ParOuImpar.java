package Aula01;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		String valor = (numero%2 == 0) ? "Número par" : "Número ímpar";
		System.out.println(valor);
		scanner.close();
	}
}


/*
 * numero%2 == 0 é o mesmo que dizer: 'se o resto da divisao por 2 for igual a 0 ele é par'
 * poderia usar esse jeito de printar, sem fazer a logica na declaração
 *   //System.out.println((numero%2 == 0) ? "Número par" : "Número ímpar");
 */