/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.dao.AdminDAO;
import org.entity.Admin;




/**
 *
 * @author YASH
 */
@WebServlet(name = "AdderAdmin", urlPatterns = {"/AdderAdmin"})
public class AdderAdmin extends HttpServlet {

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
        try
        {
            String Adminid = request.getParameter("txtAdminid");
            String Adminfirstname = request.getParameter("txtAdminfirstname");
            String Adminmiddlename = request.getParameter("txtAdminmiddlename");
            String Adminlastname = request.getParameter("txtAdminlastname");
            String Username = request.getParameter("txtUsername");
            String Adminpassword = request.getParameter("txtAdminpassword");
            String Email = request.getParameter("txtEmail");
            String Contactnumber = request.getParameter("txtContactnumber");
            String Address = request.getParameter("txtAddress");
            String Gender = request.getParameter("txtGender");
            String Dateofbirth = request.getParameter("txtDateofbirth");
            
            Admin a = new Admin();
            a.setAdminid(Adminid);
            a.setAdminfirstname(Adminfirstname);
            a.setAdminmiddlename(Adminmiddlename);
            a.setAdminlastname(Adminlastname);
            a.setUsername(Username);
            a.setAdminpassword(Adminpassword);
            a.setEmail(Email);
            a.setContactnumber(Contactnumber);
            a.setAddress(Address);
            a.setGender(Gender);
            a.setDateofbirth(Dateofbirth);
            
            AdminDAO dao = new AdminDAO();
            boolean status = dao.add(a);
            String str = "";
            if(status){
                str = "Admin details added successfully...";
            }else{
                str = "Unable to add Admin details";
            }
            request.setAttribute("Strmsg", str);
            RequestDispatcher rd = request.getRequestDispatcher("status.jsp");
            rd.forward(request, response);
            return;
        }
        catch(Exception e)
        {
            e.printStackTrace();
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

}