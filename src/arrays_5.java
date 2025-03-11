// WAP to reverse an array
public class arrays_5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int [] revarr = new int[8];

        for(int i=arr.length -1;i>=0;i--){
            revarr[arr.length - 1 - i] = arr[i];
        }
        for(int element : revarr){
            System.out.println(element);
        }
    }
}
