/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entity;

/**
 *
 * @author YASH
 */
import java.io.Serializable;
public class Admin implements Serializable {
    private String Adminid;
    private String Adminfirstname;
    private String Adminmiddlename;
    private String Adminlastname;
    private String Username;
    private String Adminpassword;
    private String Email;
    private String Contactnumber;
    private String Address;
    private String Gender;
    private String Dateofbirth;

    public Admin() {
    }

    public Admin(String Adminid) {
        this.Adminid = Adminid;
    }

    public Admin(String Adminid, String Adminfirstname, String Adminmiddlename, String Adminlastname, String Username, String Adminpassword, String Email, String Contactnumber, String Address, String Gender, String Dateofbirth) {
        this.Adminid = Adminid;
        this.Adminfirstname = Adminfirstname;
        this.Adminmiddlename = Adminmiddlename;
        this.Adminlastname = Adminlastname;
        this.Username = Username;
        this.Adminpassword = Adminpassword;
        this.Email = Email;
        this.Contactnumber = Contactnumber;
        this.Address = Address;
        this.Gender = Gender;
        this.Dateofbirth = Dateofbirth;
    }

    public String getAdminid() {
        return Adminid;
    }

    public void setAdminid(String Adminid) {
        this.Adminid = Adminid;
    }

    public String getAdminfirstname() {
        return Adminfirstname;
    }

    public void setAdminfirstname(String Adminfirstname) {
        this.Adminfirstname = Adminfirstname;
    }

    public String getAdminmiddlename() {
        return Adminmiddlename;
    }

    public void setAdminmiddlename(String Adminmiddlename) {
        this.Adminmiddlename = Adminmiddlename;
    }

    public String getAdminlastname() {
        return Adminlastname;
    }

    public void setAdminlastname(String Adminlastname) {
        this.Adminlastname = Adminlastname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getAdminpassword() {
        return Adminpassword;
    }

    public void setAdminpassword(String Adminpassword) {
        this.Adminpassword = Adminpassword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContactnumber() {
        return Contactnumber;
    }

    public void setContactnumber(String Contactnumber) {
        this.Contactnumber = Contactnumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }

    
    
}
