
package com.mycompany.educativaproject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


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
    
    
    public void registerProfessor(){
       ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmt = null;
        
        try(Connection c = connection.conexao()){
            pstmt = c.prepareStatement("Insert into tb_professor(nomeProfessor, cpfProfessor, emailProfessor, formacaoProfessor, escolaridadeProfessor, senhaProfessor) values (?,?,?,?,?,?)");    
            pstmt.setString(1, nomeProfessor);
            pstmt.setString(2, cpfProfessor);
            pstmt.setString(3, emailProfessor);
            pstmt.setString(4, escolaridadeProfessor);
            pstmt.setString(5, formacaoProfessor);
            pstmt.setString(6, senhaProfessor);
        
            pstmt.executeUpdate();      

        }
        
        catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    
    public void deleteProfessor(int id){
        ConnectionFactory connection = new ConnectionFactory();
        
        try(Connection c = connection.conexao()){
            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM tb_professor");
            ResultSet result = pstmt.executeQuery();
            
            while(result.next()){
                int idCompare = result.getInt("idProfessor");
                if(idCompare == id){
                    CallableStatement cs = c.prepareCall("{Call sp_ExcluirProfessor(?)}");
                    cs.setInt(1,id);
                    cs.execute();
                }
            }
            
            
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
