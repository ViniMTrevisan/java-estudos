package generics;

public class Utils {
    public static <T extends Comparable<T>> T max (T first, T second){
        return first.compareTo(second) < 0 ? second : first;
    }

    public static void printUser(GenericList<User> user){
        System.out.println(user);
    }

    public static void printUsers(GenericList<? extends User> users){
    }
}
