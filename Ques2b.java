package InputDemoAssignment;

import java.util.Scanner;

class EmployeeDemo{
    String name;
    int id;
    String project;
    float salary=0f;
    void addDetails()  {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Name");
        name=inp.nextLine();
        System.out.println("Enter Id");
        id=inp.nextInt();
        inp.nextLine();//We can also add next
        System.out.println("Enter Project");
        project=inp.nextLine();
        System.out.println("Enter Salary");
        salary=inp.nextFloat();
    }
    void displayDetails(){
        System.out.println("Name is "+name+" "+"Id is "+id+" "+"Project is "+project+" "+"Salary are "+salary);
    }
}
public class Ques2b {
    public static void main(String[] args) {
        EmployeeDemo obj_e = new EmployeeDemo();
        obj_e.addDetails();
        obj_e.displayDetails();

    }
}
//               ****OUTPUT************
//        Enter Name
//        Alex
//        Enter Id
//        345
//        Enter Project
//        ML
//        Enter Salary
//        780000
//        Name is Alex Id is 345 Project is ML Salary are 780000.0
