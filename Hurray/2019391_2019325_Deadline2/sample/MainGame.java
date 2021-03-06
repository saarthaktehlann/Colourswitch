package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class MainGame {

    @FXML
    Button button;
    @FXML

    public void handleNext() throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("ExitMenu.fxml"));
        Stage window = (Stage)button.getScene().getWindow();
        window.setScene(new Scene(root1,378,478));
    }
}
