package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
public class FXMLPesinSatisController implements Initializable {

    @FXML
    private TextField tfBarkod;
    @FXML
    private TextField tfTutar;
    @FXML
    private ComboBox<String> cbUrunAdi;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcBarkod;
    @FXML
    private TableColumn tcUrunIsmi;
    @FXML
    private TableColumn tcMiktar;
    @FXML
    private TableColumn tcBirim;
    @FXML
    private TableColumn tcBirimF;
    @FXML
    private Button btnPesin;
    @FXML
    private Button btnVeresiye;
    
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
    private void onMousePressedbtnPesin() {
        btnPesin.setLayoutY(btnPesin.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPesin() {
        btnPesin.setLayoutY(btnPesin.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPesin() {
        btnPesin.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnPesin() {
        btnPesin.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnVeresiye() {
        btnVeresiye.setLayoutY(btnVeresiye.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnVeresiye() {
        btnVeresiye.setLayoutY(btnVeresiye.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnVeresiye() {
        btnVeresiye.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnVeresiye() {
        btnVeresiye.setEffect(null);
    }

}
