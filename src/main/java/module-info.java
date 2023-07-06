module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.test to javafx.fxml;
    exports com.example.test;
}