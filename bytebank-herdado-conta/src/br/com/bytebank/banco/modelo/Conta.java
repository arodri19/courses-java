package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author andre
 *
 */

public abstract class Conta implements Comparable<Conta>, Serializable{
	protected double saldo;
	private int agencia;
	private int numero;
//	private transient Cliente titular;
	private Cliente titular;
	private static int total =0;
	
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("estou criando uma conta " + this.numero);
	}
	
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor); 
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		this.saldo -= valor;
		destino.deposita(valor);
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	/*public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor ou igual que 0");
			return;
		}
		this.agencia = agencia;
	}*/
	
	public int getNumero() {
		return this.numero;
	}
	
	/*public void setNumero(int numero) {
		if(numero < 0) {
			System.out.println("não pode valor 0");
			return;
		}
		this.numero = numero;
	}*/
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta)ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agencia: " + this.agencia + ", saldo:" + this.saldo;
	}
}