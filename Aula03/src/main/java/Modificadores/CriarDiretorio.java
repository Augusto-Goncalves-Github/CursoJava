package Modificadores;

import java.util.Scanner;

public class CriarDiretorio {
	
	public static void main(String[] args) {

		Diretorio dir1 = new Diretorio();
		Diretorio dir2 = new Diretorio();
		Diretorio dir3 = new Diretorio();
		
		System.out.println(dir1.quantidadeInstancia);
		System.out.println(dir2.quantidadeInstancia);
		System.out.println(dir3.quantidadeInstancia);
		System.out.println(dir1.quantidadeStatic);
		System.out.println(dir2.quantidadeStatic);
		System.out.println(dir3.quantidadeStatic);
		
	}

}
