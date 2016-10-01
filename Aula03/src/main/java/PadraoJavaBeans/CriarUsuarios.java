package PadraoJavaBeans;

public class CriarUsuarios {
	public static void main(String[] args) {
		Usuario user = new Usuario("Thias", "oi@kopatomarril", "Oxi123");
		user.setSenha("1234");
		user.setSenha("a12345");
		user.setSenha("1245a");
		user.setSenha("aaaaa");
		
		System.out.println("Senha: " + user.getSenha());
	}
}
