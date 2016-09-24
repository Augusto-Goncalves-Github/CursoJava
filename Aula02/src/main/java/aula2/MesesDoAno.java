package aula2;

import java.util.Scanner;

/*
 *  programa para utilizar o switch case SEM o break... assim é listado tudo abaixo do case que ele entrar
 */

public class MesesDoAno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o valor numérico do dia da semana");
			int mes = sc.nextInt();
			String nomeMes = "";
			
			switch (mes) {
			case 1:
				nomeMes = " Janeiro\n";
			case 2:
				nomeMes += " Fevereiro\n";
			case 3:
				nomeMes += " Março\n";
			case 4:
				nomeMes += " Abril\n";
			case 5:
				nomeMes += " Maio\n";
			case 6:
				nomeMes += " Junho\n";
			case 7:
				nomeMes += " Julho\n";
			case 8:
				nomeMes += " Agosto\n";
			case 9:
				nomeMes += " Setembro\n";
			case 10:
				nomeMes += " Outubro\n";
			case 11:
				nomeMes += " Novembro\n";
			case 12:
				nomeMes += " Dezembro\n";
				break;

			default:
				nomeMes = "Mês inexistente";
				break;
				
			}
			System.out.println(nomeMes);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Só é aceito valor numérico inteiro");
		}
		
		sc.close();
	}

}
