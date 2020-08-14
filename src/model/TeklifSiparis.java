package model;

import javafx.scene.input.MouseEvent;

/**
 *
 * @author burak
 */
public class TeklifSiparis extends AbstractMenu {

    public TeklifSiparis(Menu menu) {
        super(menu,"teklif-siparis");
        altkategori = new String[4];
        altkategori[0] = "yeni-teklif.png";
        altkategori[1] = "yeni-siparis.png";
        altkategori[2] = "teklif-siparis-rapor.png";
        altkategori[3] = "teklif-siparis-urun-rapor.png";
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
    }

}
