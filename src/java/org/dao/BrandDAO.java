/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Brand;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class BrandDAO {
    public boolean add(Brand b)throws Exception{
        String query = "insert into Brand(Brandid,Brandname,Brandlogo,Description) values(?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,b.getBrandid());
        ps.setString(2,b.getBrandname());
        ps.setString(3,b.getBrandlogo());
        ps.setString(4,b.getDescription());
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
    
    public boolean update(Brand b)throws Exception{
        String query = "update Brand set Brandname=?,Brandlogo=?,Description=? Where Brandid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,b.getBrandname());
        ps.setString(2,b.getBrandlogo());
        ps.setString(3,b.getDescription());
        ps.setString(4,b.getBrandid());
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
    public boolean delete(String Brandid)throws Exception{
        String query = "delete from Brand Where Brandid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Brandid);
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
    public Brand getById(String Brandid)throws Exception{
        Brand b = null;
        String query = "Select Brandid,Brandname,Brandlogo,Description From Brand Where Brandid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Brandid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            b = new Brand();
            b.setBrandid(rs.getString("Brandid"));
            b.setBrandname(rs.getString("Brandname"));
            b.setBrandlogo(rs.getString("Brandlogo"));
            b.setDescription(rs.getString("Description"));
        }
        con.close();
        return b;
        }
    public Brand[] getAll()throws Exception{
        ArrayList<Brand> al = new ArrayList();
        String query = "Select Brandid,Brandname,Brandlogo,Description From Brand";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Brand b = new Brand();
            b.setBrandid(rs.getString("Brandid"));
            b.setBrandname(rs.getString("Brandname"));
            b.setBrandlogo(rs.getString("Brandlogo"));
            b.setDescription(rs.getString("Description"));
        al.add(b);
        }
         Brand arr[] = new Brand[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Brandid from uniqueids where UniqueId=1";
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
   return "BRD" + (no + 1);
}

    }

