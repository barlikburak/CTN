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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import movements.JDialog;
import movements.RandomSayi;
import movements.StokGirisKontrol;

/**
 * FXML Controller class
 *
 * @author burak
 */
public class FXMLStokKartEkleController implements Initializable {

    @FXML
    private Button btnKategori;
    @FXML
    private Button btnKaydet;
    @FXML
    private Spinner<Integer> spinnerAdet;
    @FXML
    private ComboBox<String> cbKategori;
    @FXML
    private ComboBox<Integer> cbKDV;
    @FXML
    private ComboBox<String> cbKDVTipi;
    @FXML
    private ComboBox<String> cbBirim;
    @FXML
    private TextField tfBarkod;
    @FXML
    private TextField tfUrunIsmi;
    @FXML
    private TextField tfAlisFiyat;
    @FXML
    private TextField tfSatisFiyat;
    @FXML
    private TextField tfKarOrani;
    @FXML
    private TextField tfKar;
    @FXML
    private ImageView ivPlus;

    private SpinnerValueFactory<Integer> svf;
    private ObservableList<String> olKategori;
    private ObservableList<Integer> olKDV;
    private ObservableList<String> olKDVTipi;
    private ObservableList<String> olBirim;
    private Effect efekt;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000000, 0);
        spinnerAdet.setValueFactory(svf);

        olKategori = FXCollections.observableArrayList("Demirbaş", "Genel");
        cbKategori.setItems(olKategori);
        olKDV = FXCollections.observableArrayList(0, 1, 5, 8, 18);
        cbKDV.setItems(olKDV);
        olKDVTipi = FXCollections.observableArrayList("Dahil", "Hariç");
        cbKDVTipi.setItems(olKDVTipi);
        cbKDVTipi.setValue("Dahil");
        olBirim = FXCollections.observableArrayList("Adet", "Balya", "CM", "KG", "Koli", "Litre", "Metre", "ML", "Ton", "Top");
        cbBirim.setItems(olBirim);

        efekt = new DropShadow();

        tfAlisFiyat.textProperty().addListener((observable, oldValue, newValue) -> {
            karHesapla();
        });
        tfSatisFiyat.textProperty().addListener((observable, oldValue, newValue) -> {
            karHesapla();
        });
    }

    @FXML
    private void onMousePressedivPlus() {
        ivPlus.setLayoutY(ivPlus.getLayoutY() + 4);
        tfBarkod.setText(RandomSayi.sayiUret(13));
    }

    @FXML
    private void onMouseReleasedivPlus() {
        ivPlus.setLayoutY(ivPlus.getLayoutY() - 4);
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
    private void onMousePressedbtnKategori() {
        btnKategori.setLayoutY(btnKategori.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnKategori() {
        btnKategori.setLayoutY(btnKategori.getLayoutY() - 4);
        Stage primaryStage = new Stage();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/fxml/FXMLDialogStokKategori.fxml"));

            Parent root = loader.load();
            
            FXMLDialogStokKategoriController controller = loader.getController();
            controller.setListViewData(olKategori);
            controller.setEfekt(efekt);

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);

            primaryStage.initModality(Modality.APPLICATION_MODAL);
            
            primaryStage.getIcons().add(new Image("/resources/drawable/stok-kart-ekle.png")); 
            primaryStage.setTitle("KATEGORİLER");
            
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    @FXML
    private void onMouseEnteredbtnKategori() {
        btnKategori.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnKategori() {
        btnKategori.setEffect(null);
    }

    @FXML
    private void onMousePressedbtnKaydet() {
        btnKaydet.setLayoutY(btnKaydet.getLayoutY() + 4);
    }

    @FXML
    private void onMouseReleasedbtnKaydet() {
        btnKaydet.setLayoutY(btnKaydet.getLayoutY() - 4);
        String uyari = getUyari();
        if (uyari != null) {
            JDialog.openUyari("İşlem Başarısız!", uyari, "stok-kart-ekle.png");
        } else {
            JDialog.openBilgi("İşlem Başarılı!", "Kayıt başarı ile gerçekleştirildi.", "stok-kart-ekle.png");
        }
    }

    @FXML
    private void onMouseEnteredbtnKaydet() {
        btnKaydet.setEffect(efekt);
    }

    @FXML
    private void onMouseExitedbtnKaydet() {
        btnKaydet.setEffect(null);
    }

    private String getUyari() {
        if (StokGirisKontrol.isHataBarkod(tfBarkod)) {
            return "13 haneli barkod girişi yapın.";
        }
        if (StokGirisKontrol.isHataTextField(tfUrunIsmi)) {
            return "Ürün ismi girişini yapın.";
        }
        if (StokGirisKontrol.isHataComboBox(cbKategori, olKategori)) {
            return "Kategoriyi listeden seçin.";
        }
        if (StokGirisKontrol.isHataAlisFiyat(tfAlisFiyat)) {
            return "Alış fiyatı girişini düzeltin.";
        }
        if (StokGirisKontrol.isHataSatisFiyat(tfSatisFiyat)) {
            return "Satış fiyatı girişini düzeltin.";
        }
        if (StokGirisKontrol.isHataComboBox(cbKDV, olKDV)) {
            return "KDV'yi listeden seçin.";
        }
        if (StokGirisKontrol.isHataComboBox(cbKDVTipi, olKDVTipi)) {
            return "KDV tipini listeden seçin.";
        }
        if (StokGirisKontrol.isHataComboBox(cbBirim, olBirim)) {
            return "Birimi listeden seçin.";
        }
        if (StokGirisKontrol.isHataAdet(spinnerAdet)) {
            return "Adet girişini 0-1000000 arasında yapın.";
        }
        return null;
    }

    private void karHesapla() {
        try {
            double satis = Double.valueOf(tfSatisFiyat.getText());
            double alis = Double.valueOf(tfAlisFiyat.getText());
            tfKar.setText(String.valueOf(satis - alis));
            tfKarOrani.setText(String.valueOf((satis - alis) * 100 / alis));
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
