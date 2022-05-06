package hu.unideb.inf;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class FXMLMainPageController {

        @FXML
        private Button ButtonLogin;

        @FXML
        private Button ButtonRegis;

        @FXML
        void HandledGueButtonPushed(ActionEvent event) {

        }

        @FXML
        void HandledLogButtonPushed(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogPage.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                Stage stage2 = (Stage)ButtonLogin.getScene().getWindow();
                stage2.close();
                stage.setTitle("Login Page");
                stage.setScene(scene);
                stage.show();
        }

        @FXML
        void HandledRegButtonPushed(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLRegPage.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                Stage stage2 = (Stage)ButtonRegis.getScene().getWindow();
                stage2.close();
                stage.setTitle("Registration Page");
                stage.setScene(scene);
                stage.show();
        }

    }
