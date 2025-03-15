public class Methods_6 {
    public static double average(int ...arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        double avg = sum / arr.length;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(65,75,50));
        System.out.println(average(65,75,50,56));
    }
}
