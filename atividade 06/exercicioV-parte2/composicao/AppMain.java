
public class AppMain {

	public static void main(String[] args) {
		
		Carro carro = new Carro("ModeloCarro", 2018, 5, 2, "vermelho", "MMM - 8080");
		CarroProxy carroProxy = new CarroProxy(carro);
		
		System.out.println(carroProxy);
		
		Lancha lancha = new Lancha("ModeloLancha", 2018, 5, 2, "vermelho", 4);
		LanchaProxy lanchaProxy = new LanchaProxy(lancha);
		
		System.out.println(lanchaProxy);
		
		Aviao aviao = new Aviao("ModeloAviao", 2018, 5, 2, "vermelho", 3);
		AviaoProxy aviaoProxy = new AviaoProxy(aviao);
		
		System.out.println(aviaoProxy);
	}
}
