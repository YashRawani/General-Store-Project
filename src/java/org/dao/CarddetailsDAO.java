/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Carddetails;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class CarddetailsDAO {
    public boolean add(Carddetails c)throws Exception{
        String query = "insert into Carddetails(Carddetailsid, Cardid,Productid,Quantity) values(?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,c.getCarddetailsid());
        ps.setString(2,c.getCardid());
        ps.setString(3,c.getProductid());
        ps.setString(4,c.getQuantity());
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
    
    public boolean update(Carddetails c)throws Exception{
        String query = "update Carddetails set Cardid=?, Productid=?,Quantity=? Where Carddetailsid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,c.getCardid());
        ps.setString(2,c.getProductid());
        ps.setString(3,c.getQuantity());
        ps.setString(4,c.getCarddetailsid());
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
    public boolean delete(String Carddetailsid)throws Exception{
        String query = "delete from Carddetails Where Carddetailsid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Carddetailsid);
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
    public Carddetails getById(String Carddetailsid)throws Exception{
       Carddetails c = null;
        String query = "Select Carddetailsid, Cardid, Productid,Quantity From Carddetails Where Carddetailsid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Carddetailsid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            c = new Carddetails();
            c.setCarddetailsid(rs.getString("Carddetailsid"));
            c.setCardid(rs.getString("Cardid"));
            c.setProductid(rs.getString("Productid"));
            c.setQuantity(rs.getString("Quantity"));
        }
        con.close();
        return c;
        }
    public Carddetails[] getAll()throws Exception{
        ArrayList<Carddetails> al = new ArrayList();
        String query = "Select Carddetailsid, Cardid, Productid, Quantity From Carddetails";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Carddetails c = new Carddetails();
            c.setCarddetailsid(rs.getString("Carddetailsid"));
            c.setCardid(rs.getString("Cardid"));
            c.setProductid(rs.getString("Productid"));
            c.setQuantity(rs.getString("Quantity"));
            al.add(c);
        }
        Carddetails arr[] = new Carddetails[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Carddetailsid from uniqueids where UniqueId=1";
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
   return "CRD" + (no + 1);
}

    }
    

