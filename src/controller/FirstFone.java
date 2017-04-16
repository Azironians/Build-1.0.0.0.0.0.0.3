package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import Class.Sound;
import javafx.stage.Stage;
import main.game;

public class FirstFone extends Pane {
//должен загрузить Загрузку и музыку

    public void loadLoad(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlFiles/SecondFone.fxml"));
        Sound sound = new Sound(new File("sound\\sound1.wav"));
        sound.play();
        Stage g = new game().getStage();
        Scene scene = new Scene(root, 1280, 720);
        g.setScene(scene);
        g.show();
    }
}