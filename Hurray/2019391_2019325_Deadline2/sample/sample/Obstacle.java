package sample;

import java.util.ArrayList;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.converter.IntegerStringConverter;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Obstacle {
    private Group root = new Group();
    private String shape;
    private final int id;
    private RotateTransition rt;
    public Group getRoot(){
        return this.root;
    }
    public void setShape(String s){
        this.shape=s;
        rt= new RotateTransition(Duration.seconds(5),root);
    }

    public Obstacle(int i){
        this.id=i;
    }
    public void play(){
        rt.play();
    }
    public String getShape(){
        return this.shape;
    }

    public int getId() {
        return id;
    }
    public abstract void checkCollision(boolean b,Circle ball);

    public void rotate(){
     //   RotateTransition rt = new RotateTransition(Duration.seconds(5),root);
        rt.setFromAngle(360);
        rt.setToAngle(0);
//        rt.setAutoReverse(true);
        rt.setCycleCount(20);
        rt.play();
    }
}
