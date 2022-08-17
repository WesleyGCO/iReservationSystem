/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.castilho.paranavai.armario.visao;

import com.castilho.paranavai.armario.controle.MenuAdminControladorGUI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Wesley
 */
public class MenuAdminGUI extends javax.swing.JFrame {

    private final MenuAdminControladorGUI controlador;
    
    /**
     * Creates new form MenuAdminGUI
     */
    public MenuAdminGUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("iReservationSystem");
        
        this.controlador = new MenuAdminControladorGUI(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenuAdmin =  new JPanel() {  
            public void paintComponent(Graphics g) {  
                System.out.println(IndexGUI.class.getResource("/assets/biblioteca.jpg")); 
                Image img = Toolkit.getDefaultToolkit().getImage(IndexGUI.class.getResource("/assets/biblioteca.jpg"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
        };
        adminBarraMenu = new javax.swing.JMenuBar();
        adminMenuMinhaConta = new javax.swing.JMenu();
        adminMinhaContaMeusDados = new javax.swing.JMenuItem();
        adminMinhaContaSair = new javax.swing.JMenuItem();
        adminMenuRelatorios = new javax.swing.JMenu();
        adminRelatoriosEmprestimos = new javax.swing.JMenuItem();
        adminRelatoriosDevolucoes = new javax.swing.JMenuItem();
        adminRelatoriosArmarios = new javax.swing.JMenuItem();
        adminCadastro = new javax.swing.JMenu();
        adminCadastroImportacao = new javax.swing.JMenuItem();
        adminCadastroAluno = new javax.swing.JMenuItem();
        adminCadastroArmario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout painelMenuAdminLayout = new javax.swing.GroupLayout(painelMenuAdmin);
        painelMenuAdmin.setLayout(painelMenuAdminLayout);
        painelMenuAdminLayout.setHorizontalGroup(
            painelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        painelMenuAdminLayout.setVerticalGroup(
            painelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        adminMenuMinhaConta.setText("Minha Conta");

        adminMinhaContaMeusDados.setText("Meus dados");
        adminMenuMinhaConta.add(adminMinhaContaMeusDados);

        adminMinhaContaSair.setText("Sair");
        adminMinhaContaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMinhaContaSairActionPerformed(evt);
            }
        });
        adminMenuMinhaConta.add(adminMinhaContaSair);

        adminBarraMenu.add(adminMenuMinhaConta);

        adminMenuRelatorios.setText("Relatórios");

        adminRelatoriosEmprestimos.setText("Relatórios de empréstimos");
        adminMenuRelatorios.add(adminRelatoriosEmprestimos);

        adminRelatoriosDevolucoes.setText("Relatórios de devoluções");
        adminMenuRelatorios.add(adminRelatoriosDevolucoes);

        adminRelatoriosArmarios.setText("Relatórios de armários");
        adminMenuRelatorios.add(adminRelatoriosArmarios);

        adminBarraMenu.add(adminMenuRelatorios);

        adminCadastro.setText("Cadastro");

        adminCadastroImportacao.setText("Importar cadastro");
        adminCadastro.add(adminCadastroImportacao);

        adminCadastroAluno.setText("Cadastrar aluno");
        adminCadastro.add(adminCadastroAluno);

        adminCadastroArmario.setText("Cadastrar armário");
        adminCadastro.add(adminCadastroArmario);

        adminBarraMenu.add(adminCadastro);

        setJMenuBar(adminBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminMinhaContaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMinhaContaSairActionPerformed
        this.controlador.navegarParaLoginAdmin();
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_adminMinhaContaSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar adminBarraMenu;
    private javax.swing.JMenu adminCadastro;
    private javax.swing.JMenuItem adminCadastroAluno;
    private javax.swing.JMenuItem adminCadastroArmario;
    private javax.swing.JMenuItem adminCadastroImportacao;
    private javax.swing.JMenu adminMenuMinhaConta;
    private javax.swing.JMenu adminMenuRelatorios;
    private javax.swing.JMenuItem adminMinhaContaMeusDados;
    private javax.swing.JMenuItem adminMinhaContaSair;
    private javax.swing.JMenuItem adminRelatoriosArmarios;
    private javax.swing.JMenuItem adminRelatoriosDevolucoes;
    private javax.swing.JMenuItem adminRelatoriosEmprestimos;
    private javax.swing.JPanel painelMenuAdmin;
    // End of variables declaration//GEN-END:variables
}