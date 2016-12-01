package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Random random = new Random();
        button.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int changeX = random.nextInt(101) - 100;
                int changeY = random.nextInt(101) - 100;

                button.setTranslateX(changeX);
                button.setTranslateY(changeY);
            }
        });
    }
}
