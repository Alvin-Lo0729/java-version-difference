package idv.alvin.jep213;

/**
 * JEP 213: Milling Project Coin
 *
 * @author Alvin
 */
public class J8CustomClass implements CustomInterface {


    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        CustomInterface instance = new J8CustomClass();
        instance.method1();
        instance.method2();
        CustomInterface.method3();

    }
}
