// WAP to find the minimum element of an array
public class arrays_7 {
    public static void main(String[] args) {
        int [] arr = {5,65,4,55,95,14};

        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                continue;
            }
            else{
                continue;
            }
        }
        System.out.println(min);

    }
}
