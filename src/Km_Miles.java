import java.util.Scanner;

public class Km_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kn : ");
        int km = sc.nextInt();
        double miles = km * 0.621371;
        System.out.println(km + " km in miles is equal to " + miles + " miles");
    }
}
