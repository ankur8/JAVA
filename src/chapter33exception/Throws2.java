package chapter33exception;


import java.io.IOException;

public class Throws2 {

    public static void main(String args[]) throws IOException {

        throw new IOException("handled exception");   //complier complaint for checked exception but due to use of throws it won't
        //System.out.print("After Exception");   //java default catch mechanism work

    }
}



//either use throws or catch youself with try and catch . in case of throws java default catch will work .

