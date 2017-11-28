/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Consignee;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class ConsigneeDAO {
    public boolean add(Consignee c)throws Exception{
        String query = "insert into Consignee(Consigneeid,Consigneename,Address,Customerid,Contactnumber) values(?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,c.getConsigneeid());
        ps.setString(2,c.getConsigneename());
        ps.setString(3,c.getAddress());
        ps.setString(4,c.getCustomerid());
        ps.setString(5,c.getContactnumber());
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
    
    public boolean update(Consignee c)throws Exception{
        String query = "update Consignee set Consigneename=?, Address=?, Customerid=?, Contactnumber=? Where Consigneeid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,c.getConsigneename());
        ps.setString(2,c.getAddress());
        ps.setString(3,c.getCustomerid());
        ps.setString(4,c.getContactnumber());
        ps.setString(5,c.getConsigneeid());
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
    public boolean delete(String Consigneeid)throws Exception{
        String query = "delete from Consignee Where Consigneeid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Consigneeid);
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
    public Consignee getById(String Consigneeid)throws Exception{
        Consignee c = null;
        String query = "Select Consigneeid,Consigneename,Address,Customerid,Contactnumber From Consignee Where Consigneeid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Consigneeid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            c = new Consignee();
            c.setConsigneeid(rs.getString("Consigneeid"));
            c.setConsigneename(rs.getString("Consigneename"));
            c.setAddress(rs.getString("Address"));
            c.setCustomerid(rs.getString("Customerid"));
            c.setContactnumber(rs.getString("Contactnumber"));
        }
        con.close();
        return c;
        }
    public Consignee[] getAll()throws Exception{
        ArrayList<Consignee> al = new ArrayList();
        String query = "Select Consigneeid,Consigneename,Address,Customerid,Contactnumber From Consignee";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Consignee c = new Consignee();
            c.setConsigneeid(rs.getString("Consigneeid"));
            c.setConsigneename(rs.getString("Consigneename"));
            c.setAddress(rs.getString("Address"));
            c.setCustomerid(rs.getString("Customerid"));
            c.setContactnumber(rs.getString("Contactnumber"));
            al.add(c);
        }
        Consignee arr[] = new Consignee[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Consigneeid from uniqueids where UniqueId=1";
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
   return "CON" + (no + 1);
}

    }
    

