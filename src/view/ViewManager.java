package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    
    public ViewManager() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        mainPane = new AnchorPane();
        ScrollPane scrollPane = new ScrollPane(mainPane);
        mainScene = new Scene(scrollPane, screenWidth, screenHeight);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
    }
    
    public Stage getMainStage() {
        return mainStage;
    }
}
