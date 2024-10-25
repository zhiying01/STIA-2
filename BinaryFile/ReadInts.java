
package BinaryFile;

import java.io.*;

public class ReadInts {
    public static void main(String[] args) {
       String fileName = "intData.Data";
       long sum = 0;
       try
       {
        File file = new File(fileName);
        FileInputStream fileInput = new FileInputStream(file);
        DataInputStream instr = new DataInputStream(fileInput);
        
        int num1 = instr.readInt();
        int num2 = instr.readInt();
        int num3 = instr.readInt();
        int num4 = instr.readInt();
        
        sum = num1 + num2 +num3 +num4 ;
        
           System.out.println("The sum is:" +sum);
           instr.close();
       }
       catch(IOException iox)
       {
           System.out.println("Problem reading" + fileName);
       }
    }
    
}
