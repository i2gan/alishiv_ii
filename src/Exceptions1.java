import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author i2gan
 */

public class Exceptions1 {
    public static void main(String[] args) {
        /*
         * после того, как мы напечатали две строки, что ниже
         *
         * File file = new File("asdf");
         * Scanner scanner = new Scanner(file);
         *
         * появляются предложения обработки исключений. Желательно
         * выбрать try-catch
         */
        File file = new File("asdf");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("In block try");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println("After block try catch");
    }
}
