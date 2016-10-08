package Equipamento;

public class TestarEquipamento {
	
	public static void main(String[] args) {
		Equipamento impressora = new Impressora("HP: ", 500.00, 15);
		Equipamento teclado = new Teclado("Microsoft", 100.00, "PT_BR");
		Equipamento televisao = new Televisao("Semp: ", 1000.00);
		Equipamento cadeira = new Cadeira("CadeiraShow: ", 200.00);
		
		double valorTotal = imprimirPrecosFinais(impressora, teclado, televisao, cadeira);
		System.out.println("Valor total: " + valorTotal);	
	}
	
	public static double imprimirPrecosFinais(Equipamento... equipamentos){
		double valorTotal = 0;
		
		for (Equipamento equipamento : equipamentos) {
			System.out.println(equipamento.getClass().getSimpleName() + ": " + equipamento.calcularPrecoFinal());
			valorTotal += equipamento.calcularPrecoFinal();
		}
		return valorTotal;		
	}
}
