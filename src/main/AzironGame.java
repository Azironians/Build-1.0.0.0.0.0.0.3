package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AzironGame extends Application {

    public AzironGame(){}
    private Stage azironStage;

    @Override
    public void start(Stage AzironStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlFiles/WindowInitialization.fxml"));
        AzironStage.setTitle("Heroes of Azironian");
        Scene scene = new Scene(root, 1280, 720);

        AzironStage.setScene(scene);
        AzironStage.show();
        this.azironStage = AzironStage;
    }

    public Stage getStage() {
        return azironStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}