package chapter43;

import java.io.File;
import java.io.IOException;

public class fileclass {
    public static void main(String[] args) throws IOException{
    File f1=new File("/Users/ankjain/Documents/ankur.txt");
    f1.createNewFile();
            System.out.println("can file read "+f1.canRead());
        System.out.println("is file exist "+f1.exists());
        System.out.println("File name "+f1.getName());
        System.out.println("Length of file "+f1.length());
        f1.delete();
        System.out.println("is file exist "+f1.exists());

    }
}
