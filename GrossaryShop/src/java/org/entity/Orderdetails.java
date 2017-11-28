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
public class Orderdetails implements Serializable
{
   private String Orderdetailsid;
   private String Orderid;
   private String Productid;
   private String Quantity;
   private String Amount;

    public Orderdetails() {
    }

    public Orderdetails(String Orderdetailsid) {
        this.Orderdetailsid = Orderdetailsid;
    }

    public Orderdetails(String Orderdetailsid, String Orderid, String Productid, String Quantity, String Amount) {
        this.Orderdetailsid = Orderdetailsid;
        this.Orderid = Orderid;
        this.Productid = Productid;
        this.Quantity = Quantity;
        this.Amount = Amount;
    }

    public String getOrderdetailsid() {
        return Orderdetailsid;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public void setOrderdetailsid(String Orderdetailsid) {
        this.Orderdetailsid = Orderdetailsid;
    }

    public String getOrderid() {
        return Orderid;
    }

    public void setOrderid(String Orderid) {
        this.Orderid = Orderid;
    }

    public String getProductid() {
        return Productid;
    }

    public void setProductid(String Productid) {
        this.Productid = Productid;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }
   
   
}
