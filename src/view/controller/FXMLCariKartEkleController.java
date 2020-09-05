package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
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
public class FXMLCariKartEkleController implements Initializable {

    @FXML
    private Spinner<Integer> spinnerAdet;
    @FXML
    private ComboBox<String> cbCariGrubu;
    @FXML
    private ComboBox<String> cbParaBirimi;
    @FXML
    private ComboBox<String> cbGuzergahRut;
    @FXML
    private ComboBox<String> cbCariSatisFiyatTipi;
    @FXML
    private TextField tfCariAdi;
    @FXML
    private TextField tfCariUnvanSoyad;
    @FXML
    private TextField tfCariKodu;
    @FXML
    private TextField tfCariLimiti;
    @FXML
    private TextField tfWebSitesi;
    @FXML
    private TextField tfVD;
    @FXML
    private TextField tfVNo;
    @FXML
    private TextField tfRIFD;
    @FXML
    private TextField tfAdresAdi;
    @FXML
    private TextField tfEMail;
    @FXML
    private TextField tfTelefon;
    @FXML
    private TextField tfBolge;
    @FXML
    private TextField tfPosataKodu;
    @FXML
    private TextArea taCariAciklama;
    @FXML
    private TextArea taCariAdres;
    @FXML
    private CheckBox checkVarsayilanAdres;
    @FXML
    private Button btnTemizle;
    @FXML
    private Button btnKaydet;

    private Effect efekt;
    private SpinnerValueFactory<Integer> svf;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        efekt = new DropShadow();
        svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, 0);
        spinnerAdet.setValueFactory(svf);
    }

    @FXML
    private void onMousePressedbtnTemizle() {
        btnTemizle.setLayoutY(btnTemizle.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnTemizle() {
        btnTemizle.setLayoutY(btnTemizle.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnTemizle() {
        btnTemizle.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnTemizle() {
        btnTemizle.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnKaydet() {
        btnKaydet.setLayoutY(btnKaydet.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnKaydet() {
        btnKaydet.setLayoutY(btnKaydet.getLayoutY() - 4);
        JDialog.openBilgi(null, "İşlem Tamamlandı!", "cari-kart-ekle.png");
    }

    @FXML
    private void onMouseEnteredbtnKaydet() {
        btnKaydet.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnKaydet() {
        btnKaydet.setEffect(null);
    }

}
