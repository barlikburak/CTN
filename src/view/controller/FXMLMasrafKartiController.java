package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.effect.Effect;
import javafx.scene.text.Text;
import movements.JDialog;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLMasrafKartiController implements Initializable {

    @FXML
    private ListView<String> listView;
    @FXML
    private Text txtKayitSayisi;
    @FXML
    private TextField tfMasrafKartiAdi;
    @FXML
    private Button btnEkle;
    @FXML
    private Button btnSil;

    private Effect efekt;
    private ObservableList<String> olMasrafKartSecim;

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

    public void setEfekt(Effect efekt) {
        this.efekt = efekt;
    }

    public void setOlMasrafKartSecim(ObservableList<String> olMasrafKartSecim) {
        this.olMasrafKartSecim = olMasrafKartSecim;
        listView.setItems(olMasrafKartSecim);
    }

    @FXML
    private void onMousePressedbtnEkle() {
        btnEkle.setLayoutY(btnEkle.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnEkle() {
        btnEkle.setLayoutY(btnEkle.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnEkle() {
        btnEkle.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnEkle() {
        btnEkle.setEffect(null);
    }

    @FXML
    private void onMouseActionbtnSil() {
        JDialog.openOnay(null, tfMasrafKartiAdi.getText()
                + " Adlı Masraf Kartını silmek istediğinizden Emin misiniz?", "gider-masraf.png"); //sonuç boolean
    }

    @FXML
    private void onMouseEnteredbtnSil() {
        btnSil.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnSil() {
        btnSil.setEffect(null);
    }

}
