package lab8.ex4_2;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;
    public Movie(){
        this.name="";
        this.rating = 0.0;
        this.year = 0;
    }
    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
    @Override
    public int compareTo(Movie o){
        return (this.year - o.getYear());
    }
}
