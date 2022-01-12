package idv.alvin.jep213;

/**
 * @author Alvin
 */
public class Tester {
    public static void main(String[] args) {
        Handler<Integer> intHandler = new Handler<Integer>(1) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler.handle();
        Handler<? extends Number> intHandler1 = new Handler<Number>(2) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler1.handle();
        Handler<?> handler = new Handler<Object>("test") {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        handler.handle();
    }
}
