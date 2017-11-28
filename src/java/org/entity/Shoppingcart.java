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
public class Shoppingcart implements Serializable
{
    private String Shoppingcartid;
    private String Cartname;
    private String Shoppingdate;
    private String Shoppingtime;
    private String Description;
    private String Customerid;

    public Shoppingcart() {
    }

    public Shoppingcart(String Shoppingcartid) {
        this.Shoppingcartid = Shoppingcartid;
    }

    public Shoppingcart(String Shoppingcartid, String Cartname, String Shoppingdate, String Shoppingtime, String Description, String Customerid) {
        this.Shoppingcartid = Shoppingcartid;
        this.Cartname = Cartname;
        this.Shoppingdate = Shoppingdate;
        this.Shoppingtime = Shoppingtime;
        this.Description = Description;
        this.Customerid = Customerid;
    }

    public String getShoppingcartid() {
        return Shoppingcartid;
    }

    public void setShoppingcartid(String Shoppingcartid) {
        this.Shoppingcartid = Shoppingcartid;
    }

    public String getCartname() {
        return Cartname;
    }

    public void setCartname(String Cartname) {
        this.Cartname = Cartname;
    }

    public String getShoppingdate() {
        return Shoppingdate;
    }

    public void setShoppingdate(String Shoppingdate) {
        this.Shoppingdate = Shoppingdate;
    }

    public String getShoppingtime() {
        return Shoppingtime;
    }

    public void setShoppingtime(String Shoppingtime) {
        this.Shoppingtime = Shoppingtime;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String Customerid) {
        this.Customerid = Customerid;
    }
    
    
}
