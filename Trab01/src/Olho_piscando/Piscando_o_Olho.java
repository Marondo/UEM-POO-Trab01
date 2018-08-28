/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Olho_piscando;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Marondo
 */
public class Piscando_o_Olho extends JPanel {
    public void paint (Graphics g){
        g.drawOval(150, 100, 300, 330);
        g.fillOval(210, 160, 30, 115);
        g.fillRect(300, 220, 50, 15);
        g.drawArc(200,200, 180,190,175, 190);
    }

        public static void main(String[] args) {
        JFrame frm = new JFrame ("PISCANDO OLHO");
        frm.setVisible(true);
	frm.setSize(700, 500);
        frm.setBounds(300,70,600,600);
	frm.setDefaultCloseOperation(3);
	frm.add(new Piscando_o_Olho());
        frm.setBackground(new Color(23, 100, 55));
        
    }
 }