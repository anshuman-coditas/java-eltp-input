package InputDemoAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ques4 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer=new PrintWriter(new File("src/InputDemoAssignment/output.txt"));
        writer.println(23);
        int a=23,b=25,c=0;
        c=a+b;
        writer.printf("Sum of %d,%d is- %d",a,b,c);
        writer.close();
    }
}
