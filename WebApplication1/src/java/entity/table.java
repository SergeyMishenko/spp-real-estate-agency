/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Adress;
import entity.Property;
import entity.User;
import java.util.ArrayList;
import javafx.beans.binding.Bindings;

/**
 *
 * @author Сергей
 */
public class table {
    public static String writeTableUser (ArrayList<User> listUser, ArrayList<Adress> listAdress) {
    String s;
    int j;
        
       s =  "<!DOCTYPE html>"
            +"<html>"
            +"<head>"
            +"<title>Servlet StartServlet</title>"
            +"<link rel='stylesheet' href='css/style.css'>"
            +"</head>"
            +"<body>"
            +"<table border='1'>";
       
            s= s+ "<tr>" 
                        +"<th>User_id</th>"
                        +"<th>Login</th>"
                        +"<th>Password</th>"
                        +"<th>Name</th>"
                        +"<th>Surname</th>"
                        +"<th>MiddleName</th>"
                        +"<th>PhoneNumber</th>"
                        +"<th>Role</th>"
                        +"<th>Email</th>"
                        +"<th>AdressID</th>"
                        +"<th>Country</th>"
                        +"<th>City</th>"
                        +"<th>Street</th>"
                        +"<th>HouseNumber</th>"
                        +"<th>partment</th>"
                        +"<th>Housing</th>"
                    +"</tr>";
       
               for (int i=0; i<listUser.size(); i++){
                   j=0;
                   while (listUser.get(i).getAdressID() != listAdress.get(j).getAdress_id() && j<listAdress.size()){
                    j++;    
                   }
                    s= s+ "<tr>" 
                        +"<th>" + listUser.get(i).getUser_id()  +"</th>"
                        +"<th>" + listUser.get(i).getLogin()  +"</th>"
                        +"<th>" + listUser.get(i).getPassword()  +"</th>"
                        +"<th>" + listUser.get(i).getName()  +"</th>"
                        +"<th>" + listUser.get(i).getSurname()  +"</th>"
                        +"<th>" + listUser.get(i).getMiddleName()  +"</th>"
                        +"<th>" + listUser.get(i).getPhoneNumber()  +"</th>"
                        +"<th>" + listUser.get(i).getRole()  +"</th>"
                        +"<th>" + listUser.get(i).getEmail()  +"</th>"
                        +"<th>" + listUser.get(i).getAdressID()  +"</th>"
                        +"<th>" + listAdress.get(j).getCountry()+"</th>"
                        +"<th>" + listAdress.get(j).getCity()+"</th>"
                        +"<th>" + listAdress.get(j).getStreet()+"</th>"
                        +"<th>" + listAdress.get(j).getHouseNumber()+"</th>"
                        +"<th>" + listAdress.get(j).getApartment()+"</th>"
                        +"<th>" + listAdress.get(j).getHousing()+"</th>"
                    +"</tr>";
               }
            
            s +="</table>"
                +"</body>"
                +"</html>";
            return s;
    }

    public static String writeTableAdress(ArrayList<Adress> listAdress) {
     String s;
        
       s =  "<!DOCTYPE html>"
            +"<html>"
            +"<head>"
            +"<title>Servlet StartServlet</title>"
               +"<link rel='stylesheet' href='css/style.css'>"
            +"</head>"
            +"<body>"
            +"<table border='1'>";
        s= s+ "<tr>" 
                        +"<th>AdressID</th>"
                        +"<th>Country</th>"
                        +"<th>City</th>"
                        +"<th>Street</th>"
                        +"<th>HouseNumber</th>"
                        +"<th>partment</th>"
                        +"<th>Housing</th>"
                    +"</tr>";
               for (int i=0; i<listAdress.size(); i++){
               s= s+ "<tr>" 
                  +"<th>" + listAdress.get(i).getAdress_id()  +"</th>"
                  +"<th>" + listAdress.get(i).getCountry()+"</th>"
                  +"<th>" + listAdress.get(i).getCity()+"</th>"
                  +"<th>" + listAdress.get(i).getStreet()+"</th>"
                  +"<th>" + listAdress.get(i).getHouseNumber()+"</th>"
                  +"<th>" + listAdress.get(i).getApartment()+"</th>"
                  +"<th>" + listAdress.get(i).getHousing()+"</th>"
                  +"</tr>";
               }
            
            s +="</table>"
                +"</body>"
                +"</html>";
            return s;
    }

    public static String writeTableProperty(ArrayList<Property> listProperty, ArrayList<Adress> listAdress) {
     String s;
     int j;
        
       s =  "<!DOCTYPE html>"
            +"<html>"
            +"<head>"
            +"<title>Servlet StartServlet</title>"
               +"<link rel='stylesheet' href='css/style.css'>"
            +"</head>"
            +"<body>"
            +"<table border='1'>";
       
        s= s+ "<tr>" 
                  +"<th>Property_id</th>"
                  +"<th>Type</th>"
                  +"<th>Square</th>"
                  +"<th>getPrice</th>"
                  +"<th>Seller_id</th>"
                  +"<th>Country</th>"
                  +"<th>City</th>"
                  +"<th>Street</th>"
                  +"<th>HouseNumber</th>"
                  +"<th>partment</th>"
                  +"<th>Housing</th>"
                  +"</tr>";
                        
               for (int i=0; i<listProperty.size(); i++){
                   j=0;
                   while (listProperty.get(i).getAdress_id()!= listAdress.get(j).getAdress_id() && j<listAdress.size()){
                    j++;    
                   }
               s= s+ "<tr>" 
                  +"<th>" + listProperty.get(i).getProperty_id()+"</th>"
                  +"<th>" + listProperty.get(i).getType()+"</th>"
                  +"<th>" + listProperty.get(i).getSquare()+"</th>"
                  +"<th>" + listProperty.get(i).getPrice()+"</th>"
                  +"<th>" + listProperty.get(i).getSeller_id()+"</th>"
                  +"<th>" + listAdress.get(j).getCountry()+"</th>"
                  +"<th>" + listAdress.get(j).getCity()+"</th>"
                  +"<th>" + listAdress.get(j).getStreet()+"</th>"
                  +"<th>" + listAdress.get(j).getHouseNumber()+"</th>"
                  +"<th>" + listAdress.get(j).getApartment()+"</th>"
                  +"<th>" + listAdress.get(j).getHousing()+"</th>"
                  +"</tr>";
               }
            
            s +="</table>"
                +"</body>"
                +"</html>";
            return s;
    }
    
}
