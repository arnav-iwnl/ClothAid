package com.example.tmkc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginPage implements Initializable {

    @FXML
    private TextField txt_user;
    @FXML
    private Label messageInvalid;
    @FXML
    private PasswordField txt_pass;
    @FXML
    private Button bt_login;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }
    @FXML
    public void setBt_login(ActionEvent event){
        if(!txt_user.getText().isBlank() && !txt_pass.getText().isBlank())
        {
            dataBase.loginUser(event, txt_user.getText(), txt_pass.getText());
//            wait(3000);
        }
        else{
            messageInvalid.setText("Username and Password is Blank");
        }


    }
        @FXML
    public void setBt_SignUp(ActionEvent event){
        scenechanger.changeScene(event,"signup.fxml","Sign Up","");

    }
}
