public class ShapeArea {

    public int calArea(int side){
        int area=side*side;
        return area;
    }
    public int calArea(int side,int width){
        int area=side*width;
        return area;
    }
    


 public static void main(String[] args) {
    ShapeArea s1=new ShapeArea();
    s1.calArea(10);
    s1.calArea(9, 9);
    
 }   
}
