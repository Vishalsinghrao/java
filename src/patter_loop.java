import java.util.Scanner;

public class patter_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a;i>0;i--){
            for(int j =i;j<i;j--){
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
