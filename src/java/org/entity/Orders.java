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
public class Orders implements Serializable
{
     private String Orderid;
     private String Orderdate;
     private String Ordertime;
     private String Customerid;
     private String Totalamount;
     private String Discountamount;
     private String Giftvoucherid;
     private String Billamount;
     private String Taxamount;
     private String Paymenttype;

    public Orders() {
    }

    public Orders(String Orderid) {
        this.Orderid = Orderid;
    }

    public Orders(String Orderid, String Orderdate, String Ordertime, String Customerid, String Totalamount, String Discountamount, String Giftvoucherid, String Billamount, String Taxamount, String Paymenttype) {
        this.Orderid = Orderid;
        this.Orderdate = Orderdate;
        this.Ordertime = Ordertime;
        this.Customerid = Customerid;
        this.Totalamount = Totalamount;
        this.Discountamount = Discountamount;
        this.Giftvoucherid = Giftvoucherid;
        this.Billamount = Billamount;
        this.Taxamount = Taxamount;
        this.Paymenttype = Paymenttype;
    }

    public String getOrderid() {
        return Orderid;
    }

    public void setOrderid(String Orderid) {
        this.Orderid = Orderid;
    }

    public String getOrderdate() {
        return Orderdate;
    }

    public void setOrderdate(String Orderdate) {
        this.Orderdate = Orderdate;
    }

    public String getOrdertime() {
        return Ordertime;
    }

    public void setOrdertime(String Ordertime) {
        this.Ordertime = Ordertime;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String Customerid) {
        this.Customerid = Customerid;
    }

    public String getTotalamount() {
        return Totalamount;
    }

    public void setTotalamount(String Totalamount) {
        this.Totalamount = Totalamount;
    }

    public String getDiscountamount() {
        return Discountamount;
    }

    public void setDiscountamount(String Discountamount) {
        this.Discountamount = Discountamount;
    }

    public String getGiftvoucherid() {
        return Giftvoucherid;
    }

    public void setGiftvoucherid(String Giftvoucherid) {
        this.Giftvoucherid = Giftvoucherid;
    }

    public String getBillamount() {
        return Billamount;
    }

    public void setBillamount(String Billamount) {
        this.Billamount = Billamount;
    }

    public String getTaxamount() {
        return Taxamount;
    }

    public void setTaxamount(String Taxamount) {
        this.Taxamount = Taxamount;
    }

    public String getPaymenttype() {
        return Paymenttype;
    }

    public void setPaymenttype(String Paymenttype) {
        this.Paymenttype = Paymenttype;
    }

}