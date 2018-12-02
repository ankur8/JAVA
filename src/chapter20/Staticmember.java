package chapter20;
class Parent{
    static int y=90;

}
class Child extends Parent{

    static{
         y=80;
    }
}
public class Staticmember {
    public static void main(String[] args) {


        Child c = new Child();
        System.out.println("y="+Child.y);
    }
}

