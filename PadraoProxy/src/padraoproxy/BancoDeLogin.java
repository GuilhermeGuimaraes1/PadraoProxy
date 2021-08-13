/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoproxy;

/**
 *
 * @author Guilherme
 */
public class BancoDeLogin {
    private int qtdDeUsuario;
    private int usuariosConectados;

    public BancoDeLogin() {
        
        qtdDeUsuario = (int) (Math.random() * 100);
        usuariosConectados = (int) (Math.random() * 10);
    }
    
    public String getNumeroDeUsuarios() {
        return new String("Total de usuários: " + qtdDeUsuario);
    }
    
    public String getUsuariosConectados() {
        return new String("Usuários conectados: " + usuariosConectados);
    }  
}
