
package sample;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class Bikes{
    Stage window;
    public Bikes(Stage window){
        this.window=window;
    }
    public void start(){
        try {
            window.setTitle("Online Shopping");

            Menu s1Menu = new Menu(new MenuBar(),window);
            s1Menu.menuBar();

            TreeViewLeft s1TreeView = new TreeViewLeft(new TreeView<>(),window);
            s1TreeView.treeView();
            HBox hBox = new HBox();
            
            VBox vBox1 = new VBox();
            
            VBox vBoximg = new VBox();
            vBoximg.setPadding(new Insets(110, 260, 130, 260));
            vBoximg.setSpacing(20);
            VBox vBoximg2 = new VBox();
            vBoximg2.setPadding(new Insets(110, 100, 130, 50));
            vBoximg2.setSpacing(15);

            Group r=new Group();
            OneItem o1 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/tvs-scooty-zest.jpg","TVS Scooty Zest","Price: 1,47,500 BDT",250,105,window);
            o1.createAnItem();
            o1.CREATEButton();
            o1.createrectangle();
            o1.button1.setLayoutX(423);
            o1.button1.setLayoutY(140);
            OneItem o2 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/honda-livo.jpg","HONDA Livo","Price: 1,26,000 BDT",250,220,window);
            o2.createAnItem();
            o2.CREATEButton();
            o2.createrectangle();
            o2.button1.setLayoutX(423);
            o2.button1.setLayoutY(250);
            OneItem o3 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/h-power-recover.jpg","H Power Recover","Price: 1,15,000 BDT",250,335,window);
            o3.createAnItem();
            o3.CREATEButton();
            o3.createrectangle();
            o3.button1.setLayoutX(423);
            o3.button1.setLayoutY(360);
            OneItem o4 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/bajaj-pulsar-160-ns.jpg","Bajaj Pulsar 160 NS","Price: 1,99,500 BDT",250,450,window);
            o4.createAnItem();
            o4.CREATEButton();
            o4.createrectangle();
            o4.button1.setLayoutX(423);
            o4.button1.setLayoutY(470);
            OneItem o11 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/TVS JUPITER.jpg","TVS Jupiter","Price: 1,64,900 BDT",250,565,window);
            o11.createAnItem();
            o11.CREATEButton(); o11.createrectangle();
            o11.button1.setLayoutX(423);
            o11.button1.setLayoutY(580);

            OneItem o5 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/yamaha-r15-s.jpg","Yamaha R15 S","Price: 3,95,000 BDT",710,105,window);
            o5.createAnItem();
            o5.CREATEButton();
            o5.createrectangle();
            o5.button1.setLayoutX(910);
            o5.button1.setLayoutY(140);

            OneItem o6 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/yamaha-fazer-v2.jpg","Yamaha Fazer V2","Price: 2,63,000 BDT",710,220,window);
            o6.createAnItem();
            o6.CREATEButton();
            o6.createrectangle();
            o6.button1.setLayoutX(910);
            o6.button1.setLayoutY(250);

            OneItem o7 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/hero-splendor.jpg","Hero Splendor","Price: 1,63,000 BDT",710,335,window);
            o7.createAnItem();
            o7.CREATEButton();
            o7.createrectangle();
            o7.button1.setLayoutX(910);
            o7.button1.setLayoutY(360);
            OneItem o8 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/hero-hf-dawn.jpg","Hero Hf Dawn","Price: 95,000 BDT",710,450,window);
            o8.createAnItem();
            o8.CREATEButton();
            o8.createrectangle();
            o8.button1.setLayoutX(910);
            o8.button1.setLayoutY(470);

            OneItem o12 = new OneItem("/home/sahidul/Desktop/Online Shopping/src/sample/Pictures/CAR/bajaj-avenger-street-150.jpg","Bajaj Avenger\nStreet 150","Price: 1,99,500 BDT",710,565,window);
            o12.createAnItem(); o12.CREATEButton(); o12.createrectangle();
            o12.button1.setLayoutX(910);
            o12.button1.setLayoutY(580);

            vBoximg.getChildren().addAll(o1.imageView,o2.imageView,o3.imageView,o4.imageView,o11.imageView);
            vBoximg2.getChildren().addAll(o5.imageView,o6.imageView,o7.imageView,o8.imageView,o12.imageView);
            hBox.getChildren().addAll(vBoximg,vBoximg2);
            Group r3=new Group();
            r3.getChildren().addAll(o1.rectangle,o2.rectangle,o3.rectangle,o4.rectangle,o5.rectangle,o11.rectangle,o6.rectangle,o7.rectangle,o8.rectangle,o12.rectangle,hBox,o1.button1,o2.button1,o3.button1,o4.button1,o5.button1,o11.button1,o6.button1,o7.button1,o8.button1,o12.button1);

            BorderPane borderpane = new BorderPane();

            borderpane.getChildren().add(r3);
            borderpane.setTop(s1Menu.menuBar);
            borderpane.setLeft(s1TreeView.treeView);

            Scene scene11 = new Scene(borderpane, 1140, 690);
            window.setScene(scene11);
            window.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}