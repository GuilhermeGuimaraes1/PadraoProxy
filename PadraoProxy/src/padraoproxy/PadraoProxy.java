
package padraoproxy;

public class PadraoProxy {

    public static void main(String[] args) {
        System.out.println("Acesso negado");
        BancoDeLogin login = new LoginProxy("123", "123");
        System.out.println(login.getNumeroDeUsuarios());
        System.out.println(login.getUsuariosConectados());
        
        System.out.println("\nAdminstrador acessando");
        login = new LoginProxy("Login", "7913");
        System.out.println(login.getNumeroDeUsuarios());
        System.out.println(login.getUsuariosConectados());
    }
    
}
