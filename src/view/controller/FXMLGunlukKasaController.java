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
public class FXMLGunlukKasaController implements Initializable {

    @FXML
    private DatePicker dpTarih;
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
