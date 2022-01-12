package idv.alvin.jep213;

/**
 * JEP 213: Milling Project Coin
 *
 * @author Alvin
 */
public interface CustomInterface {

    void method1();

    default void method2() {
        System.out.println("default method");
    }

    static void method3() {
        System.out.println("static method");
    }

}
