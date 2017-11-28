/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Shoppingcart;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class ShoppingcartDAO {
    public boolean add(Shoppingcart s)throws Exception{
        String query = "insert into Shoppingcart(Shoppingcartid,Cartname,Shoppingdate,Shoppingtime,Description,Customerid) values(?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,s.getShoppingcartid());
        ps.setString(2,s.getCartname());
        ps.setString(3,s.getShoppingdate());
        ps.setString(4,s.getShoppingtime());
        ps.setString(5,s.getDescription());
        ps.setString(6,s.getCustomerid());
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
    
    public boolean update(Shoppingcart s)throws Exception{
        String query = "update Shoppingcart set Cartname=?, Shoppingdate=?, Shoppingtime=?, Description=?, Customerid=? Where Shoppingcartid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,s.getCartname());
        ps.setString(2,s.getShoppingdate());
        ps.setString(3,s.getShoppingtime());
        ps.setString(4,s.getDescription());
        ps.setString(5,s.getCustomerid());
        ps.setString(6,s.getShoppingcartid());
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
    public boolean delete(String Shoppingcartid)throws Exception{
        String query = "delete from Shoppingcart Where Shoppingcartid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Shoppingcartid);
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
    public Shoppingcart getById(String Shoppingcartid)throws Exception{
        Shoppingcart s = null;
        String query = "Select Shoppingcartid,Cartname,Shoppingdate,Shoppingtime,Description,Customerid From Shoppingcart Where Shoppingcartid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Shoppingcartid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            s = new Shoppingcart();
            s.setShoppingcartid(rs.getString("Shoppingcartid"));
            s.setCartname(rs.getString("Cartname"));
            s.setShoppingdate(rs.getString("Shoppingdate"));
            s.setShoppingtime(rs.getString("Shoppingtime"));
            s.setDescription(rs.getString("Description"));
            s.setCustomerid(rs.getString("Customerid"));
        }
        con.close();
        return s;
        }
    public Shoppingcart[] getAll()throws Exception{
        ArrayList<Shoppingcart> al = new ArrayList();
        String query = "Select Shoppingcartid,Cartname,Shoppingdate,Shoppingtime,Description,Customerid From Shoppingcart";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Shoppingcart s = new Shoppingcart();
            s.setShoppingcartid(rs.getString("Shoppingcartid"));
            s.setCartname(rs.getString("Cartname"));
            s.setShoppingdate(rs.getString("Shoppingdate"));
            s.setShoppingtime(rs.getString("Shoppingtime"));
            s.setDescription(rs.getString("Description"));
            s.setCustomerid(rs.getString("Customerid"));
            al.add(s);
        }
        Shoppingcart arr[] = new Shoppingcart[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Shoppingcartid from uniqueids where UniqueId=1";
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
   return "SCT" + (no + 1);
}

    }
    

