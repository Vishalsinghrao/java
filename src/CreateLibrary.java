import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);
    String[] availableBooks = new String[10];
    int currentarrsize = 3;
    public Library(){
        availableBooks[0] = "The Art of war";
        availableBooks[1] = "The 48 law";
        availableBooks[2] = "love: power or curse?";
    }

    public void addBook(){
        System.out.print("Enter the book you want to add: ");
        String book = sc.nextLine();
        availableBooks[currentarrsize] = book;
        currentarrsize++;
        showavailableBook();
    }
    public void issueBook(){
        showavailableBook();
        System.out.print("Enter the book you want to issue: ");
        String issued = sc.nextLine();
        System.out.println(issued + " Book was issued");
    }
    public void returnBook(){
        System.out.print("Enter the book you want to return: ");
        String returnbook = sc.nextLine();
        System.out.println(returnbook + " Book was returned");
    }
    public void showavailableBook(){
        for(int i=0;i<currentarrsize;i++){
            System.out.println(availableBooks[i]);
        }
    }

}

public class CreateLibrary {
    public static void main(String[] args) {
        Library harry = new Library();
        harry.addBook();
        harry.issueBook();
//        harry.returnBook();
//        harry.showavailableBook();
    }
}
