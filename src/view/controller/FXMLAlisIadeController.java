package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLAlisIadeController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcBarkod;
    @FXML
    private TableColumn tcUrunIsmi;
    @FXML
    private TableColumn tcMiktari;
    @FXML
    private TableColumn tcBirim;
    @FXML
    private TableColumn tcBirimF;
    @FXML
    private TableColumn tcIsk1;
    @FXML
    private TableColumn tcKDV;
    @FXML
    private TableColumn tcKDVTipi;
    @FXML
    private TableColumn tcAraTop;
    @FXML
    private TableColumn tcTopKDv;
    @FXML
    private TableColumn tcTutar;
    @FXML
    private ComboBox<String> cbCariSec;
    @FXML
    private ComboBox<String> cbAdresSec;
    @FXML
    private ComboBox<String> cbUrunAdi;
    @FXML
    private ComboBox<String> cbPersonel;
    @FXML
    private TextField tfVDCariSecim;
    @FXML
    private TextField tfVNoCariSecim;
    @FXML
    private TextField tfEskiBakiye;
    @FXML
    private TextField tfKartPuani;
    @FXML
    private TextField tfCariLimiti;
    @FXML
    private TextField tfKartBakiyesi;
    @FXML
    private TextField tfCariAdi;
    @FXML
    private TextField tfSoyadUnvan;
    @FXML
    private TextField tfVDCariTanimlama;
    @FXML
    private TextField tfVNoCariTanimlama;
    @FXML
    private TextField tfTel;
    @FXML
    private TextField tfEMail;
    @FXML
    private TextField tfBolge;
    @FXML
    private TextField tfBarkod;
    @FXML
    private TextField tfCanliStokBirimF;
    @FXML
    private TextField tfCanliStokBirim;
    @FXML
    private TextField tfFaturaNo;
    @FXML
    private TextField tfIrsaliyeNo;
    @FXML
    private TextField tfBelgeNo;
    @FXML
    private TextField tfIslemTarihi;
    @FXML
    private TextField tfYuzde;
    @FXML
    private TextField tfPrimGiris;
    @FXML
    private TextField tfToplam;
    @FXML
    private TextField tfTopKDV;
    @FXML
    private TextField tfIndirim;
    @FXML
    private TextField tfIscilik;
    @FXML
    private TextField tfGenelTop;
    @FXML
    private TextArea taAdresCariSecimi;
    @FXML
    private TextArea taAdresCariTanimlama;
    @FXML
    private TextArea taFaturaCiktiAciklama;
    @FXML
    private TextArea taAciklama;
    @FXML
    private CheckBox checkBarkod;
    @FXML
    private CheckBox checkUrunIsmi;
    @FXML
    private CheckBox checkMiktari;
    @FXML
    private CheckBox checkBirim;
    @FXML
    private CheckBox checkBirimF;
    @FXML
    private CheckBox checkIsk1;
    @FXML
    private CheckBox checkKDV;
    @FXML
    private CheckBox checkKDVTipi;
    @FXML
    private CheckBox checkAraTop;
    @FXML
    private CheckBox checkTopKDV;
    @FXML
    private CheckBox checkTutar;
    @FXML
    private CheckBox checkKDV0Gir;
    
    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onSelectionChangedtabCarisizIslem() {

    }

    @FXML
    private void onSelectionChangedtabCariSecimi() {

    }

    @FXML
    private void onSelectionChangedtabCariTanimlama() {

    }
    
    @FXML
    private void onMouseActionbtnPDFAktar() {
        
    }
    
    @FXML
    private void onMouseActionbtnIade() {
        
    }

}
