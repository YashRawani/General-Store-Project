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
import java.io.InputStream;
import java.io.Serializable;
public class Product implements Serializable
{
    private String Productid;
    private String Productname;
    private String Categoryid;
    private String Subcategoryid;
    private String Brandid;
    private String Unitofmeasurementid;
    private String Quantityonhand;
    private InputStream Photo;
    private String Price;

    public Product() {
    }

    public Product(String Productid) {
        this.Productid = Productid;
    }

    public Product(String Productid, String Productname, String Categoryid, String Subcategoryid, String Brandid, String Unitofmeasurementid, String Quantityonhand, InputStream Photo, String Price) {
        this.Productid = Productid;
        this.Productname = Productname;
        this.Categoryid = Categoryid;
        this.Subcategoryid = Subcategoryid;
        this.Brandid = Brandid;
        this.Unitofmeasurementid = Unitofmeasurementid;
        this.Quantityonhand = Quantityonhand;
        this.Photo = Photo;
        this.Price = Price;
    }

    public String getProductid() {
        return Productid;
    }

    public void setProductid(String Productid) {
        this.Productid = Productid;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String Productname) {
        this.Productname = Productname;
    }

    public String getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(String Categoryid) {
        this.Categoryid = Categoryid;
    }

    public String getSubcategoryid() {
        return Subcategoryid;
    }

    public void setSubcategoryid(String Subcategoryid) {
        this.Subcategoryid = Subcategoryid;
    }

    public String getBrandid() {
        return Brandid;
    }

    public void setBrandid(String Brandid) {
        this.Brandid = Brandid;
    }

    public String getUnitofmeasurementid() {
        return Unitofmeasurementid;
    }

    public void setUnitofmeasurementid(String Unitofmeasurementid) {
        this.Unitofmeasurementid = Unitofmeasurementid;
    }

    public String getQuantityonhand() {
        return Quantityonhand;
    }

    public void setQuantityonhand(String Quantityonhand) {
        this.Quantityonhand = Quantityonhand;
    }

    public InputStream getPhoto() {
        return Photo;
    }

    public void setPhoto(InputStream Photo) {
        this.Photo = Photo;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
}

    
    