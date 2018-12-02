package chapter44;

import java.io.FileOutputStream;
import java.io.*;

public class fileoutputstream {
    public static void main(String[] args) throws IOException {
        int i;
        FileOutputStream fout;
        fout = new FileOutputStream("/Users/ankjain/Documents/ankur1.txt", true);
        String s = "TATA";
        char ch[] = s.toCharArray();
        for (i = 0; i < s.length(); i++)
            fout.write(ch[i]);
        fout.close();

    }
}
