/**
 * Created by i2gan on 17.02.2023
 */

public class Test {
    public static void main(String[] args) {

        // Upcasting - восходящее преобразование
        // Animal animal = new Dog();

        Dog dog = new Dog();
        // Upcasting - восходящее преобразование
        Animal animal = dog;

        // Douncasting - нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.eat();
        dog2.bark();
        /** вывод
         *
         * Animal is eating..
         * Dog is barking..
         */

        Animal a = new Animal();
        Dog d = (Dog) a;
        d.bark(); // ошибка, так делать нельзя
    }
}
