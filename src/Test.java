/**
 * Created by i2gan on 17.02.2023
 */

public class Test {
    public static void main(String[] args) {

        byte a = 123;
        int b = 123;
        long c = 123456789123L; // по умолчанию int, добавляем L в конце
        float d = 123.45f; // по умолчанию double, нужно добавить f или F в конце
        double e = 123.45;

        long k = 123456789; // неявное приведение типов
        int l = (int)k; // явное приведелине типов

        float m = (float)123.4; // явное приведение типов

        double n = 123.8;
        int p = (int)n; // 123, дробная часть отбрасывается

        byte x = (byte) 129; // -127. приводимое число слишком большое для byte
    }
}
