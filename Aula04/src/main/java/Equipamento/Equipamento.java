package Equipamento;

public class Equipamento {
	
	private String fabricante;
	private double preco;	
	private double ipq; // um imposto ficticio
	
	public Equipamento(String fabricante, double preco){
		this.fabricante = fabricante;
		this.preco = preco;
		this.ipq = 0;
	}
	
	// o get retorna o valor do atributo - aqui ele dá o retorno do valor
	public double getPreco(){
		return preco;
	}
	
	// o set altera o valor do atributo
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public double getIpq() {
		return ipq;
	}
	
	public void setIpq(double ipq) {
		this.ipq = ipq;
	}
	
	public double calcularPrecoFinal(){
		return this.preco;
	}
}
