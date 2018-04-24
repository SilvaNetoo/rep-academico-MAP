package strategy;

public class GratificacaoDesenvolvedor implements Gratificacao {
            @Override
            public double calcularGratificacao(Funcionario umFuncionario) {
                  if (umFuncionario.getNivel() >= 2) {
                      return umFuncionario.getSalarioBase() * 1.25;
                  }
                  return umFuncionario.getSalarioBase() * 1.15;
            }
}