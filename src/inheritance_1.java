
class Circle{
    int radius;

    Circle(int r) {
        radius = r;
    }
    public double area(){
        double result = Math.PI*this.radius*this.radius;
        return Math.round(result * 100)/100;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        double result =  Math.PI*this.radius*this.radius*this.height;
        return Math.round(result * 100)/100;
    }

}
public class inheritance_1 {
    public static void main(String[] args) {
//        Circle a = new Circle(14);
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println(obj.volume());
        System.out.println(obj.area());
    }
}
