package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLCekSenetCirolaController implements Initializable {

    @FXML
    private TableView tvKasadaki;
    @FXML
    private TableColumn tcNoKasa;
    @FXML
    private TableColumn tcKayitTKasa;
    @FXML
    private TableColumn tcVadeTKasa;
    @FXML
    private TableColumn tcTutarKasa;
    @FXML
    private TableColumn tcDovizKasa;
    @FXML
    private TableColumn tcBelgeTuruKasa;
    @FXML
    private TableColumn tcCariAdiKasa;
    @FXML
    private TableView tvSecilen;
    @FXML
    private TableColumn tcNoSecilen;
    @FXML
    private TableColumn tcKayitTSecilen;
    @FXML
    private TableColumn tcVadeTSecilen;
    @FXML
    private TableColumn tcTutarSecilen;
    @FXML
    private TableColumn tcDovizSecilen;
    @FXML
    private TableColumn tcBelgeTuruSecilen;
    @FXML
    private TableColumn tcCariAdiSecilen;
    @FXML
    private ComboBox<String> cbCariSecimi;
    @FXML
    private ComboBox<String> cbIslemTipi;
    @FXML
    private ComboBox<String> cbDoviz;
    @FXML
    private DatePicker dpIslemTarihi;
    @FXML
    private TextArea taAciklama;
    @FXML
    private TextField tfTutar;
    @FXML
    private TextField tfDovizKuru;
    @FXML
    private TextField tfDovizliTutar;
    @FXML
    private TextField tfPesinat;
    @FXML
    private TextField tfKendiCekim;
    @FXML
    private TextField tfKendiSenedim;
    @FXML
    private TextField tfMusteriCeki;
    @FXML
    private TextField tfMusteriSenedi;
    @FXML
    private TextField tfAcikHesap;
    @FXML
    private TextField tfToplam;
    @FXML
    private TextField tfOrtVade;
    @FXML
    private Button btnTemizle;
    @FXML
    private Button btnKaydet;
    @FXML
    private Button btnKendiCekimEkle;
    @FXML
    private Button btnKendiSenedimEkle;
    @FXML
    private Button btnMusteriCekiEkle;
    @FXML
    private Button btnMusteriSenediEkle;
    @FXML
    private CheckBox checkKendiCekim;
    @FXML
    private CheckBox checkKendiSenedim;
    @FXML
    private CheckBox checkMusteriCeki;
    @FXML
    private CheckBox checkMusteriSenedi;

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
        btnTemizle.setEffect(efekt);
    }

    @FXML
    private void onMousePressedbtnKaydet() {
        btnKaydet.setLayoutY(btnKaydet.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnKaydet() {
        btnKaydet.setLayoutY(btnKaydet.getLayoutY() - 4);
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
