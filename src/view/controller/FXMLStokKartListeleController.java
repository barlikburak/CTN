package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class FXMLStokKartListeleController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcBarkod;
    @FXML
    private TableColumn tcUrunAdi;
    @FXML
    private TableColumn tcAlisF;
    @FXML
    private TableColumn tcSatisF;
    @FXML
    private TableColumn tcKarOrani;
    @FXML
    private TableColumn tcKar;
    @FXML
    private TableColumn tcKDV;
    @FXML
    private TableColumn tcTipi;
    @FXML
    private TableColumn tcKategori;
    @FXML
    private TableColumn tcBirim;
    @FXML
    private TableColumn tcAdet;
    @FXML
    private TableColumn tcEklenmeTarihi;
    @FXML
    private Text textKayitSayisi;
    @FXML
    private TextField tfBarkod;
    @FXML
    private TextField tfUrunAdi;
    @FXML
    private ComboBox<Integer> cbKDV;
    @FXML
    private ComboBox<String> cbKDVTipi;
    @FXML
    private ComboBox<String> cbKategori;
    @FXML
    private Button btnSorgula;
    @FXML
    private Button btnExcel;
    @FXML
    private Button btnPDF;

    private Effect efekt;
    private ObservableList<String> olKategori;
    private ObservableList<Integer> olKDV;
    private ObservableList<String> olKDVTipi;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        efekt = new DropShadow();
        
        olKategori = FXCollections.observableArrayList("Demirbaş", "Genel");
        cbKategori.setItems(olKategori);
        olKDV = FXCollections.observableArrayList(0, 1, 5, 8, 18);
        cbKDV.setItems(olKDV);
        olKDVTipi = FXCollections.observableArrayList("Dahil", "Hariç");
        cbKDVTipi.setItems(olKDVTipi);
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
