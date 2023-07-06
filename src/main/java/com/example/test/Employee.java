package com.example.test;

public class Employee {
    private int id;
    private String fname, lname, job, city, pnum, email;
    private int sal;

    public Employee() {
    }

    public Employee(int id, String fname, String lname, String job, String city, String pnum, String email, int sal) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.job = job;
        this.city = city;
        this.pnum = pnum;
        this.email = email;
        this.sal = sal;
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getJob() {
        return job;
    }
    public String getCity() {
        return city;
    }
    public String getPnum() {
        return pnum;
    }
    public String getEmail() {
        return email;
    }
    public int getSal() {
        return sal;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPnum(String pnum) {
        this.pnum = pnum;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
}
