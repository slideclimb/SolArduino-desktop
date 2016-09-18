package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class Controller {

    String username = System.getProperty("user.name");

    @FXML private Text text;
    @FXML private ImageView yay;
    @FXML private Button buttonUpdate;
    @FXML private TextField inputDegrees;

    @FXML protected void buttonUp(ActionEvent event) {
        sendHttpRequest("http://192.168.2.106/?panel=up");
    }

    @FXML protected void buttonDown(ActionEvent event) {
        sendHttpRequest("http://192.168.2.106/?panel=down");
    }

    @FXML protected void buttonAuto(ActionEvent event) {
        sendHttpRequest("http://192.168.2.106/?panel=auto");
    }

    @FXML protected void buttonUpdate(ActionEvent event) {
        sendHttpRequest("http://192.168.2.106/?update");
        System.out.println(event);
    }

    @FXML protected void setAngle(ActionEvent event) {
        sendHttpRequest("http://192.168.2.106/?degrees="+inputDegrees.getText());
    }

    private void sendHttpRequest(String url) {
        try {
            InputStream response = new URL(url).openStream();
            try (Scanner scanner = new Scanner(response)) {
                String responseBody = scanner.useDelimiter("\\A").next();
                text.setText(responseBody);
            }
        } catch (IOException e) {
            printStackTrace();
        }

    }
}
