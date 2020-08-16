package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author burak
 */
public class Kasa extends AbstractMenu {

    public Kasa(Menu menu) {
        super(menu,"kasa");
        altkategori = new String[8];
        altkategori[0] = "gunluk-kasa.png";
        altkategori[1] = "ayrintili-kasa.png";
        altkategori[2] = "gider-masraf.png";
        altkategori[3] = "gelirler.png";
        altkategori[4] = "subeler-arasi-para-transferi.png";
        altkategori[5] = "gelir-gider-rapor.png";
        altkategori[6] = "kar-zarar-analiz.png";
        altkategori[7] = "mizan-raporu.png";
        eventHandler(menu);
    }

    @Override
    public void altKategoriEventHandler() {
        getvBox().getChildren().get(0).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {

        });
        getvBox().getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
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
