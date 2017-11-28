/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.dao.ProductDAO;
import org.entity.Product;

/**
 *
 * @author YASH
 */
@WebServlet(name = "UpdaterProduct", urlPatterns = {"/UpdaterProduct"})
@MultipartConfig(maxFileSize = 16177215)
public class UpdaterProduct extends HttpServlet {

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
            Product p = new Product();
            String Productid = request.getParameter("txtProductid");
            String Productname = request.getParameter("txtProductname");
            String Categoryid = request.getParameter("txtCategoryid");
            String Subcategoryid = request.getParameter("txtSubcategoryid");
            String Brandid = request.getParameter("txtBrandid");
            String Unitofmeasurementid = request.getParameter("txtUnitofmeasurementid");
            String Quantityonhand = request.getParameter("txtQuantityonhand");
            
            InputStream inputStream = null;
            Part filePart = request.getPart("txtPhoto");
            if (filePart != null) {
                inputStream = filePart.getInputStream();
            }
            p.setPhoto(inputStream);
            String Price = request.getParameter("txtPrice");
            
            
            p.setProductid(Productid);
            p.setProductname(Productname);
            p.setCategoryid(Categoryid);
            p.setSubcategoryid(Subcategoryid);
            p.setBrandid(Brandid);
            p.setUnitofmeasurementid(Unitofmeasurementid);
            p.setQuantityonhand(Quantityonhand);
            //p.setPhoto(b);
            p.setPrice(Price);
            
            ProductDAO dao = new ProductDAO();
            boolean status = dao.update(p);
            String str = "";
            if(status){
                str = "Product details updated successfully...";
            }else{
                str = "Unable to update Product details";
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