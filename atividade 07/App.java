
public class App {

	public static void main(String[] args) {
		
		NumeroUm numeroUm = new NumeroUm();
		Adicionavel numeroUmDecorator = new NumeroUmDecorator(numeroUm);
		numeroUmDecorator = new Colchete(numeroUmDecorator);
		numeroUmDecorator = new Chaves(numeroUmDecorator);
		numeroUmDecorator = new Chaves(numeroUmDecorator);
		numeroUmDecorator = new Colchete(numeroUmDecorator);
		numeroUmDecorator = new Colchete(numeroUmDecorator);
		System.out.println(numeroUmDecorator.getAdicao());
		
	}
}
