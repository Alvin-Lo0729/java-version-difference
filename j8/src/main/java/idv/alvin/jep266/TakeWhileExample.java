package idv.alvin.jep266;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * @author Alvin
 */
public class TakeWhileExample {
    public static void main(String[] args) {
        List<String> alphabets = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
        final boolean[] check = {true};
        List<String> valueList = alphabets.stream().reduce(new ArrayList<String>(),
                new BiFunction<ArrayList<String>, String, ArrayList<String>>() {
                    @Override
                    public ArrayList<String> apply(ArrayList<String> strings, String s) {
                        if (s.equals("d")) {
                            check[0] = Boolean.FALSE;
                        }
                        if (check[0]) {
                            strings.add(s);
                        }
                        return strings;
                    }
                }, new BinaryOperator<ArrayList<String>>() {
                    @Override
                    public ArrayList<String> apply(ArrayList<String> strings, ArrayList<String> strings2) {
                        strings.addAll(strings2);
                        return strings;
                    }
                });

        System.out.println(valueList);
    }
}
