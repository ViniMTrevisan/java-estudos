package collections;

import java.util.*;

public class SetsDemo {
    public static void show(){
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        set1.removeAll(set2);
    }
}
