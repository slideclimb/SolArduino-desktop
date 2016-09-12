package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Text text;
    @FXML private ImageView yay;

    int count = 0;

    @FXML protected void buttonClick(ActionEvent event){
        count++;
        if((count % 2) == 1) {
            yay.setVisible(true);
        } else {
            yay.setVisible(false);
        }
        text.setText("Button has been clicked " + count + " times.");
    }
}
