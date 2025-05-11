/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qt.apn_portal.controller;

import com.qt.apn_portal.dao.AdminDao;
import com.qt.apn_portal.service.AdminService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author QaswaTech_1
 */
@WebServlet(name = "AdminController", urlPatterns = {"/AdminController"})
public class AdminController extends HttpServlet {

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
        String action = request.getParameter("action");
        switch (action) {
            case "login":
                adminLogin(request, response);
                break;
            case "sign_up":
                sign_up(request, response);
                break;
            case "logout":
                HttpSession session = request.getSession();
                session.invalidate();  // session delete
                response.sendRedirect("index.jsp?msg=Logout successfull");
                break;
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
        processRequest(request, response);
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

    private void adminLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        AdminService as = new AdminService();
        int status = as.adminLogin(phone, password);
        if (status == 1) // success
        {
            HttpSession session = request.getSession();
            session.setAttribute("user", "1");
            response.sendRedirect("dashboard.jsp?msg=Login Successfull");
        } else {
            response.sendRedirect("index.jsp?msg=Incorrect Phone or Password");
        }

    }

    private void sign_up(HttpServletRequest request, HttpServletResponse response) throws IOException {
       
   String name = request.getParameter("name");
   String phone = request.getParameter("phone");
   String password = request.getParameter("password");

    // Call the DAO class to insert the extra-curricular data
    AdminDao ad = new AdminDao();  // This should be ExtraDao instead if the extra data is stored separately
    String message = ad.sign_up(name, phone, password);  // Use a method from ExtraDao to save the extra data

    // Redirect the response with a message indicating success or failure
    response.sendRedirect("index.jsp?msg=" + message);
}
      

}
