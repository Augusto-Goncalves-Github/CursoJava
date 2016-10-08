package ClassesAbstratas;

public class Veterinario extends Humano {
	
	/* este metodo foi montado com o for each para se tornar dinamico, ou seja, para cada animal que emitir som
	 * o metodo já estará preparado 
	 */
	 
	public void examinar(Animal... animais){
		for (Animal animal : animais) {
			animal.emitirSom();
		}		
	}

}
