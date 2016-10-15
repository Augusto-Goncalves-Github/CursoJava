package Listas;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		
		this.nome = nome;
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	
	// alt + shift + S ou botao direito em algum lugar vazio > Source > Generate hasCode and equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	public int compareTo(Pessoa outraPessoa) {
		// comparando por nome, se quiser por cpf tem que alterar para o atributo cpf
		return nome.compareTo(outraPessoa.nome);
	}
	
	
}
