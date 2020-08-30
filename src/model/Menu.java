package model;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author burak
 */
public class Menu{

    private static final String PATH = "/resources/drawable/";
    private double screenWidth;
    private double screenHeight;
    private HBox hBox;
    private VBox vBox;
    private String[] altkategori;
    private AbstractMenu abstractMenu;

    public Menu(double screenWidth, double screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        hBox = new HBox();
        vBox = new VBox();

        AbstractMenu[] menuList = {new Stok(this), new TeklifSiparis(this),
            new Satis(this), new Kasa(this), new Cari(this),
            new CekSenet(this), new Loglar(this), new EPosta(this)};

        hBox.setStyle("-fx-background-color: #778899");
        hBox.setPrefWidth(screenWidth);
        hBox.setPrefHeight(100);
        hBox.getChildren().addAll(menuList);

        vBox.setStyle("-fx-background-color: #778899");
        vBox.setPrefWidth(0);
        vBox.setPrefHeight(0);
        vBox.setLayoutY(hBox.getPrefHeight());

    }

    public HBox gethBox() {
        return hBox;
    }

    public VBox getvBox() {
        return vBox;
    }

    public double getScreenHeight() {
        return screenHeight;
    }

}
