package ctn;

import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewManager;

/**
 *
 * @author burak
 */
public class CTN extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            ViewManager manager = new ViewManager();
            primaryStage = manager.getMainStage();
            primaryStage.show();
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
