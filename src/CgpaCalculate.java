import java.util.Scanner;

public class CgpaCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of 1st subject : ");
        int a = sc.nextInt();
        System.out.print("Enter the number of 2nd subject : ");
        int b = sc.nextInt();
        System.out.print("Enter the number of 3rd subject : ");
        int c = sc.nextInt();
        System.out.print("Enter the number of 4th subject : ");
        int d = sc.nextInt();
        System.out.print("Enter the number of 5th subject : ");
        int e = sc.nextInt();

        double gp1 = a/10.0;
        double gp2 = b/10.0;
        double gp3 = c/10.0;
        double gp4 = d/10.0;
        double gp5 = e/10.0;

        double cgpa = (gp1+gp2+gp3+gp4+gp5)/5;

        System.out.println("Your cgpa is : " + cgpa);
    }
}
