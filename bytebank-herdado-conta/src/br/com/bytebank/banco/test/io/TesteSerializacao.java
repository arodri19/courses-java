package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cliente cliente = new Cliente();
		cliente.setNome("André");
		cliente.setProfissao("Dev");
		cliente.setCpf("233235745");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(22.3);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
//		Cliente cliente = (Cliente)ois.readObject();
//		ois.close();
//		System.out.println(cliente.getNome());

	}

}
