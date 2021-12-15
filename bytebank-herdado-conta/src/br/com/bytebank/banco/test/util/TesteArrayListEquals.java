package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(22,22);
		lista.add(cc1);
		
		Conta cc3 = new ContaCorrente(22,22);
		boolean existe = lista.contains(cc3);
		
		System.out.println(existe);
		
		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("Já tenho essa conta!");
			}
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		
//		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			
//		}
	}

}
