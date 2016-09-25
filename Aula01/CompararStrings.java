package Aula01;
import java.util.Scanner;


public class CompararStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomeUm = scanner.next();
		String nomeDois = scanner.next();
		scanner.close();
		System.out.println(nomeUm.equals(nomeDois));
	}
	
	/*
	 programa basico para comparar strings
	 onde nomeUm.equals(nomeDois) está sendo case sensitive
	 e
	 onde nomeUm.equalsIgnoreCase(nomeDois) não está sendo case sensitive
	*/

}
