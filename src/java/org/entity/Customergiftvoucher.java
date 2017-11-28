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
public class Customergiftvoucher implements Serializable
{
    private String Customergiftvoucherid;
    private String Giftvoucherid;
    private String Customerid;
    private String Giftvoucherdate;

    public Customergiftvoucher() {
    }

    public Customergiftvoucher(String Customergiftvoucherid) {
        this.Customergiftvoucherid = Customergiftvoucherid;
    }

    public Customergiftvoucher(String Customergiftvoucherid, String Giftvoucherid, String Customerid, String Giftvoucherdate) {
        this.Customergiftvoucherid = Customergiftvoucherid;
        this.Giftvoucherid = Giftvoucherid;
        this.Customerid = Customerid;
        this.Giftvoucherdate = Giftvoucherdate;
    }

    public String getCustomergiftvoucherid() {
        return Customergiftvoucherid;
    }

    public void setCustomergiftvoucherid(String Customergiftvoucherid) {
        this.Customergiftvoucherid = Customergiftvoucherid;
    }

    public String getGiftvoucherid() {
        return Giftvoucherid;
    }

    public void setGiftvoucherid(String Giftvoucherid) {
        this.Giftvoucherid = Giftvoucherid;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String Customerid) {
        this.Customerid = Customerid;
    }

    public String getGiftvoucherdate() {
        return Giftvoucherdate;
    }

    public void setGiftvoucherdate(String Giftvoucherdate) {
        this.Giftvoucherdate = Giftvoucherdate;
    }
    
    
}
