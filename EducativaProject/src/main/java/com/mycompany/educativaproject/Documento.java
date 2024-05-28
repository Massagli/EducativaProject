
package com.mycompany.educativaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Documento {
    private String tituloDocumento, tipoDocumento, linkDocumento;

    /**
     * @return the tituloDocumento
     */
    public String getTituloDocumento() {
        return tituloDocumento;
    }
    public void setTituloDocumento(String tituloDocumento) {
        this.tituloDocumento = tituloDocumento;
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the linkDocumento
     */
    public String getLinkDocumento() {
        return linkDocumento;
    }
    public void setLinkDocumento(String linkDocumento) {
        this.linkDocumento = linkDocumento;
    }
    
    
    
    //-------------------
    
    
    public void registerDocumento(){
        ConnectionFactory connection = new ConnectionFactory();
        PreparedStatement pstmt=null;
        try (Connection c = connection.conexao()) {
                pstmt=c.prepareStatement("Insert into tb_documento (tituloDocumento, linkDocumento) values (?,?)");
                pstmt.setString(1, tituloDocumento);
                pstmt.setString(2, linkDocumento);
                pstmt.execute();
            } catch (Exception e){
                e.printStackTrace();
            }
    }
    
    
    
    
    
    
    
}
