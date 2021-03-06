package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class AlertBox {

    static boolean answer;
    public static boolean display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);
        Button yesbutton = new Button("yes");
        Button nobutton = new Button("no");
        yesbutton.setOnAction(e ->{
            answer = true;
            window.close();
        });
        nobutton.setOnAction(e ->{
            answer = false;
            window.close();
        });
        //Button closeButton = new Button("Close this window");
        //closeButton.setOnAction(e -> window.close());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,yesbutton,nobutton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        window.show();
        return answer;
    }
}
