package com.example.test;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

import java.io.IOException;

public class Controller implements Initializable {
    //private final Stage stage = new Stage();

    @Override
    public void initialize(java.net.URL arg0, java.util.ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public Controller() {
        // TODO Auto-generated constructor stub
    }
    public static Stage stage;
    private Scene scene;

    public void setStage(Stage stage) {
        Controller.stage = stage;
    }

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    protected void login() throws IOException {
        if(username.getText().equals("root") && password.getText().equals("1234")){
            FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("menu.fxml"));
            scene = new Scene(fxmlLoader.load(), 650, 400);
            stage.setTitle("Menu");
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    protected void back() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("menu.fxml"));
        scene = new Scene(fxmlLoader.load(), 650, 400);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void view() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("vMenu.fxml"));
        scene = new Scene(fxmlLoader.load(), 650, 400);
        stage.setTitle("View Menu");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    protected void vEmp() {

    }

    @FXML
    protected void vProd() {

    }

    @FXML
    protected void vOrd() {

    }


    @FXML
    protected void update() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uMenu.fxml"));
        scene = new Scene(fxmlLoader.load(), 650, 400);
        stage.setTitle("Update Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void uEmp() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uEmp.fxml"));
        scene = new Scene(fxmlLoader.load(), 650, 400);
        stage.setTitle("Update Employee");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void uProd() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uProd.fxml"));
        scene = new Scene(fxmlLoader.load(), 650, 400);
        stage.setTitle("Update Product");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void uOrd() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uOrd.fxml"));
        scene = new Scene(fxmlLoader.load(), 650, 400);
        stage.setTitle("Update Order");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void sub() {
        System.out.println("nice");
    }



}
