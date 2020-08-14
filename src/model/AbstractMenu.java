package model;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author burak
 */
public abstract class AbstractMenu extends ImageView {

    private Menu menu;
    protected String[] altkategori;
    private static final String PATH = "/resources/drawable/";

    public AbstractMenu(Menu menu, String image) {
        super(PATH + image + ".png");
        this.menu = menu;
    }

    protected void eventHandler(Menu menu) {
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            if (!menu.getvBox().getChildren().isEmpty()) {
                menu.getvBox().getChildren().clear();
            }
            vBoxdoldur(menu.getScreenHeight(), menu.gethBox());
        });
    }

    protected void vBoxdoldur(double screenHeight, HBox hBox) {
        ImageView imageView;
        for (String altkategori1 : altkategori) {
            imageView = new ImageView(PATH + altkategori1);
            imageView.setFitHeight(70);
            imageView.setFitWidth(140);
            menu.getvBox().getChildren().add(imageView);
        }
        menu.getvBox().setPrefWidth(140);
        menu.getvBox().setPrefHeight(screenHeight - 100);
        altKategoriEventHandler();
    }

    public abstract void altKategoriEventHandler();

    public Menu getMenu() {
        return menu;
    }

    public VBox getvBox() {
        return menu.getvBox();
    }

}
