package chapter19;

class A {
 static int a=10;
public void f1(){
    // System.out.println("super class" + a);
}
}

class B extends A {
public  void f1(){
    System.out.println("sub class" + A.a );
    super.f1();
}
}


 class Example19 {
    public static void main( String args[])
    {
        B obj=new B();
        //A.a=90;
        obj.f1();


    }
}

