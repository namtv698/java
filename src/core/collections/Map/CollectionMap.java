package core.collections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * CollectionMap
 */
public class CollectionMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5, "5");

        map.get(null);
    }
}