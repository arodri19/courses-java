
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		Gerente gerente = new Gerente();
		gerente.setNome("Andre");
		gerente.setCpf("3333333-3");
		gerente.setSalario(2500);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());

	}

}
