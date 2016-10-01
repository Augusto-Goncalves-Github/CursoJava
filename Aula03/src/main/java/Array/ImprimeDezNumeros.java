package Array;

import java.util.Scanner;

public class ImprimeDezNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[] arrayInts = new int[10];
		
		for (int i = 0; i < arrayInts.length; i++) {
			System.out.println("Número[" + i + "]");
			arrayInts[i] = sc.nextInt();
		}
		
		for (int j : arrayInts) {
			System.out.println(j);			
		}	
		sc.close();
	}
}
