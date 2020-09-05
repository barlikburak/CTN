package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLCariEkstreRaporController implements Initializable {

    @FXML
    private ComboBox<String> cbCariSecimi;
    @FXML
    private RadioButton rbTumTarihler;
    @FXML
    private RadioButton rbTarihAraligi;
    @FXML
    private RadioButton rbArtanSiralama;
    @FXML
    private RadioButton rbAzalanSiralama;
    @FXML
    private DatePicker dpBas;
    @FXML
    private DatePicker dpSon;
    @FXML
    private Button btnRaporGoruntule;

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
    private void onMousePressedbtnRaporGoruntule() {
        btnRaporGoruntule.setLayoutY(btnRaporGoruntule.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnRaporGoruntule() {
        btnRaporGoruntule.setLayoutY(btnRaporGoruntule.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnRaporGoruntule() {
        btnRaporGoruntule.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnRaporGoruntule() {
        btnRaporGoruntule.setEffect(null);
    }

}
