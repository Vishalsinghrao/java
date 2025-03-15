public class methods_1 {
    static int[] table(int n){
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] =  (i+1)*n;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] result = table(4);
        for (int element : result){
            System.out.println(element);
        }
    }
}
