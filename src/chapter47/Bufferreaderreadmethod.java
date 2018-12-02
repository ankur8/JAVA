package chapter47;

import java.io.*;

public class Bufferreaderreadmethod {
    public static void main(String[] args) throws IOException{
        BufferedReader br;
        br = new BufferedReader(new FileReader("/Users/ankjain/Documents/ankur1.txt"));
        char[] cbuf=new char[20];
        br.read(cbuf,0,15);
        System.out.println(cbuf);
br.close();

    }
}
