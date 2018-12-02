package chapter45;

import java.io.*;

public class fileinputstream {
        public static void main(String[] args) throws IOException {
            int i;
            FileInputStream fin;
            fin = new FileInputStream("/Users/ankjain/Documents/ankur1.txt");


            do{
                i=fin.read();
                if(i!=-1)
                    System.out.println((char) i);
            }while(i!=-1);

                fin.close();
        }
    }

