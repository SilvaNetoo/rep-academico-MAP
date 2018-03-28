
public class Aviao extends VeiculoModelo {
	
	private int numTurbinas;
	
	public Aviao(String modelo, int ano, int numLugares, int comprimento, String cor, int numTurbinas) {
		super(modelo, ano, numLugares, comprimento, cor);
		this.numTurbinas = numTurbinas;
	}
	
	public int getNumTurbinas() {
		return numTurbinas;
	}

	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}

	
}
