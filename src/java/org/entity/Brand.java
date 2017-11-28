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
public class Brand implements Serializable
{
    private String Brandid;
    private String Brandname;
    private String Brandlogo;
    private String Description;
    private String Brand;

    public Brand() {
    }

    public Brand(String Brand) {
        this.Brand = Brand;
    }

    public Brand(String Brandid, String Brandname, String Brandlogo, String Description) {
        this.Brandid = Brandid;
        this.Brandname = Brandname;
        this.Brandlogo = Brandlogo;
        this.Description = Description;
    }

    public String getBrandid() {
        return Brandid;
    }

    public void setBrandid(String Brandid) {
        this.Brandid = Brandid;
    }

    public String getBrandname() {
        return Brandname;
    }

    public void setBrandname(String Brandname) {
        this.Brandname = Brandname;
    }

    public String getBrandlogo() {
        return Brandlogo;
    }

    public void setBrandlogo(String Brandlogo) {
        this.Brandlogo = Brandlogo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}

