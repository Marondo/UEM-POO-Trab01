/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo_I;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Eventos_de_Clientes implements Serializable {

    private Evento evento;
    private Cliente cliente;

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Eventos_de_Clientes> lista_ec = new ArrayList<>();
    Conexao con = new Conexao();
    String caminho_ev_cl = "Eventos_de_Clientes.txt";

    /*-------------ADD------------*/
    public void addEv_Cli(Eventos_de_Clientes ec) {
        lista_ec.add(ec);
        try {
            con.cmd_grava_ev_cli(caminho_ev_cl, ec);
            actualiza_lista_Ev_Cli();
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Porblemas na gravacao ao BD Ev_Cli!");
        }
    }

    /*-------------ACTUALIZA LISTAS------------*/
    public ArrayList<Eventos_de_Clientes> actualiza_lista_Ev_Cli() {
        try {
            lista_ec = con.cmd_le__ev_cli(caminho_ev_cl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porblemas na conexao ao BD Ev_Cli");
        }
        return lista_ec;
    }

    public void grava_Ev_Cli_Actualizado(int pos, Eventos_de_Clientes ec) {
        try {
            lista_ec.set(pos, ec);
            con.cmd_grava_Ev_Cli_Actualizado(caminho_ev_cl, lista_ec);
            actualiza_lista_Ev_Cli();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porblemas na actualizacao ao BD Ev_Cli!");
        }
    }

    public Cliente quemEntrou(Cliente c) {
        return c;
    }
}
