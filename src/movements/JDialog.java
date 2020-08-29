package movements;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author burak
 */
public class JDialog {

    public static void openUyari(String headerText, String contentText, String icon) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("UYARI");
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);

        ButtonType buton = new ButtonType("Tamam", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buton);

        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("/resources/drawable/" + icon));

        alert.showAndWait();
    }

    public static void openBilgi(String headerText, String contentText, String icon) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("BİLGİ");
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);

        ButtonType buton = new ButtonType("Tamam", ButtonData.OK_DONE);

        alert.getButtonTypes().setAll(buton);

        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("/resources/drawable/" + icon));       
        
        alert.showAndWait();
    }

}
