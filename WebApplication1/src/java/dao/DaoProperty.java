/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DBConstants;
import static database.DBConstants.TABLE_PROPERTY_ADRESS_ID_COLUMN;
import static database.DBConstants.TABLE_PROPERTY_NAME;
import static database.DBConstants.TABLE_PROPERTY_PROPERTY_ID_COLUMN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import database.DataBase;
import entity.Property;

/**
 *
 * @author Михаил
 */
public class DaoProperty implements DAOInterface<Property>{
    private DataBase db;
    
    public DaoProperty(DataBase db){
        this.db = db;
    }

    @Override
    public void insert(Property t) throws SQLException {
        db.update("INSERT INTO " + TABLE_PROPERTY_NAME + "(type,square, price, id_adress, id_seller) VAlUES ("
                + "'"+ t.getType()
                + "','" + t.getSquare()
                + "','" + t.getPrice()
                + "','" + t.getAdress_id()
                + "','" + t.getSeller_id() + "')");
    }

    @Override
    public void delete(Property t) throws SQLException {
        db.update("DELETE FROM " + TABLE_PROPERTY_NAME + " WHERE " + TABLE_PROPERTY_PROPERTY_ID_COLUMN + "="  + t.getProperty_id());
    }

    @Override
    public void update(Property t) throws SQLException {
        String s = "UPDATE "+TABLE_PROPERTY_NAME+" SET ";
      
        
      if (false == t.getType().equals(""))
      s= s+"`type`='" +t.getType()+"' , ";
      
      if (t.getSquare()!= -1)
      s= s+"`square`='" +t.getSquare()+"' , ";
      
      if (t.getPrice()!= -1)
      s= s+"`price`='" +t.getPrice()+"' , ";
      
      if (t.getAdress_id()!= -1)
      s= s+"`id_adress`='" +t.getAdress_id()+"' , ";
      
      if (t.getSeller_id()!= -1)
      s= s+"`id_seller`='" +t.getSeller_id()+"' , ";
      
     
      s = s.substring(0, s.length()-2);
      s = s+" WHERE "+ TABLE_PROPERTY_PROPERTY_ID_COLUMN + "=" + "'" + t.getProperty_id()+"';";
        db.update(s);
    }
    
    public ArrayList<Property> getAllProperties() throws SQLException{
        ArrayList<Property> properties = new ArrayList<Property>();
        ResultSet rs = db.query("SELECT * FROM property");
        while (rs.next()) {
            int  yu =rs.getInt("id_adress");
            properties.add(new Property(rs.getInt("id_property"), 
                    rs.getInt("id_adress"), 
                    rs.getString("type"), 
                    rs.getInt("square"), 
                    rs.getInt("price"),  
                    rs.getInt("id_seller")));
        }
        return properties;
    }
    
}
