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
public class Giftvoucher implements Serializable
{
    private String Giftvoucherid;
    private String Giftvouchername;
    private String Giftvouchernumber;
    private String Amount; 
    private String Validfromdate;
    private String Validtodate;

    public Giftvoucher() {
    }

    public Giftvoucher(String Giftvoucherid) {
        this.Giftvoucherid = Giftvoucherid;
    }

    public Giftvoucher(String Giftvoucherid, String Giftvouchername, String Giftvouchernumber, String Amount, String Validfromdate, String Validtodate) {
        this.Giftvoucherid = Giftvoucherid;
        this.Giftvouchername = Giftvouchername;
        this.Giftvouchernumber = Giftvouchernumber;
        this.Amount = Amount;
        this.Validfromdate = Validfromdate;
        this.Validtodate = Validtodate;
    }

    public String getGiftvoucherid() {
        return Giftvoucherid;
    }

    public void setGiftvoucherid(String Giftvoucherid) {
        this.Giftvoucherid = Giftvoucherid;
    }

    public String getGiftvouchername() {
        return Giftvouchername;
    }

    public void setGiftvouchername(String Giftvouchername) {
        this.Giftvouchername = Giftvouchername;
    }

    public String getGiftvouchernumber() {
        return Giftvouchernumber;
    }

    public void setGiftvouchernumber(String Giftvouchernumber) {
        this.Giftvouchernumber = Giftvouchernumber;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getValidfromdate() {
        return Validfromdate;
    }

    public void setValidfromdate(String Validfromdate) {
        this.Validfromdate = Validfromdate;
    }

    public String getValidtodate() {
        return Validtodate;
    }

    public void setValidtodate(String Validtodate) {
        this.Validtodate = Validtodate;
    }
    
    
}
