package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Object[] referencias = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(0, 0);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(0, 22);
		referencias[1] = cc2;
		
		//System.out.println((ContaPoupanca)referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1];

	}

}
