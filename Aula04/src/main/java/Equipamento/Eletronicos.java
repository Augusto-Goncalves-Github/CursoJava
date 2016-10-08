package Equipamento;

public class Eletronicos extends Equipamento{

	public Eletronicos(String fabricante, double preco) {
		super(fabricante, preco);
		super.setIpq(0.10);
	}

	@Override
	public double calcularPrecoFinal(){
		return super.getPreco() * (1+super.getIpq());
	}
}
