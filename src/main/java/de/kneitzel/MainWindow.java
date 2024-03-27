package de.kneitzel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindow implements Initializable {

    @FXML
    private TextField textField;
    public Button button;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (button == null) {
            textField.setText("Button is null");
        } else {
            textField.setText("Button is not null");
        }
    }

    @FXML
    private void onButtonClick(ActionEvent actionEvent) {

    }
}
