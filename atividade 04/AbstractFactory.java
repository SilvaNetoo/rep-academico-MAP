
public class AbstractFactory {
	
	private static AbstractFactory abstractFac = new AbstractFactory();
	private static int count = 0;
	private static int numero;

	private AbstractFactory() {
	}
	
	public static AbstractFactory getIncremental() {
		return abstractFac;
	}

	public String toString() {
		return "abstractFactory " + numero;
	}
	
	public static void getCount(){
		numero = ++count;
	}
	
}