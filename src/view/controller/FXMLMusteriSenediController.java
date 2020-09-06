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
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLMusteriSenediController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcCariAdi;
    @FXML
    private TableColumn tcSeriNo;
    @FXML
    private TableColumn tcCekNo;
    @FXML
    private TableColumn tcKayitT;
    @FXML
    private TableColumn tcOdemeT;
    @FXML
    private TableColumn tcVadeT;
    @FXML
    private TableColumn tcTutari;
    @FXML
    private TableColumn tcOdeme;
    @FXML
    private TableColumn tcDoviz;
    @FXML
    private TableColumn tcDovizDegeri;
    @FXML
    private TableColumn tcGenelTutar;
    @FXML
    private TableColumn tcAciklama;
    @FXML
    private TableColumn tcCiroEden;
    @FXML
    private TableColumn tcDurumu;
    @FXML
    private TableColumn tcYeri;
    @FXML
    private Text txtKayitSayisi;
    @FXML
    private ComboBox<String> cbCariSecimi;
    @FXML
    private ComboBox<String> cbYeri;
    @FXML
    private ComboBox<String> cbDurumu;
    @FXML
    private TextField tfSeriNo;
    @FXML
    private CheckBox checkKayit;
    @FXML
    private CheckBox checkOdeme;
    @FXML
    private CheckBox checkVade;
    @FXML
    private DatePicker dpBasKayit;
    @FXML
    private DatePicker dpSonKayit;
    @FXML
    private DatePicker dpBasOdeme;
    @FXML
    private DatePicker dpSonOdeme;
    @FXML
    private DatePicker dpBasVade;
    @FXML
    private DatePicker dpSonVade;
    @FXML
    private Button btnCariSecimi;
    @FXML
    private Button btnSorgula;
    @FXML
    private Button btnExcel;
    @FXML
    private Button btnPDF;

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
    private void onMousePressedbtnExcel() {
        btnExcel.setLayoutY(btnExcel.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnExcel() {
        btnExcel.setLayoutY(btnExcel.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnExcel() {
        btnExcel.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnExcel() {
        btnExcel.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnPDF() {
        btnPDF.setLayoutY(btnPDF.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPDF() {
        btnPDF.setLayoutY(btnPDF.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPDF() {
        btnPDF.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnPDF() {
        btnPDF.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnCariSecimi() {
        btnCariSecimi.setLayoutY(btnCariSecimi.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnCariSecimi() {
        btnCariSecimi.setLayoutY(btnCariSecimi.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnCariSecimi() {
        btnCariSecimi.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnCariSecimi() {
        btnCariSecimi.setEffect(null);
    }

}
