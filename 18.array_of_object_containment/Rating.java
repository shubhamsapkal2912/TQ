class Movie {
    private int id;
    private String name;
    private float rating;

    Movie() {
    }

    Movie(int id, String name, float rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }
}

class Theatre {
    private int theatreId;
    private String theatreName;
    private String location;
    private Movie movie;

    Theatre() {
    }

    Theatre(int theatreId, String theatreName, String location, Movie movie) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.location = location;
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public String toString() {
        return theatreName + " (" + location + ") - " + movie.getName() + " [Rating: " + movie.getRating() + "]";
    }
}

public class Rating {
    static void sort(Theatre t[]) {
        int n = t.length;

        // Bubble Sort to sort theatres based on movie rating in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (t[j].getMovie().getRating() < t[j + 1].getMovie().getRating()) {
                    // Swap t[j] and t[j+1]
                    Theatre temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie(1, "RRR", 5.0f);
        Movie m2 = new Movie(2, "KKK", 4.8f);
        Movie m3 = new Movie(3, "SSS", 4.1f);
        Movie m4 = new Movie(6, "AAA", 4.5f);
        Movie m5 = new Movie(7, "BBB", 4.9f);
        Movie m6 = new Movie(8, "CCC", 4.0f);

        Theatre t[] = new Theatre[4];
        t[0] = new Theatre(101, "INOX", "Pune", m1);
        t[1] = new Theatre(102, "GUNJAN", "Pune", m4);
        t[2] = new Theatre(103, "IMAX", "Pune", m5);
        t[3] = new Theatre(104, "PVR", "Pune", m3);

        System.out.println("Before Sorting:");
        for (Theatre th : t) {
            System.out.println(th);
        }

        sort(t);

        System.out.println("\nAfter Sorting by Movie Rating (Descending):");
        for (Theatre th : t) {
            System.out.println(th);
        }
    }
}
