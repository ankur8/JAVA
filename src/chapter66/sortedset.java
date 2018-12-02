package chapter66;
import java.util.*;
public class sortedset {
    public static void main(String args[]) {
        TreeSet t = new TreeSet();
        t.add("D");
        t.add("A");
        t.add("C");
        t.add("B");
        System.out.println(t.pollFirst());
        System.out.println(t);
    }
}
