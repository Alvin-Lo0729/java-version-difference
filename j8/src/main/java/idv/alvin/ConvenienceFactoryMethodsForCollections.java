package idv.alvin;

import java.util.*;

/**
 * JEP 269: Convenience Factory Methods for Collections
 *
 * @author Alvin
 */
public class ConvenienceFactoryMethodsForCollections {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set = Collections.unmodifiableSet(set);
        System.out.println(set);
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list = Collections.unmodifiableList(list);
        System.out.println(list);
        Map<String, String> map = new HashMap<>();

        map.put("A", "Apple");
        map.put("B", "Boy");
        map.put("C", "Cat");
        map = Collections.unmodifiableMap(map);
        System.out.println(map);
    }
}
