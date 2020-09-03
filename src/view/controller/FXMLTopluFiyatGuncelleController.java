package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import movements.JDialog;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLTopluFiyatGuncelleController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcUrunAdi;
    @FXML
    private TableColumn tcBirimF;
    @FXML
    private ComboBox<String> cbCariSecimi;
    @FXML
    private DatePicker dpBas;
    @FXML
    private DatePicker dpSon;
    @FXML
    private Button btnSorgula;
    @FXML
    private Button btnGuncelle;

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

    @FXML
    private void onMouseEnteredbtnGuncelle() {
        btnGuncelle.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnGuncelle() {
        btnGuncelle.setEffect(null);
    }

    @FXML
    private void onMouseActionbtnGuncelle() {
        JDialog.openBilgi(null, "İşlem Başarılı!", "toplu-fis-fiyat-guncelle.png");
    }

}
