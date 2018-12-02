package chapter46;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwriter {

    public static void main(String[] args) throws  IOException{
        BufferedWriter bf = new BufferedWriter(new FileWriter("/Users/ankjain/Documents/ankur1.txt",true));
        bf.write("computer");
        bf.close();

    }

}
