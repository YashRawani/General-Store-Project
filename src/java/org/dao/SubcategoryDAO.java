/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Subcategory;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class SubcategoryDAO {
    public boolean add(Subcategory s)throws Exception{
        String query = "insert into Subcategory(Subcategoryid, Categoryid, Subcategoryname,Description) values(?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,s.getSubcategoryid());
        ps.setString(2,s.getCategoryid());
        ps.setString(3,s.getSubcategoryname());
        ps.setString(4,s.getDescription());
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
    
    public boolean update(Subcategory s)throws Exception{
        String query = "update Subcategory set Categoryid=?, Subcategoryname=?,Description=? Where Subcategoryid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,s.getCategoryid());
        ps.setString(2,s.getSubcategoryname());
        ps.setString(3,s.getDescription());
        ps.setString(4,s.getSubcategoryid());
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
    public boolean delete(String Subcategoryid)throws Exception{
        String query = "delete from Subcategory Where Subcategoryid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Subcategoryid);
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
    public Subcategory getById(String Subcategoryid)throws Exception{
       Subcategory s = null;
        String query = "Select Subcategoryid, Categoryid, Subcategoryname,Description From Subcategory Where Subcategoryid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Subcategoryid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            s = new Subcategory();
            s.setSubcategoryid(rs.getString("Subcategoryid"));
            s.setCategoryid(rs.getString("Categoryid"));
            s.setSubcategoryname(rs.getString("Subcategoryname"));
            s.setDescription(rs.getString("Description"));
        }
        con.close();
        return s;
        }
    public Subcategory[] getAll()throws Exception{
        ArrayList<Subcategory> al = new ArrayList();
        String query = "Select Subcategoryid, Categoryid, Subcategoryname,Description From Subcategory";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Subcategory s = new Subcategory();
            s.setSubcategoryid(rs.getString("Subcategoryid"));
            s.setCategoryid(rs.getString("Categoryid"));
            s.setSubcategoryname(rs.getString("Subcategoryname"));
            s.setDescription(rs.getString("Description"));
            al.add(s);
        }
        Subcategory arr[] = new Subcategory[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Subcategoryid from uniqueids where UniqueId=1";
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
   return "SUB" + (no + 1);
}

    }
    

