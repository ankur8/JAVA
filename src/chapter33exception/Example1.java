package chapter33exception;

public class Example1 {
    public static void main(String[] args)
    {
        try{
            System.out.println(3/0);
            System.out.println("In Try");
        }
        catch(NullPointerException e1){
            System.out.println("Exception:  "+e1.getMessage());

        }
        catch(ArithmeticException e1){
            System.out.println("Exception:  "+e1.getMessage());
    }
    System.out.println("Hello");
    }
}
