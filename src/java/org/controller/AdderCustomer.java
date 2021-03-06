/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.dao.CustomerDAO;
import org.entity.Customer;

/**
 *
 * @author YASH
 */
@WebServlet(name = "AdderCustomer", urlPatterns = {"/AdderCustomer"})
@MultipartConfig(maxFileSize = 16177215)
public class AdderCustomer extends HttpServlet {

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

            String Customerid = request.getParameter("txtCustomerid");
            String Customerfirstname = request.getParameter("txtCustomerfirstname");
            String Customermiddlename = request.getParameter("txtCustomermiddlename");
            String Customerlastname = request.getParameter("txtCustomerlastname");
            String Username = request.getParameter("txtUsername");
            String Customerpassword = request.getParameter("txtCustomerpassword");
            String Email = request.getParameter("txtEmail");
            String Contactnumber = request.getParameter("txtContactnumber");
            String Address = request.getParameter("txtAddress");
            String Gender = request.getParameter("txtGender");
            String Dateofbirth = request.getParameter("txtDateofbirth");
            //String Photo = request.getParameter("txtPhoto");
            //InputStream b=Photo.getBytes();

            Customer c = new Customer();
            c.setCustomerid(Customerid);
            c.setCustomerfirstname(Customerfirstname);
            c.setCustomermiddlename(Customermiddlename);
            c.setCustomerlastname(Customerlastname);
            c.setUsername(Username);
            c.setCustomerpassword(Customerpassword);
            c.setEmail(Email);
            c.setContactnumber(Contactnumber);
            c.setAddress(Address);
            c.setGender(Gender);
            c.setDateofbirth(Dateofbirth);
            //c.setPhoto(b);

            InputStream inputStream = null;
            Part filePart = request.getPart("txtPhoto");
            if (filePart != null) {
                inputStream = filePart.getInputStream();
            }
            c.setPhoto(inputStream);

            CustomerDAO dao = new CustomerDAO();
            boolean status = dao.add(c);
            String str = "";
            if (status) {
                str = "Customer details added successfully...";
            } else {
                str = "Unable to add Customer details";
            }
            request.setAttribute("Strmsg", str);
            RequestDispatcher rd = request.getRequestDispatcher("status.jsp");
            rd.forward(request, response);
            return;
        } catch (Exception e) {
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
