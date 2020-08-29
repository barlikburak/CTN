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

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLDialogStokKategoriController implements Initializable {

    @FXML
    private ListView<String> listView;
    @FXML
    private TextField textField;
    @FXML
    private Button btnAra;
    @FXML
    private Button btnEkle;
    @FXML
    private Button btnSil;

    private ObservableList<String> listViewData;
    private Effect efekt;

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

    public void setListViewData(ObservableList<String> listViewData) {
        this.listViewData = listViewData;
        listView.setItems(listViewData);
    }

    public void setEfekt(Effect efekt) {
        this.efekt = efekt;
    }

    @FXML
    private void onMousePressedbtnAra() {
        btnAra.setLayoutY(btnAra.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnAra() {
        btnAra.setLayoutY(btnAra.getLayoutY() - 4);
    }

    @FXML
    private void onMouseEnteredbtnAra() {
        btnAra.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnAra() {
        btnAra.setEffect(null);
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
    private void onMousePressedbtnSil() {
        btnSil.setLayoutY(btnSil.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnSil() {
        btnSil.setLayoutY(btnSil.getLayoutY() - 4);
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
