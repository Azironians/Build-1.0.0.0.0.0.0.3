package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import Class.Sound;

public class FirstFone {
//должен загрузить Загрузку и музыку


    public void loadLoad(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlFiles/SecondFone.fxml"));
        Sound sound = new Sound(new File("sound\\sound1.wav"));
        sound.play();

    }
}