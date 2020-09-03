package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class FXMLTeklifSiparisRaporController implements Initializable {

    @FXML
    private ComboBox<String> cbIslem;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcCariAdi;
    @FXML
    private TableColumn tcOdemeTuru;
    @FXML
    private TableColumn tcIslemTarihi;
    @FXML
    private TableColumn tcIslemTuru;
    @FXML
    private TableColumn tcAraTop;
    @FXML
    private TableColumn tcKDVTop;
    @FXML
    private TableColumn tcTopIsk;
    @FXML
    private TableColumn tcIscilik;
    @FXML
    private TableColumn tcGenelTop;
    @FXML
    private TableColumn tcFaturaNo;
    @FXML
    private TableColumn tcBelgeNo;
    @FXML
    private TableColumn tcIrsaliyeNo;
    @FXML
    private TableColumn tcIAciklama;
    @FXML
    private Text txtKayitSayisi;
    @FXML
    private Text txtToplamIskonto;
    @FXML
    private Text txtGenelToplam;
    @FXML
    private CheckBox checkPesin;
    @FXML
    private CheckBox checkCekSenet;
    @FXML
    private CheckBox checkFaturaliIslemler;
    @FXML
    private CheckBox checkIadeİslemleri;
    @FXML
    private CheckBox checkDigerIslemler;
    @FXML
    private TextField tfFaturaNo;
    @FXML
    private TextField tfBelgeNo;
    @FXML
    private TextField tfIrsaliyeNo;
    @FXML
    private DatePicker dpBas;
    @FXML
    private DatePicker dpSon;
    @FXML
    private Button btnSorgula;
    @FXML
    private Button btnExcel;
    @FXML
    private Button btnPDF;

    private Effect efekt;
    private ObservableList<String> olIslem;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        efekt = new DropShadow();
        olIslem = FXCollections.observableArrayList("Satış", "Alış");
        cbIslem.setItems(olIslem);
        cbIslem.setValue("Satış");
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
