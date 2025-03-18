class Square{
     int side;
     public int Area(){
         return side*side;
     }
     public int perimeter(){
         return 4*side;
     }
}
public class OOPS_3 {
    public static void main(String[] args) {
         Square a = new Square();
         a.side = 5;
         System.out.println(a.Area());
         System.out.println(a.perimeter());
    }
}
