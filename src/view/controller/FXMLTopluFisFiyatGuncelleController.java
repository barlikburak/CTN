package view.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import movements.JDialog;
import movements.StokGirisKontrol;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLTopluFisFiyatGuncelleController implements Initializable {

    @FXML
    private ComboBox<String> cbKategori;
    @FXML
    private TextField tfSatis;
    @FXML
    private TextField tfAlis;

    private ObservableList<String> olKategori;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        olKategori = FXCollections.observableArrayList("Demirbaş", "Genel");
        cbKategori.setItems(olKategori);
    }

    @FXML
    private void onMouseActionbtnGuncelle() {
        String str = uyari();
        if (str != null) {
            JDialog.openUyari("İşlem Başarısız!", str, "toplu-fiyat-guncelle.png");
        } else {
            str = cbKategori.getValue() + " kategorisindeki stoklarda güncelleme \nyapmak istediğinizden emin misiniz?";
            if (JDialog.openOnay("İşlemi Onaylıyor Musunuz?", str, "toplu-fiyat-guncelle.png")) {
                JDialog.openBilgi(null, "İşlem Tamamlandı!", "toplu-fiyat-guncelle.png");
            }
        }
    }

    private String uyari() {
        if (StokGirisKontrol.isHataComboBox(cbKategori, olKategori)) {
            return "Kategoriyi listeden seçin.";
        }
        if (StokGirisKontrol.isHataSatisFiyat(tfSatis)) {
            return "Satış fiyatı girişini düzeltin.";
        }
        if (StokGirisKontrol.isHataAlisFiyat(tfAlis)) {
            return "Alış fiyatı girişini düzeltin.";
        }
        return null;
    }

}
