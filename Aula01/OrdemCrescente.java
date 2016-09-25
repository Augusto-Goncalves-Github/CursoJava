package Aula01;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiro = 0;
		int segundo = 0;
		int terceiro = 0;
		
		System.out.println("Favor, digite o primeiro numero");		
		int num1 = sc.nextInt();
		
		System.out.println("Favor, digite o segundo numero");	
		int num2 = sc.nextInt();
		
		System.out.println("Favor, digite o terceiro numero");	
		int num3 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3) {
			primeiro = num1;			
		    if (num2 > num3) {
		    	terceiro = num2;
		    	segundo = num3;
		    } else {
		    	segundo = num2;
		    	terceiro = num3;
		    }
		}
		
		if (num2 < num1 && num2 < num3) {
			primeiro = num2;			
		    if (num1 > num3) {
		    	terceiro = num1;
		    	segundo = num3;
		    } else {
		    	segundo = num1;
		    	terceiro = num3;
		    }
		} 
		
		if (num3 < num1 && num3 < num2) {
			primeiro = num3;			
		    if (num1 > num2) {
		    	terceiro = num1;
		    	segundo = num2;
		    } else {
		    	segundo = num1;
		    	terceiro = num2;
		    }
		}
		
		System.out.println(primeiro + " " + segundo + " " + terceiro);	
		
		sc.close();		
	}
}
