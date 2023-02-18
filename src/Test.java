import java.util.ArrayList;
import java.util.List;

/**
 * Created by i2gan on 17.02.2023
 */

public class Test {
    public static void main(String[] args) {
        //////////////// до Java 5 ///////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        // делаем downcast
        String animal = (String) animals.get(1);
        System.out.println(animal);

        // с появлением дженериков (jenerics)//
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);

        /////////// Java 7 /////////////////////////
        List<String> animal3 = new ArrayList<>();

    }
}
