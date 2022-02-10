package InputDemoAssignment;

import java.util.Scanner;

class Student{
    String name;
    int id;
    float marks=0f;
    void addCase1(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=inp.nextLine();
        System.out.println("Enter Id: ");
        id=inp.nextInt();
        System.out.println("Enter Marks");
        marks=inp.nextFloat();
    }
    void addCase2(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Id: ");
        id=inp.nextInt();
        System.out.println("Enter marks: ");
        marks=inp.nextFloat();
        System.out.println("Enter Name: ");
        name=inp.next();
    }
    void printDetails(){
        System.out.println("Name is: "+name+" "+"Id is: "+id+" "+"Marks are: "+marks);
    }
}
public class Ques1 {
    public static void main(String[] args) {
        Student obj_s=new Student();
        obj_s.addCase1();
        obj_s.printDetails();
        obj_s.addCase2();
        obj_s.printDetails();
    }
}
// ********OUTPUT******************
//    Enter Name:
//        Anshuman
//        Enter Id:
//        123
//        Enter Marks
//        456
//        Name is: Anshuman Id is: 123 Marks are: 456.0
//        Enter Id:
//        987
//        Enter marks:
//        234
//        Enter Name:
//        Alex
//        Name is: Alex Id is: 987 Marks are: 234.0