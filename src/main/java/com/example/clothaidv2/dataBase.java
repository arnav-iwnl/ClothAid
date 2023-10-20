package com.example.tmkc;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.sql.*;

public class dataBase {

    public static void signUpUser(ActionEvent event, String username, String name, String password, String address) {
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;

        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clothaid", "root", "");
            psCheckUserExists = ((java.sql.Connection) connection).prepareStatement("SELECT * FROM user_acc WHERE username = ?");
            psCheckUserExists.setString(1, username);
            resultSet = psCheckUserExists.executeQuery();
            if (resultSet.isBeforeFirst()) {
                System.out.println("User Already Exists !!");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You cannot use this username");
                alert.show();
            } else {
                psInsert = ((java.sql.Connection) connection).prepareStatement("INSERT INTO user_acc VALUES('" + username + "','" + name + "','" + password + "','" + address + "');");
                psInsert.executeUpdate();

                scenechanger.changeScene(event, "HomePage.fxml", "Home", username);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (psCheckUserExists != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (psInsert != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void loginUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement setName = null;
        ResultSet resultSetName = null;
        ResultSet resultSet = null;
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clothaid", "root", "");
            preparedStatement = ((java.sql.Connection) connection).prepareStatement("SELECT password FROM user_acc WHERE username = ? ");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();

            if (!resultSet.isBeforeFirst()) {
                System.out.println("User is not found in database");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided credentials are incorrect");
                alert.show();
            } else {
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getNString("password");
                    if (retrievedPassword.equals(password)) {

                        scenechanger.changeScene(event, "Home.fxml", "ClothAid", username);


                    } else {
                        System.out.println("Incorrect Password");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Invalid login id or password");
                        alert.show();
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
