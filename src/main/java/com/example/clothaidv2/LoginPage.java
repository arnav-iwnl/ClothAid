package com.example.clothaidv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPage  implements Initializable {
    @FXML
    private Button LoginBtn;
    @FXML
    private Label messageInvalid;
    @FXML
    private ImageView donateImageView;
    @FXML
    private ImageView logoImageView;
    @FXML
    private TextField usernameTF;
    @FXML
    private PasswordField passTF;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File donateimg  = new File("src/main/resources/com/example/clothaidv2/images/login-img.png");
        Image donate_image = new Image(donateimg.toURI().toString());
        donateImageView.setImage(donate_image);
        //
        File logo  = new File("src/main/resources/com/example/clothaidv2/images/img.png");
        Image logoImg = new Image(logo.toURI().toString());
        logoImageView.setImage(logoImg);

    }
    public void setLoginBtnOnAction(ActionEvent event){
        //
        if(usernameTF.getText().isBlank() == false && passTF.getText().isBlank() == false){
            messageInvalid.setText("You try to login.");
            validLogin();
        }
        else{
            messageInvalid.setText("You try to login.");
        }
    }
    public void setLoginBtnOnAmessageInvalidction(ActionEvent event) {

    }
    @FXML
    private Button SignUpBtn;
    public void setSignUpBtnLoginPageonAction(ActionEvent event){
        Stage stage = (Stage) SignUpBtn.getScene().getWindow();
    }

    public void validLogin(){

    }

}