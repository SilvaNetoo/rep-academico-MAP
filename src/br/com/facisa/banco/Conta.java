package br.com.facisa.banco;

import br.com.facisa.excecoes.ValorDeDepositoInvalidoException;
import br.com.facisa.excecoes.ValorDeSaqueInvalidoException;
import br.com.facisa.tipoContaEnum.TipoContaCorrente;

public abstract class Conta {

	private int agencia;
	private int numConta;
	private double saldo;
	private String titular;
	private TipoContaCorrente tipoContaCorrente;
	
	public Conta(int agencia, int numConta, String titular,TipoContaCorrente tipoContaCorrente) {
		super();
		this.tipoContaCorrente = tipoContaCorrente;
		this.agencia = agencia;
		this.numConta = numConta;
		this.titular = titular;
	}
	
	public Conta(int agencia, int numConta, String titular, double saldo, TipoContaCorrente tipoContaCorrente){
		this(agencia,numConta,titular,tipoContaCorrente);
		this.saldo = saldo;
	}
	
	public void sacar(double valorDeSaque) throws ValorDeSaqueInvalidoException{
		if(!(valorDeSaque>this.saldo)){
			this.saldo -= valorDeSaque;
		}else{
			throw new ValorDeSaqueInvalidoException();
		}
	}
	
	public void depositar(double valorDeDepoisito) throws ValorDeDepositoInvalidoException{
		if(!(valorDeDepoisito <= 0)){
			this.saldo += valorDeDepoisito;
		}else{
			throw new ValorDeDepositoInvalidoException();
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Agencia= " + agencia + "\nNumero da conta= " + numConta + "\nSaldo= " + saldo + "\ntitular= " + titular
				+ "\nTipo de conta= " + tipoContaCorrente;
	}

	
	
}
