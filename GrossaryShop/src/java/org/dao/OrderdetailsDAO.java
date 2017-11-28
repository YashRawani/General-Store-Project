/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Orderdetails;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class OrderdetailsDAO {
    public boolean add(Orderdetails o)throws Exception{
        String query = "insert into Orderdetails(Orderdetailsid,Orderid,Productid,Quantity,Amount) values(?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,o.getOrderdetailsid());
        ps.setString(2,o.getOrderid());
        ps.setString(3,o.getProductid());
        ps.setString(4,o.getQuantity());
        ps.setString(5,o.getAmount());
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
    
    public boolean update(Orderdetails o)throws Exception{
        String query = "update Orderdetails set Orderid=?, Productid=?, Quantity=?, Amount=? Where Orderdetailsid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,o.getOrderid());
        ps.setString(2,o.getProductid());
        ps.setString(3,o.getQuantity());

        ps.setString(4,o.getAmount());
        ps.setString(5,o.getOrderdetailsid());
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
    public boolean delete(String Orderdetailsid)throws Exception{
        String query = "delete from Orderdetails Where Orderdetailsid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Orderdetailsid);
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
    public Orderdetails getById(String Orderdetailsid)throws Exception{
        Orderdetails o = null;
        String query = "Select Orderdetailsid,Orderid,Productid,Quantity,Amount From Orderdetails Where Orderdetailsid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Orderdetailsid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            o = new Orderdetails();
            o.setOrderdetailsid(rs.getString("Orderdetailsid"));
            o.setOrderid(rs.getString("Orderid"));
            o.setProductid(rs.getString("Productid"));
            o.setQuantity(rs.getString("Quantity"));
            o.setAmount(rs.getString("Amount"));
        }
        con.close();
        return o;
        }
    public Orderdetails[] getAll()throws Exception{
        ArrayList<Orderdetails> al = new ArrayList();
        String query = "Select Orderdetailsid,orderid,Productid,Quantity,Amount From Orderdetails";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Orderdetails o = new Orderdetails();
            o.setOrderdetailsid(rs.getString("Orderdetailsid"));
            o.setOrderid(rs.getString("Orderid"));
            o.setProductid(rs.getString("Productid"));
            o.setQuantity(rs.getString("Quantity"));
            o.setAmount(rs.getString("Amount"));
            al.add(o);
        }
        Orderdetails arr[] = new Orderdetails[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Orderdetailsid from uniqueids where UniqueId=1";
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
   return "ODT" + (no + 1);
}

    }
    

