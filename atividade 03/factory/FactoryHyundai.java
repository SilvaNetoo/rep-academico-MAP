package factory;

import classes.Carro;
import classes.Hatch;
import classes.Sedan;

public class FactoryHyundai {

	public Carro getCarro(String cor, String modelo) {
		if(modelo.equals("Hatch")) {
			return new Hatch(cor);
		}
		if(modelo.equals("Sedan")) {
			return new Sedan(cor);
		}
		
		return null;
	}
	
	
	
}
