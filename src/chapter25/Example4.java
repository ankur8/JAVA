package chapter254;
//interface can have static method in java8
interface Drawable{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}

class Example4{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(3));
    }}
