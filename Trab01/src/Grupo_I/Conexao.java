package Grupo_I;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Conexao implements Serializable {

    List<Cliente> lista_Clientes = new ArrayList<>();
    List<Evento> lista_Eventos = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public void cmd_grava_Cliente(String caminho, Cliente ob) throws ClassNotFoundException {
        try {
            if (ob != null) {
                ObjectOutputStream oos;
                lista_Clientes.add(ob);
                oos = new ObjectOutputStream(new FileOutputStream(caminho));
                oos.writeObject(lista_Clientes);
                oos.close();
            } else {
                System.out.println("O objecto a gravar nao deve ser nulo!");
            }
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Cliente: " + fnf);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Cliente: " + ioe);
        }
    }

    public void cmd_grava_Cliente_Actualizado(String caminho, List<Cliente> lista) throws
            ClassNotFoundException {
        //lst = null;
        try {
            if (lista != null) {
                ObjectOutputStream oos;
                //lst = lista;
                oos = new ObjectOutputStream(new FileOutputStream(caminho));
                oos.reset();
                oos.writeObject(lista);
                oos.close();
            } else {
                System.out.println("O objecto a gravar nao deve ser nulo!");
            }
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Cliente_Actualizado: " + fnf);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Cliente_Actualizado: " + ioe);
        }
    }

    public ArrayList<Cliente> cmd_le_Cliente(String caminho) throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Cliente> lista = new ArrayList<>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho));
        lista_Clientes = (ArrayList<Cliente>) ois.readObject();
        int i = 0;
        try {
            for (Cliente obj : lista_Clientes) {
                lista.add(obj);
                i++;
            }

        } catch (Exception ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_le_Cliente: " + ioe);
        } finally {
            ois.close();
        }
        return lista;
    }

    /**
     * *************************************
     */
    @SuppressWarnings("unchecked")
    public void cmd_grava_Evento(String caminho, Evento ob) throws ClassNotFoundException {
        try {
            if (ob != null) {
                ObjectOutputStream oos;
                lista_Eventos.add(ob);
                oos = new ObjectOutputStream(new FileOutputStream(caminho));
                oos.writeObject(lista_Eventos);
                oos.close();
            } else {
                System.out.println("O objecto a gravar nao deve ser nulo!");
            }
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Evento: " + fnf);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Evento: " + ioe);
        }
    }

    public void cmd_grava_Evento_Actualizado(String caminho, List<Evento> lista) throws
            ClassNotFoundException {
        //lst = null;
        try {
            if (lista != null) {
                ObjectOutputStream oos;
                //lst = lista;
                oos = new ObjectOutputStream(new FileOutputStream(caminho));
                oos.reset();
                oos.writeObject(lista);
                oos.close();
            } else {
                System.out.println("O objecto a gravar nao deve ser nulo!");
            }
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Evento_Actualizado: " + fnf);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Evento_Actualizado: " + ioe);
        }
    }

    public ArrayList<Evento> cmd_le__Eventos(String caminho) throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Evento> lista = new ArrayList<>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho));
        lista_Eventos = (ArrayList<Evento>) ois.readObject();
        try {
            for (Evento obj : lista_Eventos) {
                lista.add(obj);
            }

        } catch (Exception ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_le__Eventos: " + ioe);
        } finally {
            ois.close();
        }
        return lista;
    }

    /*----------CATEGORIA-------------*/
    List<Categoria> lista_Categorias = new ArrayList<>();

    public void cmd_grava_Categoria(String caminho, Categoria c) throws ClassNotFoundException {
        try {
            if (c != null) {
                ObjectOutputStream oos;
                lista_Categorias.add(c);
                oos = new ObjectOutputStream(new FileOutputStream(caminho));
                oos.writeObject(lista_Categorias);
                oos.close();
            } else {
                System.out.println("O objecto a gravar nao deve ser nulo!");
            }
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Categoria: " + fnf);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Categoria: " + ioe);
        }
    }

    public ArrayList<Categoria> cmd_le__Categoria(String caminho) throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Categoria> lista = new ArrayList<>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho));
        lista_Categorias = (ArrayList<Categoria>) ois.readObject();
        try {
            for (Categoria obj : lista_Categorias) {
                lista.add(obj);
            }

        } catch (Exception ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_le_Categorias: " + ioe);
        } finally {
            ois.close();
        }
        return lista;
    }
    /*----------EVENTO_DE_CLIENTES-------------*/
    List<Eventos_de_Clientes> lista_ec = new ArrayList<>();

    public void cmd_grava_ev_cli(String caminho, Eventos_de_Clientes ec) throws ClassNotFoundException {
        try {
            if (ec != null) {
                ObjectOutputStream oos;
                lista_ec.add(ec);
                oos = new ObjectOutputStream(new FileOutputStream(caminho));
                oos.writeObject(lista_ec);
                oos.close();
            } else {
                System.out.println("Evento de cliente nulo!");
            }
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Ev_Cli: " + fnf);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Ev_Cli: " + ioe);
        }
    }

    public ArrayList<Eventos_de_Clientes> cmd_le__ev_cli(String caminho) throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Eventos_de_Clientes> lista = new ArrayList<>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho));
        lista_ec = (ArrayList<Eventos_de_Clientes>) ois.readObject();
        try {
            for (Eventos_de_Clientes obj : lista_ec) {
                lista.add(obj);
            }

        } catch (Exception ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_le_Ev_Cli: " + ioe);
        } finally {
            ois.close();
        }
        return lista;
    }
    public void cmd_grava_Ev_Cli_Actualizado(String caminho, List<Eventos_de_Clientes> lista) throws
            ClassNotFoundException {
        try {
            if (lista != null) {
                ObjectOutputStream oos;
                oos = new ObjectOutputStream(new FileOutputStream(caminho));
                oos.reset();
                oos.writeObject(lista);
                oos.close();
            } else {
                System.out.println("Nao actualizado! Nulo!");
            }
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Ev_Cli_Actualizado: " + fnf);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No cmd_grava_Ev_Cli_Actualizado: " + ioe);
        }
    }

}
