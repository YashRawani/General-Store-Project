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
import org.dao.OrderdetailsDAO;
import org.entity.Orderdetails;

/**
 *
 * @author YASH
 */
@WebServlet(name = "AdderOrderdetails", urlPatterns = {"/AdderOrderdetails"})
public class AdderOrderdetails extends HttpServlet {

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
            String Orderdetailsid = request.getParameter("txtOrderdetailsid");
            String Orderid = request.getParameter("txtOrderid");
            String Productid1 = request.getParameter("txtProductid1");
            String Productid2 = request.getParameter("txtProductid2");
            String Productid = Productid1 + " , " + Productid2;
            String Quantity = request.getParameter("txtQuantity");
            String Amount = request.getParameter("txtAmount");
            
            Orderdetails o = new Orderdetails();
            o.setOrderdetailsid(Orderdetailsid);
            o.setOrderid(Orderid);
            o.setProductid(Productid);
            o.setQuantity(Quantity);
            o.setAmount(Amount);
            OrderdetailsDAO dao = new OrderdetailsDAO();
            boolean status = dao.add(o);
            String str = "";
            if(status){
                str = "Orderdetails details added successfully...";
            }else{
                str = "Unable to add Orderdetails details";
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
