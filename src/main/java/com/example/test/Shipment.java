package com.example.test;

import java.util.Date;

public class Shipment {
    private int id;
    private String cusName, empName;
    private Date date;

    public Shipment(int id, String cusName, String empName, Date date) {
        this.id = id;
        this.cusName = cusName;
        this.empName = empName;
        this.date = date;
    }
    // Getters
    public int getId() {
        return id;
    }
    public String getCusName() {
        return cusName;
    }
    public String getEmpName() {
        return empName;
    }
    public Date getDate() {
        return date;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
