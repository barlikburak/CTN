package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Menu;

/**
 *
 * @author burak
 */
public class ViewManager {

    private Dimension screenSize;
    private double screenHeight;
    private double screenWidth;
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;

    private Menu menu;

    public ViewManager() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        mainPane = new AnchorPane();
        ScrollPane scrollPane = new ScrollPane(mainPane);
        mainScene = new Scene(scrollPane, screenWidth, screenHeight);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        mainStage.getIcons().add(new Image("/resources/drawable/logo.png"));
        mainStage.setTitle("Ticari Yazılım Programı");

        createMenu();
        createLogo();
    }

    private void createMenu() {
        menu = new Menu(screenWidth, screenHeight);
        mainPane.getChildren().add(menu.gethBox());
        mainPane.getChildren().add(menu.getvBox());
    }

    private void createLogo() {
        ImageView imageView = new ImageView("/resources/drawable/logo.png");
        imageView.setFitHeight(250);
        imageView.setFitWidth(250);
        imageView.setLayoutX((screenWidth - 340) / 2);
        imageView.setLayoutY((screenHeight - 300) / 2);
        mainPane.getChildren().add(imageView);
    }

    public Stage getMainStage() {
        return mainStage;
    }
}
