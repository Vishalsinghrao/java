
// WAP to check wheather an array is sorted or not
public class arrays_8 {
    public static void main(String[] args) {
        int [] arr = {5,6,7,15,16,18};
        boolean sorted = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                sorted = false;
                break;
            }

        }
        System.out.println(sorted);
    }
}
