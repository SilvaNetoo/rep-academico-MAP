package br.com.facisa.excecoes;

public class ValorDeDepositoInvalidoException extends Exception{

	public ValorDeDepositoInvalidoException(){
		super("Valor de deposito menor ou igual a zero!");
	}
}
