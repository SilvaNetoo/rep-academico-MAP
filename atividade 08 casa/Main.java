package strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Cargo.DESENVOLVEDOR, 3000);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario funcionarioGerente = new Funcionario(Cargo.GERENTE, 5000);
		System.out.println(funcionarioGerente.calcularGratificacao());
	
		Funcionario outroFuncionario = new Funcionario(Cargo.DBA, 3000);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario funcionarioLider = new Funcionario(Cargo.LIDER, 8000);
		System.out.println(funcionarioLider.calcularGratificacao());
		
	}
}