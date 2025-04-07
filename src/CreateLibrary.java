import java.util.Scanner;

class Library{
    String[] availableBooks = new String[100];
    int currentarrsize = 3;
    public Library(){
        this.availableBooks[0] = "The Art of war";
        this.availableBooks[1] = "The 48 law";
        this.availableBooks[2] = "love: power or curse?";
    }

    public void addBook(String book){
        this.availableBooks[currentarrsize] = book;
        this.currentarrsize++;
        System.out.println(book + " was added to the library");
    }
    public void issueBook(String book){
        for(int i=0;i< this.availableBooks.length;i++){
            if(this.availableBooks[i].equals(book)){
                this.availableBooks[i] = null;
                System.out.println(book + " was issued");
                return;
            }
        }
        System.out.println(book + " is not availaible");

    }
    public void returnBook(String book){
        System.out.println(book + " Book was returned");
        this.availableBooks[currentarrsize] = book;
        this.currentarrsize++;

    }
    public void showavailableBook(){

        for(int i=0;i<this.availableBooks.length;i++){
            if(this.availableBooks[i] == null){
                continue;
            }
            System.out.println(this.availableBooks[i]);
        }
    }

}

public class CreateLibrary {
    public static void main(String[] args) {
        Library harry = new Library();
        harry.addBook("left alone");
        harry.issueBook("left alone");
        harry.showavailableBook();
        harry.returnBook("left alone");
        harry.showavailableBook();
    }
}
