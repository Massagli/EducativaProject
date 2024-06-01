/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.educativaproject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author adrie
 */
public class CursosProfFrame extends javax.swing.JFrame {
    String nomeProf;
    int idProf;
    /**
     * Creates new form CursosProfFrame
     */
    public CursosProfFrame() {
        initComponents();
        
    }
    
    public void showCursos(){
        ResultSet result = null;
        DefaultListModel <String> model = new DefaultListModel<>();
        ConnectionFactory connection = new ConnectionFactory();
        try (Connection c = connection.conexao()){
            CallableStatement cs = c.prepareCall("{call sp_GetCursos(?)}");
            cs.setInt(1, idProf);
            result = cs.executeQuery();
            while(result.next()){
                String curso = result.getString("tituloCurso");
                model.addElement(curso);
            }
            jListCurso.setModel(model);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void moveParam(String nome, int id){
        this.nomeProf = nome;
        this.idProf = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCadDoc = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnCadCurso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCurso = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadDoc.setBackground(new java.awt.Color(47, 72, 88));
        btnCadDoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnCadDoc.setText("Cadastrar Documento");
        btnCadDoc.setBorder(null);
        btnCadDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 150, 50));

        btnPerfil.setBackground(new java.awt.Color(251, 176, 59));
        btnPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.setBorder(null);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 80, 30));

        btnCadCurso.setBackground(new java.awt.Color(47, 72, 88));
        btnCadCurso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnCadCurso.setText("Cadastrar Curso");
        btnCadCurso.setBorder(null);
        btnCadCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 150, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setBackground(new java.awt.Color(147, 42, 42));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Excluir");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 122, 40));

        jListCurso.setBorder(null);
        jListCurso.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jListCurso.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListCurso.setAutoscrolls(false);
        jListCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jListCurso);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 490, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 1120, 140));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 72, 88));
        jLabel2.setText("Meus cursos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaCursosProf.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCursoActionPerformed
        CadCursoFrame cursoFrame = new CadCursoFrame();
        cursoFrame.moveParam(nomeProf, idProf);
        this.dispose();
        cursoFrame.setVisible(true);
        
    }//GEN-LAST:event_btnCadCursoActionPerformed

    private void btnCadDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadDocActionPerformed
        CadDocumentoFrame documentoFrame = new CadDocumentoFrame();
        documentoFrame.moveParam(nomeProf, idProf);
        this.dispose();
        documentoFrame.setVisible(true);
    }//GEN-LAST:event_btnCadDocActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed

        PerfilFrame perfil = new PerfilFrame();
        ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmtProf = null;
        
           
        try(Connection c = connection.conexao()){
           
            pstmtProf = c.prepareStatement("SELECT * FROM tb_professor");
            ResultSet result2 = pstmtProf.executeQuery();
            
            while(result2.next()){
                String nome = result2.getString("nomeProfessor");
                int id = result2.getInt("idProfessor");
                if(idProf == id && nome.equals(nomeProf)){
                    this.dispose();
                    perfil.moveParam(result2.getString("nomeProfessor"), result2.getString("emailProfessor"), result2.getString("cpfProfessor"), result2.getString("senhaProfessor"), result2.getInt("idProfessor"));
                    perfil.setVisible(true);
                }
                
            }
            
            //JOptionPane.showMessageDialog(null, "Campo email ou senha inválidos");
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Curso curso = new Curso();
        if(jListCurso.getSelectedValue() != null){
            int jp = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir o curso?", "Confirme Exclusão", JOptionPane.YES_NO_OPTION);
            if(jp == JOptionPane.YES_OPTION){
                curso.setTituloCurso(jListCurso.getSelectedValue());
                curso.deleteCurso();
                this.showCursos();
            }     
        }else{
            JOptionPane.showMessageDialog(null,"Você não selecionou nenhuma opção. Tente novamente.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(CursosProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursosProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursosProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursosProfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursosProfFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCurso;
    private javax.swing.JButton btnCadDoc;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPerfil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
