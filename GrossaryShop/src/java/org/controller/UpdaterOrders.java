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
import org.dao.OrdersDAO;
import org.entity.Orders;

/**
 *
 * @author YASH
 */
@WebServlet(name = "UpdaterOrders", urlPatterns = {"/UpdaterOrders"})
public class UpdaterOrders extends HttpServlet {

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
            String Orderid = request.getParameter("txtOrderid");
            String Orderdate = request.getParameter("txtOrderdate");
            String Ordertime = request.getParameter("txtOrdertime");
            String Customerid = request.getParameter("txtCustomerid");
            String Totalamount = request.getParameter("txtTotalamount");
            String Discountamount = request.getParameter("txtDiscountamount");
            String Giftvoucherid = request.getParameter("txtGiftvoucherid");
            String Billamount = request.getParameter("txtBillamount");
            String Taxamount = request.getParameter("txtTaxamount");
            String Paymenttype = request.getParameter("txtPaymenttype");
            
            Orders o = new Orders();
            o.setOrderid(Orderid);
            o.setOrderdate(Orderdate);
            o.setOrdertime(Ordertime);
            o.setCustomerid(Customerid);
            o.setTotalamount(Totalamount);
            o.setDiscountamount(Discountamount);
            o.setGiftvoucherid(Giftvoucherid);
            o.setBillamount(Billamount);
            o.setTaxamount(Taxamount);
            o.setPaymenttype(Paymenttype);
            OrdersDAO dao = new OrdersDAO();
            boolean status = dao.update(o);
            String str = "";
            if(status){
                str = "Orders details updated successfully...";
            }else{
                str = "Unable to update Orders details";
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
