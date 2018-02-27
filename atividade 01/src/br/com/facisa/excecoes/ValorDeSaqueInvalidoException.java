package br.com.facisa.excecoes;

public class ValorDeSaqueInvalidoException extends Exception{
	
	public ValorDeSaqueInvalidoException(){
		super("Valor de saque maior que o saldo atual!");
	}
}
