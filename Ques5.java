package InputDemoAssignment;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ques5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fin=new FileInputStream("src/InputDemoAssignment/output.txt");
        DataInputStream din=new DataInputStream(fin);
        int i=0,j=0;
        while ((i=fin.read())!=-1){
            System.out.print((char) i);
        }
        while(din.available()>0){
            System.out.print(din.readInt());
        }

    }
}
//Here the data is only being read using fin bt not using datainputstream. Hence it is important to close streams and flush them.