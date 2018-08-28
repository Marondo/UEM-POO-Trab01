package Grupo_I;

import Paineis_Centro.pAdmin;
import Paineis_Centro.pCliente;
import Paineis_Sul.pErro;
import Paineis_Sul.pAutenticacao;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmFundo extends javax.swing.JFrame implements Serializable {
    
    CardLayout layoutCentro;
    CardLayout layoutErro;
    
    pAdmin pAdm = new pAdmin();
    pErro erro = new pErro();
    pCliente pCli = new pCliente();
    
    Eventos_de_Clientes ev_cli = new Eventos_de_Clientes();
    Cliente cliente = new Cliente();
    
    Admin admin = new Admin();
    
    ArrayList<Cliente> lista_de_clientes = new ArrayList<>();
    ArrayList<Evento> lista_de_eventos = new ArrayList<>();
    
    public frmFundo() {
        initComponents();
        actualiza_listas();
        pAdm.preenche_cbo_clientes();
        inicializaCardLayouts();
        valida_Entrada();
        setLocationRelativeTo(null);
        pCli.lista_de_eventos = new Admin().actualizalista_de_eventos();
    }
    
    private void actualiza_listas() {
        lista_de_clientes = admin.actualizalista_de_clientes();
        lista_de_eventos = admin.actualizalista_de_eventos();
    }
    
    private void inicializaCardLayouts() {
        layoutCentro = (CardLayout) pCardCentro.getLayout();
        layoutErro = (CardLayout) pCardSul.getLayout();
        
        pCardCentro.add(pInicio, "inicio");
        pCardCentro.add(pAdm, "pAdm");
        pCardCentro.add(pCli, "pCli");
        
        pCardSul.add(pAutenticar, "pAutenticar");
        pCardSul.add(erro, "erro");
    }
    
    public boolean entro;
    public String quemEntrou = "";
    
    public boolean entrar() {
        entro = false;
        String user = txtUser.getText();
        String pass = new String(txtSenha.getPassword());
        
        if ((user.equalsIgnoreCase("teste")
                && pass.equalsIgnoreCase("adm"))
                || (user.equalsIgnoreCase("admin")
                && pass.equalsIgnoreCase("admin"))) {
            entro = true;
            quemEntrou = "@Administrador";
            lblInfoB.setText("Conta: " + quemEntrou);
            lblInfoC.setText(" Nome: @ADMIN ");
            valida_Entrada();
        } else if (user.equalsIgnoreCase("Teste")
                && pass.equalsIgnoreCase("Cli")) {
            entro = true;
            quemEntrou = "@Cliente";
            lblInfoB.setText("Conta: " + quemEntrou);
            lblInfoC.setText(" Nome: @CLI ");
            valida_Entrada();
        } else {
            valida_Entrada();
            for (Cliente cl : lista_de_clientes) {
                if (user.equalsIgnoreCase(cl.getUser())
                        && pass.equalsIgnoreCase(cl.getPass())) {
                    entro = true;
                    quemEntrou = "@Cliente";
                    lblInfoB.setText(" Conta: " + quemEntrou);
                    lblInfoC.setText(" Nome: @" + cl.getUser());
                    valida_Entrada();
                    pCli.cliente_AUX = cl;
                    break;
                }
            }  // JOptionPane.showMessageDialog(null, "Senha errada!");
        }
        if (entro == false) {
            JOptionPane.showMessageDialog(null, "Senha errada!");
            btnInicio.setForeground(new Color(255, 51, 51));//

        }
        return entro;
    }
    
    private void muda() {
        String txtBtnSair = btnInicio.getText();
        if (txtBtnSair.equalsIgnoreCase("Inicio")) {
            btnInicio.setText("SAIR");
            lblInfoB.setText("Conta: @...");
            lblInfoC.setText(" Nome: @... ");
            btnInicio.setForeground(new Color(255, 51, 51));// red
            layoutErro.show(pCardSul, "pAutenticar");
        } else {
            btnInicio.setText("INICIO");
            layoutErro.show(pCardSul, "erro");
            btnInicio.setForeground(new Color(153, 255, 255));// LighGren
        }
    }
    
    public void valida_Entrada() {
        if (entro == false) {
            muda();
            btnInicio.setText("SAIR");
            layoutErro.show(pCardSul, "pAutenticar");
            layoutCentro.show(pCardCentro, "inicio");
            
        } else {
            muda();
            btnInicio.setText("INICIO");
            if (quemEntrou.equalsIgnoreCase("@Administrador")) {
                layoutErro.show(pCardSul, "erro");
                layoutCentro.show(pCardCentro, "pAdm");
            } else {
                pCli.showTabela();
                layoutErro.show(pCardSul, "erro");
                layoutCentro.show(pCardCentro, "pCli");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        pNorte = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pInformacoes = new javax.swing.JPanel();
        lblInfoB = new javax.swing.JLabel();
        lblInfoC = new javax.swing.JLabel();
        lblInfoA = new javax.swing.JLabel();
        pSul = new javax.swing.JPanel();
        pBtnEnter = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        pCardSul = new javax.swing.JPanel();
        pAutenticar = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pCardCentro = new javax.swing.JPanel();
        pInicio = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 70));
        setName("frmFundo"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        pFundo.setBackground(new java.awt.Color(0, 0, 51));
        pFundo.setLayout(new java.awt.BorderLayout(5, 5));

        pNorte.setBackground(new java.awt.Color(0, 51, 51));
        pNorte.setPreferredSize(new java.awt.Dimension(806, 60));
        pNorte.setLayout(new java.awt.GridLayout(2, 1));

        pTitulo.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EVENTOS DA MULTI-TALENTOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pNorte.add(pTitulo);

        pInformacoes.setBackground(new java.awt.Color(0, 51, 51));

        lblInfoB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblInfoB.setForeground(new java.awt.Color(204, 255, 0));
        lblInfoB.setText("---");

        lblInfoC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblInfoC.setForeground(new java.awt.Color(204, 255, 0));
        lblInfoC.setText("---");

        lblInfoA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblInfoA.setForeground(new java.awt.Color(204, 255, 0));
        lblInfoA.setText("Dados do usuario autenticado");

        javax.swing.GroupLayout pInformacoesLayout = new javax.swing.GroupLayout(pInformacoes);
        pInformacoes.setLayout(pInformacoesLayout);
        pInformacoesLayout.setHorizontalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesLayout.createSequentialGroup()
                .addComponent(lblInfoA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfoB, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfoC, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        pInformacoesLayout.setVerticalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblInfoB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblInfoC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblInfoA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pNorte.add(pInformacoes);

        pFundo.add(pNorte, java.awt.BorderLayout.PAGE_START);

        pSul.setBackground(new java.awt.Color(0, 51, 51));
        pSul.setAlignmentX(5.0F);
        pSul.setAlignmentY(5.0F);
        pSul.setPreferredSize(new java.awt.Dimension(800, 60));

        pBtnEnter.setBackground(new java.awt.Color(0, 51, 51));

        btnInicio.setBackground(new java.awt.Color(0, 51, 51));
        btnInicio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(153, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.setOpaque(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBtnEnterLayout = new javax.swing.GroupLayout(pBtnEnter);
        pBtnEnter.setLayout(pBtnEnterLayout);
        pBtnEnterLayout.setHorizontalGroup(
            pBtnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        pBtnEnterLayout.setVerticalGroup(
            pBtnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pCardSul.setBackground(new java.awt.Color(0, 51, 51));
        pCardSul.setLayout(new java.awt.CardLayout());

        pAutenticar.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(577, 49));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Usuario");

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Senha");

        txtSenha.setBackground(new java.awt.Color(0, 0, 0));
        txtSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(204, 255, 204));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(0, 51, 51));
        btnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(153, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pAutenticar.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/key-icon4.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, java.awt.BorderLayout.CENTER);

        pAutenticar.add(jPanel2, java.awt.BorderLayout.CENTER);

        pCardSul.add(pAutenticar, "card2");

        javax.swing.GroupLayout pSulLayout = new javax.swing.GroupLayout(pSul);
        pSul.setLayout(pSulLayout);
        pSulLayout.setHorizontalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSulLayout.createSequentialGroup()
                .addComponent(pBtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCardSul, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pSulLayout.setVerticalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSulLayout.createSequentialGroup()
                .addGroup(pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBtnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCardSul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pFundo.add(pSul, java.awt.BorderLayout.PAGE_END);

        pCardCentro.setBackground(new java.awt.Color(0, 51, 51));
        pCardCentro.setName("pCardCentro"); // NOI18N
        pCardCentro.setLayout(new java.awt.CardLayout());

        pInicio.setPreferredSize(new java.awt.Dimension(810, 371));
        pInicio.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 100));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BOAS   VINDAS   A NOSSA PLATAFORMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        pInicio.add(jPanel1);

        jPanel4.setBackground(new java.awt.Color(51, 102, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(810, 270));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("[        AUTENTICAÇÃO         ]");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        pInicio.add(jPanel4);

        pCardCentro.add(pInicio, "card2");

        pFundo.add(pCardCentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(pFundo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        layoutCentro.show(pCardCentro, "inicio");
        if (btnInicio.getText() != "INICIO") {
            int r = JOptionPane.showConfirmDialog(null, "Deseja sair?");
            if (r == 0) {
                System.exit(0);
            } else {
                btnInicio.setText("INICIO");
            }
        }
        muda();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        lista_de_clientes = admin.actualizalista_de_clientes();
        entrar();
    }//GEN-LAST:event_btnEntrarActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFundo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblInfoA;
    private javax.swing.JLabel lblInfoB;
    private javax.swing.JLabel lblInfoC;
    private javax.swing.JPanel pAutenticar;
    private javax.swing.JPanel pBtnEnter;
    private javax.swing.JPanel pCardCentro;
    private javax.swing.JPanel pCardSul;
    private javax.swing.JPanel pFundo;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pNorte;
    private javax.swing.JPanel pSul;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
