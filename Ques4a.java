package InputDemoAssignment;

import java.io.*;

public class Ques4a {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream ds=new DataOutputStream(new FileOutputStream("src/InputDemoAssignment/output1.txt"));
        InputStream input=new FileInputStream("src/InputDemoAssignment/output1.txt");
        DataInputStream di=new DataInputStream(input);
        ds.writeInt(65);
        ds.writeUTF("Alex");
        while(di.available()>0){
            System.out.println(di.readInt());
            System.out.println(di.readUTF());
        }
        di.close();
        ds.flush();
        ds.close();


    }
}
