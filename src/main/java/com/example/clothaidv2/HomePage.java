package com.example.tmkc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HomePage implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //
    }
    @FXML
    public void setLogout(ActionEvent event){
        scenechanger.changeScene(event,"login.fxml","Login","");
    }
}
