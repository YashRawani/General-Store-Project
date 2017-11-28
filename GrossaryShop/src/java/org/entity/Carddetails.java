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
public class Carddetails implements Serializable
{
    private String Carddetailsid;
    private String Cardid;
    private String Productid;
    private String Quantity;

    public Carddetails() {
    }

    public Carddetails(String Carddetailsid) {
        this.Carddetailsid = Carddetailsid;
    }

    public Carddetails(String Carddetailsid, String Cardid, String Productid, String Quantity) {
        this.Carddetailsid = Carddetailsid;
        this.Cardid = Cardid;
        this.Productid = Productid;
        this.Quantity = Quantity;
    }

    public String getCarddetailsid() {
        return Carddetailsid;
    }

    public void setCarddetailsid(String Carddetailsid) {
        this.Carddetailsid = Carddetailsid;
    }

    public String getCardid() {
        return Cardid;
    }

    public void setCardid(String Cardid) {
        this.Cardid = Cardid;
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
