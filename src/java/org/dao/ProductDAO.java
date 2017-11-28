/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Product;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class ProductDAO {
    public boolean add(Product p)throws Exception{
        String query = "insert into Product(Productid,Productname,Categoryid,Subcategoryid,Brandid,Unitofmeasurementid,Quantityonhand,Photo,Price) values(?,?,?,?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,p.getProductid());
        ps.setString(2,p.getProductname());
        ps.setString(3,p.getCategoryid());
        ps.setString(4,p.getSubcategoryid());
        ps.setString(5,p.getBrandid());
        ps.setString(6,p.getUnitofmeasurementid());
        ps.setString(7,p.getQuantityonhand());
        ps.setBlob(8,p.getPhoto());
        ps.setString(9,p.getPrice());
        
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
    
    public boolean update(Product p)throws Exception{
        String query = "update Product set Productname=?,Categoryid=?,Subcategoryid=?,Brandid=?,Unitofmeasurementid=?,Quantityonhand=?,Price=? Where Productid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,p.getProductname());
        ps.setString(2,p.getCategoryid());
        ps.setString(3,p.getSubcategoryid());
        ps.setString(4,p.getBrandid());
        ps.setString(5,p.getUnitofmeasurementid());
        ps.setString(6,p.getQuantityonhand());
        ps.setString(7,p.getPrice());
        ps.setString(8,p.getProductid());
        
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
    public boolean delete(String Productid)throws Exception{
        String query = "delete from Product Where Productid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Productid);
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
    public Product getById(String Productid)throws Exception{
        Product p = null;
        String query = "Select Productid,Productname,Categoryid,Subcategoryid,Brandid,Unitofmeasurementid,Quantityonhand,Photo,Price From Product Where Productid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Productid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            
            p = new Product();
            p.setProductid(rs.getString("Productid"));
            p.setProductname(rs.getString("Productname"));
            p.setCategoryid(rs.getString("Categoryid"));
            p.setSubcategoryid(rs.getString("Subcategoryid"));
            p.setBrandid(rs.getString("Brandid"));
            p.setUnitofmeasurementid(rs.getString("Unitofmeasurementid"));
            p.setQuantityonhand(rs.getString("Quantityonhand"));
            
            p.setPrice(rs.getString("Price"));
        }
        con.close();
        return p;
        }
    public Product[] getAll()throws Exception{
        ArrayList<Product> al = new ArrayList();
        String query = "Select Productid,Productname,Categoryid,Subcategoryid,Brandid,Unitofmeasurementid,Quantityonhand,Photo,Price From Product";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Product p = new Product();
            p.setProductid(rs.getString("Productid"));
            p.setProductname(rs.getString("Productname"));
            p.setCategoryid(rs.getString("Categoryid"));
            p.setSubcategoryid(rs.getString("Subcategoryid"));
            p.setBrandid(rs.getString("Brandid"));
            p.setUnitofmeasurementid(rs.getString("Unitofmeasurementid"));
            p.setQuantityonhand(rs.getString("Quantityonhand"));
            
            p.setPrice(rs.getString("Price"));
           
            al.add(p);
        }
        Product arr[] = new Product[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Productid from uniqueids where UniqueId=1";
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
   return "PRO" + (no + 1);
}

    }
    

