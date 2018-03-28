
public class Lancha extends VeiculoModelo {
	
	private int numMotores;

	public Lancha(String modelo, int ano, int numLugares, int comprimento, String cor, int numMotores) {
		super(modelo, ano, numLugares, comprimento, cor);
		this.numMotores = numMotores;
	}
	
	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

}
