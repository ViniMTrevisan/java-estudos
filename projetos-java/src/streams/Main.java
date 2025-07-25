package streams;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        show();
    }

    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 10, Genre.THRILLER),
                new Movie("a", 15, Genre.ACTION),
                new Movie("c", 20, Genre.ACTION)
        );

        var result = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 10));

        System.out.println(result);
    }
}
