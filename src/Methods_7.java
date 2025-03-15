public class Methods_7 {
    public static void recursion(int x){
        if(x<=0){
            return;
        }
        else{
            System.out.println("4");
            recursion(x-1);
        }

    }
    public static void main(String[] args) {
        recursion(4);
    }
}
