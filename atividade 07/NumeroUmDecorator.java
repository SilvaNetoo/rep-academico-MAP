
public class NumeroUmDecorator implements Adicionavel{
	
	private NumeroUm numeroUm;
	
	public NumeroUmDecorator(NumeroUm numeroUm){
		this.numeroUm = numeroUm;
	}

	@Override
	public String getAdicao() {
		return this.numeroUm.toString();
	}
	
	

}
