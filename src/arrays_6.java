// WAP to find the maximum element of an array
public class arrays_6 {
    public static void main(String[] args) {
        int [] arr = {5,65,4,55,95,14};

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                continue;
            }
            else{
                continue;
            }
        }
        System.out.println(max);
    }
}
