/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.educativaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author adrie
 */
public class ConnectionFactory {
    
    public void conexao(){
        String usuario = "root";
        String senha = "12345678";
        String host = "localhost";
        String porta = "3306";
        String bd = "db_educativa";
        
        try{
            //Define o Driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //abertura conexão
            //definindo url
            Connection conexao = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd,usuario,senha);
            System.out.println("Conectou com sucesso");
            
            conexao.close();
        //tratando erro de conexao
        }catch(SQLException e){
            System.err.println("Não foi possível conectar ao banco");
            e.printStackTrace();
        //tratando erro de driver não encontrado
        }catch(ClassNotFoundException e){
            System.err.println("O driver JDBC não foi encontrado");
            e.printStackTrace();
        }
    }
        
    
}
