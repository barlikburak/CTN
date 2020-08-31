package movements;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

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

    public static boolean openOnay(String headerText, String contentText, String icon) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("ONAY");
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);

        ButtonType btnEvet = new ButtonType("Evet");
        ButtonType btnHayir = new ButtonType("Hayır");

        alert.getButtonTypes().setAll(btnEvet, btnHayir);

        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("/resources/drawable/" + icon));

        Optional<ButtonType> result = alert.showAndWait();
        return result.get() == btnEvet;
    }

}
