import java.util.Scanner;

public class arrays_2 {
    public static void main(String[] args) {

        /*
        without taking input from the user
        int [] nums = {4,5,6,7,8,9};
        int target = 6;
        boolean found = false;
        for(int element : nums){
            if(element == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(target + " is present in the array");
        }
        else{
            System.out.println(target + " is not present in the array");
        }*/

        // taking input from the user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int [] nums = new int[size];

        System.out.print("Now fill the array : ");
        for(int i = 0; i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the integer you want to check : ");
        int target = sc.nextInt();


        boolean found = false;
        for(int element : nums){
            if(element == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(target + " is present in the array");
        }
        else{
            System.out.println(target + " is not present in the array");
        }

    }

}
