package sample;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

import java.util.Calendar;

public class uhoh {
   public  void display(String title, String message){
        Stage alertstage=new Stage();
        Button b1=new Button("close window");
        alertstage.initModality(Modality.APPLICATION_MODAL);
        alertstage.setTitle(title);
        alertstage.setMinWidth(250);
        Label l1=new Label();
        l1.setText(message);
        b1.setOnAction(e->alertstage.close());
        VBox lay=new VBox(10);
        lay.getChildren().addAll(l1,b1);
        lay.setAlignment(Pos.CENTER);
        Scene scene=new Scene(lay);
        alertstage.setScene(scene);
        alertstage.showAndWait();




    }
}
