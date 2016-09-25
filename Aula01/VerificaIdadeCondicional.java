package Aula01;

import java.util.Scanner;

public class VerificaIdadeCondicional {
	public static void main(String[] args) {
		System.out.println("Favor, digite sua idade");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();	
		scanner.close();
		System.out.println((idade >= 18) ? "Maior de idade" : "Menor de idade");		
	}
}
