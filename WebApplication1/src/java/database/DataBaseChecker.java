/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;

/**
 *
 * @author Михаил
 */
public class DataBaseChecker {
    
    public static boolean checkConnection(DataBase db){
        Connection cn = db.getConnection();
        return cn == null ? false : true;
    }
    
}
