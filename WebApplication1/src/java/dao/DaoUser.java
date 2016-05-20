/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dao.DAOInterface;
import static database.DBConstants.*;
import database.DataBase;
import entity.User;

/**
 *
 * @author teacher
 */
public class DaoUser implements DAOInterface<User> {
    private DataBase db;

    public DaoUser(DataBase db) {
        this.db = db;
    }

    @Override
    public void insert(User t) throws SQLException {
        

        db.update("INSERT INTO " + TABLE_USER_NAME + "(login, password, name, surname, middle_name, phone_number, role, email, id_adress) VAlUES ("
                + "'" + t.getLogin() 
                + "','" + t.getPassword() 
                + "','" + t.getName() 
                + "','" + t.getSurname() 
                + "','" + t.getMiddleName() 
                + "','" + t.getPhoneNumber()
                + "','" + t.getRole() + "','" 
                + t.getEmail() + "','" 
                + t.getAdressID() + "')");
        
    }

    @Override
    public void delete(User t) throws SQLException {
        db.update("DELETE FROM " + TABLE_USER_NAME + " WHERE " + TABLE_USER_LOGIN_COLUMN + "=" + "'" + t.getLogin()+"'");
    }

    @Override
    public void update(User t) throws SQLException {
     String s = "UPDATE "+TABLE_USER_NAME+" SET ";
      if (false == t.getLogin().equals(""))
      s= s+"`login`='" +t.getLogin()+"' , ";
      
      if (false == t.getPassword().equals(""))
      s= s+"`password`='" +t.getPassword()+"' , ";
      
      if (false == t.getName().equals(""))
      s= s+"`name`='" +t.getName()+"' , ";
      
      if (false == t.getSurname().equals(""))
      s= s+"`surname`='" +t.getSurname()+"' , ";
      
      if (false == t.getMiddleName().equals(""))
      s= s+"`middle_name`='" +t.getMiddleName()+"' , ";
      
      if (false == t.getPhoneNumber().equals(""))
      s= s+"`phone_number`='" +t.getPhoneNumber()+"' , ";
      
      if (t.getRole()!= -1)
      s= s+"`role`='" +t.getRole()+"' , ";
      
      if (t.getAdressID()!= -1)
      s= s+"`id_adress`='" +t.getAdressID()+"' , ";
      
      
      if (false == t.getEmail().equals(""))
      s= s+"`email`='" +t.getEmail()+"' , ";
      
      s = s.substring(0, s.length()-2);
      s = s+" WHERE "+ TABLE_USER_ID_COLUMN + "=" + "'" + t.getUser_id()+"';";
        db.update(s);
 }

    public ArrayList<User> getAllUsers() throws SQLException {
        ArrayList<User> allUsers = new ArrayList<>();
        ResultSet rs = db.query("SELECT * FROM " + TABLE_USER_NAME);
        while (rs.next()) {
            allUsers.add(new User(rs.getInt(TABLE_USER_ID_COLUMN), 
                    rs.getString(TABLE_USER_LOGIN_COLUMN), 
                    rs.getString(TABLE_USER_PASS_COLUMN), 
                    rs.getString(TABLE_USER_NAME_COLUMN), 
                    rs.getString(TABLE_USER_SURNAME_COLUMN), 
                    rs.getString(TABLE_USER_MID_NAME_COLUMN), 
                    rs.getString(TABLE_USER_PHONE_COLUMN), 
                    rs.getInt(TABLE_USER_ROLE_COLUMN), 
                    rs.getString(TABLE_USER_EMAIL_COLUMN), 
                    rs.getInt(TABLE_USER_ADRESS_ID_COLUMN)));
        }
        return allUsers;
    }

}
