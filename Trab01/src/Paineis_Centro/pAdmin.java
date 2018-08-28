/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis_Centro;

import Grupo_I.Admin;
import Grupo_I.Categoria;
import Grupo_I.Cliente;
import Grupo_I.Evento;
import Grupo_I.Eventos_de_Clientes;
import Paineis_Sul.Valida;
import Paineis_Sul.pErro;
import com.sun.security.ntlm.Client;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marondo
 */
public class pAdmin extends javax.swing.JPanel implements Serializable {

    Admin admin = new Admin();
    Cliente cliente = new Cliente();
    Evento evento = new Evento();
    Categoria categoria = new Categoria();

    pCliente pCl = new pCliente();
    pErro erro = new pErro();
    Valida valida = new Valida();

    private void lista_pCliente() {
        pCl.lista_de_eventos = new Admin().actualizalista_de_eventos();
    }
    private ArrayList<Cliente> lista_de_clientes = new ArrayList<>();
    private ArrayList<Evento> lista_de_eventos = new ArrayList<>();
    private ArrayList<Evento> lista_de_ev_cli = new ArrayList<>();
    private ArrayList<Categoria> lista_de_categorias = new ArrayList<>();

    public pAdmin() {
        initComponents();
        preencher_Cbos();
        rdoTodos.setSelected(true);
        abilitar(false);
        actualiza_listas();
        preenche_cbo_clientes();
        preenche_cbo_categoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pNorte = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rdoClientes = new javax.swing.JRadioButton();
        rdoEventos = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pEventos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox<>();
        cboMes = new javax.swing.JComboBox<>();
        cboAno = new javax.swing.JComboBox<>();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuantBil = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAddCategoria = new javax.swing.JButton();
        pTab = new javax.swing.JPanel();
        pChek = new javax.swing.JPanel();
        rdoDisponivel = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        cboClientes = new javax.swing.JComboBox<>();
        pTabela = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoTodos = new javax.swing.JRadioButton();
        rdoIndisponivel = new javax.swing.JRadioButton();
        pCentro = new javax.swing.JPanel();
        btnAddEvento = new javax.swing.JButton();
        btnLipar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(810, 371));
        setPreferredSize(new java.awt.Dimension(810, 371));
        setLayout(new java.awt.BorderLayout());

        pNorte.setBackground(new java.awt.Color(0, 51, 51));
        pNorte.setPreferredSize(new java.awt.Dimension(736, 125));
        pNorte.setLayout(new java.awt.BorderLayout(5, 0));

        jPanel6.setPreferredSize(new java.awt.Dimension(130, 125));

        rdoClientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rdoClientes.setText("Clientes");
        rdoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoClientesActionPerformed(evt);
            }
        });

        rdoEventos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rdoEventos.setText("Eventos");
        rdoEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoEventosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ADICIONAR");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(rdoEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        pNorte.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Escreve1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pNorte.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Titulo");

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Realizar-se-á em");

        cboDia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01" }));

        cboMes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01" }));

        cboAno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018" }));

        cboCategoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Categoria");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("bilhetes");

        txtQuantBil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnAddCategoria.setBackground(new java.awt.Color(153, 153, 0));
        btnAddCategoria.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddCategoria.setText("+Categoria");
        btnAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAddCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pEventosLayout = new javax.swing.GroupLayout(pEventos);
        pEventos.setLayout(pEventosLayout);
        pEventosLayout.setHorizontalGroup(
            pEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pEventosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEventosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantBil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEventosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        pEventosLayout.setVerticalGroup(
            pEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEventosLayout.createSequentialGroup()
                        .addGroup(pEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantBil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pNorte.add(pEventos, java.awt.BorderLayout.CENTER);

        add(pNorte, java.awt.BorderLayout.PAGE_START);

        pTab.setBackground(new java.awt.Color(0, 51, 51));
        pTab.setPreferredSize(new java.awt.Dimension(736, 200));

        pChek.setBackground(new java.awt.Color(0, 61, 61));

        rdoDisponivel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdoDisponivel.setForeground(new java.awt.Color(0, 255, 255));
        rdoDisponivel.setText("Disponíveis");
        rdoDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDisponivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pChekLayout = new javax.swing.GroupLayout(pChek);
        pChek.setLayout(pChekLayout);
        pChekLayout.setHorizontalGroup(
            pChekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pChekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoDisponivel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pChekLayout.setVerticalGroup(
            pChekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rdoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 255));
        jLabel10.setText("Clientes");

        cboClientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboClientes.setForeground(new java.awt.Color(51, 255, 255));

        pTabela.setBackground(new java.awt.Color(0, 204, 204));

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

        rdoIndisponivel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdoIndisponivel.setForeground(new java.awt.Color(0, 255, 255));
        rdoIndisponivel.setText("Esgotados");
        rdoIndisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoIndisponivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTabLayout = new javax.swing.GroupLayout(pTab);
        pTab.setLayout(pTabLayout);
        pTabLayout.setHorizontalGroup(
            pTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pChek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoIndisponivel)
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(pTabLayout.createSequentialGroup()
                .addComponent(pTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pTabLayout.setVerticalGroup(
            pTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rdoTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(pChek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        add(pTab, java.awt.BorderLayout.PAGE_END);

        pCentro.setBackground(new java.awt.Color(0, 51, 51));
        pCentro.setPreferredSize(new java.awt.Dimension(736, 40));
        pCentro.setLayout(new java.awt.GridLayout(1, 6));

        btnAddEvento.setBackground(new java.awt.Color(0, 51, 51));
        btnAddEvento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddEvento.setForeground(new java.awt.Color(153, 255, 255));
        btnAddEvento.setText("ADICIONAR");
        btnAddEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEventoActionPerformed(evt);
            }
        });
        pCentro.add(btnAddEvento);

        btnLipar.setBackground(new java.awt.Color(0, 51, 51));
        btnLipar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLipar.setForeground(new java.awt.Color(153, 255, 255));
        btnLipar.setText("LIMPAR");
        btnLipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiparActionPerformed(evt);
            }
        });
        pCentro.add(btnLipar);

        add(pCentro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

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
        showTabela();
    }//GEN-LAST:event_rdoIndisponivelActionPerformed

    private void actualiza_listas() {
        lista_de_clientes = admin.actualizalista_de_clientes();
        lista_de_eventos = admin.actualizalista_de_eventos();
        lista_de_categorias = admin.actualizalista_de_categorias();
        showTabela();
    }

    private void abilitar(boolean v) {
        txtQuantBil.setEnabled(v);
        txtTitulo.setEnabled(v);
        cboAno.setEnabled(v);
        cboMes.setEnabled(v);
        cboDia.setEnabled(v);
        cboCategoria.setEnabled(v);

        btnAddEvento.setEnabled(v);
        btnLipar.setEnabled(v);
        btnAddCategoria.setEnabled(v);
    }

    private void capturaDados() {
        if (txtTitulo.getText().length() != 0
                && txtQuantBil.getText().length() != 0) {

            String data = cboDia.getSelectedItem().toString()
                    + "-" + cboMes.getSelectedItem().toString()
                    + "-" + cboAno.getSelectedItem().toString();
            if (valida.data_v(data).equalsIgnoreCase(data)) {
                if (Integer.parseInt(txtQuantBil.getText()) > 0) {
                    evento.setNr_bilhetes_disponíveis(Integer.parseInt(txtQuantBil.getText()));
                    evento.setTítulo(txtTitulo.getText());
                    evento.setData_realizacao(data);
                    evento.setCategoria(cboCategoria.getSelectedItem().toString());

                    admin.addEvento(evento);
                    lista_pCliente();
                    actualiza_listas();
                } else {
                    JOptionPane.showMessageDialog(null, "Nao salvo! Nr de bilhetes invalido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nao salvo! " + valida.data_v(data));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nao salvo! Campo vazio!");
        }
    }
    private void rdoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoClientesActionPerformed
        abilitar(false);
        rdoEventos.setSelected(false);
        showTabela();
        rdoClientes.setSelected(true);
        rdoEventos.setSelected(false);
        String user = JOptionPane.showInputDialog("Nome de usuario!");

        if (user != null) {
            String pass = JOptionPane.showInputDialog("Senha de usuario!");
            if (pass != null && (user + pass).length() > 0) {
                cliente.setUser(user);
                cliente.setPass(pass);
                admin.addCliente(cliente);
            }
        }
        preenche_cbo_clientes();
        actualiza_listas();
    }//GEN-LAST:event_rdoClientesActionPerformed

    private void rdoEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoEventosActionPerformed
        rdoClientes.setSelected(false);
        abilitar(true);
        showTabela();
    }//GEN-LAST:event_rdoEventosActionPerformed

    private void btnLiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiparActionPerformed
        txtQuantBil.setText("");
        txtTitulo.setText("");
    }//GEN-LAST:event_btnLiparActionPerformed

    private void btnAddEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventoActionPerformed
        capturaDados();
        preenche_cbo_clientes();
        showTabela();
        lista_pCliente();
    }//GEN-LAST:event_btnAddEventoActionPerformed

    private void btnAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoriaActionPerformed
        String cat = JOptionPane.showInputDialog("Nome da categoria!");
        if (cat != null) {
            if (cat.length() > 0) {
                categoria.setNome(cat);
                admin.addCategoria(categoria);
            }
        }
        preenche_cbo_categoria();
    }//GEN-LAST:event_btnAddCategoriaActionPerformed

    private void rdoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTodosActionPerformed
        rdoDisponivel.setSelected(false);
        rdoTodos.setSelected(true);
        rdoIndisponivel.setSelected(false);
        showTabela();
    }//GEN-LAST:event_rdoTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategoria;
    private javax.swing.JButton btnAddEvento;
    private javax.swing.JButton btnLipar;
    private javax.swing.JComboBox<String> cboAno;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboClientes;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pCentro;
    private javax.swing.JPanel pChek;
    private javax.swing.JPanel pEventos;
    private javax.swing.JPanel pNorte;
    private javax.swing.JPanel pTab;
    private javax.swing.JPanel pTabela;
    private javax.swing.JRadioButton rdoClientes;
    private javax.swing.JRadioButton rdoDisponivel;
    private javax.swing.JRadioButton rdoEventos;
    private javax.swing.JRadioButton rdoIndisponivel;
    private javax.swing.JRadioButton rdoTodos;
    private javax.swing.JTextField txtQuantBil;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    public String[] dia = new String[31];
    public String[] mes = new String[12];
    public String[] ano;

    public void preenche_cbo_clientes() {
        cboClientes.removeAllItems();
        actualiza_listas();
        for (Cliente c : lista_de_clientes) {
            cboClientes.addItem(c.toString());
        }
    }

    public void preenche_cbo_categoria() {
        cboCategoria.removeAllItems();
        actualiza_listas();
        for (Categoria c : lista_de_categorias) {
            cboCategoria.addItem(c.toString());
        }
    }

    public void preencher_Cbos() {
        ano = new String[5];
        for (int i = 2; i <= 31; i++) {
            if (i < 10) {
                cboDia.addItem("0" + i);
            } else {
                cboDia.addItem("" + i);
            }
        }
        for (int i = 2; i <= 12; i++) {
            if (i < 10) {
                cboMes.addItem("0" + i);
            } else {
                cboMes.addItem("" + i);
            }
        }
        for (int i = 2; i < 6; i++) {
            cboAno.addItem("" + (2017 + i));
        }
        preenche_cbo_clientes();
    }
    public String[] colunas = new String[]{"Titulo", "Categoria", "Data da realizacao", "Quant. de bilhetes disponiveis"};
    public String[] colunas_ev_cli = new String[]{"Nome do inscrito", "Titulo do evento", "Categoria", "Data", "Bilhetes reservados"};
    JScrollPane rolagem = new JScrollPane();
    JPanel pListar = new JPanel(new FlowLayout());

    Eventos_de_Clientes ev_cli = new Eventos_de_Clientes();

    public void showTabela() {

        DefaultTableModel modeloActivo;
        List<Evento> lista = lista_de_eventos;
        List<Eventos_de_Clientes> lista_ev_cl = ev_cli.actualiza_lista_Ev_Cli();
        String txt = "";

        if (rdoClientes.isSelected()) {
            modeloActivo = new DefaultTableModel(colunas_ev_cli, 0);
        } else {
            modeloActivo = new DefaultTableModel(colunas, 0);
        }
        JTable tabelaActivo = new JTable(modeloActivo);

        tabelaActivo.setModel(modeloActivo);
        pListar.setPreferredSize(new Dimension(810, 140));
        tabelaActivo.setPreferredScrollableViewportSize(new Dimension(800, 105));
        rolagem.setViewportView(tabelaActivo);
        tabelaActivo.setGridColor(Color.GREEN);
        pListar.add(rolagem);
        tabelaActivo.setShowHorizontalLines(true);

        int d = 1, id = 1;
        boolean v = rdoClientes.isSelected();
        if (v == false) {
            if (lista != null) {
                for (Evento ob : lista) {
                    if (rdoDisponivel.isSelected()) {
                        if (ob.valida_estado(ob.getData_realizacao()).equalsIgnoreCase("activo")) {
                            modeloActivo.addRow(new Object[]{
                                "  " + ob.getTítulo(), ob.getCategoria(),
                                ob.getData_realizacao(), "    " + ob.getNr_bilhetes_disponíveis() + ""});
                            id++;
                        }
                        txt = ("[ Total: activos: " + (id - 1) + " ]");
                    } else if (rdoIndisponivel.isSelected()) {
                        if (ob.valida_estado(ob.getData_realizacao()).equalsIgnoreCase("desactivo")) {
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
                JOptionPane.showMessageDialog(null, "Lista vazia (pAdmin_mtdShowtbl_if)");
            }
        } else {
            if (lista_ev_cl != null) {
                for (Eventos_de_Clientes ob : lista_ev_cl) {
                    if (rdoDisponivel.isSelected()) {
                        if ((ob.getEvento().getEstado()).equalsIgnoreCase("activo")) {
                            modeloActivo.addRow(new Object[]{
                                "  " + ob.getCliente().getUser(), ob.getEvento().getTítulo(), ob.getEvento().getCategoria(),
                                ob.getEvento().getData_realizacao(), "    " + ob.getEvento().getNr_bilhetes_disponíveis() + ""});
                            id++;
                        }
                        txt = ("[ Total: activos: " + (id - 1) + " ]");
                    } else if (rdoIndisponivel.isSelected()) {
                        if ((ob.getEvento().getEstado()).equalsIgnoreCase("desactivo")) {
                            modeloActivo.addRow(new Object[]{
                                "  " + ob.getCliente().getUser(), ob.getEvento().getTítulo(), ob.getEvento().getCategoria(),
                                ob.getEvento().getData_realizacao(), "    " + ob.getEvento().getNr_bilhetes_disponíveis() + ""});
                            id++;
                        }
                        txt = ("[ Total: desactivos: " + (d - 1) + " ]");
                    } else if (rdoTodos.isSelected()) {
                        modeloActivo.addRow(new Object[]{
                            "  " + ob.getCliente().getUser(), ob.getEvento().getTítulo(), ob.getEvento().getCategoria(),
                            ob.getEvento().getData_realizacao(), "    " + ob.getEvento().getNr_bilhetes_disponíveis() + ""});

                        d++;
                        txt = ("[ Total: desactivos: " + (d - 1) + " ]");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lista vazia (pAdmin_mtdShowtbl_ev_cli_else)");
            }
        }
        erro.modifica(txt, 0);
        pTabela.add(pListar, "tabela");
    }
    /*-----------------------------------------------------------------------*/
}
