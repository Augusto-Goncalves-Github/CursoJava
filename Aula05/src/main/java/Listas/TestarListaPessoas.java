package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestarListaPessoas {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Ze", "1235"));
		pessoas.add(new Pessoa("Jao", "2343"));
		pessoas.add(new Pessoa("Tiao", "33333"));
		pessoas.add(new Pessoa("Ego", "23345"));
		pessoas.add(new Pessoa("Juca", "5436547"));
		boolean contains = pessoas.contains(new Pessoa("Ego", "23345"));
		int indexOf = pessoas.indexOf(new Pessoa("Ego", "23345"));
		
		//comparei e ordenei por nome (ver classe Pessoa no metodo compareTo)
		// Collections.sort(pessoas);
		
		//Collections.sort(pessoas, new PessoaPorCpfComparator());
		Collections.sort(pessoas, new PessoaPorNomeComparator());
		
		System.out.println("indexOf Ego " + indexOf);
		System.out.println("contains Ego " + contains);
		System.out.println("pessoas.size " + pessoas.size());
		System.out.println("pessoas.isEmpty " + pessoas.isEmpty());
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
		}
	}

}
