package aula2;

import java.util.Scanner;

public class TestarPessoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		System.out.println("Digite o cpf da pessoa: ");
		String cpf = sc.nextLine();
		System.out.println("Digite o rg da pessoa: ");
		String rg = sc.nextLine();
		
		Pessoa objPessoa = new Pessoa(nome, cpf, rg);
		
		System.out.println(objPessoa);
		
		sc.close();
	}

}
