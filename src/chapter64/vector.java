package chapter64;
import java.util.*;
public class vector {
    public static void main(String args[])
    {
        Vector v=new Vector();
        v.addElement("one");
        v.addElement("two");
        v.addElement("three");

        System.out.println(v);
        //for(Object o:v)        //for loop for traversin collection
          //  System.out.println(o);

        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            String s=(String)e.nextElement();
            System.out.println(s+" "+s.length());
        }


    }
}
