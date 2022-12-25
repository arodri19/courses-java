
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(500);
		System.out.println(conta.saldo);
		boolean conseguiuRetirar = conta.saca(200);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaAndre = new Conta();
		contaAndre.deposita(1000);
		
		boolean conseguiuTransferir = contaAndre.transfere(300, conta);
		
		System.out.println(conta.saldo);
		System.out.println(contaAndre.saldo);
		System.out.println(conseguiuTransferir);
		
		//conta.titular = "André";
		System.out.println(conta.titular);

	}

}
