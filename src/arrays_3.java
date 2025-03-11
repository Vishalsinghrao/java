public class arrays_3 {
    public static void main(String[] args) {

        int [] marks = {44,55,75,85,60};
        double sum = 0;
        for(int element : marks){
            sum += element;
        }
        System.out.print("The average of the student is : " + sum/ marks.length);
    }
}
