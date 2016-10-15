package Pedagio;

public class TestaPedagio {
	
	public static void main(String[] args) {
		
		/*
		 * criei cada objeto (veiculo) sendo que a bike nao pega as informaçoes de pagapedagio pois ela nao paga
		 * foi atribuido PagaPedagio para caminhao, carro e moto pois eles IMPLEMENTAM PagaPedagio
		 */
		PagaPedagio carro = new Carro();
		PagaPedagio caminhao = new Caminhao();
		PagaPedagio moto = new Moto();
		Veiculo bike = new Bicicleta();
		
		/*
		 * criei o objeto que representa a cancela
		 */
		CalculadorPedagio cal = new CalculadorPedagio(7.55); 
		
		System.out.println("Caminhao: " + cal.calculaPreco(caminhao));
		System.out.println("Carro: " + cal.calculaPreco(carro));
		System.out.println("Moto: " + cal.calculaPreco(moto));
		
	}

}
