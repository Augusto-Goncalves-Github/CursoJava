package Equipamento;

public class Teclado extends Eletronicos{

	private String layout;	
	
	public Teclado(String fabricante, double preco, String layout) {
		super(fabricante, preco);
		this.layout = layout;
	}	
	
	public String getLayout() {
		return layout;
	}
	
	public void setLayout(String layout) {
		this.layout = layout;
	}
	
	public void teclar(){
		System.out.println("Teclando!");
	}
}
