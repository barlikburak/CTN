package movements;

import java.util.Optional;
import java.util.function.Consumer;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

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

    public static void openLogin() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Giriş Yap");
        dialog.setHeaderText("Mail Ayarlarından Daha Az Güvenli \nUygulama Erişimini Açmayı Unutmayın!");

        ImageView imageView = new ImageView("/resources/drawable/login.png");
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        dialog.setGraphic(imageView);
        
        Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("/resources/drawable/login.png"));

        ButtonType btnLogin = new ButtonType("Giriş Yap", ButtonData.OK_DONE);
        ButtonType btnCancel = new ButtonType("Vazgeç", ButtonData.CANCEL_CLOSE);
        dialog.getDialogPane().getButtonTypes().addAll(btnLogin, btnCancel);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField username = new TextField();
        username.setPromptText("example@gmail.com");
        PasswordField password = new PasswordField();
        password.setPromptText("Şifre");

        grid.add(new Label("E-Posta:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Şifre:"), 0, 1);
        grid.add(password, 1, 1);

        Node loginButton = dialog.getDialogPane().lookupButton(btnLogin);
        loginButton.setDisable(true);

        username.textProperty().addListener((observable, oldValue, newValue) -> {
            loginButton.setDisable(newValue.trim().isEmpty());
        });

        dialog.getDialogPane().setContent(grid);

        Platform.runLater(() -> username.requestFocus());

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == btnLogin) {
                return new Pair<>(username.getText(), password.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();

        result.ifPresent((Pair<String, String> usernamePassword) -> {
            System.out.println("Username=" + usernamePassword.getKey() + ", Password=" + usernamePassword.getValue());
        });
    }

}
