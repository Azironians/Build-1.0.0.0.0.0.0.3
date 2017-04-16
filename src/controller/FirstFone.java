package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * @author otp
 */
public class FirstFone {
//должен загрузить Загрузку и музыку


    @FXML
    private Pane label;

    static void move(ImageView imv) {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                imv.setTranslateX(imv.getTranslateX() + 1);
            }
        };
        timer.start();

    }
    @FXML
    private void selectFile() throws InterruptedException {
        File file = new File("ger3g.png");
        Image im = new Image(String.valueOf(file.toURI()));
        ImageView imv = new ImageView(im);
        label.getChildren().add(imv);
        move(imv);

    }

}