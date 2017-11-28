
package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.entity.Admin;
import org.utility.DBConnection;

public class AdminDAO {
    public boolean add(Admin a)throws Exception{
        String query = "insert into Admin(Adminid,Adminfirstname,Adminmiddlename,Adminlastname,Username,Adminpassword,Email,Contactnumber,Address,Gender,Dateofbirth) values(?,?,?,?,?,?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,a.getAdminid());
        ps.setString(2,a.getAdminfirstname());
        ps.setString(3,a.getAdminmiddlename());
        ps.setString(4,a.getAdminlastname());
        ps.setString(5,a.getUsername());
        ps.setString(6,a.getAdminpassword());
        ps.setString(7,a.getEmail());
        ps.setString(8,a.getContactnumber());
        ps.setString(9,a.getAddress());
        ps.setString(10,a.getGender());
        ps.setString(11,a.getDateofbirth());
        int rs = ps.executeUpdate();
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
    
    public boolean update(Admin a)throws Exception{
        String query = "update Admin set  Adminfirstname=?, Adminmiddlename=?, Adminlastname=?,Username=?,Adminpassword=?,Email=?,Contactnumber=?, Address=?, Gender=?, Dateofbirth=? Where Adminid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        
        ps.setString(1,a.getAdminfirstname());
        ps.setString(2,a.getAdminmiddlename());
        ps.setString(3,a.getAdminlastname());
        ps.setString(4,a.getUsername());
        ps.setString(5,a.getAdminpassword());
        ps.setString(6,a.getEmail());
        ps.setString(7,a.getContactnumber());
        ps.setString(8,a.getAddress());
        ps.setString(9,a.getGender());
        ps.setString(10,a.getDateofbirth());
        ps.setString(11,a.getAdminid());
        
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
    public boolean delete(String Adminid)throws Exception{
        String query = "delete from Admin Where Adminid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Adminid);
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
    
    public Admin Validate(String un, String pwd)throws Exception{
        Admin a = null;
        String query = "Select Adminid,Adminfirstname,Adminmiddlename,Adminlastname,Username,Adminpassword,Email,Contactnumber,Address,Gender,Dateofbirth From Admin Where Username=? and Adminpassword=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,un);
        ps.setString(2,pwd);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            a = new Admin();
            a.setAdminid(rs.getString("Adminid"));
            a.setAdminfirstname(rs.getString("Adminfirstname"));
            a.setAdminmiddlename(rs.getString("Adminmiddlename"));
            a.setAdminlastname(rs.getString("Adminlastname"));
            a.setUsername(rs.getString("Username"));
            a.setAdminpassword(rs.getString("Adminpassword"));
            a.setEmail(rs.getString("Email"));
            a.setContactnumber(rs.getString("Contactnumber"));
            a.setAddress(rs.getString("Address"));
            a.setGender(rs.getString("Gender"));
            a.setDateofbirth(rs.getString("Dateofbirth"));
        }
        con.close();
        return a;
        }
    
    public Admin getById(String Adminid)throws Exception{
        Admin a = null;
        String query = "Select Adminid,Adminfirstname,Adminmiddlename,Adminlastname,Username,Adminpassword,Email,Contactnumber,Address,Gender,Dateofbirth From Admin Where Adminid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,Adminid);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            a = new Admin();
            a.setAdminid(rs.getString("Adminid"));
            a.setAdminfirstname(rs.getString("Adminfirstname"));
            a.setAdminmiddlename(rs.getString("Adminmiddlename"));
            a.setAdminlastname(rs.getString("Adminlastname"));
            a.setUsername(rs.getString("Username"));
            a.setAdminpassword(rs.getString("Adminpassword"));
            a.setEmail(rs.getString("Email"));
            a.setContactnumber(rs.getString("Contactnumber"));
            a.setAddress(rs.getString("Address"));
            a.setGender(rs.getString("Gender"));
            a.setDateofbirth(rs.getString("Dateofbirth"));
        }
        con.close();
        return a;
        }
    
    public Admin[] getAll()throws Exception{
        ArrayList<Admin> al = new ArrayList();
        String query = "Select Adminid,Adminfirstname,Adminmiddlename,Adminlastname,Username,Adminpassword,Email,Contactnumber,Address,Gender,Dateofbirth From Admin";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Admin a = new Admin();
            a.setAdminid(rs.getString("Adminid"));
            a.setAdminfirstname(rs.getString("Adminfirstname"));
            a.setAdminmiddlename(rs.getString("Adminmiddlename"));
            a.setAdminlastname(rs.getString("Adminlastname"));
            a.setUsername(rs.getString("Username"));
            a.setAdminpassword(rs.getString("Adminpassword"));
            a.setEmail(rs.getString("Email"));
            a.setContactnumber(rs.getString("Contactnumber"));
            a.setAddress(rs.getString("Address"));
            a.setGender(rs.getString("Gender"));
            a.setDateofbirth(rs.getString("Dateofbirth"));
            al.add(a);
        }
        Admin arr[] = new Admin[al.size()];
        for(int i=0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
        con.close();
        return arr;
        }

public String getFuncCall() throws Exception {

   String str = "xxx";
   String q = "select Adminid from uniqueids where UniqueId=1";
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
   return "ADM" + (no + 1);
}
}