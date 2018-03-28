
public class AppMain {

	public static void main(String[] args) {
		
		Carro carro = new Carro("ModeloCarro", 2018, 5, 2, "vermelho");
		CarroEspecializacao carroEsp = new CarroEspecializacao("MMM - 8080");
		CarroProxy carroProxy = new CarroProxy(carro, carroEsp);
		
		System.out.println(carroProxy);
		
		Lancha lancha = new Lancha("ModeloLancha", 2018, 5, 2, "vermelho");
		LanchaEspecializacao lanchaEsp = new LanchaEspecializacao(4);
		LanchaProxy lanchaProxy = new LanchaProxy(lancha, lanchaEsp);
		
		System.out.println(lanchaProxy);
		
		Aviao aviao = new Aviao("ModeloAviao", 2018, 5, 2, "vermelho");
		AviaoEspecializacao aviaoEsp = new AviaoEspecializacao(4);
		AviaoProxy aviaoProxy = new AviaoProxy(aviao, aviaoEsp);
		
		System.out.println(aviaoProxy);
	}
}
