package InputDemoAssignment;
import java.io.*;
public class Ques6
{    public static void main(String args[])
    {
        try
        {   String logFileName = args[0];
            File f = new File("src/InputDemoAssignment/"+logFileName+".txt");
            boolean access_granted = false;
            String password = "";
            int integer = 5;
            if (args.length == 2)
            {
                System.out.println("Checking command-line password");
                password = password + args[1];
                if (password.equals("3dTAqb.7"))
                {
                    access_granted = true;
                    System.out.println("Password matches.");
                }
                else
                    System.out.println("Command-line password does not match");
            }

            if (access_granted)
            {
                System.out.println("Access granted!");

                PrintWriter out = new PrintWriter(new FileOutputStream(f, true));
                FileInputStream fi=new FileInputStream(f);
                int i=0;
                while((i=fi.read())!=-1){
                    System.out.print((char) i);
                }
                out.println();
                out.print("Updated...");
                out.println();
                out.flush();
                out.close();
            }
        }
        catch (Exception e)
        {
            System.out.println("an error has occured.");
        }
    }
}

