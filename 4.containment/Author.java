public class Author {
    private int id;
    private String name;
    private static int authorCnt=0;
    Author(){

    }

{
    authorCnt++;
}
    Author(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getAuthorcount(){
        return authorCnt;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return "Author id: "+id+" Author Name: "+name;
    }
}
