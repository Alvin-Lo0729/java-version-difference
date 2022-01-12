package idv.alvin.jep213;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author Alvin
 */
public interface CustomCalculator {

    default int addEvenNumbers(int... nums) {
        return add(n -> n % 2 == 0, nums);
    }

    default int addOddNumbers(int... nums) {
        return add(n -> n % 2 != 0, nums);
    }

    private int add(IntPredicate predicate, int... nums) {
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }
}
