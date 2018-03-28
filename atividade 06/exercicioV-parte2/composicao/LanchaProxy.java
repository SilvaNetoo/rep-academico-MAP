
public class LanchaProxy {

	private Lancha lancha;
	
	public LanchaProxy(Lancha lancha) {
		this.lancha = lancha;
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
	
	public int getNumMotores(){
		return lancha.getNumMotores();
	}
	
	@Override
	public String toString() {
		return "Lancha [modelo=" + lancha.getModelo() 
		+ ", ano=" + lancha.getAno() +", numero de lugares=" + lancha.getNumLugares() 
		+", comprimento=" + lancha.getComprimento() +", cor=" + lancha.getCor() 
		+", numero de motores=" + lancha.getNumMotores() 
		+ "]";
	}
	
}
