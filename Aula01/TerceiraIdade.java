package Aula01;

import java.util.Scanner;

public class TerceiraIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade, por favor.");
		int idade = sc.nextInt();
		
		System.out.println(idade >= 65 ? "Você já é um idoso, parabéns!!!" : "Você ainda não é um idoso.");		
		
		sc.close();
	}

}
