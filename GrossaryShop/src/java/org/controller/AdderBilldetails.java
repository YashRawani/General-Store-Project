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
import org.dao.BilldetailsDAO;
import org.entity.Billdetails;

/**
 *
 * @author YASH
 */
@WebServlet(name = "AdderBilldetails", urlPatterns = {"/AdderBilldetails"})
public class AdderBilldetails extends HttpServlet {

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
            Billdetails b = new Billdetails();
            String Billid = request.getParameter("txtBillid");
            String Orderid = request.getParameter("txtOrderid");
            String Amount = request.getParameter("txtAmount");
            String Bankname = request.getParameter("txtBankname");
            String Cardnumber = request.getParameter("txtCardnumber");
            String Billdate = request.getParameter("txtBilldate");
            String Billtime = request.getParameter("txtBilltime");
            
            
            b.setBillid(Billid);
            b.setOrderid(Orderid);
            b.setAmount(Amount);
            b.setBankname(Bankname);
            b.setCardnumber(Cardnumber);
            b.setBilldate(Billdate);
            b.setBilltime(Billtime);
            BilldetailsDAO dao = new BilldetailsDAO();
            boolean status = dao.add(b);
            String str = "";
            if(status){
                str = "Billdetails details added successfully...";
            }else{
                str = "Unable to add Billdetails details";
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
