package aula2;

import java.util.Scanner;

public class DezNumerosPares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numDigitado = 0;
		int x = 0;
		String pares = "";
		
		System.out.println("Digite um número");
		numDigitado = sc.nextInt();
		
		for (int j = 1; j <= numDigitado; j++) {
			if (j%2 == 0) {
				if (pares == "") {
					pares += j;
				}else {
					pares += ", " + j;
				}	
				
				++x;
				
				if (x == 10) {
					break;
				}// eu poderia tirar este bloco IF e colocar no FOR sendo for (int j = 1; j <= numDigitado && x < 10; j++) {
			}
		}
		System.out.println("Números pares: " + pares);
		
		sc.close();
	}

}
