package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author burak
 */
public class Satis extends AbstractMenu {

    public Satis(Menu menu) {
        super(menu,"satis");
        altkategori = new String[7];
        altkategori[0] = "pesin-satis.png";
        altkategori[1] = "faturasiz-satis.png";
        altkategori[2] = "faturali-satis.png";
        altkategori[3] = "toplu-fis-fiyat-guncelle.png";
        altkategori[4] = "satis-iade.png";
        altkategori[5] = "satis-rapor.png";
        altkategori[6] = "satis-urun-rapor.png";
        eventHandler(menu);
    }
    
    @Override
    public void altKategoriEventHandler() {
        getvBox().getChildren().get(0).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLPesinSatis");
        });
        getvBox().getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLFaturasizSatis");
        });
        getvBox().getChildren().get(2).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLFaturaliSatis");
        });
        getvBox().getChildren().get(3).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLTopluFiyatGuncelle");
        });
        getvBox().getChildren().get(4).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLSatisIade");
        });
        getvBox().getChildren().get(5).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLSatisRapor");
        });
        getvBox().getChildren().get(6).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLSatisUrunRapor");
        });
    }

}
