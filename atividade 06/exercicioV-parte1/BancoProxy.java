
public class BancoProxy implements BancoUsuarios {

	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return BancoUsuarios.getNumeroDeUsuarios();
		}
		return null;
	}

	
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return BancoUsuarios.getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
