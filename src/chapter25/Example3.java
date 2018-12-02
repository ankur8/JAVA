package chapter25;
//in java8 we can have method body in interface. But we need to make it default method
interface Drawable{
    void draw();
    default  void msg(){System.out.println("default method");}    // in java8 interface can have method body . but we need to make it default method.
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Example3{
    public static void main(String args[]){
        Rectangle d=new Rectangle();
        Drawable f=new Rectangle();
        d.draw();
        d.msg();
        f.draw();
        //f.msg();
    }}
