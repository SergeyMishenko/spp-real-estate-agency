/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoUser;
import database.DataBase;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Сергей
 */
@WebServlet(name = "AuthorizationServlet", urlPatterns = {"/AuthorizationServlet"})
public  class AuthorizationServlet extends HttpServlet {
    public static int idUser;
    private ArrayList<User> users;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AuthorizationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AuthorizationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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
        
        try {
            response.setContentType("text/html;charset=UTF-8");
            String responseString;
            String login;
            String password;
            boolean authorizationFlag = false;
            
            login = request.getParameter("login");
            password = request.getParameter("password");
            
            DataBase db = DataBase.getDB("jdbc:mysql://localhost:3306/my_db_spp", "root", "");
            DaoUser daoUser = new DaoUser(db);
            users = daoUser.getAllUsers();
            for (int i=0; i<users.size(); i++) {
                if (login.equals(users.get(i).getLogin()) && password.equals(users.get(i).getPassword())) {
                   if (users.get(i).getRole() == 1){
                        RequestDispatcher view = request.getRequestDispatcher("/adminMain.jsp");  
                        view.forward(request, response); 
                   } else {
                        RequestDispatcher view = request.getRequestDispatcher("/userMain.jsp");  
                        view.forward(request, response); 
                   }
                       
                   authorizationFlag = true;
                   idUser = users.get(i).getUser_id();
                }
            }
            if (authorizationFlag == false) {
                RequestDispatcher view = request.getRequestDispatcher("/exception.jsp");  
                view.forward(request, response);
            } 
            
            
            
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AuthorizationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
