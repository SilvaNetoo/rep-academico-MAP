
public class TesteSingleton {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Singleton inc = Singleton.getIncremental();
			inc.getCount();
			System.out.println(inc);
		}
	}
}
