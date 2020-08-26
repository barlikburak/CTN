package model;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author burak
 */
public class Kasa extends AbstractMenu {

    public Kasa(Menu menu) {
        super(menu,"kasa");
        altkategori = new String[6];
        altkategori[0] = "gunluk-kasa.png";
        altkategori[1] = "ayrintili-kasa.png";
        altkategori[2] = "gider-masraf.png";
        altkategori[3] = "gelirler.png";
        altkategori[4] = "kar-zarar-analiz.png";
        altkategori[5] = "gelir-gider-rapor.png";
        eventHandler(menu);
    }

    @Override
    public void altKategoriEventHandler() {
        getvBox().getChildren().get(0).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLGunlukKasa");
        });
        getvBox().getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLAyrintiliKasa");
        });
        getvBox().getChildren().get(2).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLGiderMasraf");
        });
        getvBox().getChildren().get(3).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLGelirler");
        });
        getvBox().getChildren().get(4).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLKarZararAnaliz");
        });
        getvBox().getChildren().get(5).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLGelirGiderRapor");
        });
    }

}
