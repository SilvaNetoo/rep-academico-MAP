
public class Main {
	
	public static void main(String[] args) {
		Pai pai = new Pai("Erivaldo",45);
		Filho filho = new Filho(pai,"Silva@email.com");
		System.out.println("Dados do pai "+pai.dados()+ " dados do filho "+ filho.dados());
		
	}
	
}
