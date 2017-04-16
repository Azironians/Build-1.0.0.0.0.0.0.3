package main;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFXCyberForum1 extends Application {
    private Parent root;
    private Stage primaryStage;

    @FXML
    public void loadload() throws IOException {
        root = FXMLLoader.load(primaryStage.getClass().getResource("../fxmlFiles/SecondFone.fxml"));

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlFiles/firstFone.fxml"));
        primaryStage.setTitle("Heroes of Azironian");
        Scene scene = new Scene(root,1280,720);
        primaryStage.setScene(scene);
        primaryStage.show();
        this.root= root;
        this.primaryStage = primaryStage;
    }


    public static void main(String[] args) {
        launch(args);
    }

}