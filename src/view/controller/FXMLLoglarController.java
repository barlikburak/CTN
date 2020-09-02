package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLLoglarController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcAciklama;
    @FXML
    private TableColumn tcTarihSaat;
    @FXML
    private TextField textField;
    @FXML
    private Button button;

    private Effect efekt;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        efekt = new DropShadow();
    }

    @FXML
    private void onMousePressedButton() {
        button.setLayoutY(button.getLayoutY() + 4);
    }

    @FXML
    private void onMouseRelasedButton() {
        button.setLayoutY(button.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredButton() {
        button.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedButton() {
        button.setEffect(null);
    }

}
