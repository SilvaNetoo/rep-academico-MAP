
public interface BancoUsuarios {
	
	int quantidadeDeUsuarios = (int) (Math.random() * 100);
	int usuariosConectados = (int) (Math.random() * 10);

	public static String getNumeroDeUsuarios() {
		return new String("Total de usuários: " + quantidadeDeUsuarios);
	}

	public static String getUsuariosConectados() {
		return new String("Usuários conectados: " + usuariosConectados);
	}
}
