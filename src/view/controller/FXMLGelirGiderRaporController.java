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
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLGelirGiderRaporController implements Initializable {

    @FXML
    private TableView tableViewGelirRapor;
    @FXML
    private TableView tableViewGiderRapor;
    @FXML
    private TableView tableViewGelirGiderRapor;
    @FXML
    private TableColumn tcGelirRaporGelirAdi;
    @FXML
    private TableColumn tcGelirRaporTutar;
    @FXML
    private TableColumn tcGelirRaporIslemTarihi;
    @FXML
    private TableColumn tcGelirRaporAciklama;
    @FXML
    private TableColumn tcGiderRaporMasrafAdi;
    @FXML
    private TableColumn tcGiderRaporTutar;
    @FXML
    private TableColumn tcGiderRaporBelgeNo;
    @FXML
    private TableColumn tcGiderRaporIslemTarihi;
    @FXML
    private TableColumn tcGiderRaporAciklama;
    @FXML
    private TableColumn tcGiderRaporMasrafTipi;
    @FXML
    private TableColumn tcGiderRaporPersonelAdSoyad;
    @FXML
    private TableColumn tcGiderRaporCariAdSoyad;
    @FXML
    private TableColumn tcGelirGiderRaporGelirGiderAdi;
    @FXML
    private TableColumn tcGelirGiderRaporGelirGiderTipi;
    @FXML
    private TableColumn tcGelirGiderRaporTutar;
    @FXML
    private TableColumn tcGelirGiderRaporIslemTarihi;
    @FXML
    private TableColumn tcGelirGiderRaporAciklama;
    @FXML
    private Text txtGelirRaporKayitSayisi;
    @FXML
    private Text txtGelirRaporToplamTutar;
    @FXML
    private Text txtGiderRaporKayitSayisi;
    @FXML
    private Text txtGiderRaporToplamTutar;
    @FXML
    private Text txtGelirGiderRaporKayitSayisi;
    @FXML
    private Text txtGelirGiderRaporToplamTutar;
    @FXML
    private TextField tfGelirRaporGelirAdi;
    @FXML
    private TextField tfGelirRaporAciklama;
    @FXML
    private TextField tfGelirRaporTutarMin;
    @FXML
    private TextField tfGelirRaporTutarMax;
    @FXML
    private TextField tfGiderRaporTutarMin;
    @FXML
    private TextField tfGiderRaporTutarMax;
    @FXML
    private TextField tfGelirGiderRaporAciklama;
    @FXML
    private TextField tfGelirGiderRaporTutarMin;
    @FXML
    private TextField tfGelirGiderRaporTutarMax;
    @FXML
    private DatePicker dpGelirRaporBas;
    @FXML
    private DatePicker dpGelirRaporSon;
    @FXML
    private DatePicker dpGiderRaporBas;
    @FXML
    private DatePicker dpGiderRaporSon;
    @FXML
    private DatePicker dpGelirGiderRaporBas;
    @FXML
    private DatePicker dpGelirGiderRaporSon;
    @FXML
    private ComboBox<String> cbGelirRaporMasrafKarti;
    @FXML
    private ComboBox<String> cbGelirRaporMasrafTipi;
    @FXML
    private Button btnSorgulaGelir;
    @FXML
    private Button btnExcelGelir;
    @FXML
    private Button btnPDFGelir;
    @FXML
    private Button btnSorgulaGider;
    @FXML
    private Button btnExcelGider;
    @FXML
    private Button btnPDFGider;
    @FXML
    private Button btnSorgulaGelirGider;
    @FXML
    private Button btnExcelGelirGider;
    @FXML
    private Button btnPDFGelirGider;

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
    private void onMousePressedbtnSorgulaGelir() {
        btnSorgulaGelir.setLayoutY(btnSorgulaGelir.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSorgulaGelir() {
        btnSorgulaGelir.setLayoutY(btnSorgulaGelir.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSorgulaGelir() {
        btnSorgulaGelir.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnSorgulaGelir() {
        btnSorgulaGelir.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnExcelGelir() {
        btnExcelGelir.setLayoutY(btnExcelGelir.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnExcelGelir() {
        btnExcelGelir.setLayoutY(btnExcelGelir.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnExcelGelir() {
        btnExcelGelir.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnExcelGelir() {
        btnExcelGelir.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnPDFGelir() {
        btnPDFGelir.setLayoutY(btnPDFGelir.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPDFGelir() {
        btnPDFGelir.setLayoutY(btnPDFGelir.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPDFGelir() {
        btnPDFGelir.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnPDFGelir() {
        btnPDFGelir.setEffect(null);
    }

    
    
    @FXML
    private void onMousePressedbtnSorgulaGider() {
        btnSorgulaGider.setLayoutY(btnSorgulaGider.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSorgulaGider() {
        btnSorgulaGider.setLayoutY(btnSorgulaGider.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSorgulaGider() {
        btnSorgulaGider.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnSorgulaGider() {
        btnSorgulaGider.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnExcelGider() {
        btnExcelGider.setLayoutY(btnExcelGider.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnExcelGider() {
        btnExcelGider.setLayoutY(btnExcelGider.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnExcelGider() {
        btnExcelGider.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnExcelGider() {
        btnExcelGider.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnPDFGider() {
        btnPDFGider.setLayoutY(btnPDFGider.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPDFGider() {
        btnPDFGider.setLayoutY(btnPDFGider.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPDFGider() {
        btnPDFGider.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnPDFGider() {
        btnPDFGider.setEffect(null);
    }
    
    
    
    
    
    @FXML
    private void onMousePressedbtnSorgulaGelirGider() {
        btnSorgulaGelirGider.setLayoutY(btnSorgulaGelirGider.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSorgulaGelirGider() {
        btnSorgulaGelirGider.setLayoutY(btnSorgulaGelirGider.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSorgulaGelirGider() {
        btnSorgulaGelirGider.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnSorgulaGelirGider() {
        btnSorgulaGelirGider.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnExcelGelirGider() {
        btnExcelGelirGider.setLayoutY(btnExcelGelirGider.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnExcelGelirGider() {
        btnExcelGelirGider.setLayoutY(btnExcelGelirGider.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnExcelGelirGider() {
        btnExcelGelirGider.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnExcelGelirGider() {
        btnExcelGelirGider.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnPDFGelirGider() {
        btnPDFGelirGider.setLayoutY(btnPDFGelirGider.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPDFGelirGider() {
        btnPDFGelirGider.setLayoutY(btnPDFGelirGider.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPDFGelirGider() {
        btnPDFGelirGider.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnPDFGelirGider() {
        btnPDFGelirGider.setEffect(null);
    }
}
