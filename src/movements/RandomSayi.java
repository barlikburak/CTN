package movements;

import java.util.Random;

/**
 *
 * @author burak
 */
public class RandomSayi {

    private static final Random random = new Random();

    public static String sayiUret(int uzunluk) {
        String barkod = "";
        for (int i = 0; i < uzunluk; i++) {
            barkod += (char) (random.nextInt(10) + 48);
        }
        return barkod;
    }
}
