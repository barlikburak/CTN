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
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLCariIslemlerController implements Initializable {

    @FXML
    private TableView tvEOTIslemleri;
    @FXML
    private TableView tvUrunler;
    @FXML
    private TableView tvFASIST;
    @FXML
    private TableColumn tcOdemeTuruEOTIslemler;
    @FXML
    private TableColumn tcIslemTarihiEOTIslemler;
    @FXML
    private TableColumn tcSaatEOTIslemler;
    @FXML
    private TableColumn tcIslemTuruEOTIslemler;
    @FXML
    private TableColumn tcAraTopEOTIslemler;
    @FXML
    private TableColumn tcKdvTopEOTIslemler;
    @FXML
    private TableColumn tcIskontoEOTIslemler;
    @FXML
    private TableColumn tcTopIskEOTIslemler;
    @FXML
    private TableColumn tcIscilikEOTIslemler;
    @FXML
    private TableColumn tcGenelTopEOTIslemler;
    @FXML
    private TableColumn tcFaturaNoEOTIslemler;
    @FXML
    private TableColumn tcBelgeNoEOTIslemler;
    @FXML
    private TableColumn tcIrsaliyeNoEOTIslemler;
    @FXML
    private TableColumn tcIAciklamaEOTIslemler;
    @FXML
    private TableColumn tcBarkodUrunler;
    @FXML
    private TableColumn tcUrunIsmiUrunler;
    @FXML
    private TableColumn tcMiktarUrunler;
    @FXML
    private TableColumn tcBirimUrunler;
    @FXML
    private TableColumn tcBirimFUrunler;
    @FXML
    private TableColumn tcKDVUrunler;
    @FXML
    private TableColumn tcKDVTipiUrunler;
    @FXML
    private TableColumn tcIsk1Urunler;
    @FXML
    private TableColumn tcIsk2Urunler;
    @FXML
    private TableColumn tcIsk3Urunler;
    @FXML
    private TableColumn tcAraTopUrunler;
    @FXML
    private TableColumn tcKdvTopUrunler;
    @FXML
    private TableColumn tcToplamUrunler;
    @FXML
    private TableColumn tcIslemTarihiUrunler;
    @FXML
    private TableColumn tcSaatUrunler;
    @FXML
    private TableColumn tcIslemTuruUrunler;
    @FXML
    private TableColumn tcOdemeTuruFASIST;
    @FXML
    private TableColumn tcIslemTarihiFASIST;
    @FXML
    private TableColumn tcSaatFASIST;
    @FXML
    private TableColumn tcIslemTuruFASIST;
    @FXML
    private TableColumn tcAraTopFASIST;
    @FXML
    private TableColumn tcKdvTopFASIST;
    @FXML
    private TableColumn tcIskontoFASIST;
    @FXML
    private TableColumn tcTopIskFASIST;
    @FXML
    private TableColumn tcIscilikFASIST;
    @FXML
    private TableColumn tcGenelTopFASIST;
    @FXML
    private TableColumn tcFaturaNoFASIST;
    @FXML
    private TableColumn tcBelgeNoFASIST;
    @FXML
    private TableColumn tcIrsaliyeNoFASIST;
    @FXML
    private TableColumn tcIAciklamaFASIST;
    @FXML
    private ComboBox<String> cbCariSecimiFASIST;
    @FXML
    private ComboBox<String> cbUrunIsmiUrunler;
    @FXML
    private Button btnCariSecimi;
    @FXML
    private Button btnEPostaGonder;
    @FXML
    private Button btnGrubaEPostaGonder;
    @FXML
    private ImageView ivPlus;
    @FXML
    private TextField tfPesinBorcGenelBilgiler;
    @FXML
    private TextField tfPesinAlacakGenelBilgiler;
    @FXML
    private TextField tfPesinBakiyeGenelBilgiler;
    @FXML
    private TextField tfCekSenetBorcGenelBilgiler;
    @FXML
    private TextField tfCekSenetAlacakGenelBilgiler;
    @FXML
    private TextField tfCekSenetBakiyeGenelBilgiler;
    @FXML
    private TextField tfToplamBorcGenelBilgiler;
    @FXML
    private TextField tfToplamAlacakGenelBilgiler;
    @FXML
    private TextField tfToplamBakiyeGenelBilgiler;
    @FXML
    private TextField tfBarkodUrunler;
    @FXML
    private Text txtKayitSayisiEOTIslemler;
    @FXML
    private Text txtBakiyeEOTIslemler;
    @FXML
    private Text txtKayitSayisiUrunler;
    @FXML
    private Text txtToplamTutarUrunler;
    @FXML
    private Text txtKayitSayisiFASIST;
    @FXML
    private Text txtGenelToplamFASIST;
    @FXML
    private Button btnSorgulaEOTIslemler;
    @FXML
    private Button btnExcelEOTIslemler;
    @FXML
    private Button btnPDFEOTIslemler;
    @FXML
    private Button btnSorgulaUrunler;
    @FXML
    private Button btnExcelUrunler;
    @FXML
    private Button btnPDFUrunler;
    @FXML
    private Button btnSorgulaFASIST;
    @FXML
    private Button btnExcelFASIST;
    @FXML
    private Button btnPDFFASIST;
    @FXML
    private Button btnPesinOdemeEOTIslemler;
    @FXML
    private Button btnCekTanimlaEOTIslemler;
    @FXML
    private Button btnSenetTanimlaEOTIslemler;
    @FXML
    private CheckBox checkPesinEOTIslemler;
    @FXML
    private CheckBox checkCekSenetEOTIslemler;
    @FXML
    private CheckBox checkSatisEOTIslemler;
    @FXML
    private CheckBox checkSatisIadeEOTIslemler;
    @FXML
    private CheckBox checkTahsilatEOTIslemler;
    @FXML
    private CheckBox checkAlisEOTIslemler;
    @FXML
    private CheckBox checkAlisIadeEOTIslemler;
    @FXML
    private CheckBox checkOdemeEOTIslemler;
    @FXML
    private CheckBox checkKayitEOTIslemler;
    @FXML
    private CheckBox checkOdemeTarihEOTIslemler;
    @FXML
    private CheckBox checkVadeEOTIslemler;
    @FXML
    private CheckBox checkFaturaliSatisUrunler;
    @FXML
    private CheckBox checkFaturasizSatisUrunler;
    @FXML
    private CheckBox checkSatisIadeUrunler;
    @FXML
    private CheckBox checkSiparisUrunler;
    @FXML
    private CheckBox checkFaturaliAlisUrunler;
    @FXML
    private CheckBox checkFaturasizAlisUrunler;
    @FXML
    private CheckBox checkAlisIadeUrunler;
    @FXML
    private CheckBox checkTeklifUrunler;
    @FXML
    private CheckBox checkIslemTarihiUrunler;
    @FXML
    private CheckBox checkFaturaliSatisFASIST;
    @FXML
    private CheckBox checkFaturasizSatisFASIST;
    @FXML
    private CheckBox checkSatisIadeFASIST;
    @FXML
    private CheckBox checkSiparisFASIST;
    @FXML
    private CheckBox checkFaturaliAlisFASIST;
    @FXML
    private CheckBox checkFaturasizAlisFASIST;
    @FXML
    private CheckBox checkAlisIadeFASIST;
    @FXML
    private CheckBox checkTeklifFASIST;
    @FXML
    private CheckBox checkIslemTarihiFASIST;
    @FXML
    private DatePicker dpBasKayitEOTIslemler;
    @FXML
    private DatePicker dpSonKayitEOTIslemler;
    @FXML
    private DatePicker dpBasOdemeEOTIslemler;
    @FXML
    private DatePicker dpSonOdemeEOTIslemler;
    @FXML
    private DatePicker dpBasVadeEOTIslemler;
    @FXML
    private DatePicker dpSonVadeEOTIslemler;
    @FXML
    private DatePicker dpBasIslemTarihiFASIST;
    @FXML
    private DatePicker dpSonIslemTarihiFASIST;
    @FXML
    private DatePicker dpBasIslemTarihiEOTIslemler;
    @FXML
    private DatePicker dpSonIslemTarihiEOTIslemler;

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

    @FXML
    private void onMousePressedbtnEPostaGonder() {
        btnEPostaGonder.setLayoutY(btnEPostaGonder.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnEPostaGonder() {
        btnEPostaGonder.setLayoutY(btnEPostaGonder.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnEPostaGonder() {
        btnEPostaGonder.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnEPostaGonder() {
        btnEPostaGonder.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnGrubaEPostaGonder() {
        btnGrubaEPostaGonder.setLayoutY(btnGrubaEPostaGonder.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnGrubaEPostaGonder() {
        btnGrubaEPostaGonder.setLayoutY(btnGrubaEPostaGonder.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnGrubaEPostaGonder() {
        btnGrubaEPostaGonder.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnGrubaEPostaGonder() {
        btnGrubaEPostaGonder.setEffect(null);
    }

    @FXML
    private void onMousePressedivPlus() {
        ivPlus.setLayoutY(ivPlus.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedivPlus() {
        ivPlus.setLayoutY(ivPlus.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredivPlus() {
        ivPlus.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedivPlus() {
        ivPlus.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnPesinOdemeEOTIslemler() {
        btnPesinOdemeEOTIslemler.setLayoutY(btnPesinOdemeEOTIslemler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPesinOdemeEOTIslemler() {
        btnPesinOdemeEOTIslemler.setLayoutY(btnPesinOdemeEOTIslemler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPesinOdemeEOTIslemler() {
        btnPesinOdemeEOTIslemler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnPesinOdemeEOTIslemler() {
        btnPesinOdemeEOTIslemler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnCekTanimlaEOTIslemler() {
        btnCekTanimlaEOTIslemler.setLayoutY(btnCekTanimlaEOTIslemler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnCekTanimlaEOTIslemler() {
        btnCekTanimlaEOTIslemler.setLayoutY(btnCekTanimlaEOTIslemler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnCekTanimlaEOTIslemler() {
        btnCekTanimlaEOTIslemler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnCekTanimlaEOTIslemler() {
        btnCekTanimlaEOTIslemler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnSenetTanimlaEOTIslemler() {
        btnSenetTanimlaEOTIslemler.setLayoutY(btnSenetTanimlaEOTIslemler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSenetTanimlaEOTIslemler() {
        btnSenetTanimlaEOTIslemler.setLayoutY(btnSenetTanimlaEOTIslemler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSenetTanimlaEOTIslemler() {
        btnSenetTanimlaEOTIslemler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnSenetTanimlaEOTIslemler() {
        btnSenetTanimlaEOTIslemler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnSorgulaEOTIslemler() {
        btnSorgulaEOTIslemler.setLayoutY(btnSorgulaEOTIslemler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSorgulaEOTIslemler() {
        btnSorgulaEOTIslemler.setLayoutY(btnSorgulaEOTIslemler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSorgulaEOTIslemler() {
        btnSorgulaEOTIslemler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnSorgulaEOTIslemler() {
        btnSorgulaEOTIslemler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnExcelEOTIslemler() {
        btnExcelEOTIslemler.setLayoutY(btnExcelEOTIslemler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnExcelEOTIslemler() {
        btnExcelEOTIslemler.setLayoutY(btnExcelEOTIslemler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnExcelEOTIslemler() {
        btnExcelEOTIslemler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnExcelEOTIslemler() {
        btnExcelEOTIslemler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnPDFEOTIslemler() {
        btnPDFEOTIslemler.setLayoutY(btnPDFEOTIslemler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPDFEOTIslemler() {
        btnPDFEOTIslemler.setLayoutY(btnPDFEOTIslemler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPDFEOTIslemler() {
        btnPDFEOTIslemler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnPDFEOTIslemler() {
        btnPDFEOTIslemler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnSorgulaUrunler() {
        btnSorgulaUrunler.setLayoutY(btnSorgulaUrunler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSorgulaUrunler() {
        btnSorgulaUrunler.setLayoutY(btnSorgulaUrunler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSorgulaUrunler() {
        btnSorgulaUrunler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnSorgulaUrunler() {
        btnSorgulaUrunler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnExcelUrunler() {
        btnExcelUrunler.setLayoutY(btnExcelUrunler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnExcelUrunler() {
        btnExcelUrunler.setLayoutY(btnExcelUrunler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnExcelUrunler() {
        btnExcelUrunler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnExcelUrunler() {
        btnExcelUrunler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnPDFUrunler() {
        btnPDFUrunler.setLayoutY(btnPDFUrunler.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPDFUrunler() {
        btnPDFUrunler.setLayoutY(btnPDFUrunler.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPDFUrunler() {
        btnPDFUrunler.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnPDFUrunler() {
        btnPDFUrunler.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnSorgulaFASIST() {
        btnSorgulaFASIST.setLayoutY(btnSorgulaFASIST.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSorgulaFASIST() {
        btnSorgulaFASIST.setLayoutY(btnSorgulaFASIST.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnSorgulaFASIST() {
        btnSorgulaFASIST.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnSorgulaFASIST() {
        btnSorgulaFASIST.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnExcelFASIST() {
        btnExcelFASIST.setLayoutY(btnExcelFASIST.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnExcelFASIST() {
        btnExcelFASIST.setLayoutY(btnExcelFASIST.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnExcelFASIST() {
        btnExcelFASIST.setEffect(efekt);;
    }

    @FXML
    private void onMouseExitedbtnExcelFASIST() {
        btnExcelFASIST.setEffect(null);
    }
    
    @FXML
    private void onMousePressedbtnPDFFASIST() {
        btnPDFFASIST.setLayoutY(btnPDFFASIST.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnPDFFASIST() {
        btnPDFFASIST.setLayoutY(btnPDFFASIST.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnPDFFASIST() {
        btnPDFFASIST.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnPDFFASIST() {
        btnPDFFASIST.setEffect(null);
    }

}
