package lab8.ex4_1;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}
