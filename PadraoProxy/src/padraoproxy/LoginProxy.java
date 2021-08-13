package padraoproxy;

public class LoginProxy extends BancoDeLogin {
    
    protected String usuario;
    protected String senha;

    public LoginProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    @Override
    public String getNumeroDeUsuarios() {
        if (temPermissaoDeAcesso()) {
            return super.getNumeroDeUsuarios();
        }
        return "Tente novamente";
    }
    
    @Override
    public String getUsuariosConectados() {
        if(temPermissaoDeAcesso()) {
            return super.getUsuariosConectados();
        }
        return "";
    }
    
    private boolean temPermissaoDeAcesso() {
        return usuario == "Login" && senha == "7913";
    }
}
