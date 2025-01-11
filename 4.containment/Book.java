public class Book {
    private int id;
    private String name;
    private double price;
    private Author author;
    private static int bookCount=0;
    private static double totalPrice=0;
    Book(){

    }
    {
        bookCount++;
    }
    Book(int id,String name,double price,Author author){
        this.id=id;
        this.name=name;
        this.price=price;
        totalPrice+=price;
        this.author=author;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setAuthor(Author author){
        this.author=author;
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public static int getBookcount(){
        return bookCount;
    }
    public Author getAuthor(){
        return author;
    }
    public static double getTotalprice(){
        return totalPrice;
    }

    public String toString(){
        return "Book Id: "+id+" Book Name: "+name+" Price:"+price+" [Author: "+author+" ]";
    }

}
