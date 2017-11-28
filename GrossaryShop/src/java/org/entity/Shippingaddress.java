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
public class Shippingaddress implements Serializable
{
    private String Shippingaddressid;
    private String orderid;
    private String Customerid;
    private String Productid;
    private String Quantity;
    private String Consigneeid;

    public Shippingaddress() {
    }

    public Shippingaddress(String Shippingaddressid) {
        this.Shippingaddressid = Shippingaddressid;
    }

    public Shippingaddress(String Shippingaddressid, String orderid, String Customerid, String Productid, String Quantity, String Consigneeid) {
        this.Shippingaddressid = Shippingaddressid;
        this.orderid = orderid;
        this.Customerid = Customerid;
        this.Productid = Productid;
        this.Quantity = Quantity;
        this.Consigneeid = Consigneeid;
    }

    public String getShippingaddressid() {
        return Shippingaddressid;
    }

    public void setShippingaddressid(String Shippingaddressid) {
        this.Shippingaddressid = Shippingaddressid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String Customerid) {
        this.Customerid = Customerid;
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

    public String getConsigneeid() {
        return Consigneeid;
    }

    public void setConsigneeid(String Consigneeid) {
        this.Consigneeid = Consigneeid;
    }
    
    
}
