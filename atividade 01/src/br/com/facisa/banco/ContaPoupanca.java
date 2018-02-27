package br.com.facisa.banco;

import br.com.facisa.excecoes.ValorDeDepositoInvalidoException;
import br.com.facisa.excecoes.ValorDeSaqueInvalidoException;
import br.com.facisa.tipoContaEnum.TipoContaCorrente;

public final class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numConta, String titular, double saldo, TipoContaCorrente tipoContaCorrente) {
		super(agencia, numConta, titular, saldo, tipoContaCorrente);
	}

	public ContaPoupanca(int agencia, int numConta, String titular, TipoContaCorrente tipoContaCorrente) {
		super(agencia, numConta, titular, tipoContaCorrente);
	}

	public void sacar(double valorDeSaque) throws ValorDeSaqueInvalidoException {
		super.sacar(valorDeSaque);
	}

	public void depositar(double valorDeDepoisito) throws ValorDeDepositoInvalidoException {
		super.depositar(valorDeDepoisito);
	}

}
