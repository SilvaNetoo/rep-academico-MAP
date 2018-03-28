
public class LanchaProxy {

	private Lancha lancha;
	private LanchaEspecializacao lanchaEsp;
	
	public LanchaProxy(Lancha lancha, LanchaEspecializacao lanchaEsp) {
		this.lancha = lancha;
		this.lanchaEsp = lanchaEsp;
	}

	
	public String getModelo(){
		return lancha.getModelo();
	}
	
	public int getAno(){
		return lancha.getAno();
	}
	
	public int getNumLugares(){
		return lancha.getNumLugares();
	}
	
	public int getComprimento(){
		return lancha.getComprimento();
	}
	
	public String getCor(){
		return lancha.getCor();
	}
	
	public int getPlaca(){
		return lanchaEsp.getNumMotores();
	}
	
	@Override
	public String toString() {
		return "Lancha [modelo=" + lancha.getModelo() 
		+ ", ano=" + lancha.getAno() +", numero de lugares=" + lancha.getNumLugares() 
		+", comprimento=" + lancha.getComprimento() +", cor=" + lancha.getCor() 
		+", numero de motores=" + lanchaEsp.getNumMotores() 
		+ "]";
	}
	
}
