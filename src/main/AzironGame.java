package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;


public class AzironGame extends Application {

    public AzironGame(){}
    private Pane azironStage;

    @Override
    public void start(Stage AzironStage) throws Exception {
        Pane root = FXMLLoader.load(getClass().getResource("../fxmlFiles/WindowInitialization.fxml"));
        AzironStage.setTitle("Heroes of Azironian");
        Scene scene = new Scene(root, 1280, 720);
        File file = new File("Picture\\Windows\\WindowInitialization.jpg");
        Image image = new Image(file.toURI().toString(),1280.0,720.0,true,true);
        ImageView imageView = new ImageView(image);

        root.getChildren().addAll(imageView);

        AzironStage.setScene(scene);
        AzironStage.show();
        this.azironStage = root;
    }

    public Pane getStage() {
        return azironStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}