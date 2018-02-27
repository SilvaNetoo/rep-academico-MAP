package br.com.facisa.banco;

import br.com.facisa.excecoes.ValorDeDepositoInvalidoException;
import br.com.facisa.excecoes.ValorDeSaqueInvalidoException;
import br.com.facisa.tipoContaEnum.TipoContaCorrente;

public final class ContaCorrente extends Conta {
	
	private static final double TAXA_MANUTENCAO_MENSAL = 0.05;

	public ContaCorrente(int agencia, int numConta, String titular, double saldo, TipoContaCorrente tipoContaCorrente) {
		super(agencia, numConta, titular, saldo,tipoContaCorrente);
	}

	public ContaCorrente(int agencia, int numConta, String titular,TipoContaCorrente tipoContaCorrente) {
		super(agencia, numConta, titular,tipoContaCorrente);
	}

	public void sacar(double valorDeSaque) throws ValorDeSaqueInvalidoException {
		double juros = valorDeSaque * TAXA_MANUTENCAO_MENSAL;
		double valorASacar = valorDeSaque + juros;
		super.sacar(valorASacar);
	}

	public void depositar(double valorDeDepoisito) throws ValorDeDepositoInvalidoException {
		super.depositar(valorDeDepoisito);
	}

}
