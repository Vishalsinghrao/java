import java.util.Scanner;

public class CbseResult {
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
        double total = a+b+c+d+e;
        double percentage = (total/500) * 100;
        System.out.println("percentage : " + percentage + "%");
    }
}
