package Listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestarListas {
	
	public static void main(String[] args) {
		List minhaLista = new ArrayList();
		List minhaOutraLista = new LinkedList();
		
		minhaLista.add("Teste");
		minhaLista.add("Outra coisa");
		minhaLista.add(1);
		
		System.out.println("minhaLista: ");	
		for (Object object : minhaOutraLista) {
			System.out.println(object);	
		}
		
		List<String> minhaListaString = new LinkedList<String>();
		minhaListaString.add("Valor 1");
		minhaListaString.add("Valor 2");
		minhaListaString.add("Valor 3");
		minhaListaString.add("Valor 4");
		minhaListaString.add("Valor 4");
		
		int indexOf = minhaListaString.indexOf("Valor 3");
		System.out.println("Valor 3 está na posição: " + indexOf);
		
		for (String string : minhaListaString) {
			System.out.println(string);	
		}
		
	}

}
