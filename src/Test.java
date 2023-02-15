import Forest.Something.SomeClass;
import Forest.Squirell;
import Forest.Tree;
// import Forest.*;

/**
 * Created by i2gan on 15.02.2023
 * Description: Для доступа из класса Test к
 * классам, которые находятся в папке Forest,
 * нужно импортировать пакет (package) Forest и класс
 * Tree (см. выше)
 * Или папку Forest со звездочкой (вложенные папки не
 * импортируются).
 */

public class Test {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Squirell squirell = new Squirell();
        SomeClass someclass = new SomeClass();
    }
}
