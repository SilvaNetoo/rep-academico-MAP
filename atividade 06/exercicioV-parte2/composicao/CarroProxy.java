
public class CarroProxy {

	private Carro carro;
	
	public CarroProxy(Carro carro) {
		this.carro = carro;
	}
	
	public String getModelo(){
		return carro.getModelo();
	}
	
	public int getAno(){
		return carro.getAno();
	}
	
	public int getNumLugares(){
		return carro.getNumLugares();
	}
	
	public int getComprimento(){
		return carro.getComprimento();
	}
	
	public String getCor(){
		return carro.getCor();
	}
	
	public String getPlaca(){
		return carro.getPlaca();
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + carro.getModelo() 
		+ ", ano=" + carro.getAno() +", numero de lugares=" + carro.getNumLugares() 
		+", comprimento=" + carro.getComprimento() +", cor=" + carro.getCor() 
		+", placa=" + carro.getPlaca() 
		+ "]";
	}
	
	
}
