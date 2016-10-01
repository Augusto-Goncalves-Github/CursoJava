package Carro;

public class Carro {
	
	String marca;
	String modelo;
	String cor;
	int anoFabricacao;
	int velocidade;
	
	public Carro(String marca, String modelo, String cor, int anoFabricacao){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;;
		this.anoFabricacao = anoFabricacao;
		this.velocidade = 0;
	}
	
	public void acelerar(){
		velocidade++;
	}

	public void frear(){
		velocidade--;
		
	}
}
