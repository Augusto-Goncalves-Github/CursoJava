package Aula01;
import java.util.Scanner;


public class OperdaorComparacao {
	public static void main(String[] args) {
		System.out.println("Favor, digite sua idade");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();	
		scanner.close();
		System.out.println("Idade é maior que 18: " + (idade > 18));
	}

}
