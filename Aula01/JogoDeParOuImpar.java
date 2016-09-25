package Aula01;

import java.util.Scanner;

public class JogoDeParOuImpar {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Valor do jogador um");		
	int jogada1 = sc.nextInt();
	
	System.out.println("Valor do jogador dois");	
	int jogada2 = sc.nextInt();
	
	int somaJogada = jogada1 + jogada2;
	
	System.out.println("O jogador um pediu par");
	System.out.println("O jogador dois colocou pediu ímpar");
	System.out.println("A soma deu: " + somaJogada);
	
	System.out.println(somaJogada%2 == 0 ? "Jogador um ganhou" : "Jogador dois ganhou");
	sc.close();
	}
}
