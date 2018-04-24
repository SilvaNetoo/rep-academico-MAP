package strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,3500, 1);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA,3200, 2);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario maisUmFuncionario = new Funcionario(Funcionario.GERENTE,5000,4);
		System.out.println(maisUmFuncionario.calcularGratificacao());
	}
}