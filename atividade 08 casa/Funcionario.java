package strategy;

public class Funcionario {
	protected double salarioBase;
	protected Cargo cargo;
	protected int nivel;
	private double estrategiaDeGratificacao;

	public Funcionario(Cargo cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		switch (cargo) {
		case DESENVOLVEDOR:
			this.cargo = Cargo.DESENVOLVEDOR;
			break;
		case DBA:
			this.cargo = Cargo.DBA;
			break;
		case LIDER:
			this.cargo = Cargo.LIDER;
			break;
		case GERENTE:
			this.cargo = Cargo.GERENTE;
			break;
		default:
			throw new RuntimeException("Cargo não encontrado :/");
		}
	}

	public double calcularGratificacao() {
		return cargo.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public int getNivel() {
		return nivel;
	}
}