package aula2;

public class Interruptor {
	Lampada lamp;
	
	public Interruptor(Lampada lamp){
		this.lamp = lamp;
	}
	
	public void Apertar(){
		if (this.lamp.EstaLigada()) {
			this.lamp.desligar();
		}else
			this.lamp.ligar();
	}

}
