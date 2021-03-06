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
import org.dao.ShoppingcartDAO;
import org.entity.Shoppingcart;

/**
 *
 * @author YASH
 */
@WebServlet(name = "AdderShoppingcart", urlPatterns = {"/AdderShoppingcart"})
public class AdderShoppingcart extends HttpServlet {

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
            String Shoppingcartid = request.getParameter("txtShoppingcartid");
            String Cartname = request.getParameter("txtCartname");
            String Shoppingdate = request.getParameter("txtShoppingdate");
            String Shoppingtime = request.getParameter("txtShoppingtime");
            String Description = request.getParameter("txtDescription");
            String Customerid = request.getParameter("txtCustomerid");
            
            Shoppingcart s = new Shoppingcart();
            s.setShoppingcartid(Shoppingcartid);
            s.setCartname(Cartname);
            s.setShoppingdate(Shoppingdate);
            s.setShoppingtime(Shoppingtime);
            s.setDescription(Description);
            s.setCustomerid(Customerid);
            ShoppingcartDAO dao = new ShoppingcartDAO();
            boolean status = dao.add(s);
            String str = "";
            if(status){
                str = "Shoppingcart details added successfully...";
            }else{
                str = "Unable to add Shoppingcart details";
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
