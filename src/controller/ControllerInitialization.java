package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.AzironGame;

import java.io.File;
import java.io.IOException;

public class ControllerInitialization {
    public void loadLoad(MouseEvent mouseEvent) throws IOException { System.out.print("sasa");
        Pane root = new AzironGame().getStage();
        File file2 = new File("Picture\\Windows\\WindowInit.bmp");
        Image image2 = new Image(file2.toURI().toString(), 1280.0, 720.0, true, true);
        ImageView imageView2 = new ImageView(image2);
        root.getChildren().addAll(imageView2);
        imageView2.toFront();
        imageView2.setTranslateX(0.0);
        imageView2.setTranslateY(0.0);


    }
}


//должен загрузить Загрузку и музыку
