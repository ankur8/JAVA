package boxingautoboxing;

public class box {
    public static void main(String args[]) {
        int a = 50;
        Integer i1 = new Integer("90");  //boxing
        Integer a3 = 5;   //boxing
        int b=i1+a3; //unboxing
        System.out.println(a+i1 + a3);
        System.out.println(b);

    }
}
