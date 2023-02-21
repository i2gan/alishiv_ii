/**
 * Created by i2gan on 17.02.2023
 */

interface AbleToEat {
    public void eat();
}
public class Test {
    public static void main(String[] args) {
        // анонимный класс, объект наследник, переопределение метода
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating..");
            }
        };

        ableToEat.eat();
    }
}
