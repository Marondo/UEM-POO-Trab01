/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis_Centro;

import Grupo_I.Admin;
import Grupo_I.Cliente;
import Grupo_I.Evento;
import Grupo_I.Eventos_de_Clientes;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marondo
 */
public class pCliente extends javax.swing.JPanel {

    Evento evento = new Evento();
    Admin admin = new Admin();
    Cliente cliente = new Cliente();
    public Cliente cliente_AUX = new Cliente();
    Eventos_de_Clientes ev_cli = new Eventos_de_Clientes();

    public pCliente() {
        initComponents();
        rdoDisponivel.setSelected(true);
        showTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblQuant = new javax.swing.JLabel();
        lblDat = new javax.swing.JLabel();
        pBaixo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoTodos = new javax.swing.JRadioButton();
        rdoDisponivel = new javax.swing.JRadioButton();
        rdoIndisponivel = new javax.swing.JRadioButton();
        pTabela = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnReservar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Titulo . . . . . .:");

        lblCat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCat.setForeground(new java.awt.Color(255, 204, 0));
        lblCat.setText("...");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Bilhetes disp . . . . .:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Categoria . . .:");

        lblTit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTit.setForeground(new java.awt.Color(255, 204, 0));
        lblTit.setText("...");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Data/Realizacao . .:");

        lblQuant.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQuant.setForeground(new java.awt.Color(255, 204, 0));
        lblQuant.setText("...");

        lblDat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDat.setForeground(new java.awt.Color(255, 204, 0));
        lblDat.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTit)
                    .addComponent(lblCat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuant)
                    .addComponent(lblDat))
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblDat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQuant)
                                    .addComponent(jLabel4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pBaixo.setBackground(new java.awt.Color(0, 102, 102));
        pBaixo.setPreferredSize(new java.awt.Dimension(810, 173));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Listar eventos");

        rdoTodos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdoTodos.setForeground(new java.awt.Color(0, 255, 255));
        rdoTodos.setText("Todos");
        rdoTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTodosActionPerformed(evt);
            }
        });

        rdoDisponivel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdoDisponivel.setForeground(new java.awt.Color(0, 255, 255));
        rdoDisponivel.setText("Disponíveis");
        rdoDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDisponivelActionPerformed(evt);
            }
        });

        rdoIndisponivel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdoIndisponivel.setForeground(new java.awt.Color(0, 255, 255));
        rdoIndisponivel.setText("Esgotados");
        rdoIndisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoIndisponivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdoTodos)
                .addGap(13, 13, 13)
                .addComponent(rdoDisponivel)
                .addGap(10, 10, 10)
                .addComponent(rdoIndisponivel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rdoIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rdoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rdoTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pTabela.setBackground(new java.awt.Color(0, 102, 102));
        pTabela.setPreferredSize(new java.awt.Dimension(810, 136));

        javax.swing.GroupLayout pBaixoLayout = new javax.swing.GroupLayout(pBaixo);
        pBaixo.setLayout(pBaixoLayout);
        pBaixoLayout.setHorizontalGroup(
            pBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pBaixoLayout.setVerticalGroup(
            pBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBaixoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pBaixo, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        btnReservar.setBackground(new java.awt.Color(51, 0, 153));
        btnReservar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(0, 153, 153));
        btnReservar.setText("Reservar bilhete");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jPanel3.add(btnReservar);

        btnPesquisar.setBackground(new java.awt.Color(51, 0, 153));
        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 153, 153));
        btnPesquisar.setText("Pesquisar por um Evento");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(btnPesquisar);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void rdoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTodosActionPerformed
        rdoDisponivel.setSelected(false);
        rdoTodos.setSelected(true);
        rdoIndisponivel.setSelected(false);
        showTabela();
    }//GEN-LAST:event_rdoTodosActionPerformed

    private void rdoDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDisponivelActionPerformed
        rdoIndisponivel.setSelected(false);
        rdoTodos.setSelected(false);
        rdoDisponivel.setSelected(true);
        showTabela();
    }//GEN-LAST:event_rdoDisponivelActionPerformed

    private void rdoIndisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoIndisponivelActionPerformed
        rdoDisponivel.setSelected(false);
        rdoTodos.setSelected(false);
        rdoIndisponivel.setSelected(true);
        showTabela();;
    }//GEN-LAST:event_rdoIndisponivelActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        actualiza_listas();
        String tit = JOptionPane.showInputDialog("Titulo do evento?");
        if (tit != null) {
            if (tit.length() > 0) {
                for (Evento e : lista_de_eventos) {
                    if (e.getTítulo().equalsIgnoreCase(tit)) {
                        lblTit.setText(e.getTítulo());
                        lblCat.setText(e.getCategoria());
                        lblDat.setText(e.getData_realizacao());
                        lblQuant.setText("" + e.getNr_bilhetes_disponíveis());
                        tit = "";
                        break;
                    }
                }
                if (tit != "") {
                    JOptionPane.showMessageDialog(null, "Nao encontrado!");
                }
                /*
                evento.setNome(cat);
                admin.addCategoria(categoria);*/
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed
    Evento ev, evaux;

    private void encotrei(int i) {

        int agora = ev.getNr_bilhetes_disponíveis();
        try {
            int bilh = Integer.parseInt(JOptionPane.showInputDialog("Insira a qunat. de bilhetes!"));
            if (agora >= bilh) {
                agora = agora - bilh;
                ev.setNr_bilhetes_disponíveis(ev.getNr_bilhetes_disponíveis() - bilh);
                if (ev != null) {
                    ev.setNr_bilhetes_disponíveis(agora);
                    lista_de_eventos.set(i, ev);
                    admin.grava_Evento_Actualizado(lista_de_eventos);
                    ///////////////////////////
                    evento = ev;
                    evento.setNr_bilhetes_disponíveis(bilh);
                    ev_cli.setCliente(cliente_AUX);
                    ev_cli.setEvento(evento);
                    ev_cli.addEv_Cli(ev_cli);
                    //////////////////////////
                    showTabela();
                    JOptionPane.showMessageDialog(null, "Guardado!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "So restou: " + ev.getNr_bilhetes_disponíveis() + " bilhetes.");
            }
        } catch (Exception e) {

        }
    }
    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        actualiza_listas();
        int i = 0;
        String tit = JOptionPane.showInputDialog("Insira o titulo do evento!");
        if (tit != null) {
            if (tit.length() > 0) {
                for (Evento e : lista_de_eventos) {
                    if (e.getTítulo().equalsIgnoreCase(tit)) {
                        ev = lista_de_eventos.get(i);
                        lblTit.setText(e.getTítulo());
                        lblCat.setText(e.getCategoria());
                        lblDat.setText(e.getData_realizacao());
                        lblQuant.setText("" + e.getNr_bilhetes_disponíveis());
                        tit = "";
                        if (e.getEstado().equalsIgnoreCase("activo")) {
                            encotrei(i);
                        } else {
                            JOptionPane.showMessageDialog(null, "Expirou! " + e.getEstado());
                        }
                        break;
                    } else {
                        i++;
                    }
                }
                if (tit != "") {
                    JOptionPane.showMessageDialog(null, "Nao encontrado! Talvez ja tenha se esgotado.");
                }
            }
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    public ArrayList<Evento> lista_de_eventos = new ArrayList<>();
    public ArrayList<Eventos_de_Clientes> lista_de_ev_cli = new ArrayList<>();

    public void actualiza_listas() {
        lista_de_eventos = new Admin().actualizalista_de_eventos();
        lista_de_ev_cli = ev_cli.actualiza_lista_Ev_Cli();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblDat;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblTit;
    private javax.swing.JPanel pBaixo;
    private javax.swing.JPanel pTabela;
    private javax.swing.JRadioButton rdoDisponivel;
    private javax.swing.JRadioButton rdoIndisponivel;
    private javax.swing.JRadioButton rdoTodos;
    // End of variables declaration//GEN-END:variables

    public String[] colunas = new String[]{"Titulo", "Categoria", "Data da realizacao", "Quant. de bilhetes disponiveis"};
    JScrollPane rolagem = new JScrollPane();
    JPanel pListar = new JPanel(new FlowLayout());

    public void showTabela() {
        actualiza_listas();
        List<Evento> lista = lista_de_eventos;
        String txt = "";
        DefaultTableModel modeloActivo = new DefaultTableModel(colunas, 0);
        JTable tabelaActivo = new JTable(modeloActivo);

        tabelaActivo.setModel(modeloActivo);
        pListar.setPreferredSize(new Dimension(810, 140));
        tabelaActivo.setPreferredScrollableViewportSize(new Dimension(800, 105));
        rolagem.setViewportView(tabelaActivo);
        tabelaActivo.setGridColor(Color.GREEN);
        pListar.add(rolagem);
        tabelaActivo.setShowHorizontalLines(true);

        int d = 1, id = 1;

        if (lista != null) {

            for (Evento ob : lista) {
                if (rdoDisponivel.isSelected()) {
                    if (ob.getEstado().equalsIgnoreCase("activo")) {
                        modeloActivo.addRow(new Object[]{
                            "  " + ob.getTítulo(), ob.getCategoria(),
                            ob.getData_realizacao(), "    " + ob.getNr_bilhetes_disponíveis() + ""});
                        id++;
                    }
                    txt = ("[ Total: activos: " + (id - 1) + " ]");
                } else if (rdoIndisponivel.isSelected()) {
                    if (ob.getEstado().equalsIgnoreCase("desactivo")) {
                        modeloActivo.addRow(new Object[]{
                            "  " + ob.getTítulo(), ob.getCategoria(),
                            ob.getData_realizacao(), "    " + ob.getNr_bilhetes_disponíveis() + ""});
                        d++;
                    }
                    txt = ("[ Total: desactivos: " + (d - 1) + " ]");
                } else if (rdoTodos.isSelected()) {
                    modeloActivo.addRow(new Object[]{
                        "  " + ob.getTítulo(), ob.getCategoria(),
                        ob.getData_realizacao(), "    " + ob.getNr_bilhetes_disponíveis() + ""});
                    d++;
                    txt = ("[ Total: desactivos: " + (d - 1) + " ]");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }

        pTabela.add(pListar, "tabela");
    }
    /*-----------------------------------------------------------------------*/

}
