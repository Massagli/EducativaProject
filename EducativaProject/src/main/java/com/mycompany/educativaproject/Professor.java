
package com.mycompany.educativaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Professor {
    private String nomeProfessor,cpfProfessor,emailProfessor,formacaoProfessor,
            escolaridadeProfessor,senhaProfessor;

    /**
     * @return the nomeProfessor
     */
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    /**
     * @return the cpfProfessor
     */
    public String getCpfProfessor() {
        return cpfProfessor;
    }
    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

    /**
     * @return the emailProfessor
     */
    public String getEmailProfessor() {
        return emailProfessor;
    }
    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    /**
     * @return the formacaoProfessor
     */
    public String getFormacaoProfessor() {
        return formacaoProfessor;
    }
    public void setFormacaoProfessor(String formacaoProfessor) {
        this.formacaoProfessor = formacaoProfessor;
    }

    /**
     * @return the escolaridadeProfessor
     */
    public String getEscolaridadeProfessor() {
        return escolaridadeProfessor;
    }
    public void setEscolaridadeProfessor(String escolaridadeProfessor) {
        this.escolaridadeProfessor = escolaridadeProfessor;
    }

    /**
     * @return the senhaProfessor
     */
    public String getSenhaProfessor() {
        return senhaProfessor;
    }
    public void setSenhaProfessor(String senhaProfessor) {
        this.senhaProfessor = senhaProfessor;
    }
    
    
    
    
    
    //-----------------------
    
    
    public void deleteProfessor(int id){
        ConnectionFactory connection = new ConnectionFactory();
        
        try(Connection c = connection.conexao()){
            PreparedStatement pstmt = c.prepareStatement("DELETE FROM tb_professor WHERE idProfessor = ?");
            pstmt.setInt(1, id);
            pstmt.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void updateProfessor(String nome, String email, String cpf, String senha, int id){
       ConnectionFactory connection = new ConnectionFactory();
       try(Connection c = connection.conexao()){
            PreparedStatement pstmt = c.prepareStatement("UPDATE tb_professor SET nomeProfessor = ?, emailProfessor = ?, cpfProfessor = ?, senhaProfessor = ? WHERE idProfessor = ?");
            pstmt.setString(1, nome);
            pstmt.setString(2, email);
            pstmt.setString(3, cpf);
            pstmt.setString(4, senha);
            pstmt.setInt(5,id);
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
       
   }
    
    
    
    
    
    
    
}
