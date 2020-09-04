package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
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
public class FXMLGelirlerController implements Initializable {

    @FXML
    private TextField tfGelirAdi;
    @FXML
    private TextField tfTutar;
    @FXML
    private DatePicker dpIslemTarihi;
    @FXML
    private TextArea taAciklama;
    @FXML
    private Button btnKaydet;

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
    private void onMouseActionbtnKaydet() {
        JDialog.openBilgi(null, "İşlem Tamamlandı!", "gelirler.png");
    }

    @FXML
    private void onMouseEnteredbtnKaydet() {
        btnKaydet.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedtnKaydet() {
        btnKaydet.setEffect(null);
    }

}
