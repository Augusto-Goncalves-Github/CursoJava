package Garagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Garagem {
	
	private Map<String, Veiculo> veiculos;
	
	public Garagem() {
		this.veiculos = new HashMap<>();
	}
	public boolean adicionar(Veiculo veiculo){
		return veiculos.add(veiculo);		
	}
	
	public boolean vender(String placa){
		return veiculos.remove(placa);
	}
	
	public Veiculo buscar(String placa){
		return veiculos.getPlaca();
	}

	public List<Veiculo> listar(){
		List<Veiculo> veiculosOrdenados = new ArrayList<>(veiculos.values());
		Col
	}
	
}
