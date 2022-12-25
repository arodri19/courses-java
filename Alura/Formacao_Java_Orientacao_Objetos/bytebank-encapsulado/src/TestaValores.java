
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(333,345456);
		//conta.setAgencia(-30);
		//conta.setNumero(-30);

		System.out.println(conta.getAgencia());
		Conta conta2 = new Conta(333,345456);
		Conta conta3 = new Conta(333,345456);
		System.out.println(Conta.getTotal());
	}

}
