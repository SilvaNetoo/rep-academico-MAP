
public class TesteAbstractFactory {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			AbstractFactory inc = AbstractFactory.getIncremental();
			inc.getCount();
			System.out.println(inc);
		}
	}
}
