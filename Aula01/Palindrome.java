package Aula01;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sentença, por favor.");
		String palavra = sc.nextLine();
		String auxReverse = "";
		
		for (int i = palavra.length()-1; i >= 0; i--) {
			// vai usando o conceito de fila na variavel, encaixando letra a letra da 
			// variavel palavra, através do +
			auxReverse+= palavra.charAt(i);			
		}
		if (auxReverse.equals(palavra)) {
			System.out.println("A sentença é palíndrome!");
		}else {
			System.out.println("A sentença não é palíndrome!");
		}
		
		sc.close();
	}

}
