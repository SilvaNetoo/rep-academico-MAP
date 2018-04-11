
public class Chaves implements Adicionavel{

	private Adicionavel adicionavel;
	
	public Chaves(Adicionavel adicionavel){
		this.adicionavel = adicionavel;
	}
	
	@Override
	public String getAdicao() {
		return "{"+this.adicionavel.getAdicao()+"}";
	}
	
}
