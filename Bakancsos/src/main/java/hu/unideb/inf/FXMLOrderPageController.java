package hu.unideb.inf;
import hu.unideb.inf.model.Desszert;
import hu.unideb.inf.model.Etel;
import hu.unideb.inf.model.Leves;
import hu.unideb.inf.model.Udito;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FXMLOrderPageController {
    @FXML
    public Button buttonHome;

    @FXML
    void HandledHomeButtonPushed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLMainPage.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        Stage stage2 = (Stage)buttonHome.getScene().getWindow();
        stage2.close();
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();
    }
}
