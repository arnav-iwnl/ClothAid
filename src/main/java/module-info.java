module com.example.clothaidv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clothaidv2 to javafx.fxml;
    exports com.example.clothaidv2;
}