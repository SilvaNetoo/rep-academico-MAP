package strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,2100, 1);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA,1700, 2);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario maisUmFuncionario = new Funcionario(Funcionario.GERENTE,4000,4);
		System.out.println(maisUmFuncionario.calcularGratificacao());
	}
}