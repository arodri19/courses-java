package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue(); //unboxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		String s = "10";
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //autoboxing
		
		System.out.println(valor);
		

	}

}
