package InputDemoAssignment;

import java.io.Console;
import java.util.Scanner;

class EmployeeDemo1{
    String name;
    int id;
    String project;
    float salary=0f;
    void addDetails()  {
        Console c=System.console();
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Name");
        name=c.readLine();
        System.out.println("Enter Id");
        id=Integer.parseInt(c.readLine());
        inp.nextLine();//We can also add next
        System.out.println("Enter Project");
        project=c.readLine();
        System.out.println("Enter Salary");
        salary=Float.parseFloat(c.readLine());
    }
    void displayDetails(){
        System.out.println("Name is "+name+" "+"Id is "+id+" "+"Project is "+project+" "+"Salary are "+salary);
    }
}
public class Ques2c {
    public static void main(String[] args) {
        EmployeeDemo1 obj_e = new EmployeeDemo1();
        obj_e.addDetails();
        obj_e.displayDetails();
    }
}
