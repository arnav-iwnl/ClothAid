package com.example.tmkc;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class scenechanger {

    public static void changeScene(ActionEvent event, String fxmlFile, String Title, String name)
    {
        Parent root = null;
        try{
            FXMLLoader loader = new FXMLLoader(scenechanger.class.getResource(fxmlFile));
            root = loader.load();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(Title);
        stage.setScene(new Scene(root, 850,550));
        stage.show();
    }

}
