package com.example.test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
public class dbConn {
    Connection conn = null;

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aljaar", "root", "1234");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static ObservableList<Shipment> getDataShipment() {
        Connection conn = ConnectDB();
        ObservableList<Shipment> list = FXCollections.observableArrayList();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ship_cus_emp");
            while (resultSet.next()) {
//                System.out.println("shipment_ID: " + resultSet.getInt(1) +
//                        ", Customer_name: " + resultSet.getString(2) +
//                        ", Emp_name: " + resultSet.getString(3) +
//                        ", Date: " + resultSet.getDate(4));
                list.add(new Shipment(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDate(4)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    // dbConn.updateEmp(Integer.parseInt(empid.getText()), empfname.getText(), emplname.getText(), job.getText(), Ecity.getText(), pnum.getText(), emaile.getText(), Integer.parseInt(sal.getText()));
    public static void updateEmp(int empid, String fname, String lname, String job, String city, String pnum, String email, int sal) {
        try {
            Connection conn = ConnectDB();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setInt(1, empid);
            statement.setString(2, fname);
            statement.setString(3, lname);
            statement.setString(4, job);
            statement.setString(5, city);
            statement.setString(6, pnum);
            statement.setString(7, email);
            statement.setInt(8, sal);
            statement.executeUpdate();

            System.out.println(empid + " " + fname + " " + lname + " " + job + " " + city + " " + pnum + " " + email + " " + sal);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Employee getEmp(int id) {
        Connection conn = ConnectDB();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee WHERE employee_ID = " + id);
            resultSet.next();
//            System.out.println("employee_ID: " + resultSet.getInt(1) +
//                    ", First_name: " + resultSet.getString(2) +
//                    ", Last_name: " + resultSet.getString(3) +
//                    ", Job: " + resultSet.getString(4) +
//                    ", City: " + resultSet.getString(5) +
//                    ", Phone_number: " + resultSet.getString(6) +
//                    ", Email: " + resultSet.getString(7) +
//                    ", Salary: " + resultSet.getInt(8));
            return new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getInt(8));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Employee();
    }

    //    public Product(int product_ID, int company_ID, String name, String weight, int cost) {
//        this.product_ID = product_ID;
//        this.company_ID = company_ID;
//        this.name = name;
//        this.weight = weight;
//        this.cost = cost;
//    }
    public static void updateProd(int prodid, int compid, String name, String weight, int cost) {
        try {
            Connection conn = ConnectDB();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO product VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, prodid);
            statement.setInt(2, compid);
            statement.setString(3, name);
            statement.setString(4, weight);
            statement.setInt(5, cost);
            statement.executeUpdate();

//            System.out.println(prodid + " " + compid + " " + name + " " + weight + " " + cost);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Product getProd(int id) {
        Connection conn = ConnectDB();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product WHERE product_ID = " + id);
            resultSet.next();
//            System.out.println("product_ID: " + resultSet.getInt(1) +
//                    ", Company_ID: " + resultSet.getInt(2) +
//                    ", Name: " + resultSet.getString(3) +
//                    ", Weight: " + resultSet.getString(4) +
//                    ", Cost: " + resultSet.getInt(5));
            return new Product(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Product();
    }

//    public Order(int order_ID, int product_ID, int customer_ID, String date, int quantity) {
//        this.order_ID = order_ID;
//        this.product_ID = product_ID;
//        this.customer_ID = customer_ID;
//        this.date = date;
//        this.quantity = quantity;
//    }

    public static void updateOrd(int orderid, int prodid, int custid, String date, int quantity) {
        try {
            Connection conn = ConnectDB();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO orders VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, orderid);
            statement.setInt(2, prodid);
            statement.setInt(3, custid);
            statement.setString(4, date);
            statement.setInt(5, quantity);
            statement.executeUpdate();
//            System.out.println(orderid + " " + prodid + " " + custid + " " + date + " " + quantity);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Order getOrd(int id) {
        Connection conn = ConnectDB();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM orders WHERE order_ID = " + id);
            resultSet.next();
//            System.out.println("order_ID: " + resultSet.getInt(1) +
//                    ", Product_ID: " + resultSet.getInt(2) +
//                    ", Customer_ID: " + resultSet.getInt(3) +
//                    ", Date: " + resultSet.getString(4) +
//                    ", Quantity: " + resultSet.getInt(5));
            return new Order(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getInt(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Order();
    }

}
