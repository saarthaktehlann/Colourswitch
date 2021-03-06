package sample;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Cross extends Obstacle{
    private Rectangle r1 = new Rectangle();
    private Rectangle r2 = new Rectangle();
    private Rectangle r3 = new Rectangle();
    private  Rectangle r4 = new Rectangle();

    // Group cross = new Group();
    public Cross(int i){
        super(i);
        setShape("box");
        this.r1.setX(140.0f);
        this.r1.setY(85.0f);
        this.r1.setWidth(10.0f);
        this.r1.setHeight(70.0f);
        this.r1.setFill(Color.RED);
        this.r2.setX(140.0f);
        this.r2.setY(5.0f);
        this.r2.setWidth(10.0f);
        this.r2.setHeight(70.0f);
        this.r2.setFill(Color.BLUE);
        this.r3.setX(150.0f);
        this.r3.setY(75.0f);
        this.r3.setWidth(70.0f);
        this.r3.setHeight(10.0f);
        this.r3.setFill(Color.YELLOW);
        this.r4.setX(70.0f);
        this.r4.setY(75.0f);
        this.r4.setWidth(70.0f);
        this.r4.setHeight(10.0f);
        this.r4.setFill(Color.WHITE);
        this.getRoot().getChildren().add(r1);
        this.getRoot().getChildren().add(r2);
        this.getRoot().getChildren().add(r3);
        this.getRoot().getChildren().add(r4);
        this.getRoot().setLayoutX(-20);
    }





    public void checkCollision(boolean gameOver, Circle ball){
        if(ball.getBoundsInParent().intersects(r1.getBoundsInParent())){
            if (ball.getFill()==Color.RED) {
                gameOver=false;}
            else if(ball.getFill()!=Color.RED){
                gameOver=true;}
        }

        if(ball.getBoundsInParent().intersects(r2.getBoundsInParent())){
            if (ball.getFill()==Color.BLUE) {
                gameOver=false;}
            else if(ball.getFill()!=Color.BLUE){
                gameOver=true;}}
        if(ball.getBoundsInParent().intersects(r3.getBoundsInParent())){
            if (ball.getFill()==Color.YELLOW) {
                gameOver=false;}
            else if(ball.getFill()!=Color.YELLOW) {
                gameOver=true;}}
        if(ball.getBoundsInParent().intersects(r4.getBoundsInParent())){
            if (ball.getFill()==Color.WHITE) {
                gameOver=false;}
            else if(ball.getFill()!=Color.WHITE){
                gameOver=true;}}

       // return gameOver;
    }
}