package sample;


import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;

public class Box extends Obstacle{

    private Rectangle r1 = new Rectangle();
    private Rectangle r2 = new Rectangle();
    private Rectangle r3 = new Rectangle();
    private  Rectangle r4 = new Rectangle();

    // Group cross = new Group();
    public Box(int i){
        super(i);
        setShape("box");
        this.r1.setX(114.0f);
        this.r1.setY(85.0f);
        this.r1.setWidth(10.0f);
        this.r1.setHeight(140.0f);
        this.r1.setFill(Color.RED);

        this.r2.setX(264.0f);
        this.r2.setY(85.0f);
        this.r2.setWidth(10.0f);
        this.r2.setHeight(140.0f);
        this.r2.setFill(Color.BLUE);

        this.r3.setX(124.0f);
        this.r3.setY(225.0f);
        this.r3.setWidth(140.0f);
        this.r3.setHeight(10.0f);
        this.r3.setFill(Color.YELLOW);

        this.r4.setX(124.0f);
        this.r4.setY(75.0f);
        this.r4.setWidth(140.0f);
        this.r4.setHeight(10.0f);
        this.r4.setFill(Color.WHITE);

        this.getRoot().getChildren().add(r1);
        this.getRoot().getChildren().add(r2);
        this.getRoot().getChildren().add(r3);
        this.getRoot().getChildren().add(r4);
        this.getRoot().setLayoutX(-17);
    }


//
//
//    public static Timeline c;
//
//    public void move(){
//
//        c=new Timeline(new KeyFrame(Duration.millis(10), new KeyValue(getRoot().rotateProperty(),-720)));
//
//        c.setCycleCount(Timeline.INDEFINITE);
//        c.play();
//    }


    ArrayList<Rectangle> ob;


    public void checkCollision(boolean gameOver,Circle ball){

        gameOver=false;
        ob = new ArrayList();
        ob.add(r1);
        ob.add(r2);
        ob.add(r3);
        ob.add(r4);

        for(int i=0;i<ob.size();i++){

            if(ob.get(i).getBoundsInLocal().intersects(ball.getBoundsInLocal())){

                System.out.println("object  "+ob.get(i).getFill());

                if(ob.get(i).getFill() != ball.getFill()){
                    System.out.println("intersection  "+ ob.get(i).getFill());
                    gameOver=true;
                }

                else if(ob.get(i).getFill().equals(ball.getFill())){
                    gameOver=false;
                }


                break;}

        }
       // return  gameOver;

    }



}


