package ClassesAbstratas;

public class Baleia extends Mamifero implements Examinavel {

	@Override
	public void emitirSom() {
		System.out.println("som da baleia");		
	}
}
