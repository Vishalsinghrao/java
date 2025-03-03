import java.util.Scanner;

public class Table_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the table of : ");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
