package model;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author burak
 */
public class Stok extends AbstractMenu {

    public Stok(Menu menu) {
        super(menu, "stok");
        altkategori = new String[8];
        altkategori[0] = "stok-kart-ekle.png";
        altkategori[1] = "stok-kart-liste.png";
        altkategori[2] = "faturasiz-alis.png";
        altkategori[3] = "faturali-alis.png";
        altkategori[4] = "alis-iade.png";
        altkategori[5] = "toplu-fiyat-guncelle.png";
        altkategori[6] = "alinan-urun-rapor.png";
        altkategori[7] = "stok-rapor.png";
        eventHandler(menu);
    }

    @Override
    public void altKategoriEventHandler() {
        getvBox().getChildren().get(0).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLStokKartEkle", "Stok Kart Ekle");
        });
        getvBox().getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLStokKartListele", "Stok Kart Listesi");
        });
        getvBox().getChildren().get(2).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLFaturasizAlis", "Faturasız Alış");
        });
        getvBox().getChildren().get(3).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLFaturaliAlis", "Faturalı Alış");
        });
        getvBox().getChildren().get(4).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLAlisIade", "Alış İade");
        });
        getvBox().getChildren().get(5).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLTopluFisFiyatGuncelle", "Toplu Fiyat Güncelle");
        });
        getvBox().getChildren().get(6).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLAlinanUrunRapor","Alınan Ürün Raporları");
        });
        getvBox().getChildren().get(7).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLStokRapor","Stok Raporları");
        });

    }

}
