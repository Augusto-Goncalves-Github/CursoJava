package Aula01;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor a ser sacado?");
		int valorSaque = sc.nextInt();		
		int restante = valorSaque;
		
		int notaCem = restante/100;
		restante = restante%100;
		
		int notaCinq = restante/50;
		restante = restante%50;
		
		int notaVinte = restante/20;
		restante = restante%20;
		
		int notaDez = restante/10;
		restante = restante%10;
		
		int notaCinco = restante/5;
		restante = restante%5;
		
		if (restante > 0){
			System.out.println("Valor não é possível de ser sacado");
		} else {
			if (notaCem > 0){
				System.out.println("Precisa de " + notaCem + " notas de R$100");
			} 
			if (notaCinq > 0){
				System.out.println("Precisa de " + notaCinq + " notas de R$50");
			} 
			if (notaVinte > 0){
				System.out.println("Precisa de " + notaVinte + " notas de R$20");
			} 
			if (notaDez > 0){
				System.out.println("Precisa de " + notaDez + " notas de R$10");
			} 
			if (notaCinco > 0){
				System.out.println("Precisa de " + notaCinco + " notas de R$5");
			} 			
		}		
		sc.close();
	}

}
