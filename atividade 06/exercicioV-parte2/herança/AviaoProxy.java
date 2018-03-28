
public class AviaoProxy {

	private Aviao aviao;
	private AviaoEspecializacao aviaoEsp;
	
	public AviaoProxy(Aviao aviao, AviaoEspecializacao aviaoEsp) {
		this.aviao = aviao;
		this.aviaoEsp = aviaoEsp;
	}

	public String getModelo(){
		return aviao.getModelo();
	}
	
	public int getAno(){
		return aviao.getAno();
	}
	
	public int getNumLugares(){
		return aviao.getNumLugares();
	}
	
	public int getComprimento(){
		return aviao.getComprimento();
	}
	
	public String getCor(){
		return aviao.getCor();
	}
	
	public int getPlaca(){
		return aviaoEsp.getNumTurbinas();
	}
	
	@Override
	public String toString() {
		return "Aviao [modelo=" + aviao.getModelo() 
		+ ", ano=" + aviao.getAno() +", numero de lugares=" + aviao.getNumLugares() 
		+", comprimento=" + aviao.getComprimento() +", cor=" + aviao.getCor() 
		+", numero de turbinas=" + aviaoEsp.getNumTurbinas()
		+ "]";
	}
	
}
