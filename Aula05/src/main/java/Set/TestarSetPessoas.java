package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Listas.Pessoa;
import Listas.PessoaPorCpfComparator;

public class TestarSetPessoas {
	
	public static void main(String[] args) {
		
		Set<Pessoa> pessoas = new HashSet<>();		
		pessoas.add(new Pessoa("Ze", "1235"));
		pessoas.add(new Pessoa("Jao", "2343"));
		pessoas.add(new Pessoa("Tiao", "33333"));
		pessoas.add(new Pessoa("Ego", "23345"));
		pessoas.add(new Pessoa("Juca", "5436547"));
		
		System.out.println("Pessoas");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
		}
		
		Set<Pessoa> pessoasOrdenadas = new TreeSet<>(new PessoaPorCpfComparator());		
		pessoasOrdenadas.add(new Pessoa("Ze", "1235"));
		pessoasOrdenadas.add(new Pessoa("Jao", "2343"));
		pessoasOrdenadas.add(new Pessoa("Tiao", "33333"));
		pessoasOrdenadas.add(new Pessoa("Ego", "23345"));
		pessoasOrdenadas.add(new Pessoa("Juca", "5436547"));
		
		System.out.println("Pessoas Ordenadas");
		for (Pessoa pessoa : pessoasOrdenadas) {
			System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
		}
	}

}
