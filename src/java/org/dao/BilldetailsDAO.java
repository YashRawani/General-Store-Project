/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Billdetails;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class BilldetailsDAO {
    public boolean add(Billdetails b)throws Exception{
        String query = "insert into Billdetails(Billid,Orderid,Amount,Bankname,Cardnumber,Billdate,Billtime) values(?,?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,b.getBillid());
        ps.setString(2,b.getOrderid());
        ps.setString(3,b.getAmount());
        ps.setString(4,b.getBankname());
        ps.setString(5,b.getCardnumber());
        ps.setString(6,b.getBilldate());
        ps.setString(7,b.getBilltime());
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
    
    public boolean update(Billdetails b)throws Exception{
        String query = "update Billdetails set Orderid=?, Amount=?, Bankname=?, Cardnumber=?, Billdate=?, Billtime=? Where Billid=? ";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,b.getOrderid());
        ps.setString(2,b.getAmount());
        ps.setString(3,b.getBankname());
        ps.setString(4,b.getCardnumber());
        ps.setString(5,b.getBilldate());
        ps.setString(6,b.getBilltime());
        ps.setString(7,b.getBillid());
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
    public boolean delete(String Billid)throws Exception{
        String query = "delete from Billdetails Where Billid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Billid);
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
    public Billdetails getById(String Billid)throws Exception{
        Billdetails b = null;
        String query = "Select Billid,Orderid,Amount,Bankname,Cardnumber,Billdate,Billtime From Billdetails Where Billid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Billid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            b = new Billdetails();
            b.setBillid(rs.getString("Billid"));
            b.setOrderid(rs.getString("Orderid"));
            b.setAmount(rs.getString("Amount"));
            b.setBankname(rs.getString("Bankname"));
            b.setCardnumber(rs.getString("Cardnumber"));
            b.setCardnumber(rs.getString("Billdate"));
            b.setCardnumber(rs.getString("Billtime"));
        }
        con.close();
        return b;
        }
    public Billdetails[] getAll()throws Exception{
        ArrayList<Billdetails> al = new ArrayList();
        String query = "Select Billid,Orderid,Amount,Bankname,Cardnumber,Billdate,Billtime From Billdetails";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Billdetails b = new Billdetails();
            b.setBillid(rs.getString("Billid"));
            b.setOrderid(rs.getString("Orderid"));
            b.setAmount(rs.getString("Amount"));
            b.setBankname(rs.getString("Bankname"));
            b.setCardnumber(rs.getString("Cardnumber"));
            b.setCardnumber(rs.getString("Billdate"));
            b.setCardnumber(rs.getString("Billtime"));
            al.add(b);
        }
        Billdetails arr[] = new Billdetails[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    
public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Billid from uniqueids where UniqueId=1";
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
   return "BDT" + (no + 1);
}

}