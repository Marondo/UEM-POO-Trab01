
package Grupo_I;

import java.io.Serializable;

/**
 *
 * @author Marondo
 */
public class Cliente implements Serializable{
    private String user;
    private String pass ;

    public Cliente() {
    }

    public Cliente(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return  "| Nome: "+getUser()+" | Senha: "+getPass();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    } 
}
