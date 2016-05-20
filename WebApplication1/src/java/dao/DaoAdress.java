/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static database.DBConstants.TABLE_ADRESS_ID_COLUMN;
import static database.DBConstants.TABLE_ADRESS_NAME;
import static database.DBConstants.TABLE_USER_LOGIN_COLUMN;
import static database.DBConstants.TABLE_USER_NAME;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import database.DataBase;
import entity.Adress;

/**
 *
 * @author Михаил
 */
public class DaoAdress implements DAOInterface<Adress>{
    private DataBase db;
    public int adressId;
    
    public DaoAdress (DataBase db){
        this.db = db;
    }

    @Override
    public void insert(Adress t) throws SQLException {
       int bufAdressId=0;
        
        ResultSet rs = db.query("SELECT id_adress FROM adress");
        while (rs.next()) {
            if (bufAdressId<rs.getInt("id_adress")) 
            bufAdressId = rs.getInt("id_adress");
        }
        t.setAdress_id(bufAdressId+1);
        adressId = t.getAdress_id();
        
        db.update("INSERT INTO " + TABLE_ADRESS_NAME + "(id_adress,country, city, street, house_number, apartment, housing) VAlUES ("
                + "'"+ t.getAdress_id()
                + "','" + t.getCountry()
                + "','" + t.getCity()
                + "','" + t.getStreet() 
                + "','" + t.getHouseNumber()
                + "','" + t.getApartment()
                + "','" + t.getHousing()+"')"); 
    }

    @Override
    public void delete(Adress t) throws SQLException {
        db.update("DELETE FROM " + TABLE_ADRESS_NAME + " WHERE " + TABLE_ADRESS_ID_COLUMN + "=" + "'" + t.getAdress_id()+"'");
    }

    @Override
    public void update(Adress t) throws SQLException {
      String s = "UPDATE "+TABLE_ADRESS_NAME+" SET ";
      if (false == t.getCountry().equals(""))
      s= s+"`country`='" +t.getCountry()+"' , ";
      
      if (false == t.getCity().equals(""))
      s= s+"`city`='" +t.getCity()+"' , ";
      
      if (false == t.getStreet().equals(""))
      s= s+"`street`='" +t.getStreet()+"' , ";
      
      if (t.getHouseNumber()!= -1)
      s= s+"`house_number`='" +t.getHouseNumber()+"' , ";
      
      if (false == t.getHousing().equals(""))
      s= s+"`housing`='" +t.getHousing()+"' , ";
      
      
      if (-1 != t.getApartment())
      s= s+"`apartament`='" +t.getApartment()+"' , ";
      
      s = s.substring(0, s.length()-2);
      s = s+" WHERE "+ TABLE_ADRESS_ID_COLUMN + "=" + "'" + t.getAdress_id()+"';";
        db.update(s);
        
    }
    
    public ArrayList<Adress> getAllAdresses() throws SQLException{
        ArrayList<Adress> adresses = new ArrayList<Adress>();
        ResultSet rs = db.query("SELECT * FROM Adress");
        while (rs.next()) {
            adresses.add(new Adress(rs.getInt("id_adress"), 
                    rs.getString("country"), 
                    rs.getString("city"), 
                    rs.getString("street"), 
                    rs.getInt("house_number"), 
                    rs.getString("housing"), 
                    rs.getInt("apartment")));
        }
        return adresses;
    }
}
