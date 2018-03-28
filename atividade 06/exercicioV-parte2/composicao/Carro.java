
public class Carro extends VeiculoModelo {
	
	private String placa;

	public Carro(String modelo, int ano, int numLugares, int comprimento, String cor, String placa) {
		super(modelo, ano, numLugares, comprimento, cor);
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
