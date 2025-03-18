
class Employee {
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }

    public String getName() {
        return name;
    }
    public String SetName(String n){
        name = n;
        return name;

    }
}
public class OOPS_1 {
    public static void main(String[] args) {
         Employee vishal = new Employee();

         vishal.Salary = 55000;
         vishal.name = "vishal";
         System.out.println("the salary of vishal is " + vishal.getSalary());
         System.out.println("the name of employee is " + vishal.getName());
         System.out.println("the changed name of employee is " + vishal.SetName("rahul"));
    }
}
