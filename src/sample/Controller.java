package sample;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;
import java.util.Scanner;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class Controller {

    String username = System.getProperty("user.name");

    @FXML private Text text;
    @FXML private ImageView yay;
    @FXML private Button buttonUpdate;
    @FXML private TextField inputDegrees;
    @FXML private ImageView buttonDownImage;

    @FXML protected void buttonUp(ActionEvent event) {
        sendHttpRequest("http://192.168.178.106/?panel=up");
    }

    @FXML protected void buttonDown(ActionEvent event) {
        sendHttpRequest("http://192.168.178.106/?panel=down");
    }

    @FXML protected void buttonAuto(ActionEvent event) {
        sendHttpRequest("http://192.168.178.106/?panel=auto");
    }

    @FXML protected void buttonUpdate(ActionEvent event) {
        sendHttpRequest("http://192.168.178.106/?update");
    }

    @FXML protected void setAngle(ActionEvent event) {
        sendHttpRequest("http://192.168.178.106/?degrees="+inputDegrees.getText());
    }

    @FXML protected void buttonStop(ActionEvent event) {
        sendHttpRequest("http://192.168.178.106/?panel=stop");
    }

    private void sendHttpRequest(String url) {
        System.out.println(url);
//        try {
//            InputStream response = new URL(url).openStream();
//            try (Scanner scanner = new Scanner(response)) {
//                String responseBody = scanner.useDelimiter("\\A").next();
//                text.setText(responseBody);
//            }
//        } catch (IOException e) {
//            printStackTrace();
//        }

    }
}
