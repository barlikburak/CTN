package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLGunlukIzlemeController implements Initializable {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn tcAdi;
    @FXML
    private TableColumn tcSoyadi;
    @FXML
    private TableColumn tcIslemTuru;
    @FXML
    private TableColumn tcVadeTarihi;
    @FXML
    private TableColumn tcAlacak;
    @FXML
    private TableColumn tcEPosta;
    @FXML
    private CheckBox checkVadesiGecenler;
    @FXML
    private CheckBox checkTarihAraligi;
    @FXML
    private DatePicker dpBas;
    @FXML
    private DatePicker dpSon;
    @FXML
    private Text txtToplamKayitSayisi;
    @FXML
    private Text txtToplamAlacak;
    
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
