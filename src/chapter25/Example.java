package chapter25;
interface I1
{
    void f1();
}
interface I2
{
void f2();
}

 class A implements I1 , I2
{
  public void f1(){};
  public void f2(){};
  public void f3(){};
}
class B extends A implements I2{    // Class can extend as well as implements interface simultaneosuly
    void f4(){};
    //public void f2(){System.out.println("b class");};

}
public class Example {

    public static void main(String [] args)
    {
        A a1 = new A();
        I2 b1 = new B();
        I1 obj=new A()   ;    //Rule: can call only f1() from I1 interface obj reference variable as f1 belongs to I1 but f2 f3 belongs to class A
        obj.f1();
        a1.f2();  // can call f1,f2,f2 function with a1 object
        b1.f2();
    }
}
