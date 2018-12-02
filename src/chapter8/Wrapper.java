package chapter8;

public class Wrapper {
public static void main(String[] args)
{
    Integer i1=Integer.valueOf("748");
    Float f1=Float.valueOf("2.34");
    System.out.println(f1);
Float value=2.4f;
int f3=f1.intValue();//autoboxing happens here  i.e converting float value to int
double d1=f1.doubleValue();
System.out.println(f3);
System.out.println(d1);
System.out.println(f1);   //autounboxing in printing f1 object value.
}
}
