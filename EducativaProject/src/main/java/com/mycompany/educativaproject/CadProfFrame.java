/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.educativaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author adrie
 */
public class CadProfFrame extends javax.swing.JFrame {

    /**
     * Creates new form CadProfFrame
     */
    public CadProfFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnMove = new javax.swing.JButton();
        txtConfPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGrad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconEstu.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Quero me cadastrar");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Sou Aluno");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        btnBack.setBackground(new java.awt.Color(147, 42, 42));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Voltar");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 122, 40));

        btnMove.setBackground(new java.awt.Color(47, 72, 88));
        btnMove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMove.setForeground(new java.awt.Color(255, 255, 255));
        btnMove.setText("Avançar");
        btnMove.setBorder(null);
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 122, 40));
        getContentPane().add(txtConfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 400, 40));

        jLabel9.setText("Confirmar Senha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 400, 40));

        jLabel8.setText("Senha");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));
        getContentPane().add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 400, 40));

        jLabel7.setText("Formação");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));
        getContentPane().add(txtGrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 400, 40));

        jLabel6.setText("Escolaridade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 400, 40));

        jLabel5.setText("E-mail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 400, 40));

        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 400, 40));

        jLabel3.setText("Nome Completo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Registro Professor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegistroAluno.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        CadAlunoFrame alunoFrame = new CadAlunoFrame();
        this.dispose();
        alunoFrame.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        this.dispose();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        LoginFrame professorFrame = new LoginFrame();
        Professor professor = new Professor();
        professor.setNomeProfessor(txtName.getText());
        professor.setCpfProfessor(txtCpf.getText());
        professor.setEmailProfessor(txtEmail.getText());
        professor.setEscolaridadeProfessor(txtGrad.getText());
        professor.setFormacaoProfessor(txtCourse.getText());
        professor.setSenhaProfessor(new String(txtPassword.getPassword()));
        if(new String(txtPassword.getPassword()).equals(new String(txtConfPassword.getPassword()))){
            professor.registerProfessor();
            professorFrame.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "As senhas não coincidem");
            
        }
    }//GEN-LAST:event_btnMoveActionPerformed

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
            java.util.logging.Logger.getLogger(CadProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProfFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txtConfPassword;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGrad;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
