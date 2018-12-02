package chapter64;

import java.util.LinkedList;
import java.util.*;
import java.util.ListIterator;

public class linklist {
    public static void  main(String args[]){
        LinkedList l=new LinkedList();
        l.add("C");
        l.add("CPP");
        l.add("JAVA");
        l.add("PHP");

        ListIterator lt=l.listIterator();
        while(lt.hasNext()){
            String s=(String)lt.next();
            if(s.equals("JAVA"))
                lt.set("JAVASE");
            System.out.println(s);
        }
        System.out.println(l);
    }
}
