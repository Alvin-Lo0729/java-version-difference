package idv.alvin.jep266;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alvin
 */
public class DropWhileExample {
    public static void main(String[] args) {
        List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

        List<String> subset2 = alphabets
                .stream()
                .dropWhile(s -> !s.equals("d"))
                .collect(Collectors.toList());

        System.out.println(subset2);
    }
}
