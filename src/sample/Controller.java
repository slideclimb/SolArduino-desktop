package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Text text;

    int count = 0;

    @FXML protected void buttonClick(ActionEvent event){
        count++;
        text.setText("Button has been clicked " + count + " times.");
    }
}
