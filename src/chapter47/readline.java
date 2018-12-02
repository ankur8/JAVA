package chapter47;

//readline() read a line of text and return string

import java.io.*;


public class readline {
    public static void main(String[] args) throws IOException {

            BufferedReader br=new BufferedReader(new FileReader("/Users/ankjain/Documents/ankur1.txt"));
            String s2;
            while((s2=br.readLine())!=null)
                System.out.println(s2);

            br.close();

        }
    }

