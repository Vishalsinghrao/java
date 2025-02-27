import java.util.Scanner;

public class check_pass {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your marks in maths ");
        int m1 = sc.nextInt();
        System.out.print("Enter your marks in physics ");
        int m2 = sc.nextInt();
        System.out.print("Enter your marks in chemistry ");
        int m3 = sc.nextInt();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>40 && m1>33 && m2>33 && m3>33){
            System.out.println("you passed");
            System.out.println(avg);

        }
        else{
            System.out.println("you failed");
        }
    }
}
