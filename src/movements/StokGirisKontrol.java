package movements;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

/**
 *
 * @author burak
 */
public class StokGirisKontrol {
    
    public static boolean isHataBarkod(TextField tfBarkod) {
        try {
            Long.valueOf(tfBarkod.getText());
            if (tfBarkod.getText().length() == 13) {
                return false;
            }
        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return true;
    }

    public static boolean isHataTextField(TextField textField) {
        return textField.getText().equalsIgnoreCase("");
    }

    public static boolean isHataComboBox(ComboBox cb, ObservableList list) {
        if (cb.getValue() != null) {
            for (int i = 0; i < list.size(); i++) {
                if (cb.getValue().toString().toLowerCase().equalsIgnoreCase(list.get(i).toString().toLowerCase())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isHataAlisFiyat(TextField tfAlisFiyat) {
        try {
            if (Double.valueOf(tfAlisFiyat.getText()) >= 0) {
                return false;
            }
        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return true;
    }

    public static boolean isHataSatisFiyat(TextField tfSatisFiyat) {
        try {
            if (Double.valueOf(tfSatisFiyat.getText()) >= 0) {
                return false;
            }
        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return true;
    }

    public static boolean isHataAdet(Spinner<Integer> spinnerAdet) {
        try {
            if (spinnerAdet.getValue() >= 0 && spinnerAdet.getValue() <= 1000000) {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return true;
    }
}
