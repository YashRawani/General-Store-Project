/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.dao.AdminDAO;
import org.entity.Customer;
import org.dao.CustomerDAO;
import org.entity.Admin;


/**
 *
 * @author Aditya
 */
@WebServlet(name = "Validator", urlPatterns = {"/Validator"})
public class Validator extends HttpServlet {

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
        try {
            String strUN = request.getParameter("txtUN");
            String strPW = request.getParameter("txtPwd");
            String strUT = request.getParameter("cboUserType");
            
            if(strUT.equals("Admin"))
            {
                AdminDAO dao = new AdminDAO();
                Admin adm = dao.Validate(strUN, strPW);
                
                if(adm != null)
                {
                    HttpSession sess = request.getSession();
                    sess.setAttribute("username", strUN);
                    sess.setAttribute("usertype", strUT);
                    sess.setAttribute("userobj", adm);
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
                    rd.forward(request, response);
                    return;
                }
                else
                {
                    request.setAttribute("errMsg","Invalid username or password for this role.");
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);
                    return;
                }
            }
            else if(strUT.equals("Customer"))
            {
                CustomerDAO dao = new CustomerDAO();
                Customer cus = dao.Validate(strUN, strPW);
                
                if(cus != null)
                {
                    HttpSession sess = request.getSession();
                    sess.setAttribute("username", strUN);
                    sess.setAttribute("usertype", strUT);
                    sess.setAttribute("userobj", cus);
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
                    rd.forward(request, response);
                    return;
                }
                else
                {
                    request.setAttribute("errMsg","Invalid username or password for this role.");
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);
                    return;
                }
            }
                
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
