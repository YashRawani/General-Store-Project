/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Giftvoucher;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class GiftvoucherDAO {
    public boolean add(Giftvoucher g)throws Exception{
        String query = "insert into Giftvoucher(Giftvoucherid,Giftvouchername,Giftvouchernumber,Amount,Validfromdate,Validtodate) values(?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,g.getGiftvoucherid());
        ps.setString(2,g.getGiftvouchername());
        ps.setString(3,g.getGiftvouchernumber());
        ps.setString(4,g.getAmount());
        ps.setString(5,g.getValidfromdate());
        ps.setString(6,g.getValidtodate());
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
    
    public boolean update(Giftvoucher g)throws Exception{
        String query = "update Giftvoucher set Giftvouchername=?, Giftvouchernumber=?, Amount=?, Validfromdate=?, Validtodate=? Where Giftvoucherid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        
        ps.setString(1,g.getGiftvouchername());
        ps.setString(2,g.getGiftvouchernumber());
        ps.setString(3,g.getAmount());
        ps.setString(4,g.getValidfromdate());
        ps.setString(5,g.getValidtodate());
        ps.setString(6,g.getGiftvoucherid());
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
    public boolean delete(String Giftvoucherid)throws Exception{
        String query = "delete from Giftvoucher Where Giftvoucherid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Giftvoucherid);
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
    public Giftvoucher getById(String Orderdetailsid)throws Exception{
        Giftvoucher g = null;
        String query = "Select Giftvoucherid,Giftvouchername,Giftvouchernumber,Amount,Validfromdate,Validtodate From Giftvoucher Where Giftvoucherid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Orderdetailsid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            g = new Giftvoucher();
            g.setGiftvoucherid(rs.getString("Giftvoucherid"));
            g.setGiftvouchername(rs.getString("Giftvouchername"));
            g.setGiftvouchernumber(rs.getString("Giftvouchernumber"));
            g.setAmount(rs.getString("Amount"));
            g.setValidfromdate(rs.getString("Validfromdate"));
            g.setValidtodate(rs.getString("Validtodate"));
        }
        con.close();
        return g;
        }
    public Giftvoucher[] getAll()throws Exception{
        ArrayList<Giftvoucher> al = new ArrayList();
        String query = "Select Giftvoucherid,Giftvouchername,Giftvouchernumber,Amount,Validfromdate,Validtodate From Giftvoucher";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Giftvoucher g = new Giftvoucher();
            g.setGiftvoucherid(rs.getString("Giftvoucherid"));
            g.setGiftvouchername(rs.getString("Giftvouchername"));
            g.setGiftvouchernumber(rs.getString("Giftvouchernumber"));
            g.setAmount(rs.getString("Amount"));
            g.setValidfromdate(rs.getString("Validfromdate"));
            g.setValidtodate(rs.getString("Validtodate"));
            al.add(g);
        }
        Giftvoucher arr[] = new Giftvoucher[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Giftvoucherid from uniqueids where UniqueId=1";
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
   return "GVO" + (no + 1);
}

}
    

