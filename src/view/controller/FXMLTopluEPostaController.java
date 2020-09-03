package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import movements.JDialog;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLTopluEPostaController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcAdi;
    @FXML
    private TableColumn tcSoyadi;
    @FXML
    private TableColumn tcGrubu;
    @FXML
    private TableColumn tcEPosta;
    @FXML
    private ComboBox<String> cbCariGrubu;
    @FXML
    private TextField tfGonderen;
    @FXML
    private TextField tfKonu;
    @FXML
    private TextField tfCariAdi;
    @FXML
    private TextArea taMesaj;
    @FXML
    private Button btnEmail;
    @FXML
    private Button btnGonder;
    @FXML
    private Button btnSorgula;
    
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
    private void onMousePressedbtnEmail() {
        btnEmail.setLayoutY(btnEmail.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnEmail() {
        btnEmail.setLayoutY(btnEmail.getLayoutY() - 4);
        JDialog.openLogin();
    }

    @FXML
    private void onMouseEnteredbtnEmail() {
        btnEmail.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnEmail() {
        btnEmail.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnGonder() {
        btnGonder.setLayoutY(btnGonder.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnGonder() {
        btnGonder.setLayoutY(btnGonder.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnGonder() {
        btnGonder.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnGonder() {
        btnGonder.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnSorgula() {
        btnSorgula.setLayoutY(btnSorgula.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSorgula() {
        btnSorgula.setLayoutY(btnSorgula.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSorgula() {
        btnSorgula.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnSorgula() {
        btnSorgula.setEffect(null);
    }
}
