
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1314,24557);
		
		//conta.setNumero(4444);
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		cliente.setNome("andre");
		conta.setTitular(cliente);
		conta.getTitular().setCpf("333333333");
		
		System.out.println(conta.getTitular().getCpf());
		
		System.out.println(Conta.getTotal());
	}

}
