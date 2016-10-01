package Array;
import java.util.Scanner;


public class InverteArray {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Informe a qtde de números: ");
		 int n = sc.nextInt();
		 int[] numeros = new int[n];
		 
		 for (int i = 0; i < numeros.length; i++) {
			 System.out.println("Informe o número na posição " + i + ": ");
			 numeros[i] = sc.nextInt();
		}
		 for (int j = numeros.length - 1; j>= 0; j--) {
			 System.out.print(numeros[j]);
			 System.out.print("  ");
		}
	}
}
