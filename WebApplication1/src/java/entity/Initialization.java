/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import controller.AuthorizationServlet;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Сергей
 */
public class Initialization {
    public static User UserInitialization(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String middleName = request.getParameter("middle_name");
        String phoneNumber = request.getParameter("phone");
        String email = request.getParameter("email");
       
        User user = new User(login, password, name, surname, middleName, phoneNumber, 0, email, 1);
       
        return user;
    }
  
        public static Adress adressInitialization(HttpServletRequest request) {
        String house_number;
        String apartment;
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String street = request.getParameter("street");
        if (false == request.getParameter("house_number").equals("")){
        house_number = request.getParameter("house_number");
        } else house_number = "-1";
        if (false == request.getParameter("apartment").equals("")){
        apartment = request.getParameter("apartment");}
                 else apartment = "-1";
        String housing = request.getParameter("housing");
       
        Adress adress = new Adress(-1,country,city,street,Integer.parseInt(house_number),housing,Integer.parseInt(apartment));
        return adress;
    }
    
        
        public static Property propertyInitialization(HttpServletRequest request) {
        String type = request.getParameter("type");
        String square = request.getParameter("square");
        String price = request.getParameter("price");
        
        if (price =="") price="-1";
        if (square =="") square="-1";
        
        int idSeller = AuthorizationServlet.idUser;
        Property property = new Property(0, type, Integer.parseInt(square), Integer.parseInt(price), idSeller);
        return property;
    }
}
