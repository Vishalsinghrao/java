import java.util.Scanner;

public class Taxpayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.print("Enter your salary in lakhs ");
        float sal = sc.nextFloat();
        if(sal <= 2.5f){
          tax = tax + 0;
        }
        else if(sal >2.5f && sal <= 5.0){
            tax = tax + 0.05f * (sal - 2.5f);
        }
        else if(sal > 5.0f && sal <= 10.0){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (sal - 5.0f );
        }
        else if(sal>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5.0f);
            tax = tax + 0.2f * (sal - 10.0f );
        }
        System.out.println("total tax you have to pay " + tax);

    }
}
