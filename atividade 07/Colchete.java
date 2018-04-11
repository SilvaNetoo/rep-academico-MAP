
public class Colchete implements Adicionavel {

	private Adicionavel adicionavel;
	
	public Colchete(Adicionavel adicionavel){
		this.adicionavel = adicionavel;
	}

	@Override
	public String getAdicao() {
		return "[" + this.adicionavel.getAdicao()+"]";
	}

	
}
