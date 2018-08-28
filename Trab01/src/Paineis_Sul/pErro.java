package Paineis_Sul;

import java.awt.Color;

/**
 *
 * @author Marondo
 */
public class pErro extends javax.swing.JPanel {

    public pErro() {
        initComponents();
        modifica("       Area de textos de apoio!", 0);
    }

    public void modifica(String txt, int nr) {
        lblErro.setText("[ " + txt + " ]");
        if (nr == 0) {
            lblErro.setForeground(Color.YELLOW);
        } else {
            lblErro.setForeground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblErro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(670, 31));
        setLayout(new java.awt.BorderLayout());

        lblErro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 255, 0));
        lblErro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErro.setText("                 Area de textos de Apoio");
        lblErro.setPreferredSize(new java.awt.Dimension(677, 49));
        add(lblErro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblErro;
    // End of variables declaration//GEN-END:variables
}
