package chapter33exception;
import java.io.*;
public class Throws {

    public static void main(String args[]) {
        try {
            throw new IOException("handled exception");   //complier compaint for checked exception
            //System.out.print("After Exception");
        } catch (IOException e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}


//either use throws or catch youself with try and catch . in case of throws java default catch will work .

