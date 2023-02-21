import java.util.ArrayList;
import java.util.List;

/**
 * Created by i2gan on 17.02.2023
 */

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);
    }

    /*
     * Object
     *     Animal
     *         Dog
     *
     * <? extends Animal> подразумевает Animal и наследники (здесь Dog)
     * <? super Animal> подразумеваем Animal и родители (здесь Object)
     */
    private static void test(List<? extends Animal> list) {
        for (Animal animal: list)
            animal.eat();
    }
}
