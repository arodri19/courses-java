
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referenciaGerente = new Administrador();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Andre");
		gerente.setCpf("333333");
		gerente.setSalario(5000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		gerente.setSenha(2222);
		
		System.out.println(gerente.autentica(2222));
		
		System.out.println(gerente.getBonificacao());
	}

}
