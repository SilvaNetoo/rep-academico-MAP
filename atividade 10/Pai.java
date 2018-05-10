
public class Pai implements Familia{
	
	String nome;
	int idade;
	
	Pai(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String dados() {
		return this.nome+" "+this.idade;
	}
	
}