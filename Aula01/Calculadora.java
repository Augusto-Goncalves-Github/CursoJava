package Aula01;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int numero1 = scanner.nextInt();
//		int numero2 = scanner.nextInt();
		
		double numero1 = scanner.nextDouble();
		double numero2 = scanner.nextDouble();		
		
		scanner.close();
		
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));
	}

}
