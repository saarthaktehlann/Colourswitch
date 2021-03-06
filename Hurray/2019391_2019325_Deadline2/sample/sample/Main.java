package sample;//package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.awt.*;
//import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.util.converter.IntegerStringConverter;
import sample.AlertBox;

public class Main extends Application {
    //  Stage window;
    BorderPane borderPane1= new BorderPane();
    BorderPane borderPane2= new BorderPane();
    BorderPane borderPane3= new BorderPane();
    BorderPane borderPane4= new BorderPane();
    BorderPane borderPane5= new BorderPane();
    BorderPane borderPane6= new BorderPane();
    Scene scene1, scene2, scene3, scene4, scene5, scene6;
    Label scorelabel;

    Button btn;
    int score,index;
    int stars =20;
    Stage primaryStage=new Stage();
    //  Circle ball;
    //Ball ball;
    Button pause;
    ArrayList<Rectangle> columns;
    //    int W=800,H=700;
    int W=378,H=478;
    int ticks,ymotion;
    Group root;
    Group root1,root2,root3,root4,root5;
    boolean gameOver;
    Label l;
    IntegerStringConverter str;
    Timeline tim;
    //Scene scene;
    Image cloud;
    ImageView cloudv;
    int X,Y;

    CSSwitch cswitch;
    Image images = new Image(new FileInputStream("C:\\Users\\Saarthak\\Desktop\\unnamed_lol.jpg"));
    ImageView imageViewn = new ImageView(images);
    ImageView imageView2 = new ImageView(images);
    ImageView imageView3 = new ImageView(images);
    ImageView imageView4 = new ImageView(images);
    ImageView imageView5 = new ImageView(images);
    ImageView imageView7 = new ImageView(images);
    Box box;
    Box box1;
    Box box2;
    Box box3;
    //Circle ball=new Circle();
    Ball ball = new Ball();
    Cross cross;
    Cross cross1;
    Cross cross2;
    Cross cross3;
    Cross cross4;
    CSSwitch c1= new CSSwitch();
    CSSwitch c2 = new CSSwitch();
    CSSwitch c3 = new CSSwitch();

    public Main() throws FileNotFoundException {
    }

    // obstacle3 fan;
    void Collision(CSSwitch c){
        if(ball.getBall().getBoundsInParent().intersects(c.getCswitch().getBoundsInParent())){
            c.changeColor(ball);
        }

        if(ball.getBall().getCenterY()>478){
            gameOver=true;
        }

        if(gameOver)
        {
            ball.getBall().setCenterY(H-120-ball.getBall().getRadius());
            l.setText("GameOver\n   Score:"+str.toString(score));
            l.setFont(new Font("Arial",50));
            l.setLayoutX(primaryStage.getWidth()/2-130);
            l.setLayoutY(primaryStage.getHeight()/2-50);
            l.setTextFill(Color.ORANGE);


        }
    }


    void Jump(){

        if(!gameOver){
            if(ymotion>0){
                ymotion=0;
            }
            ymotion=ymotion-10;
        }
    }

