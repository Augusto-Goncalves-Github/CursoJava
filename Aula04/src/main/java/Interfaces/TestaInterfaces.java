package Interfaces;

public class TestaInterfaces {
	public static void main(String[] args) {
		System.out.println(MinhaPrimeiraInterface.MEU_ATRIBUTO);
		
		MinhaPrimeiraInterface objeto = new ImplementacaoDaInterface();
		objeto.fazAlgumaCoisa();
	}
}
