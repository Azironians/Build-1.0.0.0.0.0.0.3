package controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.AzironGame;

import java.io.IOException;

public class ControllerInitialization extends Pane {

    public void loadLoad(MouseEvent mouseEvent) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("../fxmlFiles/WindowInitialization.fxml"));
        Stage g = new AzironGame().getStage();
        Scene scene = new Scene(root, 1280, 720);
        g.setScene(scene);
        g.show();
    }
}


//должен загрузить Загрузку и музыку
