package GerarSenhas;

import java.util.Scanner;

public class TestarGerarSenha {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GeradorSenha geradorSenha = new GeradorSenha();
		
		int opcao;
		
		while (true) {
			opcao = menu(sc);
			if (opcao == 1) {
				//geradorSenha.gerarSenhaPadrao();
				System.out.println("Senha padrao: " + geradorSenha.gerarSenhaPadrao());
			} else if (opcao == 2) {
				System.out.println("Senha idoso: " + geradorSenha.gerarSenhaIdoso());
			} else if (opcao == 3) {
				geradorSenha.proximaSenha();
			}
		}
		
//		sc.close();	
		
	}

	private static int menu(Scanner sc) {

		System.out.println("1 - Gerar senha padrão");
		System.out.println("2 - Gerar senha idoso");
		System.out.println("3 - Próxima senha");
		
		int opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}
}
