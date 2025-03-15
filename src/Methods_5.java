public class Methods_5 {
    public static int fibonacci(int x){
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<10;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.print("fibonacci series: ");
        for (int element : arr){
            System.out.print(element + ",");
        }
        System.out.println();
        return arr[x];

    }
    public static void main(String[] args) {
        System.out.println("the value is " + fibonacci(8));
    }
}
