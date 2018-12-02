package chapter21;

class A {
    int a;

    public A() {
        System.out.print("A class");
    }
}

class B{
    int b;
    public B(){
        super();// optional as default constructor of super class called by child implicitly
        System.out.print("B class");
    }
}
public class Example {
    public static void main(String[] args){
        B obj = new B();
    }
}
