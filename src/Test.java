import Package1.Person;

/**
 * Created by i2gan on 15.02.2023
 */

// класс может быть только public или default
public class Test extends Person {
    // public  доступен во всем проекте
    // private доступен только внутри класса
    // без модификатора по умолчанию default доступен только внутри пакета
    // protected доступен в подклассах во всем проекте
    public Test() {
        name = "Tom";
    }
}
