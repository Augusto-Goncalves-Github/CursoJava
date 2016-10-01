package PadraoJavaBeans;

public class FuncionarioBonificacao {
	
	private String nome;
	private int salario;
	private String cargo;
	private int porcentagemBonificacao;
	
	public FuncionarioBonificacao(String nome, int salario, String cargo, int porcentagemBonificacao){
		this.salario = salario;
		this.nome = nome;
		this.cargo = cargo;
		this.porcentagemBonificacao = porcentagemBonificacao;
	}
	
    public void setNome(String nome) {
		this.nome = nome;
	}
    
    public String getNome() {
		return nome;
	}
	
    public void setSalario(int salario) {
    	if (this.salario < salario) {
			this.salario = salario;
		}
    }
    
    public int getSalario() {
		return salario;
	}
    
    public void setCargo(String cargo) {
		this.cargo = cargo;
	}
    
    public String getCargo() {
		return cargo;
	}
    
    public void setPorcentagemBonificacao(int porcentagemBonificacao) {
    	if (this.porcentagemBonificacao < porcentagemBonificacao) {
    		this.porcentagemBonificacao = porcentagemBonificacao;
		}
	}
    
    public int getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
}
