// Create a class Cylinder and use getters and setters to set its radius and height
class Cylinder{
    int Radius;
    int Height;
/*    public void setRadius(int r){
        Radius = r;
    }
    public int getRadius(){
        return Radius;
    }
    public void setHeight(int h){
        Height = h;
    }
    public int getHeight(){
        return Height;
    }
    public double Areaofcylinder(int r, int h){
        double result = 2*(Math.PI * r * r) + 2*(Math.PI * r * h);
        return Math.round(result * 100.0) / 100.0;
    }
    public double Volumeofcylinder(int r, int h){
        double result = (Math.PI * r * r * h);
        return Math.round(result * 100.0) / 100.0;
    }

 */

    // using a constructor this time
    public Cylinder(int r, int h){
        System.out.println("The radius of the cylinder is: " + r);
        System.out.println("The height of the cylinder is: " + h);
    }

}
public class OOPS_5 {
    public static void main(String[] args) {
        Cylinder first = new Cylinder(24,56);
//        first.setRadius(24);
//        first.setHeight(56);
//        System.out.println(first.getRadius());
//        System.out.println(first.getHeight());
//        System.out.println("The Area of Cylinder is " + first.Areaofcylinder(first.getRadius(), first.getHeight()));
//        System.out.println("The Volume of Cylinder is "+ first.Volumeofcylinder(first.getRadius(), first.getHeight()));
    }
}
