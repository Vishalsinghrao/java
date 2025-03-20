import java.util.Scanner;

class guess{
    Scanner sc = new Scanner(System.in);
    int Userinput;
    int random;
    int numofguesses = 1;
    int[] prevguesses = new int[10];

    public guess(){
        random = (int)(Math.random() * 100 +1);
    }

    public void Userinput(){
        if(numofguesses < 11) {
            System.out.print("Enter your guess: ");
            Userinput = sc.nextInt();
            numofguesses++;
            System.out.println("The number of attempts you have left: " + (11 - numofguesses));
            isCorrectNumber();
        }
        else{
            System.out.println("Game Over you lost the random number was "+ random);
        }

    }
    public void isCorrectNumber(){
        if(Userinput == random){
            System.out.println("you guessed the right number");
        }
        else if(Userinput < random){
            System.out.println("this number is smaller than the target");
            Userinput();
        }
        else if(Userinput > 100 || Userinput < 0){
            System.out.println("please enter a number between 0 to 100");
        }
        else{
            System.out.println("this number is bigger than the target");
            Userinput();
        }
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        guess num = new guess();
        num.Userinput();
    }
}
