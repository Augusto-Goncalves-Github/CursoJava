package aula2;

/**
 * 
 * @author java01
 *
 */
public class Ponto {
	// iniciar com o valor que quero
	double x = 0.0;
	// iniciar com padrão
	double y;
	
	/**
	 * exemplo de construtor
	 */
	public Ponto(double coordX, double coordY){
		x = coordX;
		y = coordY;
	}
	
	public void deslocar(double deltax, double deltay){
		x += deltax;
		y += deltay;
	}
	
	/**
	 * metodo para zerar as variaveis
	 */
	public void zerar(){
		x = 0;
		y = 0;
	}
	
	/**
	 * metodo para verificar se o Y é menor que zero
	 * @return
	 */
	public boolean isYMenorQueZero(){
		if (y < 0)
			return true;
		return false;
	}

}
