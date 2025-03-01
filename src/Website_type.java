import java.util.Scanner;

public class Website_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your website name: ");
        String website_name = sc.nextLine();
        if(website_name.endsWith(".com")){
            System.out.println(website_name + " is a commercial website");
        }
        else if(website_name.endsWith(".org")){
            System.out.println(website_name + " is a organization website");
        }
        else if(website_name.endsWith(".in")){
            System.out.println(website_name + " is a indian website");
        }
        else{
            System.out.println("enter a valid website name");
        }

    }
}
