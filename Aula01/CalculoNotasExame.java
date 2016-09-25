package Aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoNotasExame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor, digite o nome do aluno");		
		String nomeAluno = sc.nextLine();
		
		System.out.println("Favor, digite a primeira nota do aluno");		
		double nota1 = sc.nextDouble();
		
		System.out.println("Favor, digite a segunda nota do aluno");	
		double nota2 = sc.nextDouble();
		
		System.out.println("Favor, digite a terceira nota do aluno");	
		double nota3 = sc.nextDouble();	
		
		double media = (nota1 + nota2 + nota3)/3;	
				
		System.out.println("O aluno " + nomeAluno + " teve a média: " + media);	
		
		if (media >= 7){
			System.out.println("Aprovado");			
		} else if (media >= 4) {
			System.out.println("Exame");	
		} else {
			System.out.println("Reprovado");
		}
		sc.close();
	}

}
