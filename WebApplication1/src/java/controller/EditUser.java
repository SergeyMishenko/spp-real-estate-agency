/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoAdress;
import dao.DaoUser;
import database.DataBase;
import entity.Adress;
import entity.Initialization;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
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
@WebServlet(name = "EditUser", urlPatterns = {"/EditUser"})
public class EditUser extends HttpServlet {

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
            out.println("<title>Servlet EditUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditUser at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        try {
            
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            DataBase db = DataBase.getDB("jdbc:mysql://localhost:3306/my_db_spp", "root", "");
            
            
            User user = Initialization.UserInitialization(request);
            user.setUser_id(Integer.parseInt(request.getParameter("id_user")));
            
            if(request.getParameter("role")!="") user.setRole(Integer.parseInt(request.getParameter("role")));
            else   user.setRole(-1);
            
            if(request.getParameter("id_adress")!="") user.setAdressID(Integer.parseInt(request.getParameter("id_adress")));
            else   user.setAdressID(-1);
            
            DaoUser daoUser = new DaoUser(db);
            daoUser.update(user);
            
            RequestDispatcher view = request.getRequestDispatcher("/adminMain.jsp");  
            view.forward(request, response);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddPropertyServlet.class.getName()).log(Level.SEVERE, null, ex);
            RequestDispatcher view = request.getRequestDispatcher("/exception.jsp");
            view.forward(request, response);
        }
       catch (Exception e ) {
        RequestDispatcher view = request.getRequestDispatcher("/exception.jsp");  
        view.forward(request, response);
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
