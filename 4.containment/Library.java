public class Library {
    public static void main(String[] args) {
        Author a1=new Author(1, "Napolean Hill");
        Author a2=new Author(2, "Robert T Kiyosaki");

        Book b1=new Book(101, "Think and Grow Rich", 99,a1);
        Book b2=new Book(102, "Rich Dad Poor Dad", 119,a2);
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("Total Books:"+Book.getBookcount());
        System.out.println("Total Books Price:"+Book.getTotalprice());

    }
}
