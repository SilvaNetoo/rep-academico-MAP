package br.com.facisa.main;

import javax.swing.JOptionPane;

import br.com.facisa.banco.Conta;
import br.com.facisa.banco.ContaCorrente;
import br.com.facisa.banco.ContaPoupanca;
import br.com.facisa.tipoContaEnum.TipoContaCorrente;

public class Teste {

	private static Conta c;
	private static boolean sairOk;

	public static void main(String[] args) {

		do {
			sairOk = false;

			String tipoContaStr = JOptionPane
					.showInputDialog("Crie sua conta:\nConta corrente digite 1\nConta poupança digite 2\n");
			int tipoConta = Integer.parseInt(tipoContaStr);

			if (tipoConta == 1) {
				operacoesContaCorrente();
				sairOk = true;
			} else if (tipoConta == 2) {
				operacoesContaPoupanca();
				sairOk = true;
			} else {
				JOptionPane.showMessageDialog(null, "Operação inválida, tente novamente.");
			}
		} while (!sairOk);

		JOptionPane.showMessageDialog(null, "Operação encerrada!");

	}

	private static void operacoesContaCorrente() {
		String agenciaStr = JOptionPane.showInputDialog("Digite o numero da agência: ");
		int agencia = Integer.parseInt(agenciaStr);
		String numContaStr = JOptionPane.showInputDialog("Digite o numero da conta: ");
		int numConta = Integer.parseInt(agenciaStr);
		String titular = JOptionPane.showInputDialog("Digite o nome do titular: ");

		ContaCorrente cCorrente = (ContaCorrente) c;

		sairOk = false;

		while (!sairOk) {

			String tipoContaStr = JOptionPane.showInputDialog(
					"Qual tipo de conta corrente deseja abrir?\nConta corrente NORMAL digite 1:\nConta corrente BLACK digite 2:");
			int tipoConta = Integer.parseInt(tipoContaStr);
			if (tipoConta == 1) {
				cCorrente = new ContaCorrente(agencia, numConta, titular, TipoContaCorrente.NORMAL);
				break;
			} else if (tipoConta == 2) {
				cCorrente = new ContaCorrente(agencia, numConta, titular, TipoContaCorrente.BLACK);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
			}
		}

		try {

			sairOk = false;

			while (!sairOk) {
				String operacaoStr = JOptionPane.showInputDialog("Por favor, digite a operação desejada"
						+ "\nSacar = 1\nDepositar = 2\nInformações da conta = 3\nSair = 0");
				int operacao = Integer.parseInt(operacaoStr);
				if (operacao == 1) {
					String valorDeSaqueStr = JOptionPane.showInputDialog("Digite o valor do saque: ");
					double valorDeSaque = Double.parseDouble(valorDeSaqueStr);
					try {
						cCorrente.sacar(valorDeSaque);
					} catch (Throwable e) {
						e.printStackTrace();
					}

				} else if (operacao == 2) {
					String valorDeDepoisitoStr = JOptionPane.showInputDialog("Digite o valor do deposito: ");
					double valorDeDepoisito = Double.parseDouble(valorDeDepoisitoStr);
					try {
						cCorrente.depositar(valorDeDepoisito);
					} catch (Throwable e) {
						e.printStackTrace();
					}

				} else if (operacao == 3) {
					JOptionPane.showMessageDialog(null, cCorrente.toString());
				} else if (operacao == 0) {
					sairOk = true;
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
				}
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void operacoesContaPoupanca() {
		String agenciaContaPoupancaStr = JOptionPane.showInputDialog("Digite o numero da agência: ");
		int agencia = Integer.parseInt(agenciaContaPoupancaStr);
		String contaContaPoupancaStr = JOptionPane.showInputDialog("Digite o numero da conta: ");
		int numConta = Integer.parseInt(contaContaPoupancaStr);
		String titular = JOptionPane.showInputDialog("Digite o nome do titular: ");

		ContaPoupanca cPoupanca = (ContaPoupanca) c;

		sairOk = false;

		while (!sairOk) {

			String tipoContaStr = JOptionPane.showInputDialog(
					"Qual tipo de conta poupança deseja abrir?\nConta poupança NORMAL digite 1:\nConta poupança BLACK digite 2:");
			int tipoConta = Integer.parseInt(tipoContaStr);
			if (tipoConta == 1) {
				cPoupanca = new ContaPoupanca(agencia, numConta, titular, TipoContaCorrente.NORMAL);
				break;
			} else if (tipoConta == 2) {
				cPoupanca = new ContaPoupanca(agencia, numConta, titular, TipoContaCorrente.BLACK);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
			}
		}

		try {

			sairOk = false;

			while (!sairOk) {
				String operacaoStr = JOptionPane.showInputDialog("Por favor, digite a operação desejada"
						+ "\nSacar = 1\nDepositar = 2\nInformações da conta = 3\nSair = 0");
				int operacao = Integer.parseInt(operacaoStr);
				if (operacao == 1) {
					String valorDeSaqueStr = JOptionPane.showInputDialog("Digite o valor do saque: ");
					double valorDeSaque = Double.parseDouble(valorDeSaqueStr);
					try {
						cPoupanca.sacar(valorDeSaque);
					} catch (Throwable e) {
						e.printStackTrace();
					}
				} else if (operacao == 2) {
					String valorDeDepositoStr = JOptionPane.showInputDialog("Digite o valor do deposito: ");
					double valorDeDeposito = Double.parseDouble(valorDeDepositoStr);
					try {
						cPoupanca.depositar(valorDeDeposito);
					} catch (Throwable e) {
						e.printStackTrace();
					}
				} else if (operacao == 3) {
					JOptionPane.showMessageDialog(null, cPoupanca.toString());
				} else if (operacao == 0) {
					sairOk = true;
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
				}

			}
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}
}
