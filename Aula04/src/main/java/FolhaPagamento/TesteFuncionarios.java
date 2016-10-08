package FolhaPagamento;

public class TesteFuncionarios {
	
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Gerentao", 5000.00);
		Funcionario supervisor = new Supervisor("Zoiudo", 3500.00);
		Funcionario secretaria = new Secretaria("Secretaria", 2000.00);
		FolhaPagamento folha = new FolhaPagamento();
		
		folha.calcular(gerente, supervisor, secretaria);
	}

}
