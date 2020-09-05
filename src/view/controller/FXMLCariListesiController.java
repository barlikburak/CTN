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
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLCariListesiController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcCariKod;
    @FXML
    private TableColumn tcAdi;
    @FXML
    private TableColumn tcSoyadi;
    @FXML
    private TableColumn tcNetBakiye;
    @FXML
    private TableColumn tcVD;
    @FXML
    private TableColumn tcVNo;
    @FXML
    private TableColumn tcAdres;
    @FXML
    private TableColumn tcTCNo;
    @FXML
    private TableColumn tcParaBirimi;
    @FXML
    private TableColumn tcLimit;
    @FXML
    private TableColumn tcAciklama;
    @FXML
    private TableColumn tcKayitTarihi;
    @FXML
    private Text txtKayitSayisi;
    @FXML
    private TextField tfAdi;
    @FXML
    private TextField tfSoyadi;
    @FXML
    private TextField tfCariKodu;
    @FXML
    private TextField tfTCNo;
    @FXML
    private ComboBox<String> cbCariGrubu;
    @FXML
    private ComboBox<String> cbGuzergah;
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

}
