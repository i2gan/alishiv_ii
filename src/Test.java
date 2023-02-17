/**
 * Created by i2gan on 17.02.2023
 */

public class Test {
    public static void main(String[] args) {
        // Double, Float, Long, Short, Byte, Character и Boolean

        // упаковка в класс-обертку
        Integer x = new Integer(123); // предупреждение, лучше сокращенная запись
        Integer x2 = 123; // сокращенная запись

        // распаковка упакованного
        int y = x2;

        // после написания x. - открывается список доступных методов
        // здесь преобразуем int в double
        System.out.println(x.doubleValue());
    }
}
