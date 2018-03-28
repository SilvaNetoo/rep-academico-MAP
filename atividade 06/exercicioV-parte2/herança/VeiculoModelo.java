
public abstract class VeiculoModelo {
	
	private String modelo;
	private int ano;
	private int numLugares;
	private int comprimento;
	private String cor;
	
	public VeiculoModelo(String modelo, int ano, int numLugares, int comprimento, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.numLugares = numLugares;
		this.comprimento = comprimento;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumLugares() {
		return numLugares;
	}

	public void setNumLugares(int numLugares) {
		this.numLugares = numLugares;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}	

}
