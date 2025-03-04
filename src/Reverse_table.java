import java.util.Scanner;

public class Reverse_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the table of : ");
        int n = sc.nextInt();
        for(int i = 10;i>0;i--){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
