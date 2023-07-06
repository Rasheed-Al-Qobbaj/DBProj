package com.example.test;

public class Product {
    private int product_ID, company_ID;
    private String name, weight;
    private int cost;

    public Product() {
    }

    public Product(int product_ID, int company_ID, String name, String weight, int cost) {
        this.product_ID = product_ID;
        this.company_ID = company_ID;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    // Getters
    public int getProduct_ID() {
        return product_ID;
    }

    public int getCompany_ID() {
        return company_ID;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    // Setters
    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }

    public void setCompany_ID(int company_ID) {
        this.company_ID = company_ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
