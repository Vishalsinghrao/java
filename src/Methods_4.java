public class Methods_4 {
    public static void pattern(int x){
        for(int i = 0;i<x;i++){
            for(int j=x;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
