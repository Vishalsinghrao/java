class rectangle{
    int length = 4;
    int breadth = 5;

    public rectangle(){
        System.out.println("The radius of the cylinder is: " + length);
        System.out.println("The height of the cylinder is: " + breadth);
    }
    public rectangle(int l, int b){
        System.out.println("The radius of the cylinder is: " + l);
        System.out.println("The height of the cylinder is: " + b);
    }
}
public class OOPS_6 {
    public static void main(String[] args) {
        rectangle first = new rectangle(6,8);
    }
}
