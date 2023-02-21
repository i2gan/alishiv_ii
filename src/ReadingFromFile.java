import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by i2gan on 21.02.2023
 */

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * Первая часть урока: считываем строки из файла
         */
        String s = File.separator;
        // Создали файл по пути "E:\Edu\Java\file.tst\".
        String path = "E:" + s + "Edu" + s + "Java" + s + "file.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        /*
         * Вторая часть урока: считываем числа из единственной строки файла
         */
        String path2 = "E:" + s + "Edu" + s + "Java" + s + "numbers.txt";
        File file1 = new File(path2);
        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number: numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        scanner1.close();

        /*
         * создаем файл в папке alishev_ii c относительным путем
         * "file_5.txt"
         */
        // Создали файл по пути "E:\Edu\Java\file.tst\".

        File file3 = new File("file_5.txt");

        Scanner scanner3 = new Scanner(file3);
        while (scanner3.hasNextLine()) {
            System.out.println(scanner3.nextLine());
        }
        scanner3.close();
    }
}
