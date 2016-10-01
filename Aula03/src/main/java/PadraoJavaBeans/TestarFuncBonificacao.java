package PadraoJavaBeans;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TestarFuncBonificacao {
	public static void main(String[] args) {
		FuncionarioBonificacao func = new FuncionarioBonificacao("Ego", 1000, "Prog", 5);
		
		func.setSalario(900);
		func.setPorcentagemBonificacao(10);
		System.out.println("Salario: " + func.getSalario());
		System.out.println("Porcentagem: " + func.getPorcentagemBonificacao());
		
		func.setSalario(1200);
		func.setPorcentagemBonificacao(5);
		System.out.println("Salario: " + func.getSalario());
		System.out.println("Porcentagem: " + func.getPorcentagemBonificacao());
		
		func.setSalario(1500);
		func.setPorcentagemBonificacao(12);
		System.out.println("Salario: " + func.getSalario());
		System.out.println("Porcentagem: " + func.getPorcentagemBonificacao());
	}
}
