package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhação {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = new Random().nextInt(10) + 1;	// o programa gera um número aleatório de 1 a 10
		int qtdTentativas = 0;		
		int numChute = 0;
		do {												// faça o código
			System.out.println("Adivinhe o número");
			numChute = sc.nextInt();
			++qtdTentativas;
			
		} while (numChute != numeroAleatorio);          	// enquanto
		
		System.out.println("Você acertou em " + qtdTentativas + " tentativas.");
		
		sc.close();
	}

}
