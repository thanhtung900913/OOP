package lab8.ex4_1;

import java.util.*;

public class TestMovie {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Force Awakens",8.3,2015));
        movies.add(new Movie("Star Wars", 8.7,1977));
        movies.add(new Movie ("Empire Strikes Back" , 8.8, 1980));
        movies.add(new Movie ("Return of the Jedi", 8.4, 1983));

        //Collections.sort(movies);
        Collections.sort(movies,new MovieNameComparator());

        System.out.println(Arrays.toString(movies.toArray()));
//        for(Movie movie : movies){
//            System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
//        }
    }
}
