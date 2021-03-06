package sample;
import java.util.Random;
import java.util.ArrayList;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.converter.IntegerStringConverter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class CSSwitch {
    private Circle cswitch= new Circle();
    private final int W=378,H=478;
    public CSSwitch(){
        cswitch.setCenterX(179.0f);
        cswitch.setCenterY(310.0f);
        cswitch.setRadius(20.0f);



        Stop[] stops = new Stop[] {
                new Stop(0, Color.YELLOW),
                new Stop(1, Color.BLUE),
                new Stop(2, Color.RED)
        };
        LinearGradient linearGradient =
                new LinearGradient(0, 1, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        cswitch.setFill(linearGradient);


    }
    public int getIndex(ArrayList<Paint>arr, Paint item){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals(item)){
                return i;
            }
        }
        return 0;
    }
    public Circle getCswitch(){
        return cswitch;
    }
    public void changeColor(Ball ball){ArrayList<Paint> colors = new ArrayList<>();
        colors.add(Color.WHITE);
        colors.add(Color.BLUE);
        colors.add(Color.RED);
        colors.add(Color.YELLOW);
        ArrayList<Paint> notwhite = new ArrayList<>();
        notwhite.add(Color.BLUE);
        notwhite.add(Color.RED);
        notwhite.add(Color.YELLOW);
        ArrayList<Paint> notblue = new ArrayList<>();
        notblue.add(Color.YELLOW);
        notblue.add(Color.RED);
        notblue.add(Color.WHITE);
        ArrayList<Paint> notred = new ArrayList<>();
        notred.add(Color.WHITE);
        notred.add(Color.BLUE);
        notred.add(Color.YELLOW);
        ArrayList<Paint> notyellow = new ArrayList<>();
        notyellow.add(Color.WHITE);
        notyellow.add(Color.BLUE);
        notyellow.add(Color.RED);

        Random rand = new Random();
        int in=rand.nextInt(3);
        int cs = getIndex(colors,ball.getColor());
        if(cs==0){ball.setFill(notwhite.get(in));

            cswitch.setCenterX(1000);}
        if(cs==1){ball.setFill(notblue.get(in));

            cswitch.setCenterX(1000);}
        if(cs==2){ball.setFill(notred.get(in));

            cswitch.setCenterX(1000);}
        if(cs==3){ball.setFill(notyellow.get(in));

            cswitch.setCenterX(1000);}

    }
}