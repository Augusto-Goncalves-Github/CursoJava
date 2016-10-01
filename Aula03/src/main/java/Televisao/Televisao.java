package Televisao;

public class Televisao {
	
	private boolean status;
	private String marca;
	private String modelo;
	
	private int volume;
	private int canal;
	private int diodo;
	private int voltagem;
	
	public Televisao(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.status = false;
	}
	
	public void ligar(){
		this.ligarTela();
		this.RegularDiodo();
		this.ajustarVoltagem();
		System.out.println("TV ligada");
	}

	public void desligar(){
		this.ligarTela();
		System.out.println("TV desligada");
	}
	
	public void aumentarVolume(){
		this.voltagem = volume++;
		System.out.println("Aumentou volume");
	}
	
	public void diminuirVolume(){
		this.voltagem = volume--;
		System.out.println("Diminuiu volume");
	}
	
	private void ajustarVoltagem(){
		this.voltagem = 333;
		System.out.println("Ajustar voltagem");
	}
	
	public void aumentarCanal(){
		this.canal = canal++;
		System.out.println("Canal aumentado");
	}
	
	public void diminuirCanal(){
		this.canal = canal--;
		System.out.println("Canal diminuido");
	}
	
	private void ligarTela(){
		this.status = !this.status;
		System.out.println("Ligar a tv");
	}
	
	private void RegularDiodo(){
		this.diodo = 123;
		System.out.println("Diodo regulado");
	}
}
