package aula2;

public class Pessoa {
	String nome;
	String cpf;
	String rg;
	
	/**
	 * Construtor da classe Pessoa
	 * @param nome -- recebe o nome
	 * @param cpf  -- recebe o cpf
	 * @param rg   -- recebe o rg
	 */
	public Pessoa(String nome, String cpf, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		}
	
	/**
	 * sobrescrevendo o método toString da classe Object
	 */
	public String toString(){
		return "Nome " + this.nome + ", cpf " + this.cpf + ", rg " + this.rg;
	}
}
