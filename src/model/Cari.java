package model;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author burak
 */
public class Cari extends AbstractMenu {

    public Cari(Menu menu) {
        super(menu,"cari");
        altkategori = new String[8];
        altkategori[0] = "cari-islemler.png";
        altkategori[1] = "cari-kart-ekle.png";
        altkategori[2] = "cari-listesi.png";
        altkategori[3] = "cari-ekstre-rapor.png";
        altkategori[4] = "detayli-cari-ekstre-rapor.png";
        altkategori[5] = "tahsilat-odm-rapor.png";
        altkategori[6] = "alacak-borc-rapor.png";
        altkategori[7] = "gunluk-izleme.png";
        eventHandler(menu);
    }
    
    @Override
    public void altKategoriEventHandler() {
        getvBox().getChildren().get(0).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLCariIslemler");
        });
        getvBox().getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLCariKartEkle");
        });
        getvBox().getChildren().get(2).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
        });
        getvBox().getChildren().get(3).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
        });
        getvBox().getChildren().get(4).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
        });
        getvBox().getChildren().get(5).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
        });
        getvBox().getChildren().get(6).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
        });
        getvBox().getChildren().get(7).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
        });
    }

}
