package InputDemoAssignment;

import java.io.Console;
import java.io.PrintWriter;

public class Ques3 {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter Name: ");
        String name=c.readLine();
        System.out.println("Enter Password");
        char[] pass=c.readPassword();
        String pwd=new String(pass);
        System.out.println("Password Entered is: "+pwd);
        PrintWriter out=c.writer();
        out.println("Writer() method");
        String format="%1$4s %2$10s %3$10s%n";
        c.printf(format,"Emp_NAME","Emp_PROJECT");
        c.printf(format,"----","----");
        c.printf(format,"Alex","ML");
        c.printf(format,"Mike","Android");
        c.flush();
    }
}
