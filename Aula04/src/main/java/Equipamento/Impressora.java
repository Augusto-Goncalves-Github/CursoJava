package Equipamento;

public class Impressora extends Eletronicos{
	
	private int pontosPorPolegada;
	
	public Impressora(String fabricante, double preco, int pontosPorPolegada){
		super(fabricante, preco);
		this.pontosPorPolegada = pontosPorPolegada;
		//super.setIpq(0.05);
	}
	
	public int getPontosPorPolegada(){
		return pontosPorPolegada;
	}
	
	public void setPontosPorPolegada(int pontosPorPolegada) {
		this.pontosPorPolegada = pontosPorPolegada;
	}
	
	public void imprimir(){
		System.out.println("Imprimindo!");
	}
}
