package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLAyrintiliKasaController implements Initializable {

    @FXML
    private TableView tvKasa;
    @FXML
    private TableView tvBanka;
    @FXML
    private TableColumn tcKasaIslemTuru;
    @FXML
    private TableColumn tcKasaTutar;
    @FXML
    private TableColumn tcKasaDoviz;
    @FXML
    private TableColumn tcBankaIslemTuru;
    @FXML
    private TableColumn tcBankaTutar;
    @FXML
    private TableColumn tcBankaDoviz;
    @FXML
    private DatePicker dpBas;
    @FXML
    private DatePicker dpSon;
    @FXML
    private TextField tfKasaTl;
    @FXML
    private TextField tfKasaDolar;
    @FXML
    private TextField tfKasaEuro;
    @FXML
    private TextField tfBankaTl;
    @FXML
    private TextField tfBankaDolar;
    @FXML
    private TextField tfBankaEuro;
    @FXML
    private TextField tfTopGelirTl;
    @FXML
    private TextField tfTopGelirDolar;
    @FXML
    private TextField tfTopGelirEuro;
    @FXML
    private TextField tfTopGiderTl;
    @FXML
    private TextField tfTopGiderDolar;
    @FXML
    private TextField tfTopGiderEuro;
    @FXML
    private TextField tfTopGelirTlKasa;
    @FXML
    private TextField tfTopGelirDolarKasa;
    @FXML
    private TextField tfTopGelirEuroKasa;
    @FXML
    private TextField tfTopGiderTlKasa;
    @FXML
    private TextField tfTopGiderDolarKasa;
    @FXML
    private TextField tfTopGiderEuroKasa;
    @FXML
    private TextField tfTopGelirTlBanka;
    @FXML
    private TextField tfTopGelirDolarBanka;
    @FXML
    private TextField tfTopGelirEuroBanka;
    @FXML
    private TextField tfTopGiderTlBanka;
    @FXML
    private TextField tfTopGiderDolarBanka;
    @FXML
    private TextField tfTopGiderEuroBanka;
    @FXML
    private TextField tfNetBakiyeTl;
    @FXML
    private TextField tfNetBakiyeDolar;
    @FXML
    private TextField tfNetBakiyeEuro;
    @FXML
    private TextField tfNetKar;
    

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

}
