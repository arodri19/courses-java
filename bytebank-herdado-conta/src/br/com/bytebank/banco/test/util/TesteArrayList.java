package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		List<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(22,11);
		lista.add(cc1);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		
		Conta cc3 = new ContaCorrente(22,11);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22,11);
		lista.add(cc4);
		
		
		for(int i = 0; i< lista.size(); i++) {
			Conta conta = lista.get(i);
			System.out.println(conta);
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
