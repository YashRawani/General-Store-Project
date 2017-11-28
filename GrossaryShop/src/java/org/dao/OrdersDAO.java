/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Orders;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class OrdersDAO {
    public boolean add(Orders o)throws Exception{
        String query = "insert into Orders(Orderid,Orderdate,Ordertime,Customerid,Totalamount,Discountamount,Giftvoucherid,Billamount,Taxamount,Paymenttype) values(?,?,?,?,?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,o.getOrderid());
        ps.setString(2,o.getOrderdate());
        ps.setString(3,o.getOrdertime());
        ps.setString(4,o.getCustomerid());
        ps.setString(5,o.getTotalamount());
        ps.setString(6,o.getDiscountamount());
        ps.setString(7,o.getGiftvoucherid());
        ps.setString(8,o.getBillamount());
        ps.setString(9,o.getTaxamount());
        ps.setString(10,o.getPaymenttype());
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
    
    public boolean update(Orders o)throws Exception{
        String query = "update Orders set  Orderdate=?, Ordertime=?, Customerid=?, Totalamount=?,Discountamount=?,Giftvoucherid=?,Billamount=?, Taxamount=?, Paymenttype=? Where Orderid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        
        ps.setString(1,o.getOrderdate());
        ps.setString(2,o.getOrdertime());
        ps.setString(3,o.getCustomerid());
        ps.setString(4,o.getTotalamount());
        ps.setString(5,o.getDiscountamount());
        ps.setString(6,o.getGiftvoucherid());
        ps.setString(7,o.getBillamount());
        ps.setString(8,o.getTaxamount());
        ps.setString(9,o.getPaymenttype());
        ps.setString(10,o.getOrderid());
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
    public boolean delete(String Orderid)throws Exception{
        String query = "delete from Orders Where Orderid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Orderid);
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
    public Orders getById(String Orderid)throws Exception{
        Orders o = null;
        String query = "Select Orderid,Orderdate,Ordertime,Customerid,Totalamount,Discountamount,Giftvoucherid,Billamount,Taxamount,Paymenttype From Orders Where Orderid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Orderid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            o = new Orders();
            o.setOrderid(rs.getString("Orderid"));
            o.setOrderdate(rs.getString("Orderdate"));
            o.setOrdertime(rs.getString("Ordertime"));
            o.setCustomerid(rs.getString("Customerid"));
            o.setTotalamount(rs.getString("Totalamount"));
            o.setDiscountamount(rs.getString("Discountamount"));
            o.setGiftvoucherid(rs.getString("Giftvoucherid"));
            o.setBillamount(rs.getString("Billamount"));
            o.setTaxamount(rs.getString("Taxamount"));
            o.setPaymenttype(rs.getString("Paymenttype"));
        }
        con.close();
        return o;
        }
    public Orders[] getAll()throws Exception{
        ArrayList<Orders> al = new ArrayList();
        String query = "Select Orderid,Orderdate,Ordertime,Customerid,Totalamount,Discountamount,Giftvoucherid,Billamount,Taxamount,Paymenttype From Orders";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Orders o = new Orders();
            o.setOrderid(rs.getString("Orderid"));
            o.setOrderdate(rs.getString("Orderdate"));
            o.setOrdertime(rs.getString("Ordertime"));
            o.setCustomerid(rs.getString("Customerid"));
            o.setTotalamount(rs.getString("Totalamount"));
            o.setDiscountamount(rs.getString("Discountamount"));
            o.setGiftvoucherid(rs.getString("Giftvoucherid"));
            o.setBillamount(rs.getString("Billamount"));
            o.setTaxamount(rs.getString("Taxamount"));
            o.setPaymenttype(rs.getString("Paymenttype"));
            al.add(o);
        }
        Orders arr[] = new Orders[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Orderid from uniqueids where UniqueId=1";
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
   return "ORD" + (no + 1);
}

    }
    

