package FolhaPagamento;

public class FolhaPagamento {
	
	private double totalGasto;
	
	public void calcular(Funcionario... funcionarios){
		for (Funcionario funcionario : funcionarios) {
			totalGasto += funcionario.getSalarioComBonificacao();
			System.out.println(funcionario.getClass().getSimpleName() + ": " +funcionario.getSalarioComBonificacao());
		}
		System.out.println("Total gasto com pessoal: " + totalGasto);
	}
	

}
