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
public class Category implements Serializable 
{
    private String Categoryid;
    private String Categoryname;
    private String Description;

    public Category() {
    }

    public Category(String Categoryid) {
        this.Categoryid = Categoryid;
    }

    public Category(String Categoryid, String Categoryname, String Description) {
        this.Categoryid = Categoryid;
        this.Categoryname = Categoryname;
        this.Description = Description;
    }

    public String getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(String Categoryid) {
        this.Categoryid = Categoryid;
    }

    public String getCategoryname() {
        return Categoryname;
    }

    public void setCategoryname(String Categoryname) {
        this.Categoryname = Categoryname;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}

