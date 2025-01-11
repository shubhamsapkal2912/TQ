class Room{
    int length,breadth;
Room(){
length=10;
breadth=10;
}
Room(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
}
Room(int length){
    this.length=length;
    this.breadth=length;
}
void calArea(){
    System.out.println("Area is : "+(length*breadth));
}
void calArea(int leaveSpace){
    float area=length*breadth-leaveSpace;
    System.out.println("Area is : "+area);
}
}
public class RoomArea {
    public static void main(String[] args) {
        Room r1=new Room();
        r1.calArea();

        Room r2=new Room(10,30);
        r2.calArea(10);

        Room r3=new Room(10);
        r3.calArea(5);
        
    }
}
