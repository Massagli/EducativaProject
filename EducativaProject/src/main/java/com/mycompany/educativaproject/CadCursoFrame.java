package com.mycompany.educativaproject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CadCursoFrame extends javax.swing.JFrame {
    
    String nomeProf;
    int idProf;
    
    

    public CadCursoFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void moveParam(String nome, int id){
        this.nomeProf = nome;
        this.idProf = id;
        lblName.setText(nomeProf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnMove = new javax.swing.JButton();
        btnPaNao = new javax.swing.JRadioButton();
        btnPaSim = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btnPcNao = new javax.swing.JRadioButton();
        btnPcSim = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCatego = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblName.setText("jLabel11");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

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
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, 122, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("CADASTRAR CURSO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

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
        getContentPane().add(btnMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 122, 40));

        btnPaNao.setText("Não");
        getContentPane().add(btnPaNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, -1, -1));

        buttonGroup2.add(btnPaSim);
        btnPaSim.setText("Sim");
        getContentPane().add(btnPaSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jLabel9.setText("Possui Avaliação?");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        buttonGroup1.add(btnPcNao);
        btnPcNao.setText("Não");
        getContentPane().add(btnPcNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        buttonGroup1.add(btnPcSim);
        btnPcSim.setText("Sim");
        btnPcSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPcSimActionPerformed(evt);
            }
        });
        getContentPane().add(btnPcSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jLabel8.setText("Possui Certificado?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 360, 40));

        jLabel7.setText("Duração em Horas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 360, 40));

        jLabel6.setText("Área de Ensino");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));
        getContentPane().add(txtCatego, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 360, 40));

        jLabel5.setText("Categoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));
        getContentPane().add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 360, 40));

        jLabel4.setText("Descrição");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));
        getContentPane().add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 360, 40));

        jLabel3.setText("Titulo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel2.setText("Nome do Instrutor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaProfessor.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPcSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPcSimActionPerformed
        
    }//GEN-LAST:event_btnPcSimActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        if (!txtArea.getText().isEmpty() && !txtCatego.getText().isEmpty() && !txtDesc.getText().isEmpty() && !txtTitle.getText().isEmpty() && !txtTime.getText().isEmpty()){
        CursosProfFrame cursoProfFrame = new CursosProfFrame();
        Curso curso = new Curso(); 
        
        curso.setTituloCurso(txtTitle.getText());
        curso.setDescricaoCurso(txtDesc.getText());
        curso.setDuracaoCurso(Integer.parseInt(txtTime.getText()));
        curso.setCategoriaCurso(txtCatego.getText());
        curso.setAreaEnsinoCurso(txtArea.getText());
        
        if(btnPcSim.isSelected()){
            curso.setCertificadoCurso(true);    
        }
        if(btnPcNao.isSelected()){
            curso.setCertificadoCurso(false);                
        }
           
        if(btnPaSim.isSelected()){
            curso.setAvaliacaoCurso(true);
        }
        if(btnPaNao.isSelected()){
            curso.setAvaliacaoCurso(false);
        }
        
        curso.registerCurso();
        
        
        ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmt = null;
        
            try(Connection c = connection.conexao()){
                pstmt = c.prepareStatement("SELECT MAX(idCurso) FROM tb_Curso");
                ResultSet result = pstmt.executeQuery();

                if (result.next()) {
                    int maxIdCurso = result.getInt(1);
                    CallableStatement cs = c.prepareCall("{call sp_CursoProfessor(?,?)}");
                    cs.setInt(1, maxIdCurso);
                    cs.setInt(2, idProf);
                    cs.execute();
                    JOptionPane.showMessageDialog(null, "Curso Cadastrado com sucesso!");
                    txtArea.setText("");
                    txtCatego.setText("");
                    txtDesc.setText("");
                    txtTime.setText("");
                    txtTitle.setText("");
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
        }
    }//GEN-LAST:event_btnMoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CursosProfFrame cursosFrame = new CursosProfFrame();
        cursosFrame.moveParam(nomeProf, idProf);
        cursosFrame.showCursos();
        this.dispose();
        cursosFrame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CadCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCursoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMove;
    private javax.swing.JRadioButton btnPaNao;
    private javax.swing.JRadioButton btnPaSim;
    private javax.swing.JRadioButton btnPcNao;
    private javax.swing.JRadioButton btnPcSim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCatego;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
