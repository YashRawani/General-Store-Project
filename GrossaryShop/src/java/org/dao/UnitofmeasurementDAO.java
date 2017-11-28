/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.entity.Unitofmeasurement;
import org.utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinod
 */
public class UnitofmeasurementDAO {
    public boolean add(Unitofmeasurement u)throws Exception{
        String query = "insert into Unitofmeasurement(Unitofmeasurementid,Unitofmeasurement,Description) values(?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,u.getUnitofmeasurementid());
        ps.setString(2,u.getUnitofmeasurement());
        ps.setString(3,u.getDescription());
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
    
    public boolean update(Unitofmeasurement u)throws Exception{
        String query = "update Unitofmeasurement set Unitofmeasurement=?, Description=? Where Unitofmeasurementid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,u.getUnitofmeasurement());
        ps.setString(2,u.getDescription());
        ps.setString(3,u.getUnitofmeasurementid());
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
    public boolean delete(String Unitofmeasurementid)throws Exception{
        String query = "delete from Unitofmeasurement Where Unitofmeasurementid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Unitofmeasurementid);
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
    public Unitofmeasurement getById(String Unitofmeasurementid)throws Exception{
        Unitofmeasurement u = null;
        String query = "Select Unitofmeasurementid,Unitofmeasurement,Description From Unitofmeasurement Where Unitofmeasurementid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Unitofmeasurementid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            u = new Unitofmeasurement();
            u.setUnitofmeasurementid(rs.getString("Unitofmeasurementid"));
            u.setUnitofmeasurement(rs.getString("Unitofmeasurement"));
            u.setDescription(rs.getString("Description"));
        }
        con.close();
        return u;
        }
    public Unitofmeasurement[] getAll()throws Exception{
        ArrayList<Unitofmeasurement> al = new ArrayList();
        String query = "Select Unitofmeasurementid,Unitofmeasurement,Description From Unitofmeasurement";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Unitofmeasurement u = new Unitofmeasurement();
            u.setUnitofmeasurementid(rs.getString("Unitofmeasurementid"));
            u.setUnitofmeasurement(rs.getString("Unitofmeasurement"));
            u.setDescription(rs.getString("Description"));
            al.add(u);
        }
        Unitofmeasurement arr[] = new Unitofmeasurement[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }
    public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Unitofmeasurementid from uniqueids where UniqueId=1";
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
   return "UOM" + (no + 1);
}

    }
    

