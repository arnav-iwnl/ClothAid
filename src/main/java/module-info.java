module com.example.tmkc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tmkc to javafx.fxml;
    exports com.example.tmkc;
}