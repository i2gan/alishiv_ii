/**
 * Created by i2gan on 17.02.2023
 */

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
        /* вывод:
        Animal is eating...
        Dog is eating..
        Animal is eating...
         */
    }
    /*
     * с помощью полиморфизма мы вызываем метод
     * test() для объектов трех разных классов:
     * одного родителя и двух потомков, в одном из
     * которых метод переопределен, в другом нет метода
     * вообще
     */
    public static void test(Animal animal) {
        animal.eat();
    }
}
