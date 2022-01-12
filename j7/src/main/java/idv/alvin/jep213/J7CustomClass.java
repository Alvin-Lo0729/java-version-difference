package idv.alvin.jep213;

/**
 * JEP 213: Milling Project Coin
 *
 * @author Alvin
 */
public class J7CustomClass implements CustomInterface {

    @Override
    public void method() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        CustomInterface instance = new J7CustomClass();
        instance.method();
    }
}