    void start1(){
        ball.getBall().setCenterX(W/2-10);
        ball.getBall().setCenterY(H/2+180);
        c1.getCswitch().setCenterX(179.0f);
        c1.getCswitch().setCenterY(310.0f);
        imageViewn.setX(167);
        imageViewn.setY(150);
        box2.getRoot().setLayoutY(-2000);
        c2.getCswitch().setCenterX(179.0f);
        c2.getCswitch().setLayoutY(-430);
        cross2.getRoot().setLayoutY(-1300);
        cross3.getRoot().setLayoutY(-2200);
        //c2.getCswitch().setCenterY(250.0f);
        imageView2.setX(167);
        imageView2.setY(150);
        cross2.getRoot().setLayoutY(-1300);
        c3.getCswitch().setCenterX(179.0f);
        c3.getCswitch().setCenterY(300.0f);
        box1.getRoot().setLayoutY(-1000);
        imageView3.setX(167);
        imageView3.setY(-1200);
        imageView4.setX(167);
        imageView4.setY(-1500);
        imageView5.setX(167);
        imageView5.setY(-2000);

        box3.getRoot().setLayoutY(-2600);

        imageView7.setFitHeight(20);
        imageView7.setFitWidth(20);
        imageView7.setX(167);
        imageView7.setY(-2200);

        gameOver=false;
        ymotion=0;
        score=0;
        scorelabel.setText("Score"+str.toString(score));
        root.getChildren().remove(btn);
        root.getChildren().removeAll(columns);
        columns.clear();

        int i=0;

//        while(i<20) {
//            addColumn();
//            i++;}

        tim.pause();

        scene3.setOnKeyPressed(k -> {
            String code = k.getCode().toString();
            if(code=="UP")
            {

                root.getChildren().addAll(columns);

                tim.play();

            }
        });
    }
    @Override
    public void start(Stage window) throws Exception{
        /*Parent root1 = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("MainGame.fxml"));
        Parent root3 = FXMLLoader.load(getClass().getResource("ResumeGame.fxml"));
        Parent root4 = FXMLLoader.load(getClass().getResource("ExitMenu.fxml"));*/
        primaryStage.setTitle("Color Switch");
        primaryStage.setHeight(478);
        primaryStage.setWidth(378);
        primaryStage.setResizable(false);
        //primaryStage.setScene(new Scene(root, 378, 478));
        root4=new Group();
        VBox vBox = new VBox();
        Image image = new Image(new FileInputStream("C:\\Users\\Saarthak\\Desktop\\colorswitch_new.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setX(52.5);
        imageView.setY(0);
        imageView.setFitHeight(195);
        imageView.setFitWidth(275);
        imageView.setPreserveRatio(true);
        //  borderPane1.getChildren().add(imageView);
        RadioButton radioButton1 = new RadioButton("VIEW STARS");
        RadioButton radioButton2 = new RadioButton("NEW GAME");
        RadioButton radioButton3 = new RadioButton("RESUME GAME");
        RadioButton radioButton4 = new RadioButton("EXIT");
        radioButton1.setPrefSize(173,47);
        radioButton1.setPadding(new Insets(10,10,10,10));
        radioButton1.setStyle("-fx-text-fill: red; "+ "-fx-background-color: #3CB371;");
        radioButton2.setPrefSize(173,47);
        radioButton2.setStyle("-fx-text-fill: red; "+ "-fx-background-color: #3CB371;");
        radioButton2.setPadding(new Insets(10,10,10,10));
        radioButton3.setPrefSize(173,47);
        radioButton3.setStyle("-fx-text-fill: red; "+ "-fx-background-color: #3CB371;");
        //radioButton3.setStyle("-fx-background-color: #3CB371;");

        //radioButton3.setStyle("-fx-text-: red;");
        radioButton3.setPadding(new Insets(10,10,10,10));
        radioButton4.setPrefSize(173,47);
        radioButton4.setStyle("-fx-text-fill: red; "+ "-fx-background-color: #3CB371;");
        radioButton4.setPadding(new Insets(10,10,10,10));
        AlertBox alertBox = new AlertBox();
        radioButton4.setOnAction(e ->{
            boolean check = alertBox.display("Confirmation","Are you sure you want to exit?");
            if(check==true){
                Platform.exit();
            }
        });
        //radioButton4.setOnAction(e->window.close());
        vBox.getChildren().addAll(radioButton1,radioButton2,radioButton3,radioButton4);
        vBox.setSpacing(10);
        // borderPane1.setCenter(vBox);
        vBox.setLayoutX(100);
        vBox.setLayoutY(200);
        root4.getChildren().addAll(vBox,imageView);
        vBox.setAlignment(Pos.BOTTOM_CENTER);
        scene1=new Scene(root4,378,478);
        scene1.setFill(Color.BLACK);
        //borderPane1.setStyle("-fx-background-color: black");
        primaryStage.setScene(scene1);

        Image imagex = new Image(new FileInputStream("C:\\Users\\Saarthak\\Desktop\\colorswitch_new.jpg"));
        ImageView imageViewx = new ImageView(image);
        imageViewx.setX(52.5);
        imageViewx.setY(0);
        imageViewx.setFitHeight(195);
        imageViewx.setFitWidth(275);
        imageViewx.setPreserveRatio(true);
        Group root9=new Group();
        root9.getChildren().add(imageViewx);
        Label first = new Label("Loading.....");
        first.setPrefSize(200,100);
        first.setStyle("-fx-text-fill: white; ");
        first.setLayoutX(90);
        first.setLayoutY(200);
        first.setFont(new Font(45));
        root9.getChildren().add(first);
        Scene scene=new Scene(root9,378,478);
        primaryStage.setScene(scene);
        scene.setFill(Color.BLACK);
        scene.setOnKeyPressed(k->primaryStage.setScene(scene1));

        // View Score
        root1=new Group();
        Image image1 = new Image(new FileInputStream("C:\\Users\\Saarthak\\Desktop\\unnamed_lol.jpg"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setX(140);
        imageView1.setY(30);
        imageView1.setFitHeight(100);
        imageView1.setFitWidth(100);
        imageView1.setPreserveRatio(true);
        Label label =new Label("STARS: "+stars);
        label.setFont(new Font(45));
        label.setPrefSize(349, 140);
        label.setWrapText(true);
        label.setAlignment(Pos.CENTER);
        label.setTextAlignment(TextAlignment.CENTER);
        label.setStyle("-fx-text-fill: white; "+"-fx-background-color: #FFD700; "+"-fx-border-color: white; ");
        label.setLayoutY(200);
        label.setLayoutX(7.5);

        // borderPane2.getChildren().add(label);
        // label.setAlignment(Pos.CENTER);
        // borderPane2.setCenter(label);
        Button button = new Button("OKAY");
        button.setFont(new Font(24));
        button.setPrefSize(105,58);
        button.setOnAction(e->primaryStage.setScene(scene1));
        /*HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(button);
        button.setAlignment(Pos.CENTER);*/
        button.setLayoutX(140);
        button.setLayoutY(375);
        root1.getChildren().addAll(imageView1,label,button);
        // borderPane2.getChildren().add(label);
        //  borderPane2.setBottom(hBox);
        //borderPane2.setStyle("-fx-background-color: black");
        scene2=new Scene(root1,378,478);
        scene2.setFill(Color.BLACK);
        radioButton1.setOnAction(e -> primaryStage.setScene(scene2));
        // Main Game
        root=new Group();
        // Image images = new Image(new FileInputStream("C:\\Users\\Srishti\\Downloads\\unnamed_lol.jpg"));


        box=new Box(1);
        box.rotate();
        // CSSwitch c1= new CSSwitch();
        c1.getCswitch().setCenterX(179.0f);
        c1.getCswitch().setCenterY(310.0f);
        // ImageView imageViewn = new ImageView(images);
        imageViewn.setFitHeight(20);
        imageViewn.setFitWidth(20);
        imageViewn.setX(167);
        imageViewn.setY(150);
        Group g1=new Group();
        g1.getChildren().add(box.getRoot());
        //g1.getChildren().add(imageView1);
        g1.getChildren().add(c1.getCswitch());
        g1.setLayoutY(10);
        imageViewn.setFitHeight(20);
        imageViewn.setFitWidth(20);
        imageViewn.setX(167);
        imageViewn.setY(150);
//layout is 10

        cross=new Cross(1);
        cross.rotate();
        CSSwitch c2= new CSSwitch();
        c2.getCswitch().setCenterX(179.0f);
        c2.getCswitch().setCenterY(250.0f);
        ImageView imageView2 = new ImageView(images);
        imageView2.setFitHeight(20);
        imageView2.setFitWidth(20);
        imageView2.setX(167);
        imageView2.setY(150);
        Group g2=new Group();
        g2.getChildren().add(cross.getRoot());
        //g2.getChildren().add(imageView2);
        g2.getChildren().add(c2.getCswitch());
        g2.setLayoutY(-450);
        c2.getCswitch().setLayoutY(-430);
        imageView2.setFitHeight(20);
        imageView2.setFitWidth(20);
        imageView2.setX(167);
        imageView2.setY(-410);

//layout is -450

        box1=new Box(2);
        box1.rotate();
        CSSwitch c3= new CSSwitch();
        c3.getCswitch().setCenterX(179.0f);
        c3.getCswitch().setCenterY(300.0f);
        ImageView imageView3 = new ImageView(images);

        Group g3=new Group();
        g3.getChildren().add(box1.getRoot());
        g3.getChildren().add(imageView3);
        g3.getChildren().add(c3.getCswitch());
        g3.setLayoutY(1200);
        box1.getRoot().setLayoutY(-1000);
        ImageView imageView6 = new ImageView(images);
        imageView6.setFitHeight(20);
        imageView6.setFitWidth(20);
        imageView6.setX(167);
        imageView6.setY(-900);


        imageView3.setFitHeight(20);
        imageView3.setFitWidth(20);
        imageView3.setX(167);
        imageView3.setY(-1200);
        c3.getCswitch().setLayoutY(-1300);


        cross2=new Cross(2);
        cross2.rotate();
        cross2.getRoot().setLayoutY(-1300);
        ImageView imageView4 = new ImageView(images);
        imageView4.setFitHeight(20);
        imageView4.setFitWidth(20);
        imageView4.setX(167);
        imageView4.setY(-1500);
        CSSwitch c4= new CSSwitch();
        c4.getCswitch().setCenterX(179.0f);
        c4.getCswitch().setCenterY(300.0f);
        c4.getCswitch().setLayoutY(-1800);

        CSSwitch c5= new CSSwitch();
        c5.getCswitch().setCenterX(179.0f);
        c5.getCswitch().setCenterY(300.0f);
        c5.getCswitch().setLayoutY(-2600);


        box2=new Box(2);
        box2.rotate();
        box2.getRoot().setLayoutY(-2000);
        ImageView imageView5 = new ImageView(images);
        imageView5.setFitHeight(20);
        imageView5.setFitWidth(20);
        imageView5.setX(167);
        imageView5.setY(-2000);
        cross3=new Cross(3);
        cross3.rotate();
        cross3.getRoot().setLayoutY(-2200);

        box3=new Box(3);
        box3.rotate();
        box3.getRoot().setLayoutY(-2600);
        ImageView imageView7 = new ImageView(images);
        imageView7.setFitHeight(20);
        imageView7.setFitWidth(20);
        imageView7.setX(167);
        imageView7.setY(-2200);

        cross4=new Cross(4);
        cross4.rotate();
        cross4.getRoot().setLayoutY(-2800);






        //BALL is Being Made

        ball.getBall().setCenterX(W/2-15);
        ball.getBall().setCenterY(H/2-10);
        ball.getBall().setRadius(10);
        ball.setFill(Color.WHITE);


        index=0;
        ymotion=0;

        str=new IntegerStringConverter();

        l=new Label();

        scorelabel=new Label();
        scorelabel.setTextFill(Color.WHITE);
        scorelabel.setFont(new Font("Arial",20));


        columns=new ArrayList<Rectangle>();



        tim=new Timeline();
        tim.setCycleCount(Animation.INDEFINITE);


        gameOver=false;

        btn = new Button();
        btn.setText("OKAY");
        btn.setTranslateX(130);
        btn.setTranslateY(150);
        btn.setPrefSize(100,50);
        btn.setTextFill(Color.BLACK);
        btn.setStyle("-fx-font: 10 arial; -fx-base: #ee2211;");
        btn.setFont(new Font("Open Sans",20));


        KeyFrame kf=new KeyFrame(Duration.millis(20),e -> {

            ticks++;
            if(ticks%4==0&&ymotion<15)
            {
                ymotion=ymotion+3;
            }

            X=X-2;

            int y=(int)ball.getBall().getCenterY()+ymotion;
            ball.getBall().setCenterY(y);
            scene3.setOnKeyPressed(k -> {

                String code = k.getCode().toString();
                if(code=="UP")
                {
                    Jump();
                }

                if(code=="SPACE")
                {
                    gameOver=true;
                }
                if(code=="DOWN")
                {
                    primaryStage.setScene(scene6);
                }
            });



            Collision(c1);
            Collision(c2);
            Collision(c3);
            Collision(c4);
            Collision(c5);

////////////////////////////////////////////////////////////////////////////down


            if(ball.getBall().getCenterY()<=239){
                g1.setLayoutY(g1.getLayoutY()+1);
                g2.setLayoutY(g2.getLayoutY()+1);
                c2.getCswitch().setLayoutY(c2.getCswitch().getLayoutY()+1);
                imageViewn.setLayoutY(imageViewn.getLayoutY()+1);
                imageView2.setLayoutY(imageView2.getLayoutY()+1);
                g3.setLayoutY(g3.getLayoutY()+1);
                box1.getRoot().setLayoutY(box1.getRoot().getLayoutY()+1);
                imageView3.setLayoutY(imageView3.getLayoutY()+1);
                c3.getCswitch().setLayoutY(c3.getCswitch().getLayoutY()+1);
                cross2.getRoot().setLayoutY(cross2.getRoot().getLayoutY()+1);
                imageView4.setLayoutY(imageView4.getLayoutY()+1);
                box2.getRoot().setLayoutY(box2.getRoot().getLayoutY()+1);
                c4.getCswitch().setLayoutY(c4.getCswitch().getLayoutY()+1);
                imageView5.setLayoutY(imageView5.getLayoutY()+1);
                cross3.getRoot().setLayoutY(cross3.getRoot().getLayoutY()+1);
                imageView6.setLayoutY(imageView6.getLayoutY()+1);
                c5.getCswitch().setLayoutY(c5.getCswitch().getLayoutY()+1);
                box3.getRoot().setLayoutY(box3.getRoot().getLayoutY()+1);
                imageView7.setLayoutY(imageView7.getLayoutY()+1);
                cross4.getRoot().setLayoutY(cross4.getRoot().getLayoutY()+1);



            }

////////////////////////////////////////////////////////////////////////////////////////////////////////star conditions for g1
            if(ball.getBall().getBoundsInParent().intersects(imageViewn.getBoundsInParent())){
                imageViewn.setX(1000);
                score++;
                scorelabel.setText(String.valueOf(score));
            }

//////////////////////////////////////////////////////////////////////////////////////////////////////////star conditions for g2
            if(ball.getBall().getBoundsInParent().intersects(imageView2.getBoundsInParent())){
                imageView2.setX(1000);
                score++;
                scorelabel.setText(String.valueOf(score));
            }

////////////////////////////////////////////////////////////////////////////////////////////////////////star conditions for g3
            if(ball.getBall().getBoundsInParent().intersects(imageView3.getBoundsInParent())){
                imageView3.setX(1000);
                score++;
                scorelabel.setText(String.valueOf(score));
            }

//            ////////////////////////////////////////////////////////////////////////////////////////////////////////star conditions for g4
            if(ball.getBall().getBoundsInParent().intersects(imageView4.getBoundsInParent())){
                imageView4.setX(1000);
                score++;
                scorelabel.setText(String.valueOf(score));
            }

            //            ////////////////////////////////////////////////////////////////////////////////////////////////////////star conditions for g5
            if(ball.getBall().getBoundsInParent().intersects(imageView5.getBoundsInParent())){
                imageView5.setX(1000);
                score++;
                scorelabel.setText(String.valueOf(score));
            }

            //            ////////////////////////////////////////////////////////////////////////////////////////////////////////star conditions for g6
            if(ball.getBall().getBoundsInParent().intersects(imageView6.getBoundsInParent())){
                imageView6.setX(1000);
                score++;
                scorelabel.setText(String.valueOf(score));
            }

            //            ////////////////////////////////////////////////////////////////////////////////////////////////////////star conditions for g7
            if(ball.getBall().getBoundsInParent().intersects(imageView7.getBoundsInParent())){
                imageView7.setX(1000);
                score++;
                scorelabel.setText(String.valueOf(score));
            }


            if(gameOver)
            {
                if(!(root.getChildren().contains(l)))
                    root.getChildren().addAll(l,btn);
                btn.setOnMouseClicked(k ->
                {
                    primaryStage.setScene(scene5);
                    // root.getChildren().remove(l);
                    //start1();

                });

            }



        });


        tim.getKeyFrames().addAll(kf);



        root.getChildren().addAll(scorelabel);

        root.getChildren().add(ball.getBall());


        root.getChildren().add(g1);
        root.getChildren().add(g2);
        root.getChildren().add(c2.getCswitch());
        root.getChildren().add(imageViewn);
        root.getChildren().add(imageView2);
        root.getChildren().add(box1.getRoot());
        root.getChildren().add(imageView3);
        root.getChildren().add(c3.getCswitch());
        root.getChildren().add(cross2.getRoot());
        root.getChildren().add(imageView4);
        root.getChildren().add(box2.getRoot());
        root.getChildren().add(c4.getCswitch());
        root.getChildren().add(imageView5);
        root.getChildren().add(cross3.getRoot());

        root.getChildren().add(imageView6);
        root.getChildren().add(c5.getCswitch());
        root.getChildren().add(box3.getRoot());
        root.getChildren().add(imageView7);
        root.getChildren().add(cross4.getRoot());

        scene3=new Scene(root, 378,478);
        scene3.setFill(Color.BLACK);
        start1();

        //Saved Games
        root2=new Group();
        radioButton2.setOnAction(e->{
            primaryStage.setScene(scene3);
            root.getChildren().remove(l);
            start1();
            score=0;
            scorelabel.setText(score+"");
        });
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("SAVED GAMES");
        MenuItem menuItem1 = new MenuItem("GAME 1");
        MenuItem menuItem2 = new MenuItem("GAME 2");
        MenuItem menuItem3 = new MenuItem("GAME 3");
        menuItem1.setStyle("-fx-background-color: pink");
        menuItem2.setStyle("-fx-background-color: pink");
        menuItem3.setStyle("-fx-background-color: pink");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);
        menuBar.getMenus().add(menu);
        menuBar.setPrefSize(350, 80);
        menu.setVisible(true);
        menuBar.setStyle("-fx-font-size: 35px; "+"-fx-background-color: black");
        menu.setStyle("-fx-background-color: #DB7093");
        menuBar.setLayoutX(10);
        menuBar.setLayoutY(200);

        Button button3 = new Button("BACK");
        button3.setPrefSize(125,51);

        button3.setAlignment(Pos.CENTER);
        button3.setStyle("-fx-background-color: HOTPINK; "+"-fx-font-size: 20px");
        button3.setOnAction(e->primaryStage.setScene(scene1));
        button3.setLayoutX(120);
        button3.setLayoutY(375);
        menuItem1.setOnAction(e->primaryStage.setScene(scene3));
        menuItem2.setOnAction(e->primaryStage.setScene(scene3));
        menuItem3.setOnAction(e->primaryStage.setScene(scene3));
        root2.getChildren().addAll(button3);
        root2.getChildren().add(menuBar);
        scene4 = new Scene(root2,378,478);
        scene4.setFill(Color.BLACK);
        radioButton3.setOnAction(e->primaryStage.setScene(scene4));

        // Destroy Menu
        VBox vBox2 = new VBox();
        root5= new Group();
        Label label1 = new Label("YOU LOST");
        label1.setPadding(new Insets(10,10,10,10));
        Label label5 = new Label("Stars: "+stars);
        label5.setStyle("-fx-background-color: GOLD; "+"-fx-font-size: 15px");
        label5.setPadding(new Insets(5,5,5,5));
        //borderPane5.setCenter(label1);
        RadioButton radioButton5= new RadioButton("USE 10 STARS TO RESUME");
        radioButton5.setPrefSize(225,40);
        radioButton5.setPadding(new Insets(10,10,10,10));
        radioButton5.setStyle("-fx-background-color: #AFEEEE; "+"-fx-font-size: 15px");
        RadioButton radioButton6 = new RadioButton("EXIT");
        radioButton6.setStyle("-fx-background-color: #AFEEEE; "+"-fx-font-size: 15px");
        radioButton6.setPrefSize(225,40);
        radioButton6.setPadding(new Insets(10,10,10,10));
        RadioButton radioButton11 = new RadioButton("RESTART");
        radioButton11.setStyle("-fx-background-color: #AFEEEE; "+"-fx-font-size: 15px");
        radioButton11.setPrefSize(225,40);
        radioButton11.setPadding(new Insets(10,10,10,10));

        vBox2.setAlignment(Pos.CENTER);
        vBox2.getChildren().addAll(label5, label1, radioButton5,radioButton11,radioButton6);
        label1.setStyle("-fx-background-color: SKYBLUE; "+"-fx-font-size: 20px");
        vBox2.setSpacing(20);
        vBox2.setLayoutX(75);
        vBox2.setLayoutY(130);
        // borderPane5.setCenter(vBox2);
        // borderPane5.setTop(label5);
        //borderPane5.setStyle("-fx-background-color: black");
        root5.getChildren().add(vBox2);
        scene5=new Scene(root5,378,478);
        scene5.setFill(Color.BLACK);
        uhoh uh = new uhoh();
        radioButton5.setOnAction(e->{
            if(stars>=10){
                stars=stars-10;
                label.setText("Stars: "+stars);
                label5.setText("Stars: "+stars);
                primaryStage.setScene(scene3);
                root.getChildren().remove(l);
                start1();
            }
            else if(stars<10){
                uh.display("OOPS!","You do not have enough stars");
                primaryStage.setScene(scene1);
            }
        });

        radioButton6.setOnAction(e->primaryStage.setScene(scene1));
        radioButton11.setOnAction(e ->{
            primaryStage.setScene(scene3);
            root.getChildren().remove(l);
            start1();
            score=0;
            scorelabel.setText(score+"");
        });
        //Exit Menu
        VBox vBox3 = new VBox();
        root3=new Group();
        RadioButton radioButton7 = new RadioButton("GO BACK");
        radioButton7.setPadding(new Insets(10,10,10,10));
        RadioButton radioButton8 = new RadioButton("SAVE & EXIT");
        radioButton8.setPadding(new Insets(10,10,10,10));
        RadioButton radioButton9 = new RadioButton("EXIT WITHOUT SAVING");
        radioButton9.setPadding(new Insets(10,10,10,10));
        RadioButton radioButton10 = new RadioButton("RESTART");
        radioButton10.setPadding(new Insets(10,10,10,10));
        radioButton7.setStyle("-fx-background-color: #FA8072; "+"-fx-font-size: 15px");
        radioButton8.setStyle("-fx-background-color: #FA8072; "+"-fx-font-size: 15px");
        radioButton9.setStyle("-fx-background-color: #FA8072; "+"-fx-font-size: 15px");
        radioButton10.setStyle("-fx-background-color: #FA8072; "+"-fx-font-size: 15px");
        radioButton7.setPrefSize(225,40);
        radioButton8.setPrefSize(225,40);
        radioButton9.setPrefSize(225,40);
        radioButton10.setPrefSize(225,40);
        radioButton7.setOnAction(e->primaryStage.setScene(scene3));
        radioButton8.setOnAction(e -> {
            Game game= new Game(menu.getItems().size()+1,score,ball.getColor());
            try {
                writeToFile(game);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            Game gm1=game;
            try {
                gm1 = readFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            MenuItem menuItem4 = new MenuItem("Game "+gm1.getId());
            menu.getItems().add(menuItem4);
            menuItem4.setStyle("-fx-background-color: pink");
            Game finalGm = gm1;
            menuItem4.setOnAction(k ->{
                primaryStage.setScene(scene3);
                primaryStage.setScene(scene3);
                root.getChildren().remove(l);
                start1();
                scorelabel.setText(finalGm.getScore()+"");
                ball.setColor(finalGm.getCl());

            });
            primaryStage.setScene(scene1);
        });

        AlertBox alertBox1 = new AlertBox();
        radioButton9.setOnAction(e -> {
            boolean check = alertBox1.display("Confirmation","Your game is not saved. Are you sure you want to exit?");
            if(check==true){
                primaryStage.setScene(scene1);
            }
        });
        radioButton10.setOnAction(e->{
            primaryStage.setScene(scene3);
            // primaryStage.setScene(scene3);
            root.getChildren().remove(l);
            start1();
            score=0;
            scorelabel.setText(score+"");
        });
        vBox3.getChildren().addAll(radioButton7,radioButton8,radioButton10,radioButton9);
        vBox3.setSpacing(10);
        vBox3.setAlignment(Pos.CENTER);
        vBox3.setLayoutX(75);
        vBox3.setLayoutY(130);
        root3.getChildren().add(vBox3);
        scene6 = new Scene(root3,378,478);
        scene6.setFill(Color.BLACK);
        primaryStage.setHeight(478);
        primaryStage.setWidth(378);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    public static void writeToFile(Game g) throws  IOException{
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("Game.bin"));
        outputStream.writeObject(g);
    } public static Game readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Game.bin"));
        Game g =(Game) objectInputStream.readObject();
        //System.out.println(g.getCl().toString());
        return g;

    }
}