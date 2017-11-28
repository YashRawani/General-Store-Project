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
public class Consignee implements Serializable
{
 private String Consigneeid;
 private String Consigneename;
 private String Address;
 private String Customerid;
 private String Contactnumber;

    public Consignee() {
    }

    public Consignee(String Consigneeid) {
        this.Consigneeid = Consigneeid;
    }

    public Consignee(String Consigneeid, String Consigneename, String Address, String Customerid, String Contactnumber) {
        this.Consigneeid = Consigneeid;
        this.Consigneename = Consigneename;
        this.Address = Address;
        this.Customerid = Customerid;
        this.Contactnumber = Contactnumber;
    }

    public String getConsigneeid() {
        return Consigneeid;
    }

    public void setConsigneeid(String Consigneeid) {
        this.Consigneeid = Consigneeid;
    }

    public String getConsigneename() {
        return Consigneename;
    }

    public void setConsigneename(String Consigneename) {
        this.Consigneename = Consigneename;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String Customerid) {
        this.Customerid = Customerid;
    }

    public String getContactnumber() {
        return Contactnumber;
    }

    public void setContactnumber(String Contactnumber) {
        this.Contactnumber = Contactnumber;
    }
 
 
}
