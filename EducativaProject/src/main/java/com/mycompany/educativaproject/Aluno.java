package com.mycompany.educativaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Aluno {
   private String nomeAluno,cpfAluno,emailAluno,senhaAluno;
   private int idadeAluno, idAluno;

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the cpfAluno
     */
    public String getCpfAluno() {
        return cpfAluno;
    }
    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    /**
     * @return the emailAluno
     */
    public String getEmailAluno() {
        return emailAluno;
    }
    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    /**
     * @return the senhaAluno
     */
    public String getSenhaAluno() {
        return senhaAluno;
    }
    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    /**
     * @return the idadeAluno
     */
    public int getIdadeAluno() {
        return idadeAluno;
    }
    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }
    
    
    
    /**
     * @return the idadeAluno
     */
    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    
    
    
    
    //----------------------------
    
    
    public void deleteAluno(){
        ConnectionFactory connection = new ConnectionFactory();
        
        try(Connection c = connection.conexao()){
            PreparedStatement pstmt = c.prepareStatement("DELETE FROM tb_aluno WHERE idAluno = ?");
            pstmt.setInt(1,idAluno);
            pstmt.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
   public void updateAluno(String nome, String email, String cpf, String senha, int id){
       ConnectionFactory connection = new ConnectionFactory();
       try(Connection c = connection.conexao()){
            PreparedStatement pstmt = c.prepareStatement("UPDATE tb_aluno SET nomeAluno = ?, emailAluno = ?, cpfAluno = ?, senhaAluno = ? WHERE idAluno = ?");
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
