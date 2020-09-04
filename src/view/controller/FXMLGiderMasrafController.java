package view.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import movements.JDialog;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLGiderMasrafController implements Initializable {

    @FXML
    private ComboBox<String> cbMasrafKartSecim;
    @FXML
    private ComboBox<String> cbMasrafTipi;
    @FXML
    private TextField tfTutar;
    @FXML
    private TextField tfBelgeNo;
    @FXML
    private DatePicker dpIslemTarihi;
    @FXML
    private ImageView ivPlus;
    @FXML
    private TextArea taAciklama;
    @FXML
    private Button btnKaydet;

    private Effect efekt;
    private ObservableList<String> olMasrafKartSecim;
    private ObservableList<String> olMasrafTipi;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        efekt = new DropShadow();
        olMasrafKartSecim = FXCollections.observableArrayList("Temizlik", "Elektrik",
                "Su", "Telefon", "ADSL", "Yakıt", "GSM", "Muhasebe", "Avukat",
                "Banka", "Kırtasiye", "Sigorta", "Tadilat ve Bakım", "SSK, Bağkur",
                "Kira, Stopaj", "KDV ve diğer vergiler", "Bilişim", "Medikal",
                "Kargo", "Gezi", "Ulaşım");
        cbMasrafKartSecim.setItems(olMasrafKartSecim);
        cbMasrafKartSecim.setValue("ADSL");
        olMasrafTipi = FXCollections.observableArrayList("Firma Gideri",
                "Personel Gideri", "Cari Gideri");
        cbMasrafTipi.setItems(olMasrafTipi);
        cbMasrafTipi.setValue("Firma Gideri");
    }

    @FXML
    private void onMousePressedivPlus() {
        ivPlus.setLayoutY(ivPlus.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedivPlus() {
        ivPlus.setLayoutY(ivPlus.getLayoutY() - 4);
        Stage primaryStage = new Stage();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/fxml/FXMLMasrafKarti.fxml"));

            Parent root = loader.load();
            
            FXMLMasrafKartiController controller = loader.getController();
            controller.setOlMasrafKartSecim(olMasrafKartSecim);
            controller.setEfekt(efekt);

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);

            primaryStage.initModality(Modality.APPLICATION_MODAL);
            
            primaryStage.getIcons().add(new Image("/resources/drawable/gider-masraf.png")); 
            primaryStage.setTitle("Masraf Kartı Tanımlamaları");
            
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    @FXML
    private void onMouseEnteredivPlus() {
        ivPlus.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedivPlus() {
        ivPlus.setEffect(null);
    }

    @FXML
    private void onMouseActionbtnKaydet() {
        JDialog.openBilgi(null, "İşlem Tamamlandı!", "gider-masraf.png");
    }

    @FXML
    private void onMouseEnteredbtnKaydet() {
        btnKaydet.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnKaydet() {
        btnKaydet.setEffect(null);
    }

}
