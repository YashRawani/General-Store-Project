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
public class Subcategory implements Serializable
{
 private String Subcategoryid;
 private String Categoryid;
 private String Subcategoryname;
 private String Description;

    public Subcategory() {
    }

    public Subcategory(String Subcategoryid) {
        this.Subcategoryid = Subcategoryid;
    }

    public Subcategory(String Subcategoryid, String Categoryid, String Subcategoryname, String Description) {
        this.Subcategoryid = Subcategoryid;
        this.Categoryid = Categoryid;
        this.Subcategoryname = Subcategoryname;
        this.Description = Description;
    }

    public String getSubcategoryid() {
        return Subcategoryid;
    }

    public void setSubcategoryid(String Subcategoryid) {
        this.Subcategoryid = Subcategoryid;
    }

    public String getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(String Categoryid) {
        this.Categoryid = Categoryid;
    }

    public String getSubcategoryname() {
        return Subcategoryname;
    }

    public void setSubcategoryname(String Subcategoryname) {
        this.Subcategoryname = Subcategoryname;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    
 
}
