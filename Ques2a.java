package InputDemoAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
    String name;
    int id;
    String project;
    float salary=0f;
    void addDetails() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name");
        name=br.readLine();
        System.out.println("Enter Id");
        id= Integer.parseInt(br.readLine());
        System.out.println("Enter Project");
        project=br.readLine();
        System.out.println("Enter Salary");
        salary=Float.parseFloat(br.readLine());
    }
    void displayDetails(){
        System.out.println("Name is "+name+" "+"Id is "+id+" "+"Project is "+project+" "+"Salary is "+salary);
    }
}
public class Ques2a {
    public static void main(String[] args) throws IOException {
        Employee obj_e=new Employee();
        obj_e.addDetails();
        obj_e.displayDetails();

    }
}
            //*********OUTPUT**********
//        Enter Name
//        Alex
//        Enter Id
//        234
//        Enter Project
//        Ecommerce
//        Enter Salary
//        340000
//        Name is Alex Id is 234 Project is Ecommerce Salary is 340000.0