import java.util.Arrays;

public class Theatre {
    private int tid;
    private String tname;
    private String location;
    private Movie movies[];
    Theatre(){
        super();
    }
    Theatre(int tid, String tname, String location, Movie[] movies) {
       super();
        this.tid = tid;
        this.tname = tname;
        this.location = location;
        this.movies = movies;
    }
    public int getTid() {
        return tid;
    }
    public void setTid(int tid) {
        this.tid = tid;
    }
    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname = tname;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Movie[] getMovies() {
        return movies;
    }
    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
    @Override
    public String toString() {
        return "Theatre [tid=" + tid + ", tname=" + tname + ", location=" + location + ", movies="
                + Arrays.toString(movies) + "]";
    }
    
    
}
