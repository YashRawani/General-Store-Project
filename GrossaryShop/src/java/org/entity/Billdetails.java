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
public class Billdetails implements Serializable
{
    private String Billid;
    private String Orderid;
    private String Amount;
    private String Bankname;
    private String Cardnumber;
    private String Billdate;
    private String Billtime;

    public Billdetails() {
    }

    public Billdetails(String Billid) {
        this.Billid = Billid;
    }

    public Billdetails(String Billid, String Orderid, String Amount, String Bankname, String Cardnumber, String Billdate, String Billtime) {
        this.Billid = Billid;
        this.Orderid = Orderid;
        this.Amount = Amount;
        this.Bankname = Bankname;
        this.Cardnumber = Cardnumber;
        this.Billdate = Billdate;
        this.Billtime = Billtime;
    }

    public String getBillid() {
        return Billid;
    }

    public void setBillid(String Billid) {
        this.Billid = Billid;
    }

    public String getOrderid() {
        return Orderid;
    }
    public void setOrderid(String Orderid) {
        this.Orderid = Orderid;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getBankname() {
        return Bankname;
    }

    public void setBankname(String Bankname) {
        this.Bankname = Bankname;
    }

    public String getCardnumber() {
        return Cardnumber;
    }

    public void setCardnumber(String Cardnumber) {
        this.Cardnumber = Cardnumber;
    }

    public String getBilldate() {
        return Billdate;
    }

    public void setBilldate(String Billdate) {
        this.Billdate = Billdate;
    }

    public String getBilltime() {
        return Billtime;
    }

    public void setBilltime(String Billtime) {
        this.Billtime = Billtime;
    }
    
    
}
