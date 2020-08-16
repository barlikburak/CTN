package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author burak
 */
public class EPosta extends AbstractMenu {

    public EPosta(Menu menu) {
        super(menu, "e-posta");
        altkategori = new String[2];
        altkategori[0] = "e-posta-gonder.png";
        altkategori[1] = "toplu-e-posta.png";
        eventHandler(menu);
    }

    @Override
    public void altKategoriEventHandler() {
        getvBox().getChildren().get(0).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {

        });
        getvBox().getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {

        });
    }

}
