package sample;

//import java.awt.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    private final int id;
    private Paint cl;
    private int score;
    public Game(int id, int score, Paint p){
        this.id=id;
        this.setCl(p);

    }
    public void setScore(int s){
        this.score=s;
    }
    public int getScore(){
        return this.score;
    }
    public void setCl(Paint p){
        this.cl=p;
    }
    public Paint getCl(){
        return this.cl;
    }
    public int getId(){
        return this.id;
    }
}
