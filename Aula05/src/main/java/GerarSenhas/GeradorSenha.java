package GerarSenhas;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {
	
	private int contI; // contador senha idoso
	private int contP; // contador senha padrao
	List<Integer> senhaIdoso = new ArrayList<>();
	List<Integer> senhaPadrao = new ArrayList<>();
	
	public GeradorSenha() {
		this.contI = 0;
		this.contP = 0;
	}
	
	public String gerarSenhaIdoso(){
		contI++;
		senhaIdoso.add(contI);
		return "I" + contI;
	}
	
	public String gerarSenhaPadrao(){
		contP++;
		senhaPadrao.add(contP);
		return "P" + contP;
	}
	
	public String proximaSenha(){
		return senhaIdoso.get(0);
		
	}

}
