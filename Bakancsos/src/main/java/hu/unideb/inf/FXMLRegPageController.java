package hu.unideb.inf;

import hu.unideb.inf.model.JPAUsersDAO;
import hu.unideb.inf.model.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLRegPageController {

    @FXML
    private TextField passw;

    @FXML
    private TextField usern;

    @FXML
    private TextField gname;

    @FXML
    private TextField sname;

    @FXML
    private Button ButtonBack;

    @FXML
    private Button ButtonRegis;

    @FXML
    void BackPushed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLMainPage.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        Stage stage2 = (Stage)ButtonBack.getScene().getWindow();
        stage2.close();
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void HandledRegButtonPushed(ActionEvent event) throws IOException {
        JPAUsersDAO usersDAO = new JPAUsersDAO();
        Users user = new Users();
        user.setSname(sname.getText());
        user.setGname(gname.getText());
        user.setUsername(usern.getText());
        user.setPassword(passw.getText());
        usersDAO.saveUser(user);
        toLogin();
    }

    void toLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogPage.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        Stage stage2 = (Stage)ButtonRegis.getScene().getWindow();
        stage2.close();
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }

}

