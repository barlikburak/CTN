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
public class FXMLSatisUrunRaporController implements Initializable {

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
    private TableColumn tcKar;
    @FXML
    private TableColumn tcKDV;
    @FXML
    private TableColumn tcKDVTipi;
    @FXML
    private TableColumn tcIsk1;
    @FXML
    private TableColumn tcIsk2;
    @FXML
    private TableColumn tcIsk3;
    @FXML
    private TableColumn tcAraTop;
    @FXML
    private TableColumn tcKDVTop;
    @FXML
    private TableColumn tcToplam;
    @FXML
    private TableColumn tcDoviz;
    @FXML
    private TableColumn tcDegeri;
    @FXML
    private TableColumn tcCariAdi;
    @FXML
    private TableColumn tcIslemTarihi;
    @FXML
    private TableColumn tcIslemTuru;
    @FXML
    private Button btnSorgula;
    @FXML
    private Button btnExcel;
    @FXML
    private Button btnPDF;
    @FXML
    private DatePicker dpBas;
    @FXML
    private DatePicker dpSon;
    @FXML
    private CheckBox checkFaturaliIslemler;
    @FXML
    private CheckBox checkIadeİslemleri;
    @FXML
    private CheckBox checkDigerIslemler;
    @FXML
    private TextField tfBarkod;
    @FXML
    private ComboBox<String> cbUrunIsmi;
    @FXML
    private ComboBox<String> cbKategori;
    @FXML
    private Text txtKayitSayisi;
    @FXML
    private Text txtToplamKar;
    @FXML
    private Text txtToplamTutar;

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

}
