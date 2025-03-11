
// WAP to add 5 float arrays
public class arrays_1 {
    public static void main(String[] args) {

        float[] arr1 = {1.2f, 2.3f, 3.4f};
        float[] arr2 = {4.5f, 5.6f, 6.7f};
        float[] arr3 = {7.8f, 8.9f, 9.0f};
        float[] arr4 = {10.1f, 11.2f, 12.3f};
        float[] arr5 = {13.4f, 14.5f, 15.6f};

        float totalSum = 0;

        for (float num : arr1) {
            totalSum += num;
        }
        for (float num : arr2) {
            totalSum += num;
        }
        for (float num : arr3) {
            totalSum += num;
        }
        for (float num : arr4) {
            totalSum += num;
        }
        for (float num : arr5) {
            totalSum += num;
        }

        System.out.println("Total sum of all float arrays: " + totalSum);
    }
}
