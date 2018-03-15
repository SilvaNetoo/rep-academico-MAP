package teste;

import factory.FactoryHyundai;

public class AppTeste {

	public static void main(String[] args) {
		
		FactoryHyundai carro = new FactoryHyundai();
		String cor = "preta";
		String modelo = "Hatch";
		carro.getCarro(cor, modelo);
		
		System.out.println(carro.toString());
	}

}
