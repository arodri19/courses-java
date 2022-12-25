
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.getSaldo());
		
		System.out.println(conta.titular);
		conta.titular = new Cliente();
		
		conta.titular.nome = "André";
		System.out.println(conta.titular.nome);
	}
}
