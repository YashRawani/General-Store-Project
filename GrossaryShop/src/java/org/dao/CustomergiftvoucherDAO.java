/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Customergiftvoucher;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class CustomergiftvoucherDAO {
    public boolean add(Customergiftvoucher c)throws Exception{
        String query = "insert into Customergiftvoucher(Customergiftvoucherid,Giftvoucherid,Customerid,Giftvoucherdate) values(?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,c.getCustomergiftvoucherid());
        ps.setString(2,c.getGiftvoucherid());
        ps.setString(3,c.getCustomerid());
        ps.setString(4,c.getGiftvoucherdate());
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
    
    public boolean update(Customergiftvoucher c)throws Exception{
        String query = "update Customergiftvoucher set  Customerid=?, Giftvoucherdate=?,Customergiftvoucherid=? where Giftvoucherid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
       
        ps.setString(1,c.getCustomerid());
        ps.setString(2,c.getGiftvoucherdate());
        ps.setString(3,c.getGiftvoucherid());
         ps.setString(4,c.getGiftvoucherid());
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
    public boolean delete(String Customergiftvoucherid)throws Exception{
        String query = "delete from Customergiftvoucher Where Customergiftvoucherid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Customergiftvoucherid);
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
    public Customergiftvoucher getById(String Customergiftvoucherid)throws Exception{
        Customergiftvoucher c = null;
        String query = "Select Customergiftvoucherid,Giftvoucherid,Customerid,Giftvoucherdate From Customergiftvoucher Where Customergiftvoucherid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Customergiftvoucherid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            c = new Customergiftvoucher();
            c.setCustomergiftvoucherid(rs.getString("Customergiftvoucherid"));
            c.setGiftvoucherid(rs.getString("Giftvoucherid"));
            c.setCustomerid(rs.getString("Customerid"));
            c.setGiftvoucherdate(rs.getString("Giftvoucherdate"));
        }
        con.close();
        return c;
        }
    public Customergiftvoucher[] getAll()throws Exception{
        ArrayList<Customergiftvoucher> al = new ArrayList();
        String query = "Select Customergiftvoucherid,Giftvoucherid,Customerid,Giftvoucherdate From Customergiftvoucher";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Customergiftvoucher c = new Customergiftvoucher();
            c.setCustomergiftvoucherid(rs.getString("Customergiftvoucherid"));
            c.setGiftvoucherid(rs.getString("Giftvoucherid"));
            c.setCustomerid(rs.getString("Customerid"));
            c.setGiftvoucherdate(rs.getString("Giftvoucherdate"));
            al.add(c);
        }
        Customergiftvoucher arr[] = new Customergiftvoucher[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Customergiftvoucherid from uniqueids where UniqueId=1";
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
   return "CGV" + (no + 1);
}

    
    }
    

