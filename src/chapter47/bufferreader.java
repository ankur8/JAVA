package chapter47;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferreader {
    public static void main(String[] args) throws IOException{
        int ch;
        BufferedReader br=new BufferedReader(new FileReader("/Users/ankjain/Documents/ankur1.txt"));
        while((ch=br.read())!=-1)
        System.out.println((char)ch);

          br.close();

    }
}
