/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Category;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class CategoryDAO {
    public boolean add(Category c)throws Exception{
        String query = "insert into Category(Categoryid,Categoryname,Description) values(?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,c.getCategoryid());
        ps.setString(2,c.getCategoryname());
        ps.setString(3,c.getDescription());
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
    
    public boolean update(Category c)throws Exception{
        String query = "update Category set Categoryname=?, Description=? Where Categoryid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,c.getCategoryname());
        ps.setString(2,c.getDescription());
        ps.setString(3,c.getCategoryid());
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
    public boolean delete(String Categoryid)throws Exception{
        String query = "delete from Category Where Categoryid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Categoryid);
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
    
    public Category getById(String Categoryid)throws Exception{
        Category c = null;
        String query = "Select Categoryid,Categoryname,Description From Category Where Categoryid=? ";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Categoryid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            c = new Category();
            c.setCategoryid(rs.getString("Categoryid"));
            c.setCategoryname(rs.getString("Categoryname"));
            c.setDescription(rs.getString("Description"));
        }
        con.close();
        return c;
        }
    public Category[] getAll()throws Exception{
        ArrayList<Category> al = new ArrayList();
        String query = "Select Categoryid,Categoryname,Description From Category";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Category c = new Category();
            c.setCategoryid(rs.getString("Categoryid"));
            c.setCategoryname(rs.getString("Categoryname"));
            c.setDescription(rs.getString("Description"));
            al.add(c);
        }
        Category arr[] = new Category[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Categoryid from uniqueids where UniqueId=1";
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
   return "CAT" + (no + 1);
}


    }
    

