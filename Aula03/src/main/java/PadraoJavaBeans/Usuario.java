package PadraoJavaBeans;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private int qtdMinima = 5;

	public Usuario(String nome, String email, String senha){
		this.nome = nome;
		this.email = email;
		this.setSenha(senha);
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setSenha(String senha){
		if (validaSenha(senha))
			this.senha = senha;
	}

	public String getSenha(){
		return this.senha;
	}

	private boolean validaSenha(String senha){
		return ((qtdMinima(senha, qtdMinima)) && (contemLetra(senha)) && (contemNum(senha)));
	}

	private boolean contemNum(String arg0){
		for (int i = 0; i < arg0.length(); i++){
			if (Character.isDigit(arg0.charAt(i)))
				return true;
		}
		return false;
	}

	private boolean contemLetra(String arg0){
		for (int i = 0; i < arg0.length(); i++){
			if (Character.isLetter(arg0.charAt(i)))
				return true;
		}
		return false;
	}

	private boolean qtdMinima(String arg0, int qtdMinima){
		return (arg0.length() >= qtdMinima);
	}
}
