import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author i2gan
 */

public class Exceptions1 {
    public static void main(String[] args) {
        /*
         * появляются предложения обработки исключений. Желательно
         * выбрать в "More actions" "try-catch"
         */
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключений в методе main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("checkGit");
        Scanner scanner = new Scanner(file);
    }
}
