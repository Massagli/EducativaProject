/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.educativaproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author adrie
 */
public class PerfilFrame extends javax.swing.JFrame {

    /**
     * Creates new form PerfilFrame
     */
    public PerfilFrame() {
        initComponents();

        
    }
    
    public void moveParam(String nome,String email,String cpf,String senha, int id){
        lblId.setText(Integer.toString(id));
        lblName.setText(nome);
        txtName.setText(nome);
        txtName.setEnabled(false);
        txtEmail.setText(email);
        txtEmail.setEnabled(false);
        txtCpf.setText(cpf);
        txtCpf.setEnabled(false);
        txtPassword.setText(senha);
        txtPassword.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 400, 40));
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 400, 40));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 400, 40));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 400, 40));

        jLabel1.setBackground(new java.awt.Color(251, 176, 59));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jPanel1.setBackground(new java.awt.Color(251, 176, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoEducativa.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 180, 150));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 72, 88));
        jLabel8.setText("HOME");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

        jPanel2.setBackground(new java.awt.Color(47, 72, 88));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1100, 220));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel3.setText("Nome Completo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        jLabel6.setText("Senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, -1));

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 122, 40));

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 122, 40));

        btnAtualizar.setBackground(new java.awt.Color(0, 147, 40));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Salvar");
        btnAtualizar.setBorder(null);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 640, 122, 40));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblId.setToolTipText("");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        txtName.setEnabled(false);
        txtEmail.setEnabled(true);
        txtCpf.setEnabled(true);
        txtPassword.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    

        

    
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int id = Integer.parseInt(lblId.getText());
        String nome = lblName.getText();
        CadAlunoFrame alunoFrame = new CadAlunoFrame();
        CadProfFrame profFrame = new CadProfFrame();
        Aluno aluno = new Aluno();
        aluno.setIdAluno(Integer.parseInt(lblId.getText()));
        Professor professor = new Professor();
        ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmt = null;
        PreparedStatement pstmtProf = null;
        
        try(Connection c = connection.conexao()){
           
            pstmt = c.prepareStatement("SELECT * FROM tb_aluno");
            ResultSet result = pstmt.executeQuery();
            pstmtProf = c.prepareStatement("SELECT * FROM tb_professor");
            ResultSet result2 = pstmtProf.executeQuery();
            
            while(result.next()){
                int compareId= result.getInt("idAluno");
                String compareName = result.getString("nomeAluno");
                if(id == compareId && nome.equals(compareName)){
                    int jp = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir seu perfil?", "Confirme Exclusão", JOptionPane.YES_NO_OPTION);
                    if(jp == JOptionPane.YES_OPTION){
                        aluno.deleteAluno();
                        System.out.println("Deu bom");
                        this.dispose();
                        alunoFrame.setVisible(true);
                    }   

                }
                
                
            }
            
            while(result2.next()){
                int compareId= result2.getInt("idProfessor");
                String compareName = result2.getString("nomeProfessor");
                if(id == compareId && nome.equals(compareName)){
                    int jp = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir seu perfil?", "Confirme Exclusão", JOptionPane.YES_NO_OPTION);
                    if(jp == JOptionPane.YES_OPTION){
                        professor.deleteProfessor(id);
                        System.out.println("Deu bom");
                        this.dispose();
                        profFrame.setVisible(true);
                    }  
                    
                }
                
            }
             
            }catch (Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        int id = Integer.parseInt(lblId.getText());
        String nome = lblName.getText();

        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmt = null;
        PreparedStatement pstmtProf = null;
        
        
        try(Connection c = connection.conexao()){
           
            pstmt = c.prepareStatement("SELECT * FROM tb_aluno");
            ResultSet result = pstmt.executeQuery();
            pstmtProf = c.prepareStatement("SELECT * FROM tb_professor");
            ResultSet result2 = pstmtProf.executeQuery();
            
            while(result.next()){
                int compareId= result.getInt("idAluno");
                String compareName = result.getString("nomeAluno");
                if(id == compareId && nome.equals(compareName)){
                    aluno.updateAluno(txtName.getText(), txtEmail.getText(), txtCpf.getText(), txtPassword.getText(), id);
                    lblName.setText(result.getString("nomeAluno"));
                    System.out.println("Deu bom");
                    txtName.setEnabled(false);
                    txtEmail.setEnabled(false);
                    txtCpf.setEnabled(false);
                    txtPassword.setEnabled(false);
                } 
            }
            
            while(result2.next()){
                int compareId= result2.getInt("idProfessor");
                String compareName = result2.getString("nomeProfessor");
                if(id == compareId && nome.equals(compareName)){
                    professor.updateProfessor(txtName.getText(), txtEmail.getText(), txtCpf.getText(), txtPassword.getText(), id);
                    lblName.setText(result2.getString("nomeProfessor"));
                    System.out.println("Deu bom");
                    txtName.setEnabled(false);
                    txtEmail.setEnabled(false);
                    txtCpf.setEnabled(false);
                    txtPassword.setEnabled(false);
                } 
            }
             
            }catch (Exception e){
                e.printStackTrace();
            }
        
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int id = Integer.parseInt(lblId.getText());
        String nome = lblName.getText();
        CadAlunoFrame alunoFrame = new CadAlunoFrame();
        CadProfFrame profFrame = new CadProfFrame();
        Aluno aluno = new Aluno();
        CursosProfFrame cursosFrame = new CursosProfFrame();
        aluno.setIdAluno(Integer.parseInt(lblId.getText()));
        Professor professor = new Professor();
        ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmt = null;
        PreparedStatement pstmtProf = null;
        
        try(Connection c = connection.conexao()){
           
            pstmt = c.prepareStatement("SELECT * FROM tb_aluno");
            ResultSet result = pstmt.executeQuery();
            pstmtProf = c.prepareStatement("SELECT * FROM tb_professor");
            ResultSet result2 = pstmtProf.executeQuery();
            
            while(result.next()){
                int compareId= result.getInt("idAluno");
                String compareName = result.getString("nomeAluno");
                if(id == compareId && nome.equals(compareName)){
                    JOptionPane.showMessageDialog(null, "Funcionalidade disponível em breve");

                }
                
                
            }
            
            while(result2.next()){
                int compareId = result2.getInt("idProfessor");
                String compareName = result2.getString("nomeProfessor");
                if(id == compareId && nome.equals(compareName)){
                    cursosFrame.moveParam(compareName, compareId);
                    cursosFrame.showCursos();
                    this.dispose();
                    cursosFrame.setVisible(true);
                }
                
            }
             
            }catch (Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilFrame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
