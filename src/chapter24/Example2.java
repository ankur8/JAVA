package chapter24;

abstract class Shape{
    int p=90;
    abstract void draw();
    Shape(){   //abstract class can have constructor
        System.out.println("consturctor abstract class");
    }
    void a(){System.out.println("abstract class");}
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle");}
}
class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle " + p);}
    void d(){System.out.println("circle class member method ");}
}
//In real scenario, method is called by programmer or user
class Example2 {
    public static void main(String args[]) {
        Shape s = new Circle1();//In real scenario, object is provided through method e.g. getShape() method
        s.draw();      // call circle class draw from reference variable of Shape class
      // s.d();   //not possible as only can call functions belongs to Shape class with reference variable of shape class
      s.a();// non abstract method of abstract class
    }


}
