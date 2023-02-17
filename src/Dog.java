/**
 * Created by i2gan on 17.02.2023
 */

public class Dog extends Animal{
    /*
     * переопределили метод eat() класса Animal
     */
    @Override
    public void eat() {
        System.out.println("Dog is eating..");
    }
    public void bark() {
        System.out.println("Dog is barking..");
    }
}
