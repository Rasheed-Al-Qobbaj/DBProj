package com.example.test;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class Controller implements Initializable {
    //private final Stage stage = new Stage();



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
            scene = new Scene(fxmlLoader.load());
            stage.setTitle("Menu");
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    protected void back() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("menu.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private TableView<Shipment> table = new TableView<Shipment>();

    @FXML
    private TableColumn<Shipment, Integer> id = new TableColumn<Shipment, Integer>();

    @FXML
    private TableColumn<Shipment, String> cusName = new TableColumn<Shipment, String>();

    @FXML
    private TableColumn<Shipment, String> empName= new TableColumn<Shipment, String>();

    @FXML
    private TableColumn<Shipment, Date> date= new TableColumn<Shipment, Date>();

    ObservableList<Shipment> list;

    @Override
    public void initialize(java.net.URL arg0, java.util.ResourceBundle arg1) {
        id.setCellValueFactory(new PropertyValueFactory<Shipment, Integer>("id"));
        cusName.setCellValueFactory(new PropertyValueFactory<Shipment, String>("cusName"));
        empName.setCellValueFactory(new PropertyValueFactory<Shipment, String>("empName"));
        date.setCellValueFactory(new PropertyValueFactory<Shipment, Date>("date"));
        list = dbConn.getDataShipment();
        table.setItems(list);
    }

    @FXML
    protected void view() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("vMenu.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("View Menu");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    protected void update() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uMenu.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Update Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void uEmpMenu() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uEmp.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Update Employee");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private TextField empid;

    @FXML
    private TextField empfname;

    @FXML
    private TextField emplname;

    @FXML
    private TextField job;

    @FXML
    private TextField Ecity;

    @FXML
    private TextField pnum;

    @FXML
    private TextField emaile;

    @FXML
    private TextField sal;


    @FXML
    protected void Eupdate(){
          dbConn.updateEmp(Integer.parseInt(empid.getText()), empfname.getText(), emplname.getText(), job.getText(), Ecity.getText(), pnum.getText(), emaile.getText(), Integer.parseInt(sal.getText()));
    }

    @FXML
    protected void Esearch(){
        Employee emp = dbConn.getEmp(Integer.parseInt(empid.getText()));
        empfname.setText(emp.getFname());
        emplname.setText(emp.getLname());
        job.setText(emp.getJob());
        Ecity.setText(emp.getCity());
        pnum.setText(emp.getPnum());
        emaile.setText(emp.getEmail());
        sal.setText(Integer.toString(emp.getSal()));
    }

    @FXML
    protected void uProd() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uProd.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Update Product");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private TextField prodid;

    @FXML
    private TextField Pcomid;

    @FXML
    private TextField pname;

    @FXML
    private TextField pweight;

    @FXML
    private TextField pcost;

    @FXML
    protected void Pupdate(){
          dbConn.updateProd(Integer.parseInt(prodid.getText()), Integer.parseInt(Pcomid.getText()), pname.getText(), pweight.getText(), Integer.parseInt(pcost.getText()));
    }

    @FXML
    protected void Psearch(){
        Product prod = dbConn.getProd(Integer.parseInt(prodid.getText()));
        Pcomid.setText(Integer.toString(prod.getCompany_ID()));
        pname.setText(prod.getName());
        pweight.setText(prod.getWeight());
        pcost.setText(Integer.toString(prod.getCost()));
    }

    @FXML
    private TextField oid;

    @FXML
    private TextField opid;

    @FXML
    private TextField ocid;

    @FXML
    private DatePicker odate;

    @FXML
    private TextField oquan;

    @FXML
    private void Oupdate(){
          dbConn.updateOrd(Integer.parseInt(oid.getText()), Integer.parseInt(opid.getText()), Integer.parseInt(ocid.getText()), odate.getValue().toString(), Integer.parseInt(oquan.getText()));
    }

    @FXML
    private void Osearch(){
        Order ord = dbConn.getOrd(Integer.parseInt(oid.getText()));
        opid.setText(Integer.toString(ord.getProduct_ID()));
        ocid.setText(Integer.toString(ord.getCustomer_ID()));
        odate.setValue(LocalDate.parse(ord.getDate()));
        oquan.setText(Integer.toString(ord.getQuantity()));
    }

    @FXML
    protected void uOrd() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("uOrd.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Update Order");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void sub() {
        System.out.println("nice");
    }



}
