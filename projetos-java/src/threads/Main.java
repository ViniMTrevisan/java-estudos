package threads;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);

    }
}


