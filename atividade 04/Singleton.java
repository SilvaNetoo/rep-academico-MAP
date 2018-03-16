
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	private static int count = 0;
	private static int numero;

	private Singleton() {
	}
	
	public static Singleton getIncremental() {
		return singleton;
	}

	public String toString() {
		return "Singleton " + numero;
	}
	
	public static void getCount(){
		numero = ++count;
	}
	
}