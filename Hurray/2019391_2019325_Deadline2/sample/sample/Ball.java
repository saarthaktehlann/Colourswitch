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
public class Ball  {
    private Circle ball = new Circle();
    private Paint color;
    private final int W=378,H=478;
    public Ball(){
        ball.setCenterX(W/2-15);
        ball.setCenterY(H/2-10);
        ball.setRadius(10);
        ball.setFill(Color.WHITE);
    }
    public Circle getBall(){
        return ball;
    }
    public Paint getColor(){
        return ball.getStroke();
    }
    public void setFill(Paint p){
        this.ball.setFill(p);
        this.color=p;
    }
    public void setColor(Paint paint){
        color = paint;
        ball.setStroke(paint);
    }
    void Jump(int ymotion, boolean gameOver){

        if(!gameOver){
            if(ymotion>0){
                ymotion=0;
            }
            ymotion=ymotion-10;
        }

    }
}
