package com.example.tmkc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupPage implements Initializable {

    @FXML
    private TextField txt_user;
    @FXML
    private TextField txt_fname;
    @FXML
    private TextField txt_address;
    @FXML
    private PasswordField txt_pass;
    @FXML
    private Button bt_signup;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }
    @FXML
    public void setBt_signup(ActionEvent event){
        if(!txt_user.getText().isBlank() && !txt_pass.getText().isBlank()&&!txt_fname.getText().isBlank())
        {
            dataBase.signUpUser(event,txt_user.getText(),txt_fname.getText(),txt_pass.getText(),txt_address.getText());
        }
        else{
            System.out.println("Please fill all the details!");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all the required info to sign up!");
            alert.show();

        }
    }
}
