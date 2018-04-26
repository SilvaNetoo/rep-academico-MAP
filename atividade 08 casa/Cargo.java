package strategy;

public enum Cargo implements Strategy {

	DESENVOLVEDOR {
		public double calcularGratificacao(Funcionario funcionario) {
			if (funcionario.getNivel() >= 2) {
				return funcionario.getSalarioBase() * 1.25;
			}
			return funcionario.getSalarioBase() * 1.15;
		}
	},
	DBA {
		public double calcularGratificacao(Funcionario funcionario) {
			if (funcionario.getNivel() >= 2) {
				return funcionario.getSalarioBase() * 1.25;
			}
			return funcionario.getSalarioBase() * 1.15;
		}
	},
	LIDER {
		public double calcularGratificacao(Funcionario funcionario) {
			if (funcionario.getNivel() >= 2) {
				return funcionario.getSalarioBase() * 1.35;
			}
			return funcionario.getSalarioBase() * 1.25;
		}
	},
	GERENTE {
		public double calcularGratificacao(Funcionario funcionario) {
			if (funcionario.getNivel() >= 2) {
				return funcionario.getSalarioBase() * 1.45;
			}
			return funcionario.getSalarioBase() * 1.30;
		}
	}

}
