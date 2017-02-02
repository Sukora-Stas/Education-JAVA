package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);
        Button btn = new Button();
        btn.setLayoutX(100);
        btn.setMaxSize(100,500);
        btn.setLayoutY(80);
        btn.setText("Hello World");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });
        root.getChildren().add(btn);

        Button btn1 = new Button();
        btn1.setLayoutX(0);
        btn1.setLayoutY(0);
        btn1.setText("Idi naxuy");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Sosi xyu");
            }
        });
        root.getChildren().add(btn1);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}