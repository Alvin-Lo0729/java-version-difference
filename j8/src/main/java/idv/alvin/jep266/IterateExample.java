package idv.alvin.jep266;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Alvin
 */

public class IterateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
