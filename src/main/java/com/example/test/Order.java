package com.example.test;

public class Order {
    private int order_ID, product_ID, customer_ID;
    private String date;
    private int quantity;

    public Order(){

    }
    public Order(int order_ID, int product_ID, int customer_ID, String date, int quantity) {
        this.order_ID = order_ID;
        this.product_ID = product_ID;
        this.customer_ID = customer_ID;
        this.date = date;
        this.quantity = quantity;
    }

    // Getters
    public int getOrder_ID() {
        return order_ID;
    }
    public int getProduct_ID() {
        return product_ID;
    }
    public int getCustomer_ID() {
        return customer_ID;
    }
    public String getDate() {
        return date;
    }
    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }
    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }
    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
