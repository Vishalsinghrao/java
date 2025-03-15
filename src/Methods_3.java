public class Methods_3 {
    public static int sum(int x){
        if(x==0){
            return 0;
        }else {
            return x + sum(x - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
