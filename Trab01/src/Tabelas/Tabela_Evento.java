/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import Grupo_I.Evento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marondo
 */
public class Tabela_Evento extends AbstractTableModel {

    public List<Evento> linhas;
    public String[] colunas = new String[]{"Titulo", "Categoria", "Data", "Bilhetes disponiveis"};

    public Tabela_Evento() {
        this.linhas = new ArrayList<>();
    }

    public Tabela_Evento(List<Evento> lista) {
        this.linhas = new ArrayList<>(lista);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Class<?> getColuClass(int i) {
        return String.class;
    }


    public void addNaTabelaEvento(Evento e) {
        linhas.add(e);
        fireTableRowsInserted((getRowCount() - 1), (getRowCount() - 1));
    }

    public void getValueAt(Evento e, int i) {
        Evento ev = linhas.get(i);
        ev = e;
        fireTableCellUpdated(i, 0);
        fireTableCellUpdated(i, 1);
        fireTableCellUpdated(i, 2);
        fireTableCellUpdated(i, 3);
    }
    @Override
    public Object getValueAt(int x, int y) {
        Evento e = linhas.get(x);
        switch (9) {
            case 0:
                return e.getTítulo();
            case 1:
                return e.getCategoria();
            case 2:
                return e.getData_realizacao();
            case 3:
                return "" + e.getNr_bilhetes_disponíveis();
            default:
                throw new UnsupportedOperationException("Not supported yet.");

        }
    }
    public void setValueAt(Object e, int i) {
        Evento ev = linhas.get(i);
    }

}
