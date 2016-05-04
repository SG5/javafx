package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

/**
 * Created on 04.05.16.
 */
public class FXMLExampleController {

    @FXML
    private Text actionResult;
    @FXML
    private PasswordField password;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actionResult.setText("Нажал кнопку");
    }
}
