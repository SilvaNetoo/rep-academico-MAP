
public class Filho implements Familia{
	
	Pai pai;
	String email;
	
	Filho(Pai pai, String email){
		this.pai = pai;
		this.email = email;
	}
	
	public String dados() {
		return this.pai+" "+this.email;
	}
	
	
}