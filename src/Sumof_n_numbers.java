import java.util.Scanner;

public class Sumof_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number you want the sum of : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum = sum + n;
            n--;
        }
        System.out.println("the sum is " + sum);
    }
}
