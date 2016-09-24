package aula2;

public class Lampada {
	String watts;
	String fabricante;
	boolean status;
	
	public Lampada(String watts, String fabricante) {
		this.watts = watts;
		this.fabricante = fabricante;
	}
	
	public void ligar(){
		System.out.println("Ligada");
		this.status = true;
	}
	
	public void desligar(){
		System.out.println("Desligada");
		this.status = false;
	}
	
	public boolean EstaLigada(){
		return status;
	}

}
