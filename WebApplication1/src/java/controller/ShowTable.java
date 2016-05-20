/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoAdress;
import dao.DaoProperty;
import dao.DaoUser;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.table;
import database.DataBase;
import entity.Adress;
import entity.Property;

/**
 *
 * @author Сергей
 */
@WebServlet(name = "ShowTable", urlPatterns = {"/ShowTable"})
public class ShowTable extends HttpServlet {
    
    private ArrayList<User> users;
    private ArrayList<Property> property;
    private ArrayList<Adress> adress;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

             try {
                 
                 response.setContentType("text/html;charset=UTF-8");
                 String responseString;
                 
                 
                 DataBase db = DataBase.getDB("jdbc:mysql://localhost:3306/my_db_spp", "root", "");
                 DaoAdress daoAdress = new DaoAdress(db);

                   
                 switch(request.getParameter("nameTable")) {
                    case "users":
                        DaoUser daoUser = new DaoUser(db);
                        users = daoUser.getAllUsers();
                        adress = daoAdress.getAllAdresses();
                        responseString = table.writeTableUser(users,adress);
                        try (PrintWriter out = response.getWriter()) {
                                out.println(responseString);
                            }
                    break;
                      
                    case "adress":
                        adress = daoAdress.getAllAdresses();
                        responseString = table.writeTableAdress(adress);
                        try (PrintWriter out = response.getWriter()) {
                                out.println(responseString);
                            }
                    break;
                    
                    case "property":
                        DaoProperty daoProperty = new DaoProperty(db);
                        property = daoProperty.getAllProperties();
                        adress = daoAdress.getAllAdresses();
                        responseString = table.writeTableProperty(property, adress);
                        try (PrintWriter out = response.getWriter()) {
                                out.println(responseString);
                            }
                    break;
                    
                    default:
                        responseString = "<h1>таблица  " +request.getParameter("nameTable")+ " не найдена </h1>";
                        responseString+= "<p><a href='http://localhost:8080/WebApplication1/adminMain.jsp'>назад</a></p>";

                        try (PrintWriter out = response.getWriter()) {
                                out.println(responseString);
                            }
                        
                break;
                         
                 }
                 
                 
                 
                 
             }   catch (SQLException ex) {
            Logger.getLogger(ShowTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
}
