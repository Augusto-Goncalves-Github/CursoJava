package GerarSenhas;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {
	
	private int contI; // contador senha idoso
	private int contP; // contador senha padrao
	
	private List<Integer> senhaIdoso;
	private List<Integer> senhaPadrao;
	
	private int proximaSenhaPadrao;
	private int proximaSenhaIdoso;
	
	public GeradorSenha() {
		this.senhaIdoso = new ArrayList<>();
		this.senhaPadrao = new ArrayList<>();
//		this.proximaSenhaIdoso() = this.proximaSenhaIdoso;
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
		
		if (!senhaIdoso.isEmpty()) {
			return "I" + senhaIdoso.remove(0);
		}
		if (!senhaPadrao.isEmpty()) {	
			return "P" + senhaPadrao.remove(0);
		}		
		return senhaIdoso.get(0);
		
	}

}
