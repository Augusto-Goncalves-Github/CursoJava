package Carro;

public class TestarCarro {
	
	public static void main(String[] args) {
		Carro primeiroCarro = new Carro("Ferrari", "430 Scuderia", "Vermelha", 2009);
		Carro segundoCarro = new Carro("Fiat", "Uno", "Branco", 2009);
		
		primeiroCarro.acelerar();
		primeiroCarro.acelerar();
		primeiroCarro.frear();
		primeiroCarro.acelerar();
		
		segundoCarro.acelerar();
		segundoCarro.acelerar();
		segundoCarro.frear();
		segundoCarro.acelerar();
		
		System.out.println(primeiroCarro.velocidade);
		System.out.println(segundoCarro.velocidade);
	}

}
