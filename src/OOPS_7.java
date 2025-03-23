class sphere{
    int Radius;
    int Height;

    public void setRadius(int r){
        Radius = r;
    }
    public int getRadius(){
        return Radius;
    }

    public double Areaofsphere(int r){
        double result = (Math.PI * r * r);
        return Math.round(result * 100.0) / 100.0;
    }
    public double Circumferenceofsphere(int r){
        double result = 2*(Math.PI * r);
        return Math.round(result * 100.0) / 100.0;
    }
}

public class OOPS_7 {
    public static void main(String[] args) {
        sphere first = new sphere();
          first.setRadius(24);
          System.out.println(first.getRadius());
          System.out.println("The Area of Cylinder is " + first.Areaofsphere(first.getRadius()));
          System.out.println("The Volume of Cylinder is "+ first.Circumferenceofsphere(first.getRadius()));
    }
}
