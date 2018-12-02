package chapter62;
import java.util.ArrayList;
import java.util.Iterator;

public class Arrarylist {
    public static void main(String [] args){
        ArrayList l1=new ArrayList(2);
        l1.add("ankur");
        l1.add("smriti");
        l1.add("arrav");
        l1.add("jaiho");
        l1.add("wow");
        l1.add(4,"names");
        l1.set(3,"nutral");
        //l1.clear(); //to clear all elements from arraylist
        System.out.println("so:-"+l1.get(2));
        Iterator it= l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());


    }

    }
    }

