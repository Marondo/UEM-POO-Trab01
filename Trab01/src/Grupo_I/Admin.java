
package Grupo_I;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marondo
 */
public class Admin implements Serializable {

    private String user = "admin";
    private String pass = "admin";
    public ArrayList<Cliente> lista_de_clientes = new ArrayList<>();
    public ArrayList<Evento> lista_de_eventos = new ArrayList<>();
    public ArrayList<Categoria> lista_de_categorias = new ArrayList<>();

    Conexao con = new Conexao();
    String caminho_cl = "Clientes.txt";
    String caminho_ev = "Eventos.txt";
    String caminho_cat = "Categorias.txt";
    
    Cliente cliente = new Cliente();
    Evento evento = new Evento();

    public Admin() {
    }

    public Admin(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return user;
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

    /*-------------ADD------------*/
    public void addCliente(Cliente c) {
        lista_de_clientes.add(c);
        try {
            con.cmd_grava_Cliente(caminho_cl, c);
                    JOptionPane.showMessageDialog(null, "Evento Salvo!");
            actualizalista_de_clientes();
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Porblemas na gravacao ao BD Cliente!");
        }
    }

    public void addEvento(Evento e) {
        lista_de_eventos.add(e);
        try {
            con.cmd_grava_Evento(caminho_ev, e);
            actualizalista_de_eventos();
                    JOptionPane.showMessageDialog(null, "Evento Salvo!");
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Porblemas na gravacao ao BD Eventos!");
        }
    }
    public void addCategoria(Categoria c) {
        lista_de_categorias.add(c);
        try {
            con.cmd_grava_Categoria(caminho_cat, c);
            actualizalista_de_categorias();
                    JOptionPane.showMessageDialog(null, "Categpria Salvo!");
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Porblemas na gravacao ao BD Categoria!");
        }
    }

    /*-------------ACTUALIZA LISTAS------------*/
    public ArrayList<Cliente> actualizalista_de_clientes() {
        try {
            lista_de_clientes = con.cmd_le_Cliente(caminho_cl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porblemas na conexao ao BD Cliente");
        }
        return lista_de_clientes;
    }

    public ArrayList<Evento> actualizalista_de_eventos() {
        try {
            lista_de_eventos = con.cmd_le__Eventos(caminho_ev);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porblemas na conexao ao BD Eventos");
        }
        return lista_de_eventos;
    }
    public ArrayList<Categoria> actualizalista_de_categorias() {
        try {
            lista_de_categorias = con.cmd_le__Categoria(caminho_cat);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porblemas na conexao ao BD Categorias");
        }
        return lista_de_categorias;
    }

    /*-------------GRAVA ACTUALIZACOES------------*/
    private void grava_Cliente_Actualizado(int pos) {
        try {
            lista_de_clientes.set(pos, cliente);
            con.cmd_grava_Cliente_Actualizado(caminho_cl, lista_de_clientes);
            actualizalista_de_clientes();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porblemas na actualizacao ao BD Cliente");
        }
    }
    
    public void grava_Evento_Actualizado(ArrayList<Evento> lista) {
        try {
           // lista_de_eventos.set(pos, ev);
            con.cmd_grava_Evento_Actualizado(caminho_ev, lista);
            actualizalista_de_eventos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porblemas na actualizacao ao BD Evento. "+e);
        }
    }
}
