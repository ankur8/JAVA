package chapter27;
import java.util.*;

public class Example {

    public static void main(String [] args){
        System.out.println("Enter name and age:");

        Scanner sc=new Scanner(System.in);
        /// String name=sc.next();
        // String name2=sc.next() ;
        String name=sc.nextLine(); //use next() to read one word or nextline() to read whole line
        int age=sc.nextInt();
        //System.out.println("Name: "+name+"Age: "+age +name2);
        System.out.println("Name: "+name+"Age: "+age);


    }
}
