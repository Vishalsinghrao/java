

public class sum_of_occurence {
    public static void main(String[] args) {
        System.out.print("Enter the number you want the table of : ");
        int n = 8;
        int sum = 0;
        for(int i = 1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n * i));
            sum = sum + (n*i);
        }
        System.out.println(sum);
    }
}

