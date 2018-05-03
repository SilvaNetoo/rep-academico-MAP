package template;

public class Main {

	public static void main(String[] args) {
		CapitalStrategy capital1 = new CapitalStrategyAdvisedLine();
		capital1.capital();
		CapitalStrategy capital2 = new CapitalStrategyRevolver();
		capital2.capital();
		CapitalStrategy capital3 = new CapitalStrategyTermLoan();
		capital3.capital();
	}

}
