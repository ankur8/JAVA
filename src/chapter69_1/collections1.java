package chapter69_1;

        import java.util.Collections;
        import java.util.Vector;

public class collections1 {
    public static void main(String args[]){
        Vector v=new Vector();
        v.add(20);
        v.add(3);
        v.add(40);
        v.add(80);
        v.add(5);
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);

    }
}
