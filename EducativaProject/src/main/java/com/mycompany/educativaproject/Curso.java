
package com.mycompany.educativaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Curso {
    private String tituloCurso, descricaoCurso, categoriaCurso, areaEnsinoCurso;
    private int duracaoCurso;
    private boolean certificadoCurso, avaliacaoCurso;

    public String getTituloCurso() {
        return tituloCurso;
    }
    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }


    public String getDescricaoCurso() {
        return descricaoCurso;
    }
    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }


    public String getCategoriaCurso() {
        return categoriaCurso;
    }
    public void setCategoriaCurso(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }


    public String getAreaEnsinoCurso() {
        return areaEnsinoCurso;
    }
    public void setAreaEnsinoCurso(String areaEnsinoCurso) {
        this.areaEnsinoCurso = areaEnsinoCurso;
    }


    public int getDuracaoCurso() {
        return duracaoCurso;
    }
    public void setDuracaoCurso(int duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }
    
    /**
     * @return the certificadoCurso
     */
    public boolean isCertificadoCurso() {
        return certificadoCurso;
    }

    /**
     * @param certificadoCurso the certificadoCurso to set
     */
    public void setCertificadoCurso(boolean certificadoCurso) {
        this.certificadoCurso = certificadoCurso;
    }

    /**
     * @return the avaliacaoCurso
     */
    public boolean isAvaliacaoCurso() {
        return avaliacaoCurso;
    }

    /**
     * @param avaliacaoCurso the avaliacaoCurso to set
     */
    public void setAvaliacaoCurso(boolean avaliacaoCurso) {
        this.avaliacaoCurso = avaliacaoCurso;
    }
    
    
    
    
    
    
    
    //--------------------
    
    
    
    
    public void registerCurso(){
        ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmt = null;
        
        try(Connection c = connection.conexao()){
            pstmt = c.prepareStatement("INSERT INTO tb_curso(tituloCurso, descCurso, duracaoCurso, categoriaCurso, areaEnsinoCurso, certificado, avaliacao) VALUES (?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, tituloCurso);
            pstmt.setString(2, descricaoCurso);
            pstmt.setInt(3, duracaoCurso);
            pstmt.setString(4, categoriaCurso);
            pstmt.setString(5, areaEnsinoCurso);
            pstmt.setBoolean(6, certificadoCurso);
            pstmt.setBoolean(7, avaliacaoCurso);
            
            pstmt.executeUpdate();
                
        }catch(Exception e){
           e.printStackTrace();     
        }
    }

    
    public void deleteCurso(){
        ConnectionFactory connection = new ConnectionFactory();
        
        try(Connection c = connection.conexao()){
            PreparedStatement pstmt = c.prepareStatement("DELETE FROM tb_curso WHERE tituloCurso = ?");
            pstmt.setString(1,tituloCurso);
            pstmt.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
