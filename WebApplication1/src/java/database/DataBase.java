/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Михаил
 */
public class DataBase {
	
    private static DataBase db;
    private Connection cn;
    private Statement st;

    public Connection getConnection() {
        return cn;
    }

    public Statement getStatement() {
        return st;
    }
    
    private DataBase(String url, String user, String pass){
        try {
            DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
            cn = (Connection) DriverManager.getConnection(url, user, pass);
            st = (Statement) cn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ошибка подключения к БД.");
        }      
    }
    
    public static DataBase getDB(String url, String user, String pass){
        if (db == null){
            db = new DataBase(url, user, pass);
        }
        return db;
    }
    
    public void update(String sql) throws SQLException{
        st.executeUpdate(sql);
    }
    
    public ResultSet query(String sql) throws SQLException{
        ResultSet rs = null;
        rs = st.executeQuery(sql);
        return rs;
    }
    
    public void close() throws SQLException{
        st.close();
        cn.close();
    }
}
