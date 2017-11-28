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
public class Unitofmeasurement implements Serializable
{
    
    private String Unitofmeasurementid;
    private String Unitofmeasurement;
    private String Description;

    public Unitofmeasurement() {
    }

    public Unitofmeasurement(String Unitofmeasurementid) {
        this.Unitofmeasurementid = Unitofmeasurementid;
    }

    public Unitofmeasurement(String Unitofmeasurementid, String Unitofmeasurement, String Description) {
        this.Unitofmeasurementid = Unitofmeasurementid;
        this.Unitofmeasurement = Unitofmeasurement;
        this.Description = Description;
    }

    public String getUnitofmeasurementid() {
        return Unitofmeasurementid;
    }

    public void setUnitofmeasurementid(String Unitofmeasurementid) {
        this.Unitofmeasurementid = Unitofmeasurementid;
    }

    public String getUnitofmeasurement() {
        return Unitofmeasurement;
    }

    public void setUnitofmeasurement(String Unitofmeasurement) {
        this.Unitofmeasurement = Unitofmeasurement;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}