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
import java.io.InputStream;
import java.io.Serializable;
public class Customer implements Serializable {
    private String Customerid;
    private String Customerfirstname;
    private String Customermiddlename;
    private String Customerlastname;
    private String Username;
    private String Customerpassword;
    private String Email;
    private String Contactnumber;
    private String Address;
    private String Gender;
    private String Dateofbirth;
    private InputStream Photo;

    public Customer() {
    }

    public Customer(String Customerid) {
        this.Customerid = Customerid;
    }

       public Customer(String Customerid, String Customerfirstname, String Customermiddlename, String Customerlastname, String Username, String Customerpassword, String Email, String Contactnumber, String Address, String Gender, String Dateofbirth, InputStream Photo) {
        this.Customerid = Customerid;
        this.Customerfirstname = Customerfirstname;
        this.Customermiddlename = Customermiddlename;
        this.Customerlastname = Customerlastname;
        this.Username = Username;
        this.Customerpassword = Customerpassword;
        this.Email = Email;
        this.Contactnumber = Contactnumber;
        this.Address = Address;
        this.Gender = Gender;
        this.Dateofbirth = Dateofbirth;
        this.Photo = Photo;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String Customerid) {
        this.Customerid = Customerid;
    }

    public String getCustomerfirstname() {
        return Customerfirstname;
    }

    public void setCustomerfirstname(String Customerfirstname) {
        this.Customerfirstname = Customerfirstname;
    }

    public String getCustomermiddlename() {
        return Customermiddlename;
    }

    public void setCustomermiddlename(String Customermiddlename) {
        this.Customermiddlename = Customermiddlename;
    }

    public String getCustomerlastname() {
        return Customerlastname;
    }

    public void setCustomerlastname(String Customerlastname) {
        this.Customerlastname = Customerlastname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getCustomerpassword() {
        return Customerpassword;
    }

    public void setCustomerpassword(String Customerpassword) {
        this.Customerpassword = Customerpassword;
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

    public InputStream getPhoto() {
        return Photo;
    }

    public void setPhoto(InputStream Photo) {
        this.Photo = Photo;
    }  
}
