package hu.unideb.inf;
import hu.unideb.inf.model.JPAUsersDAO;
import hu.unideb.inf.model.Users;
import hu.unideb.inf.model.UsersDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FXMLLogPageController {

        @FXML
        private TextField pass;

        @FXML
        private TextField user;

        @FXML
        private Button ButtonBack;

        @FXML
        private Button ButtonLog;

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
        void HandledLoginButtonPushed(ActionEvent event) throws IOException {
            if (ValidateUser(user.getText(), pass.getText())) {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLMenuPage.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                Stage stage2 = (Stage) ButtonBack.getScene().getWindow();
                stage2.close();
                stage.setTitle("Main Page");
                stage.setScene(scene);
                stage.show();
            }
        }

        private boolean ValidateUser(String username, String password){
            try(UsersDAO aDAO = new JPAUsersDAO();) {
                List<Users> UsersList = new ArrayList<>(aDAO.getPersons());
                for (Users user : UsersList) {
                    if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return false;
        }

    }
