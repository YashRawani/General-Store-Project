/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Customer;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class CustomerDAO {
    public boolean add(Customer c)throws Exception{
        String query = "insert into Customer(Customerid,Customerfirstname,Customermiddlename,Customerlastname,Username,Customerpassword,Email,Contactnumber,Address,Gender,Dateofbirth,Photo) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,c.getCustomerid());
        ps.setString(2,c.getCustomerfirstname());
        ps.setString(3,c.getCustomermiddlename());
        ps.setString(4,c.getCustomerlastname());
        ps.setString(5,c.getUsername());
        ps.setString(6,c.getCustomerpassword());
        ps.setString(7,c.getEmail());
        ps.setString(8,c.getContactnumber());
        ps.setString(9,c.getAddress());
        ps.setString(10,c.getGender());
        ps.setString(11,c.getDateofbirth());
        ps.setBlob(12,c.getPhoto());
        int rs=ps.executeUpdate();
        con.close();
        if(rs>0)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    
    public boolean update(Customer c)throws Exception{
        String query = "update Customer set  Customerfirstname=?, Customermiddlename=?, Customerlastname=?,Username=?,Customerpassword=?,Email=?,Contactnumber=?, Address=?, Gender=?, Dateofbirth=? Where Customerid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        
        ps.setString(1,c.getCustomerfirstname());
        ps.setString(2,c.getCustomermiddlename());
        ps.setString(3,c.getCustomerlastname());
        ps.setString(4,c.getUsername());
        ps.setString(5,c.getCustomerpassword());
        ps.setString(6,c.getEmail());
        ps.setString(7,c.getContactnumber());
        ps.setString(8,c.getAddress());
        ps.setString(9,c.getGender());
        ps.setString(10,c.getDateofbirth());
        ps.setString(11,c.getCustomerid());  
        int rs=ps.executeUpdate();
        con.close();
        if(rs>0)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    public boolean delete(String Customer)throws Exception{
        String query = "delete from Customer Where Customerid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Customer);
        int rs=ps.executeUpdate();
        con.close();
        if(rs>0)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    public Customer getById(String Customerid)throws Exception{
        Customer c = null;
        String query = "Select Customerid,Customerfirstname,Customermiddlename,Customerlastname,Username,Customerpassword,Email,Contactnumber,Address,Gender,Dateofbirth,Photo From Customer Where Customerid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Customerid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            c = new Customer();
            c.setCustomerid(rs.getString("Customerid"));
            c.setCustomerfirstname(rs.getString("Customerfirstname"));
            c.setCustomermiddlename(rs.getString("Customermiddlename"));
            c.setCustomerlastname(rs.getString("Customerlastname"));
            c.setUsername(rs.getString("Username"));
            c.setCustomerpassword(rs.getString("Customerpassword"));
            c.setEmail(rs.getString("Email"));
            c.setContactnumber(rs.getString("Contactnumber"));
            c.setAddress(rs.getString("Address"));
            c.setGender(rs.getString("Gender"));
            c.setDateofbirth(rs.getString("Dateofbirth"));

        }
        con.close();
        return c;
        }
    
    public Customer Validate(String un,String pwd)throws Exception{
        Customer c = null;
        String query = "Select Customerid,Customerfirstname,Customermiddlename,Customerlastname,Username,Customerpassword,Email,Contactnumber,Address,Gender,Dateofbirth,Photo From Customer Where Username=? and Customerpassword=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,un);
        ps.setString(2,pwd);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            c = new Customer();
            c.setCustomerid(rs.getString("Customerid"));
            c.setCustomerfirstname(rs.getString("Customerfirstname"));
            c.setCustomermiddlename(rs.getString("Customermiddlename"));
            c.setCustomerlastname(rs.getString("Customerlastname"));
            c.setUsername(rs.getString("Username"));
            c.setCustomerpassword(rs.getString("Customerpassword"));
            c.setEmail(rs.getString("Email"));
            c.setContactnumber(rs.getString("Contactnumber"));
            c.setAddress(rs.getString("Address"));
            c.setGender(rs.getString("Gender"));
            c.setDateofbirth(rs.getString("Dateofbirth"));

        }
        con.close();
        return c;
        }
    
    public Customer[] getAll()throws Exception{
        ArrayList<Customer> al = new ArrayList();
        String query = "Select Customerid,Customerfirstname,Customermiddlename,Customerlastname,Username,Customerpassword,Email,Contactnumber,Address,Gender,Dateofbirth,Photo From Customer";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Customer c = new Customer();
            c.setCustomerid(rs.getString("Customerid"));
            c.setCustomerfirstname(rs.getString("Customerfirstname"));
            c.setCustomermiddlename(rs.getString("Customermiddlename"));
            c.setCustomerlastname(rs.getString("Customerlastname"));
            c.setUsername(rs.getString("Username"));
            c.setCustomerpassword(rs.getString("Customerpassword"));
            c.setEmail(rs.getString("Email"));
            c.setContactnumber(rs.getString("Contactnumber"));
            c.setAddress(rs.getString("Address"));
            c.setGender(rs.getString("Gender"));
            c.setDateofbirth(rs.getString("Dateofbirth"));

            al.add(c);
        }
        Customer arr[] = new Customer[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Customerid from uniqueids where UniqueId=1";
   DBConnection db = new DBConnection();
   Connection con = db.getConnection();
   PreparedStatement ps = con.prepareStatement(q);
   ResultSet rs = ps.executeQuery();
   int no = 0;
   if (rs.next()) {
       str = rs.getString(1);
       no = Integer.parseInt(str);
   }
   con.close();
   return "CUS" + (no + 1);

  }
}
    

