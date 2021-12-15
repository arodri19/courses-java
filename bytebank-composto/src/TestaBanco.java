
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "André";
		cliente.cpf = "222.222.222-22";
		cliente.profissao = "programador";
		
		Conta conta = new Conta();
		conta.titular = cliente;
		System.out.println(conta.titular.nome);
	}
}
