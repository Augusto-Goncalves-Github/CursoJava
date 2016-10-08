package ClassesAbstratas;

public class TesteAnimal {
	
	public static void main(String[] args) {
		Animal baleia = new Baleia();
		Animal jacare = new Jacare();
		Animal humano = new Humano();
		Veterinario veterinario = new Veterinario();
		
		veterinario.examinar(jacare, baleia, humano, veterinario);
	}
}
