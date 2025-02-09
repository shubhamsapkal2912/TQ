
public class Movie {
    private int movieid;
    private String name;
    private int rating;
    Movie(){

    }
     Movie(int movieid, String name, int rating) {
        this.movieid = movieid;
        this.name = name;
        this.rating = rating;
    }
    public int getMovieid() {
        return movieid;
    }
    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Movie [movieid=" + movieid + ", name=" + name + ", rating=" + rating + "]";
    }
   
    

}
