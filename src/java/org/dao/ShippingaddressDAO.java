/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Shippingaddress;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class ShippingaddressDAO {
    public boolean add(Shippingaddress s)throws Exception{
        String query = "insert into Shippingaddress(Shippingaddressid,Orderid,Customerid,Productid,Quantity,Consigneeid) values(?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,s.getShippingaddressid());
        ps.setString(2,s.getOrderid());
        ps.setString(3,s.getCustomerid());
        ps.setString(4,s.getProductid());
        ps.setString(5,s.getQuantity());
        ps.setString(6,s.getConsigneeid());
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
    
    public boolean update(Shippingaddress s)throws Exception{
        String query = "update Shippingaddress set Orderid=?, Customerid=?, Productid=?, Quantity=?, Consigneeid=? Where Shippingaddressid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,s.getOrderid());
        ps.setString(2,s.getCustomerid());
        ps.setString(3,s.getProductid());
        ps.setString(4,s.getQuantity());
        ps.setString(5,s.getConsigneeid());
        ps.setString(6,s.getShippingaddressid());
        
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
    public boolean delete(String Shippingaddressid)throws Exception{
        String query = "delete from Shippingaddress Where Shippingaddressid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Shippingaddressid);
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
    public Shippingaddress getById(String Shippingaddressid)throws Exception{
        Shippingaddress s = null;
        String query = "Select Shippingaddressid,Orderid,Customerid,Productid,Quantity,Consigneeid From Shippingaddress Where Shippingaddressid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Shippingaddressid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            s = new Shippingaddress();
            s.setShippingaddressid(rs.getString("Shippingaddressid"));
            s.setOrderid(rs.getString("Orderid"));
            s.setCustomerid(rs.getString("Customerid"));
            s.setProductid(rs.getString("Productid"));
            s.setQuantity(rs.getString("Quantity"));
            s.setConsigneeid(rs.getString("Consigneeid"));
        }
        con.close();
        return s;
        }
    public Shippingaddress[] getAll()throws Exception{
        ArrayList<Shippingaddress> al = new ArrayList();
        String query = "Select Shippingaddressid,Orderid,Customerid,Productid,Quantity,Consigneeid From Shippingaddress";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Shippingaddress s = new Shippingaddress();
            s.setShippingaddressid(rs.getString("Shippingaddressid"));
            s.setOrderid(rs.getString("Orderid"));
            s.setCustomerid(rs.getString("Customerid"));
            s.setProductid(rs.getString("Productid"));
            s.setQuantity(rs.getString("Quantity"));
            s.setConsigneeid(rs.getString("Consigneeid"));
            al.add(s);
        }
        Shippingaddress arr[] = new Shippingaddress[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Shippingaddressid from uniqueids where UniqueId=1";
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
   return "SHA" + (no + 1);
}

    }
    

