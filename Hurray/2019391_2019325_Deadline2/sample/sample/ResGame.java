package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ResGame {
    @FXML
    Button button;
    @FXML
    public void handleResGame() throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("MainGame.fxml"));
        Stage window = (Stage)button.getScene().getWindow();
        window.setScene(new Scene(root1,378,478));
    }
    public void handleExitButton() throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("ExitGame.fxml"));
        Stage window = (Stage)button.getScene().getWindow();
        window.setScene(new Scene(root1,378,478));
    }
}
