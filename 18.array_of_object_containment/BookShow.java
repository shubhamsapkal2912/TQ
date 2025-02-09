public class BookShow {
    public static void main(String[] args) {
        Theatre[] th = new Theatre[2];

        // Movies for the first theatre
        Movie[] m1 = new Movie[2];
        m1[0] = new Movie(1, "AAA", 4);
        m1[1] = new Movie(2, "BBB", 2);

        th[0]=new Theatre(101, "ABS", "PUNE", m1);

    }
}
