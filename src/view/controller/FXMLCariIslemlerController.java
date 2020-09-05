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
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
