package idv.alvin.jep266;

import java.util.stream.Stream;

/**
 * @author Alvin
 */
public class OfNullableExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.ofNullable("123");
        System.out.println(stream.count());

        stream = Stream.ofNullable(null);
        System.out.println(stream.count());
    }
}
